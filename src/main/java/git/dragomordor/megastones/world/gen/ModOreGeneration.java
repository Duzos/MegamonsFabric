package git.dragomordor.megastones.world.gen;

import git.dragomordor.megastones.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

import java.util.List;

public class ModOreGeneration {
    public static void generateOres() {

        // Aerodactylite - Mounains
        BiomeModifications.addFeature(
                BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN), // Mountains
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_AERODACTYLITE_PLACED_KEY);



//        // Alakazite - Mountains
//        BiomeModifications.addFeature(
//                BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN), // Mountains
//                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_ALAKAZITE_PLACED_KEY);

        // Alakazite - Geodes
        BiomeModifications.addFeature(
                BiomeSelectors.foundInOverworld(), // Mountains
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_ALAKAZITE_PLACED_KEY);



        // Beedrilite - Forests/Plains
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                        BiomeKeys.PLAINS,BiomeKeys.SNOWY_PLAINS,BiomeKeys.SUNFLOWER_PLAINS, //plains
                        BiomeKeys.FOREST,BiomeKeys.FOREST,BiomeKeys.FLOWER_FOREST,BiomeKeys.BIRCH_FOREST), // forests
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_BEEDRILLITE_PLACED_KEY);
        // Blastoisinite - Deep Oceans, Warm Oceans
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                BiomeKeys.WARM_OCEAN, // Warm Ocean
                BiomeKeys.DEEP_OCEAN), // Deep Ocean
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_BLASTOISINITE_PLACED_KEY);
        // charizardite - Mountains
        BiomeModifications.addFeature(
                BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN), // Mountains
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_CHARIZARDITEX_PLACED_KEY);
        // charizardite - Mountains
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_CHARIZARDITEY_PLACED_KEY);
        // gengarite - Dark forests, Jungles
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                BiomeKeys.DARK_FOREST, // Dark Forest
                BiomeKeys.JUNGLE, BiomeKeys.SPARSE_JUNGLE, BiomeKeys.BAMBOO_JUNGLE), // Jungles
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_GENGARITE_PLACED_KEY);
        // gyaradosite - Deep Oceans, Warm Oceans
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WARM_OCEAN, BiomeKeys.DEEP_OCEAN),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_GYARADOSITE_PLACED_KEY);
        // kangaskhanite - Savannahs
        BiomeModifications.addFeature(
                BiomeSelectors.tag(BiomeTags.IS_SAVANNA), // Savannahs
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_KANGASKHANITE_PLACED_KEY);
        // Mewtwonite - Unobtainable
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(), // Unobtainable
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_MEWTWONITEX_PLACED_KEY);
        // Mewtwonite - Unobtainable
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(), // Unobtainable
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_MEWTWONITEY_PLACED_KEY);
        // pidegeotite - Forests, Plains
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                BiomeKeys.PLAINS,BiomeKeys.SNOWY_PLAINS,BiomeKeys.SUNFLOWER_PLAINS, //plains
                BiomeKeys.FOREST,BiomeKeys.FOREST,BiomeKeys.FLOWER_FOREST,BiomeKeys.BIRCH_FOREST), // forests
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_PIDGEOTITE_PLACED_KEY);
        // Pinsirite - Dark Forest, Jungles
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                        BiomeKeys.DARK_FOREST, // Dark Forest
                        BiomeKeys.JUNGLE, BiomeKeys.SPARSE_JUNGLE, BiomeKeys.BAMBOO_JUNGLE), // Jungles
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_PINSIRITE_PLACED_KEY);
        // slowbronite - Beaches
        BiomeModifications.addFeature(BiomeSelectors.tag(
                BiomeTags.IS_BEACH), // Beaches
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_SLOWBRONITE_PLACED_KEY);
        // venasaurite - Dark Forest, Jungles
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                        BiomeKeys.DARK_FOREST, // Dark Forest
                        BiomeKeys.JUNGLE, BiomeKeys.SPARSE_JUNGLE, BiomeKeys.BAMBOO_JUNGLE), // Jungles
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_VENUSAURITE_PLACED_KEY);


        // Forest Ore - Forests
        BiomeModifications.addFeature(BiomeSelectors.tag(
                        BiomeTags.IS_FOREST), //Forest
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_FOREST_SHARD_PLACED_KEY);




    }
}
