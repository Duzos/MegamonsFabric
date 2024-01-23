package git.dragomordor.megastones.world.gen;

import git.dragomordor.megastones.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModGeodeGeneration {
//    public static void generateGeodes() {
//        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
//                GenerationStep.Feature.LOCAL_MODIFICATIONS, ModPlacedFeatures.ALAKAZITE_GEODE_PLACED_KEY);
//    }

    public static void generateGeodes() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ALAKAZITE_GEODE_PLACED_KEY);
    }




}
