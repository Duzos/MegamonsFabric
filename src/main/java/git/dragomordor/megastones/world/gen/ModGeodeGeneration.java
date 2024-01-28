package git.dragomordor.megastones.world.gen;

import com.cobblemon.mod.common.api.tags.CobblemonBiomeTags;
import git.dragomordor.megastones.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModGeodeGeneration {

    public static void generateGeodes() {

        BiomeModifications.addFeature(BiomeSelectors.tag(CobblemonBiomeTags.IS_FOREST),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.AERODACTYLITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(CobblemonBiomeTags.IS_ARID),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.ALAKAZITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(CobblemonBiomeTags.IS_AUTUMN),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.BEEDRILLITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(CobblemonBiomeTags.IS_BADLANDS),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.BLASTOISINITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(CobblemonBiomeTags.IS_BAMBOO),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.CHARIZARDITEX_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(CobblemonBiomeTags.IS_CAVE),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.CHARIZARDITEY_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(CobblemonBiomeTags.IS_COAST),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.GENGARITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(CobblemonBiomeTags.IS_COLD),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.GYARADOSITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(CobblemonBiomeTags.IS_DEEP_DARK),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.KANGASKHANITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(CobblemonBiomeTags.IS_DESERT),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.MEWTWONITEX_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(CobblemonBiomeTags.IS_FRESHWATER),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.MEWTWONITEY_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(CobblemonBiomeTags.IS_SAVANNA),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.PIDGEOTITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(CobblemonBiomeTags.IS_SUMMER),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.PINSIRITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(CobblemonBiomeTags.IS_SWAMP),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.SLOWBRONITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(CobblemonBiomeTags.IS_TUNDRA),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.VENUSAURITE_GEODE_PLACED_KEY);

    }




}
