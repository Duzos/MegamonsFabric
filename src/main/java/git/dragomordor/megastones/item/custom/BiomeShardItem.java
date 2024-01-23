package git.dragomordor.megastones.item.custom;

import git.dragomordor.megastones.config.ModConfig;
import git.dragomordor.megastones.item.MegastonesItems;
import git.dragomordor.megastones.util.RarityMaps;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.*;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;


import java.util.List;
import java.util.Objects;

public class BiomeShardItem extends Item {

    private final String biome;

    public BiomeShardItem(String biome) {
        super(new FabricItemSettings());
        this.biome = biome;
    }

    @Override
    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);

        NbtCompound nbt = stack.getNbt();

        // Show rarity on tooltip and shift info

        if ((nbt != null) && nbt.contains("Rarity")) {
            if (Screen.hasShiftDown()) {

                String rarity = nbt.getString("Rarity");
                String rarityName = RarityMaps.getRarityNames().getOrDefault(rarity, "Unknown Rarity");
                Formatting rarityColor = RarityMaps.getRarityColors().getOrDefault(rarity, Formatting.WHITE);
                LiteralTextContent rarityLiteralText = new LiteralTextContent(rarityName);
                Text rarityText = MutableText.of(rarityLiteralText).setStyle(Style.EMPTY.withColor(rarityColor));


                int commonRequiredShards = ModConfig.getCommonShardCombineRequired();
                int uncommonRequiredShards = ModConfig.getUncommonShardCombineRequired();
                int rareRequiredShards = ModConfig.getRareShardCombineRequired();
                int veryRareRequiredShards = ModConfig.getVeryRareShardCombineRequired();
                int ultraRareRequiredShards = ModConfig.getUltraRareShardCombineRequired();
                int requiredShards = 99;

                requiredShards = switch (rarity.toLowerCase()) {
                    case "common" -> commonRequiredShards;
                    case "uncommon" -> uncommonRequiredShards;
                    case "rare" -> rareRequiredShards;
                    case "very_rare" -> veryRareRequiredShards;
                    case "ultra_rare" -> ultraRareRequiredShards;
                    default -> requiredShards;
                };

                MutableText tooltipText = Text.literal("Combine ").formatted(Formatting.GOLD)
                        .append(String.valueOf(requiredShards))
                        .append(" ").append(rarityText)
                        .append(" shards into a " + biome.substring(0, 1).toUpperCase() + biome.substring(1))
                        .append(" Raw Megastone by using while sneaking");


                tooltip.add(tooltipText);

            } else {
                String rarity = nbt.getString("Rarity");
                String rarityName = RarityMaps.getRarityNames().getOrDefault(rarity, "Unknown Rarity");
                Formatting rarityColor = RarityMaps.getRarityColors().getOrDefault(rarity, Formatting.WHITE);

                LiteralTextContent rarityLiteralText = new LiteralTextContent(rarityName);
                Text rarityText = MutableText.of(rarityLiteralText).setStyle(Style.EMPTY.withColor(rarityColor));
                tooltip.add(rarityText);


                LiteralTextContent shiftLiteralText = new LiteralTextContent(" SHIFT ");
                Text shiftText = MutableText.of(shiftLiteralText).setStyle(Style.EMPTY.withColor(Formatting.YELLOW));

                MutableText tooltipText = Text.literal("Hold").formatted(Formatting.DARK_GRAY)
                        .append(shiftText)
                        .append("for more info");

                tooltip.add(tooltipText);
            }

        }

        // add more tooltip info here
    }

    // Combine shards

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {

            if (player.isSneaking()) {
                ItemStack heldItem = player.getStackInHand(hand);
                String shardRarity = RarityMaps.getRarityFromItem(heldItem);

                int commonRequiredShards = ModConfig.getCommonShardCombineRequired();
                int uncommonRequiredShards = ModConfig.getUncommonShardCombineRequired();
                int rareRequiredShards = ModConfig.getRareShardCombineRequired();
                int veryRareRequiredShards = ModConfig.getVeryRareShardCombineRequired();
                int ultraRareRequiredShards = ModConfig.getUltraRareShardCombineRequired();

                int requiredShards = 99;
                // check whether shard has rarity
                if (!(Objects.equals(shardRarity, null))) {
                    int stacksCombined = 0; // initialize
                    requiredShards = switch (shardRarity.toLowerCase()) {
                        case "common" -> commonRequiredShards;
                        case "uncommon" -> uncommonRequiredShards;
                        case "rare" -> rareRequiredShards;
                        case "veryrare" -> veryRareRequiredShards;
                        case "ultrarare" -> ultraRareRequiredShards;
                        default -> requiredShards;
                    };
                    stacksCombined = consumeShards(heldItem, player, requiredShards, stacksCombined);


                    if (stacksCombined==0) {
                        player.sendMessage(Text.of("Not enough Shards to combine"),true);
                    }
                    if (stacksCombined>0) {
                        // give [stacksCombined] number of megastones
                        player.playSound(SoundEvents.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.NEUTRAL,1F,1F);
                        createRawMegastones(player,shardRarity,stacksCombined);
                    }
                }

            }

        return super.use(world, player, hand);
    }

    private boolean canCombineShards(ItemStack stack, int requiredShards) {
        // check whether item is a shard that can combine
        if (stack.getCount() >= requiredShards) { // checks if 9 or more shards are in the stack
            return true;
        }
        return false;
    }

    private int consumeShards(ItemStack stack, PlayerEntity player, int requiredShards, int stacksCombined) {
        // Combine 9 shards
        while (canCombineShards(stack, requiredShards)) {
            stack.decrement(requiredShards);
            stacksCombined += 1;
        }
        return stacksCombined;
    }


    private void createRawMegastones(PlayerEntity player, String megastoneRarity, int numberOfStonesToGive) {

       PlayerInventory inventory = player.getInventory();
       ItemStack rawMegastoneItemStack = MegastonesItems.getItemStackByName(biome+"_raw_megastone"); // the relevant raw megastone to give

        for (int i = 0; i < numberOfStonesToGive; i++) {
            ItemStack megastoneStack = rawMegastoneItemStack.copy(); // Use a copy of the original ItemStack
            NbtCompound nbt = megastoneStack.getOrCreateNbt(); // Use getOrCreateNbt() to make sure NBT is present
            nbt.putString("Rarity", megastoneRarity);

            if (!inventory.insertStack(megastoneStack)) {
                player.dropItem(megastoneStack, true);
            }
        }

    }
}
