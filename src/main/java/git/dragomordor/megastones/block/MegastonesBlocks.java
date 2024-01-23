package git.dragomordor.megastones.block;

import git.dragomordor.megastones.MegastonesMod;
import git.dragomordor.megastones.block.custom.BiomeShardOreBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class MegastonesBlocks {

    // Stone Ore - Megastones
    public static final Block ORE_AERODACTYLITE = registerBlock("ore_aerodactylite",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.5F,3.0F), UniformIntProvider.create(5,9)));
    public static final Block ORE_ALAKAZITE = registerBlock("ore_alakazite",
                new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.5F,3.0F), UniformIntProvider.create(5,9)));
    public static final Block ORE_BEEDRILLITE = registerBlock("ore_beedrillite",
                new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.5F,3.0F), UniformIntProvider.create(5,9)));
    public static final Block ORE_BLASTOISINITE = registerBlock("ore_blastoisinite",
                new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.5F,3.0F), UniformIntProvider.create(5,9)));
    public static final Block ORE_CHARIZARDITEX = registerBlock("ore_charizarditex",
                new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.5F,3.0F), UniformIntProvider.create(5,9)));
    public static final Block ORE_CHARIZARDITEY = registerBlock("ore_charizarditey",
                new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.5F,3.0F), UniformIntProvider.create(5,9)));
    public static final Block ORE_GENGARITE = registerBlock("ore_gengarite",
                new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.5F,3.0F), UniformIntProvider.create(5,9)));
    public static final Block ORE_GYARADOSITE = registerBlock("ore_gyaradosite",
                new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.5F,3.0F), UniformIntProvider.create(5,9)));
    public static final Block ORE_KANGASKHANITE = registerBlock("ore_kangaskhanite",
                new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.5F,3.0F), UniformIntProvider.create(5,9)));
    public static final Block ORE_MEWTWONITEX = registerBlock("ore_mewtwonitex",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.5F,3.0F), UniformIntProvider.create(5,9)));
    public static final Block ORE_MEWTWONITEY = registerBlock("ore_mewtwonitey",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.5F,3.0F), UniformIntProvider.create(5,9)));
    public static final Block ORE_PIDGEOTITE = registerBlock("ore_pidgeotite",
                new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.5F,3.0F), UniformIntProvider.create(5,9)));
    public static final Block ORE_PINSIRITE = registerBlock("ore_pinsirite",
                new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.5F,3.0F), UniformIntProvider.create(5,9)));
    public static final Block ORE_SLOWBRONITE = registerBlock("ore_slowbronite",
                new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.5F,3.0F), UniformIntProvider.create(5,9)));
    public static final Block ORE_VENUSAURITE = registerBlock("ore_venusaurite",
                new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.5F,3.0F), UniformIntProvider.create(5,9)));

    // Deepslate Ore - Megastones
    public static final Block ORE_DEEPSLATE_AERODACTYLITE = registerBlock("ore_deepslate_aerodactylite",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F), UniformIntProvider.create(5,9)));
    public static final Block ORE_DEEPSLATE_ALAKAZITE = registerBlock("ore_deepslate_alakazite",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F), UniformIntProvider.create(5,9)));
    public static final Block ORE_DEEPSLATE_BEEDRILLITE = registerBlock("ore_deepslate_beedrillite",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F), UniformIntProvider.create(5,9)));
    public static final Block ORE_DEEPSLATE_BLASTOISINITE = registerBlock("ore_deepslate_blastoisinite",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F), UniformIntProvider.create(5,9)));
    public static final Block ORE_DEEPSLATE_CHARIZARDITEX = registerBlock("ore_deepslate_charizarditex",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F), UniformIntProvider.create(5,9)));
    public static final Block ORE_DEEPSLATE_CHARIZARDITEY = registerBlock("ore_deepslate_charizarditey",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F), UniformIntProvider.create(5,9)));
    public static final Block ORE_DEEPSLATE_GENGARITE = registerBlock("ore_deepslate_gengarite",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F), UniformIntProvider.create(5,9)));
    public static final Block ORE_DEEPSLATE_GYARADOSITE = registerBlock("ore_deepslate_gyaradosite",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F), UniformIntProvider.create(5,9)));
    public static final Block ORE_DEEPSLATE_KANGASKHANITE = registerBlock("ore_deepslate_kangaskhanite",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F), UniformIntProvider.create(5,9)));
    public static final Block ORE_DEEPSLATE_MEWTWONITEX = registerBlock("ore_deepslate_mewtwonitex",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F), UniformIntProvider.create(5,9)));
    public static final Block ORE_DEEPSLATE_MEWTWONITEY = registerBlock("ore_deepslate_mewtwonitey",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F), UniformIntProvider.create(5,9)));
    public static final Block ORE_DEEPSLATE_PIDGEOTITE = registerBlock("ore_deepslate_pidgeotite",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F), UniformIntProvider.create(5,9)));
    public static final Block ORE_DEEPSLATE_PINSIRITE = registerBlock("ore_deepslate_pinsirite",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F), UniformIntProvider.create(5,9)));
    public static final Block ORE_DEEPSLATE_SLOWBRONITE = registerBlock("ore_deepslate_slowbronite",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F), UniformIntProvider.create(5,9)));
    public static final Block ORE_DEEPSLATE_VENUSAURITE = registerBlock("ore_deepslate_venusaurite",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F), UniformIntProvider.create(5,9)));

    // Megastone Geode Block
    public static final Block GEODE_MEGASTONE_WALL = registerBlock("geode_megastone_block",
            new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).strength(5.5F,3.5F)));


    // Megastone Shard Ore / biome Ore
    public static final Block ORE_FOREST_SHARD = registerBlock("ore_forest_shard",
            new BiomeShardOreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)
                    .strength(4.5F,3.0F),"forest")); // strength
    public static final Block ORE_DEEPSLATE_FOREST_SHARD = registerBlock("ore_deepslate_forest_shard",
            new BiomeShardOreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)
                    .strength(5.5F,3.5F),"forest")); // strength


    // Helper Methods
    // registerDefault Block
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MegastonesMod.MODID, name), block);
    }

    // register Default BlockItem
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MegastonesMod.MODID, name),
                new BlockItem(block, new FabricItemSettings()));
    }




    public static void registerMegastonesBlocks() {
        MegastonesMod.LOGGER.info("Registering MegastonesBlocks for "+MegastonesMod.MODID);
    }

}
