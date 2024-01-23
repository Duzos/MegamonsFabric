package git.dragomordor.megastones.item.custom;

import com.cobblemon.mod.common.CobblemonSounds;
import git.dragomordor.megastones.util.RarityMaps;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.LiteralTextContent;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BiomeRawMegastoneItem extends Item {
    private final String biome;
    public BiomeRawMegastoneItem(String biome) {
        super(new FabricItemSettings());
        this.biome = biome;
    }


    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {


        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();
        Direction facing = context.getSide();
        PlayerEntity player = context.getPlayer();
        PlayerInventory inventory = player.getInventory();

        // only when player is sneaking
        if (player.isSneaking()) {
            // When Raw megastone is used on a stonecutter
            if ( (world.getBlockState(pos).isOf(Blocks.STONECUTTER)) && (facing==Direction.UP) ) {
                ItemStack rawMegastoneItemStack = context.getStack();
                String rarity = RarityMaps.getRarityFromItem(rawMegastoneItemStack);

                // Create a Cut Megastone item
                //ItemStack cutMegastoneItemStack = MegastonesItems.CUT_AERODACTYLITE.getDefaultStack();
                ItemStack cutMegastoneItemStack = RarityMaps.generateRandomCutMegastone(biome, rarity);
                // Give the player the Cut Megastone item
                if (!inventory.insertStack(cutMegastoneItemStack)) {
                    player.dropItem(cutMegastoneItemStack, true);
                }
                // Decrease the Raw Megastone stack size by 1
                rawMegastoneItemStack.decrement(1);
                player.playSound(SoundEvents.UI_STONECUTTER_TAKE_RESULT, SoundCategory.NEUTRAL,1F,1F);
                return ActionResult.SUCCESS;
            }
        }
        return super.useOnBlock(context);
    }

    @Override
    @Environment(EnvType.CLIENT)
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);

        NbtCompound nbt = stack.getNbt();

        if ((nbt != null) && nbt.contains("Rarity")) {
            String rarity = nbt.getString("Rarity");
            String rarityName = RarityMaps.getRarityNames().getOrDefault(rarity, "Unknown Rarity");
            Formatting rarityColor = RarityMaps.getRarityColors().getOrDefault(rarity, Formatting.WHITE);

            LiteralTextContent rarityLiteralText = new LiteralTextContent(rarityName);
            Text rarityText = MutableText.of(rarityLiteralText).setStyle(Style.EMPTY.withColor(rarityColor));
            tooltip.add(rarityText);
        }
    }


}
