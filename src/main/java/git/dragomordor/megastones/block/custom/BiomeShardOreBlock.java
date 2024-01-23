package git.dragomordor.megastones.block.custom;

import git.dragomordor.megastones.MegastonesMod;
import git.dragomordor.megastones.config.ModConfig;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class BiomeShardOreBlock extends Block {

    private final String biome;

    public BiomeShardOreBlock(Settings settings, String biome) {
        super(settings);
        this.biome = biome;

    }


    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        super.onBreak(world, pos, state, player);

        // drops nothing in creative mode
        if (player.isCreative()) {
            return;
        }

        // Check if the player is holding a diamond pickaxe or better
        ItemStack mainHandStack = player.getMainHandStack();
        Item mainHandItem = mainHandStack.getItem();

        if ((mainHandItem instanceof PickaxeItem)
            && (((PickaxeItem) mainHandItem).getMaterial().getMiningLevel() >= ToolMaterials.DIAMOND.getMiningLevel())) {
            // PLayer is holding correct tool and mining level

            // Check if the pickaxe has Silk Touch enchantment
            boolean hasSilkTouch = EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, mainHandStack) > 0;

            if (hasSilkTouch) {
                // Drop the block itself instead of shards
                Block.dropStack(world, pos, new ItemStack(this));
            } else {

                // Read drop percentages from the ModConfig class
                int commonBaseChance = ModConfig.getCommonShardBaseChancePercent();
                int uncommonBaseChance = ModConfig.getUncommonShardBaseChancePercent();
                int rareBaseChance = ModConfig.getRareShardBaseChancePercent();
                int veryRareBaseChance = ModConfig.getVeryRareShardBaseChancePercent();
                int ultraRareBaseChance = ModConfig.getUltraRareShardBaseChancePercent();

                int fortuneLevel = EnchantmentHelper.getLevel(Enchantments.FORTUNE, player.getMainHandStack());

                float commonChance = commonBaseChance;
                float uncommonChance = uncommonBaseChance;
                float rareChance = rareBaseChance;
                float veryRareChance = veryRareBaseChance;
                float ultraRareChance = ultraRareBaseChance;

                // if fortune level exists
                float commonFortuneWeight = 0F;
                float uncommonFortuneWeight =  0.4F;
                float rareFortuneWeight = 0.8F;
                float veryRareFortuneWeight = 1.2F;
                float ultraRareFortuneWeight = 1.6F;


                if (fortuneLevel>0) {
                    commonChance *= (float) (commonBaseChance * Math.pow(1 + commonFortuneWeight * fortuneLevel, 1 + ((float) fortuneLevel / 10)));
                    uncommonChance *= (float) (uncommonChance * Math.pow(1 + uncommonFortuneWeight * fortuneLevel, 1 + ((float) fortuneLevel / 10)));
                    rareChance *= (float) (rareBaseChance * Math.pow(1 + rareFortuneWeight * fortuneLevel, 1 + ((float) fortuneLevel / 10)));
                    veryRareChance *= (float) (veryRareBaseChance * Math.pow(1 + veryRareFortuneWeight * fortuneLevel, 1 + ((float) fortuneLevel / 10)));
                    ultraRareChance *= (float) (ultraRareBaseChance * Math.pow(1 + ultraRareFortuneWeight * fortuneLevel, 1 + ((float) fortuneLevel / 10)));
                }

                if (commonChance<=0) {
                    commonChance=0;
                }

                // Config for furtune to affect shard drops

                Random rand = new Random();
                float totalChances = commonChance+uncommonChance+rareChance+veryRareChance+ultraRareChance;
                float dropChance = rand.nextFloat(totalChances); // Generate a random number between 1 and Sum of chances

                String shardRarity;
                if (dropChance <= commonChance) {
                    shardRarity = "common";
                } else if (dropChance <= commonChance + uncommonChance) {
                    shardRarity = "uncommon";
                } else if (dropChance <= commonChance + uncommonChance + rareChance) {
                    shardRarity = "rare";
                } else if (dropChance <= commonChance + uncommonChance + rareChance + veryRareChance) {
                    shardRarity = "very_rare";
                } else {
                    shardRarity = "ultra_rare";
                }

                String shardName = (biome+"_shard");
                dropShard(world, pos, shardName ,shardRarity);

            }

        } else {
            // If not broken by a diamond pickaxe or better, do nothing
            super.onBreak(world, pos, state, player);
        }
    }

    private void dropShard(World world, BlockPos pos, String shardName, String shardRarity) {
        // Drop the shard as an item with NBT data indicating its rarity
        Item shardItem = Registries.ITEM.get(new Identifier(MegastonesMod.MODID,shardName));;
        ItemStack shardStack = new ItemStack(shardItem, 1);

        // Create NBT data to represent shard rarity
        NbtCompound nbt = new NbtCompound();
        nbt.putString("Rarity", shardRarity);
        shardStack.setNbt(nbt);

        // Spawn the shard in the world
        Block.dropStack(world, pos, shardStack);
    }

}
