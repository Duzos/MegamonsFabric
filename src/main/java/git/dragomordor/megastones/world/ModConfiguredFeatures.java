package git.dragomordor.megastones.world;

import git.dragomordor.megastones.MegastonesMod;
import git.dragomordor.megastones.block.MegastonesBlocks;
import git.dragomordor.megastones.util.ModTags;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

import java.util.List;

public class ModConfiguredFeatures {

// Ore configuration
    // Stone ore - Megastone
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_AERODACTYLITE_KEY = registerKey("ore_aerodactylite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_ALAKAZITE_KEY = registerKey("ore_alakazite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_BEEDRILLITE_KEY = registerKey("ore_beedrillite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_BLASTOISINITE_KEY = registerKey("ore_blastoisinite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_CHARIZARDITEX_KEY = registerKey("ore_charizarditex");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_CHARIZARDITEY_KEY = registerKey("ore_charizarditey");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_GENGARITE_KEY = registerKey("ore_gengarite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_GYARADOSITE_KEY = registerKey("ore_gyaradosite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_KANGASKHANITE_KEY = registerKey("ore_kangaskhanite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_MEWTWONITEX_KEY = registerKey("ore_mewtwonitex");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_MEWTWONITEY_KEY = registerKey("ore_mewtwonitey");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_PIDGEOTITE_KEY = registerKey("ore_pidgeotite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_PINSIRITE_KEY = registerKey("ore_pinsirite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_SLOWBRONITE_KEY = registerKey("ore_slowbronite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_VENUSAURITE_KEY = registerKey("ore_venusaurite");

    // Forest Ore
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_FOREST_SHARD_KEY = registerKey("ore_forest_shard");

    // Geodes
    public static final RegistryKey<ConfiguredFeature<?,?>> ALAKAZITE_GEODE_KEY = registerKey("alakazite_geode") ;


// Register ore json files
    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        //RuleTest netherReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER); -------- NOT USED
        //RuleTest endsReplaceables = new BlockMatchRuleTest(Blocks.END_STONE); -------- NOT USED
        RuleTest megastoneWallReplaceables = new TagMatchRuleTest(ModTags.Blocks.GEODE_WALLS);

        List<OreFeatureConfig.Target> overworldAerodactaliteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, MegastonesBlocks.ORE_AERODACTYLITE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MegastonesBlocks.ORE_DEEPSLATE_AERODACTYLITE.getDefaultState()));



        List<OreFeatureConfig.Target> overworldAlakaziteOres = List.of(
                //OreFeatureConfig.createTarget(stoneReplaceables, MegastonesBlocks.ORE_ALAKAZITE.getDefaultState()),
               // OreFeatureConfig.createTarget(deepslateReplaceables, MegastonesBlocks.ORE_DEEPSLATE_ALAKAZITE.getDefaultState()),
                OreFeatureConfig.createTarget(megastoneWallReplaceables, MegastonesBlocks.ORE_ALAKAZITE.getDefaultState())
        );



        List<OreFeatureConfig.Target> overworldBeedrilliteOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, MegastonesBlocks.ORE_BEEDRILLITE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, MegastonesBlocks.ORE_DEEPSLATE_BEEDRILLITE.getDefaultState())
        );

        List<OreFeatureConfig.Target> overworldBlastoisiniteOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, MegastonesBlocks.ORE_BLASTOISINITE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, MegastonesBlocks.ORE_DEEPSLATE_BLASTOISINITE.getDefaultState())
        );

        List<OreFeatureConfig.Target> overworldCharizarditeXOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, MegastonesBlocks.ORE_CHARIZARDITEX.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, MegastonesBlocks.ORE_DEEPSLATE_CHARIZARDITEX.getDefaultState())
        );

        List<OreFeatureConfig.Target> overworldCharizarditeYOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, MegastonesBlocks.ORE_CHARIZARDITEY.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, MegastonesBlocks.ORE_DEEPSLATE_CHARIZARDITEY.getDefaultState())
        );

        List<OreFeatureConfig.Target> overworldGengariteOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, MegastonesBlocks.ORE_GENGARITE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, MegastonesBlocks.ORE_DEEPSLATE_GENGARITE.getDefaultState())
        );

        List<OreFeatureConfig.Target> overworldGyaradositeOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, MegastonesBlocks.ORE_GYARADOSITE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, MegastonesBlocks.ORE_DEEPSLATE_GYARADOSITE.getDefaultState())
        );

        List<OreFeatureConfig.Target> overworldKangaskhaniteOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, MegastonesBlocks.ORE_KANGASKHANITE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, MegastonesBlocks.ORE_DEEPSLATE_KANGASKHANITE.getDefaultState())
        );

        List<OreFeatureConfig.Target> overworldMewtwoniteXOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, MegastonesBlocks.ORE_MEWTWONITEX.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, MegastonesBlocks.ORE_DEEPSLATE_MEWTWONITEX.getDefaultState())
        );

        List<OreFeatureConfig.Target> overworldMewtwoniteYOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, MegastonesBlocks.ORE_MEWTWONITEY.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, MegastonesBlocks.ORE_DEEPSLATE_MEWTWONITEY.getDefaultState())
        );

        List<OreFeatureConfig.Target> overworldPidgeotiteOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, MegastonesBlocks.ORE_PIDGEOTITE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, MegastonesBlocks.ORE_DEEPSLATE_PIDGEOTITE.getDefaultState())
        );

        List<OreFeatureConfig.Target> overworldPinsiriteOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, MegastonesBlocks.ORE_PINSIRITE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, MegastonesBlocks.ORE_DEEPSLATE_PINSIRITE.getDefaultState())
        );

        List<OreFeatureConfig.Target> overworldSlowbroniteOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, MegastonesBlocks.ORE_SLOWBRONITE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, MegastonesBlocks.ORE_DEEPSLATE_SLOWBRONITE.getDefaultState())
        );

        List<OreFeatureConfig.Target> overworldVenusauriteOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, MegastonesBlocks.ORE_VENUSAURITE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, MegastonesBlocks.ORE_DEEPSLATE_VENUSAURITE.getDefaultState())
        );

        // Forest shards
        List<OreFeatureConfig.Target> overworldForestShardOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, MegastonesBlocks.ORE_FOREST_SHARD.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, MegastonesBlocks.ORE_DEEPSLATE_FOREST_SHARD.getDefaultState())
        );



        // Key:
            // Uncommon (slightly rarer than lapis): size: 5, discardOnAirChance: 0.0F
            // Rare (equivalent to diamonds, smaller vein size): size: 3, discardOnAirChance: 0.5F
            // Very Rare (equivalent to Netherite, can still be found in caves exposed to air rarely): size: 2, discardOnAirChance: 0.8F
            // Ultra Rare (rare than netherite, can never be found exposed to air): size: 1, discardOnAirChance: 1.0F
            // Unobtainable - size: 0, discardOnAirChance: 1.0F

        int uncommonSize = 3;
        int rareSize = 3;
        int veryrareSize = 3;
        int ultrarareSize = 3;

        float uncommonAirDiscard = 0.0F;
        float rareAirDiscard = 0.0F;
        float veryrareAirDiscard = 0.0F;
        float ultrarareAirDiscard = 0.0F;

        register(context, ORE_AERODACTYLITE_KEY, Feature.ORE, new OreFeatureConfig(overworldAerodactaliteOres, ultrarareSize,ultrarareAirDiscard)); // Ultra-Rare

        register(context, ORE_ALAKAZITE_KEY, Feature.ORE, new OreFeatureConfig(overworldAlakaziteOres, 1)); // Rare

        register(context, ORE_BEEDRILLITE_KEY, Feature.ORE, new OreFeatureConfig(overworldBeedrilliteOres, uncommonSize,uncommonAirDiscard)); // Uncommon
        register(context, ORE_BLASTOISINITE_KEY, Feature.ORE, new OreFeatureConfig(overworldBlastoisiniteOres, ultrarareSize,ultrarareAirDiscard)); //Ultra-Rare
        register(context, ORE_CHARIZARDITEX_KEY, Feature.ORE, new OreFeatureConfig(overworldCharizarditeXOres, ultrarareSize,ultrarareAirDiscard)); //Ultra-Rare
        register(context, ORE_CHARIZARDITEY_KEY, Feature.ORE, new OreFeatureConfig(overworldCharizarditeYOres, ultrarareSize,ultrarareAirDiscard)); //Ultra-Rare
        register(context, ORE_GENGARITE_KEY, Feature.ORE, new OreFeatureConfig(overworldGengariteOres, rareSize,rareAirDiscard)); // Rare
        register(context, ORE_GYARADOSITE_KEY, Feature.ORE, new OreFeatureConfig(overworldGyaradositeOres, rareSize,rareAirDiscard)); // Rare
        register(context, ORE_KANGASKHANITE_KEY, Feature.ORE, new OreFeatureConfig(overworldKangaskhaniteOres, uncommonSize,uncommonAirDiscard)); // Uncommon
        register(context, ORE_MEWTWONITEX_KEY, Feature.ORE, new OreFeatureConfig(overworldMewtwoniteXOres, 0,1.0F)); // Unobtainable
        register(context, ORE_MEWTWONITEY_KEY, Feature.ORE, new OreFeatureConfig(overworldMewtwoniteYOres, 0,1.0F)); // Unobtainable
        register(context, ORE_PIDGEOTITE_KEY, Feature.ORE, new OreFeatureConfig(overworldPidgeotiteOres, rareSize,rareAirDiscard)); // Rare
        register(context, ORE_PINSIRITE_KEY, Feature.ORE, new OreFeatureConfig(overworldPinsiriteOres, uncommonSize,uncommonAirDiscard)); // Uncommon
        register(context, ORE_SLOWBRONITE_KEY, Feature.ORE, new OreFeatureConfig(overworldSlowbroniteOres, uncommonSize,uncommonAirDiscard)); //Uncommon
        register(context, ORE_VENUSAURITE_KEY, Feature.ORE, new OreFeatureConfig(overworldVenusauriteOres, ultrarareSize,ultrarareAirDiscard)); // Ultra-Rare

        // Forest Ore
        register(context, ORE_FOREST_SHARD_KEY, Feature.ORE, new OreFeatureConfig(overworldForestShardOres, 4,0.0F));

        // Geodes
        // Alakazite geode
        register(context, ALAKAZITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_WALL),
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_WALL),
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_WALL),
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_WALL),
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_WALL),
                        List.of(MegastonesBlocks.ORE_ALAKAZITE.getDefaultState()),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.7D, 2.2D, 3.2D, 4.2D),
                new GeodeCrackConfig(0.0D, 2.0D, 2),
                0.35D, 0.083D,
                true, UniformIntProvider.create(4, 6),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));

    }





    // Helper methods
    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(MegastonesMod.MODID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
