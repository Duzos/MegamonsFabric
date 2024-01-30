package git.dragomordor.megastones.world.gen;

import com.cobblemon.mod.common.api.tags.CobblemonBiomeTags;
import git.dragomordor.megastones.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

import java.util.List;
import java.util.function.Predicate;

public class ModGeodeGeneration {

    public static void generateGeodes() {

        List<TagKey<Biome>> aerodactylite_tag = List.of(CobblemonBiomeTags.IS_LUSH);
        List<TagKey<Biome>> alakazite_tag = List.of(CobblemonBiomeTags.IS_HILLS,CobblemonBiomeTags.IS_TEMPERATE,CobblemonBiomeTags.IS_MAGICAL);
        List<TagKey<Biome>> beedrillite_tag = List.of(CobblemonBiomeTags.IS_FOREST,CobblemonBiomeTags.IS_JUNGLE);
        List<TagKey<Biome>> blastoisinite_tag = List.of(CobblemonBiomeTags.IS_RIVER);
        List<TagKey<Biome>> charizarditex_tag = List.of(CobblemonBiomeTags.IS_HILLS,CobblemonBiomeTags.IS_VOlCANIC);
        List<TagKey<Biome>> charizarditey_tag = List.of(CobblemonBiomeTags.IS_HILLS,CobblemonBiomeTags.IS_VOlCANIC);
        List<TagKey<Biome>> gengarite_tag = List.of(CobblemonBiomeTags.IS_DEEP_DARK,CobblemonBiomeTags.IS_SPOOKY);
        List<TagKey<Biome>> gyaradosite_tag = List.of(CobblemonBiomeTags.IS_FRESHWATER,CobblemonBiomeTags.IS_COLD_OCEAN,CobblemonBiomeTags.IS_DEEP_OCEAN,CobblemonBiomeTags.IS_FROZEN_OCEAN,CobblemonBiomeTags.IS_LUKEWARM_OCEAN,CobblemonBiomeTags.IS_WARM_OCEAN);
        List<TagKey<Biome>> kangaskhanite_tag = List.of(CobblemonBiomeTags.IS_SAVANNA);
        List<TagKey<Biome>> mewtwonitex_tag = List.of(CobblemonBiomeTags.IS_VOID);
        List<TagKey<Biome>> mewtwonitey_tag = List.of(CobblemonBiomeTags.IS_VOID);
        List<TagKey<Biome>> pidgeotite_tag = List.of(CobblemonBiomeTags.IS_TEMPERATE);
        List<TagKey<Biome>> pinsirite_tag = List.of(CobblemonBiomeTags.IS_JUNGLE,CobblemonBiomeTags.IS_ISLAND);
        List<TagKey<Biome>> slowbronite_tag = List.of(CobblemonBiomeTags.IS_COAST);
        List<TagKey<Biome>> venusaurite_tag = List.of(CobblemonBiomeTags.IS_JUNGLE, CobblemonBiomeTags.IS_ISLAND);

        BiomeModifications.addFeature(MyBiomeSelectors.multipleTags(aerodactylite_tag),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.AERODACTYLITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(MyBiomeSelectors.multipleTags(alakazite_tag),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.ALAKAZITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(MyBiomeSelectors.multipleTags(beedrillite_tag),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.BEEDRILLITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(MyBiomeSelectors.multipleTags(blastoisinite_tag),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.BLASTOISINITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(MyBiomeSelectors.multipleTags(charizarditex_tag),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.CHARIZARDITEX_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(MyBiomeSelectors.multipleTags(charizarditey_tag),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.CHARIZARDITEY_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(MyBiomeSelectors.multipleTags(gengarite_tag),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.GENGARITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(MyBiomeSelectors.multipleTags(gyaradosite_tag),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.GYARADOSITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(MyBiomeSelectors.multipleTags(kangaskhanite_tag),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.KANGASKHANITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(MyBiomeSelectors.multipleTags(mewtwonitex_tag),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.MEWTWONITEX_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(MyBiomeSelectors.multipleTags(mewtwonitey_tag),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.MEWTWONITEY_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(MyBiomeSelectors.multipleTags(pidgeotite_tag),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.PIDGEOTITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(MyBiomeSelectors.multipleTags(pinsirite_tag),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.PINSIRITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(MyBiomeSelectors.multipleTags(slowbronite_tag),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.SLOWBRONITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(MyBiomeSelectors.multipleTags(venusaurite_tag),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.VENUSAURITE_GEODE_PLACED_KEY);

    }



    public static class MyBiomeSelectors {
        public static Predicate<BiomeSelectionContext> multipleTags(List<TagKey<Biome>> tags) {
            return context -> tags.stream().allMatch(context::hasTag);
        }
    }

}
