package git.dragomordor.megastones.world;

import com.cobblemon.mod.common.api.tags.CobblemonBiomeTags;
import git.dragomordor.megastones.MegastonesMod;
import git.dragomordor.megastones.world.gen.ModGeodeGeneration;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {

    // stone ores - Megastones
    public static final RegistryKey<PlacedFeature> ORE_AERODACTYLITE_PLACED_KEY = registerKey("ore_aerodactylite_placed");
    public static final RegistryKey<PlacedFeature> ORE_ALAKAZITE_PLACED_KEY = registerKey("ore_alakazite_placed");
    public static final RegistryKey<PlacedFeature> ORE_BEEDRILLITE_PLACED_KEY = registerKey("ore_beedrillite_placed");
    public static final RegistryKey<PlacedFeature> ORE_BLASTOISINITE_PLACED_KEY = registerKey("ore_blastoisinite_placed");
    public static final RegistryKey<PlacedFeature> ORE_CHARIZARDITEX_PLACED_KEY = registerKey("ore_charizarditex_placed");
    public static final RegistryKey<PlacedFeature> ORE_CHARIZARDITEY_PLACED_KEY = registerKey("ore_charizarditey_placed");
    public static final RegistryKey<PlacedFeature> ORE_GENGARITE_PLACED_KEY = registerKey("ore_gengarite_placed");
    public static final RegistryKey<PlacedFeature> ORE_GYARADOSITE_PLACED_KEY = registerKey("ore_gyaradosite_placed");
    public static final RegistryKey<PlacedFeature> ORE_KANGASKHANITE_PLACED_KEY = registerKey("ore_kangaskhanite_placed");
    public static final RegistryKey<PlacedFeature> ORE_MEWTWONITEX_PLACED_KEY = registerKey("ore_mewtwonitex_placed");
    public static final RegistryKey<PlacedFeature> ORE_MEWTWONITEY_PLACED_KEY = registerKey("ore_mewtwonitey_placed");
    public static final RegistryKey<PlacedFeature> ORE_PIDGEOTITE_PLACED_KEY = registerKey("ore_pidgeotite_placed");
    public static final RegistryKey<PlacedFeature> ORE_PINSIRITE_PLACED_KEY = registerKey("ore_pinsirite_placed");
    public static final RegistryKey<PlacedFeature> ORE_SLOWBRONITE_PLACED_KEY = registerKey("ore_slowbronite_placed");
    public static final RegistryKey<PlacedFeature> ORE_VENUSAURITE_PLACED_KEY = registerKey("ore_venusaurite_placed");


    // Forest Ore
    public static final RegistryKey<PlacedFeature> ORE_FOREST_SHARD_PLACED_KEY = registerKey("ore_forest_shard_placed");

    // Geodes
    public static final RegistryKey<PlacedFeature> AERODACTYLITE_GEODE_PLACED_KEY = registerKey("aerodactylite_geode_placed");
    public static final RegistryKey<PlacedFeature> ALAKAZITE_GEODE_PLACED_KEY = registerKey("alakazite_geode_placed");
    public static final RegistryKey<PlacedFeature> BEEDRILLITE_GEODE_PLACED_KEY = registerKey("beedrillite_geode_placed");
    public static final RegistryKey<PlacedFeature> BLASTOISINITE_GEODE_PLACED_KEY = registerKey("blastoisinite_geode_placed");
    public static final RegistryKey<PlacedFeature> CHARIZARDITEX_GEODE_PLACED_KEY = registerKey("charizarditex_geode_placed");
    public static final RegistryKey<PlacedFeature> CHARIZARDITEY_GEODE_PLACED_KEY = registerKey("charizarditey_geode_placed");
    public static final RegistryKey<PlacedFeature> GENGARITE_GEODE_PLACED_KEY = registerKey("gengarite_geode_placed");
    public static final RegistryKey<PlacedFeature> GYARADOSITE_GEODE_PLACED_KEY = registerKey("gyaradosite_geode_placed");
    public static final RegistryKey<PlacedFeature> KANGASKHANITE_GEODE_PLACED_KEY = registerKey("kangaskhanite_geode_placed");
    public static final RegistryKey<PlacedFeature> MEWTWONITEX_GEODE_PLACED_KEY = registerKey("mewtwonitex_geode_placed");
    public static final RegistryKey<PlacedFeature> MEWTWONITEY_GEODE_PLACED_KEY = registerKey("mewtwonitey_geode_placed");
    public static final RegistryKey<PlacedFeature> PIDGEOTITE_GEODE_PLACED_KEY = registerKey("pidgeotite_geode_placed");
    public static final RegistryKey<PlacedFeature> PINSIRITE_GEODE_PLACED_KEY = registerKey("pinsirite_geode_placed");
    public static final RegistryKey<PlacedFeature> SLOWBRONITE_GEODE_PLACED_KEY = registerKey("slowbronite_geode_placed");
    public static final RegistryKey<PlacedFeature> VENUSAURITE_GEODE_PLACED_KEY = registerKey("venusaurite_geode_placed");





    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

                // Key:
                // Uncommon (slightly rarer than lapis): modifierswithcount, count: 2 , trapezoid
                // Rare (equivalent to diamonds, smaller vein size):modifierswithcount, count: 1, trapezoid
                // Very Rare (equivalent to Netherite, can still be found in caves exposed to air rarely): modifierswithrarity, chance: 9, trapezoid
                // Ultra Rare (rare than netherite, can never be found exposed to air):modifierswithrarity, chance: 3, trapezoid
                // Unobtainable - size: 0, discardOnAirChance: 1.0F

                int aboveDeepslateUpper = 80;
                int aboveDeepslateLower = 5;
                int belowDeepslateUpper = 5;
                int belowDeepslateLower = -80;


                int uncommonCount = 2;
                int rareCount = 2;
                int veryrareCount = 2;
                int ultrarareount = 2;


//                // Aerodactylite - Mounains, Below Deepslate, Ultra-rare
//                register(context, ORE_AERODACTYLITE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_AERODACTYLITE_KEY),
//                        ModOrePlacement.modifiersWithCount(ultrarareount,
//                                HeightRangePlacementModifier.trapezoid(
//                                        YOffset.fixed(belowDeepslateLower), YOffset.fixed(belowDeepslateUpper))));
//
//                // Alakazite - Geode Walls
//                register(context, ORE_ALAKAZITE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_ALAKAZITE_KEY),
//                        ModOrePlacement.modifiersWithCount(1,
//                                HeightRangePlacementModifier.trapezoid(
//                                        YOffset.fixed(-80), YOffset.fixed(80))));
//
//
//                // Beedrilite - Forests, Above Deepslate, Uncommon
//                register(context, ORE_BEEDRILLITE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_BEEDRILLITE_KEY),
//                        ModOrePlacement.modifiersWithCount(uncommonCount,
//                                HeightRangePlacementModifier.trapezoid(
//                                        YOffset.fixed(aboveDeepslateLower), YOffset.fixed(aboveDeepslateUpper))));
//                // Blastoisinite - Warm Oceans, Above Deepslate, Uncommon
//                register(context, ORE_BLASTOISINITE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_BLASTOISINITE_KEY),
//                        ModOrePlacement.modifiersWithCount(uncommonCount,
//                                HeightRangePlacementModifier.trapezoid(
//                                        YOffset.fixed(aboveDeepslateLower), YOffset.fixed(aboveDeepslateUpper))));
//                // charizardite - Mountains, Above deepslate, Ultra-rare
//                register(context, ORE_CHARIZARDITEX_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_CHARIZARDITEX_KEY),
//                        ModOrePlacement.modifiersWithCount(ultrarareount,
//                                HeightRangePlacementModifier.trapezoid(
//                                        YOffset.fixed(aboveDeepslateLower), YOffset.fixed(300))));
//                // charizardite - Mountains, Above deepslate, Ultra-rare
//                register(context, ORE_CHARIZARDITEY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_CHARIZARDITEY_KEY),
//                        ModOrePlacement.modifiersWithCount(ultrarareount,
//                                HeightRangePlacementModifier.trapezoid(
//                                        YOffset.fixed(aboveDeepslateLower), YOffset.fixed(300))));
//                // gengarite - Dark forests, below deepslate, rare
//                register(context, ORE_GENGARITE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_GENGARITE_KEY),
//                        ModOrePlacement.modifiersWithCount(rareCount,
//                                HeightRangePlacementModifier.trapezoid(
//                                        YOffset.fixed(belowDeepslateLower), YOffset.fixed(belowDeepslateUpper))));
//                // gyaradosite - Deep oceans, Below deepslate, rare
//                register(context, ORE_GYARADOSITE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_GYARADOSITE_KEY),
//                        ModOrePlacement.modifiersWithCount(rareCount,
//                                HeightRangePlacementModifier.trapezoid(
//                                        YOffset.fixed(belowDeepslateLower), YOffset.fixed(belowDeepslateUpper))));
//                // kangaskhanite - Savannahs, Above deepslate, uncommon
//                register(context, ORE_KANGASKHANITE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_KANGASKHANITE_KEY),
//                        ModOrePlacement.modifiersWithCount(uncommonCount,
//                                HeightRangePlacementModifier.trapezoid(
//                                        YOffset.fixed(aboveDeepslateLower), YOffset.fixed(aboveDeepslateUpper))));
//                // Mewtwonite - Unobtainable
//                register(context, ORE_MEWTWONITEX_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_MEWTWONITEX_KEY),
//                        ModOrePlacement.modifiersWithCount(0,
//                                HeightRangePlacementModifier.trapezoid(
//                                        YOffset.fixed(-100), YOffset.fixed(-99))));
//                // Mewtwonite - Unobtainable
//                register(context, ORE_MEWTWONITEY_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_MEWTWONITEY_KEY),
//                        ModOrePlacement.modifiersWithCount(0,
//                                HeightRangePlacementModifier.trapezoid(
//                                        YOffset.fixed(-100), YOffset.fixed(-99))));
//                // pidegeotite - Forests/plains , above deepslate, rare
//                register(context, ORE_PIDGEOTITE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_PIDGEOTITE_KEY),
//                        ModOrePlacement.modifiersWithCount(rareCount,
//                                HeightRangePlacementModifier.trapezoid(
//                                        YOffset.fixed(aboveDeepslateLower), YOffset.fixed(aboveDeepslateUpper))));
//                // Pinsirite - Forests/jungles, above deepslate, uncommon
//                register(context, ORE_PINSIRITE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_PINSIRITE_KEY),
//                        ModOrePlacement.modifiersWithCount(uncommonCount,
//                                HeightRangePlacementModifier.trapezoid(
//                                        YOffset.fixed(aboveDeepslateLower), YOffset.fixed(aboveDeepslateUpper))));
//                // slowbronite - Beaches, Above deepslate, uncommon
//                register(context, ORE_SLOWBRONITE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_SLOWBRONITE_KEY),
//                        ModOrePlacement.modifiersWithCount(uncommonCount,
//                                HeightRangePlacementModifier.trapezoid(
//                                        YOffset.fixed(aboveDeepslateLower), YOffset.fixed(aboveDeepslateUpper))));
//                // venasaurite - Jungles, above deepslate, ultra-rare
//                register(context, ORE_VENUSAURITE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_VENUSAURITE_KEY),
//                        ModOrePlacement.modifiersWithCount(ultrarareount,
//                                HeightRangePlacementModifier.trapezoid(
//                                        YOffset.fixed(aboveDeepslateLower), YOffset.fixed(aboveDeepslateUpper))));
//
//
//                // Forest ore - Forest, above and below deepslate, diamond-rarity
//                register(context, ORE_FOREST_SHARD_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORE_FOREST_SHARD_KEY),
//                        ModOrePlacement.modifiersWithCount(7,
//                                HeightRangePlacementModifier.trapezoid(
//                                        YOffset.fixed(-80), YOffset.fixed(80))));



        //Geodes
        register(context, AERODACTYLITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.AERODACTYLITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(200), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.fixed(6),
                        YOffset.fixed(40)), BiomePlacementModifier.of());
        register(context, ALAKAZITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ALAKAZITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(200), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.fixed(6),
                        YOffset.fixed(40)), BiomePlacementModifier.of());
        register(context, BEEDRILLITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BEEDRILLITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(200), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.fixed(6),
                        YOffset.fixed(40)), BiomePlacementModifier.of());
        register(context, BLASTOISINITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BLASTOISINITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(200), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.fixed(6),
                        YOffset.fixed(40)), BiomePlacementModifier.of());
        register(context, CHARIZARDITEX_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CHARIZARDITEX_GEODE_KEY),
                RarityFilterPlacementModifier.of(200), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.fixed(6),
                        YOffset.fixed(40)), BiomePlacementModifier.of());
        register(context, CHARIZARDITEY_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CHARIZARDITEY_GEODE_KEY),
                RarityFilterPlacementModifier.of(200), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.fixed(6),
                        YOffset.fixed(40)), BiomePlacementModifier.of());
        register(context, GENGARITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GENGARITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(200), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.fixed(6),
                        YOffset.fixed(40)), BiomePlacementModifier.of());
        register(context, GYARADOSITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GYARADOSITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(200), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.fixed(6),
                        YOffset.fixed(40)), BiomePlacementModifier.of());
        register(context, KANGASKHANITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.KANGASKHANITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(200), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.fixed(6),
                        YOffset.fixed(40)), BiomePlacementModifier.of());
        register(context, MEWTWONITEX_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MEWTWONITEX_GEODE_KEY),
                RarityFilterPlacementModifier.of(200), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.fixed(6),
                        YOffset.fixed(40)), BiomePlacementModifier.of());
        register(context, MEWTWONITEY_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MEWTWONITEY_GEODE_KEY),
                RarityFilterPlacementModifier.of(200), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.fixed(6),
                        YOffset.fixed(40)), BiomePlacementModifier.of());
        register(context, PIDGEOTITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PIDGEOTITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(200), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.fixed(6),
                        YOffset.fixed(40)), BiomePlacementModifier.of());
        register(context, PINSIRITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PINSIRITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(200), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.fixed(6),
                        YOffset.fixed(40)), BiomePlacementModifier.of());
        register(context, SLOWBRONITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SLOWBRONITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(200), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.fixed(6),
                        YOffset.fixed(40)), BiomePlacementModifier.of());
       register(context, VENUSAURITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.VENUSAURITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(200), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.fixed(6),
                        YOffset.fixed(40)), BiomePlacementModifier.of());


    }



    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MegastonesMod.MODID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }

}
