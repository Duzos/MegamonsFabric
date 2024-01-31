package git.dragomordor.megamons.world.gen;

import com.cobblemon.mod.common.api.tags.CobblemonBiomeTags;
import git.dragomordor.megamons.MegamonsMod;
import git.dragomordor.megamons.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

import java.util.List;
import java.util.function.Predicate;

public class ModGeodeGeneration {

    public static void generateGeodes() {

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.AERODACTYLITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.ALAKAZITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.BEEDRILLITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.BLASTOISINITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.CHARIZARDITEX_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.CHARIZARDITEY_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.GENGARITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.GYARADOSITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.KANGASKHANITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.MEWTWONITEX_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.MEWTWONITEY_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.PIDGEOTITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.PINSIRITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.SLOWBRONITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.VENUSAURITE_GEODE_PLACED_KEY);

    }

}
