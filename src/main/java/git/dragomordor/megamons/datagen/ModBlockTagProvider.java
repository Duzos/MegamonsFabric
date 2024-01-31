package git.dragomordor.megamons.datagen;

import git.dragomordor.megamons.block.MegamonsBlocks;
import git.dragomordor.megamons.tags.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {


    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {



        getOrCreateTagBuilder(ModTags.Blocks.ORE_MEGASTONES)
                // Stone ore
                .add(MegamonsBlocks.ORE_AERODACTYLITE)
                .add(MegamonsBlocks.ORE_ALAKAZITE)
                .add(MegamonsBlocks.ORE_BEEDRILLITE)
                .add(MegamonsBlocks.ORE_BLASTOISINITE)
                .add(MegamonsBlocks.ORE_CHARIZARDITEX)
                .add(MegamonsBlocks.ORE_CHARIZARDITEY)
                .add(MegamonsBlocks.ORE_GENGARITE)
                .add(MegamonsBlocks.ORE_GYARADOSITE)
                .add(MegamonsBlocks.ORE_KANGASKHANITE)
                .add(MegamonsBlocks.ORE_MEWTWONITEX)
                .add(MegamonsBlocks.ORE_MEWTWONITEY)
                .add(MegamonsBlocks.ORE_PIDGEOTITE)
                .add(MegamonsBlocks.ORE_PINSIRITE)
                .add(MegamonsBlocks.ORE_SLOWBRONITE)
                .add(MegamonsBlocks.ORE_VENUSAURITE)
                // Deepslate ore
                .add(MegamonsBlocks.ORE_DEEPSLATE_AERODACTYLITE)
                .add(MegamonsBlocks.ORE_DEEPSLATE_ALAKAZITE)
                .add(MegamonsBlocks.ORE_DEEPSLATE_BEEDRILLITE)
                .add(MegamonsBlocks.ORE_DEEPSLATE_BLASTOISINITE)
                .add(MegamonsBlocks.ORE_DEEPSLATE_CHARIZARDITEX)
                .add(MegamonsBlocks.ORE_DEEPSLATE_CHARIZARDITEY)
                .add(MegamonsBlocks.ORE_DEEPSLATE_GENGARITE)
                .add(MegamonsBlocks.ORE_DEEPSLATE_GYARADOSITE)
                .add(MegamonsBlocks.ORE_DEEPSLATE_KANGASKHANITE)
                .add(MegamonsBlocks.ORE_DEEPSLATE_MEWTWONITEX)
                .add(MegamonsBlocks.ORE_DEEPSLATE_MEWTWONITEY)
                .add(MegamonsBlocks.ORE_DEEPSLATE_PIDGEOTITE)
                .add(MegamonsBlocks.ORE_DEEPSLATE_PINSIRITE)
                .add(MegamonsBlocks.ORE_DEEPSLATE_SLOWBRONITE)
                .add(MegamonsBlocks.ORE_DEEPSLATE_VENUSAURITE)
                // Crystal ore
                .add(MegamonsBlocks.ORE_CRYSTAL_AERODACTYLITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_ALAKAZITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_BEEDRILLITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_BLASTOISINITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEX)
                .add(MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEY)
                .add(MegamonsBlocks.ORE_CRYSTAL_GENGARITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_GYARADOSITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_KANGASKHANITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEX)
                .add(MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEY)
                .add(MegamonsBlocks.ORE_CRYSTAL_PIDGEOTITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_PINSIRITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_SLOWBRONITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_VENUSAURITE)

                // Geode Crystal Evo ores
                .add(MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE)
                .add(MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE)
                .add(MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE)
                .add(MegamonsBlocks.CRYSTAL_ICE_STONE_ORE)
                .add(MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE)
                .add(MegamonsBlocks.CRYSTAL_MOON_STONE_ORE)
                .add(MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE)
                .add(MegamonsBlocks.CRYSTAL_SUN_STONE_ORE)
                .add(MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE)
                .add(MegamonsBlocks.CRYSTAL_WATER_STONE_ORE)

                ;

        getOrCreateTagBuilder(ModTags.Blocks.GEODE_WALLS)
                .add(MegamonsBlocks.GEODE_MEGASTONE_CRYSTAL_WALL)
                .add(MegamonsBlocks.GEODE_MEGASTONE_SHELL_WALL)
                ;


       getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
               // Stone ore
               .add(MegamonsBlocks.ORE_AERODACTYLITE)
               .add(MegamonsBlocks.ORE_ALAKAZITE)
               .add(MegamonsBlocks.ORE_BEEDRILLITE)
               .add(MegamonsBlocks.ORE_BLASTOISINITE)
               .add(MegamonsBlocks.ORE_CHARIZARDITEX)
               .add(MegamonsBlocks.ORE_CHARIZARDITEY)
               .add(MegamonsBlocks.ORE_GENGARITE)
               .add(MegamonsBlocks.ORE_GYARADOSITE)
               .add(MegamonsBlocks.ORE_KANGASKHANITE)
               .add(MegamonsBlocks.ORE_MEWTWONITEX)
               .add(MegamonsBlocks.ORE_MEWTWONITEY)
               .add(MegamonsBlocks.ORE_PIDGEOTITE)
               .add(MegamonsBlocks.ORE_PINSIRITE)
               .add(MegamonsBlocks.ORE_SLOWBRONITE)
               .add(MegamonsBlocks.ORE_VENUSAURITE)
               // Deepslate ore
               .add(MegamonsBlocks.ORE_DEEPSLATE_AERODACTYLITE)
               .add(MegamonsBlocks.ORE_DEEPSLATE_ALAKAZITE)
               .add(MegamonsBlocks.ORE_DEEPSLATE_BEEDRILLITE)
               .add(MegamonsBlocks.ORE_DEEPSLATE_BLASTOISINITE)
               .add(MegamonsBlocks.ORE_DEEPSLATE_CHARIZARDITEX)
               .add(MegamonsBlocks.ORE_DEEPSLATE_CHARIZARDITEY)
               .add(MegamonsBlocks.ORE_DEEPSLATE_GENGARITE)
               .add(MegamonsBlocks.ORE_DEEPSLATE_GYARADOSITE)
               .add(MegamonsBlocks.ORE_DEEPSLATE_KANGASKHANITE)
               .add(MegamonsBlocks.ORE_DEEPSLATE_MEWTWONITEX)
               .add(MegamonsBlocks.ORE_DEEPSLATE_MEWTWONITEY)
               .add(MegamonsBlocks.ORE_DEEPSLATE_PIDGEOTITE)
               .add(MegamonsBlocks.ORE_DEEPSLATE_PINSIRITE)
               .add(MegamonsBlocks.ORE_DEEPSLATE_SLOWBRONITE)
               .add(MegamonsBlocks.ORE_DEEPSLATE_VENUSAURITE)
               // Crystal ore
               .add(MegamonsBlocks.ORE_CRYSTAL_AERODACTYLITE)
               .add(MegamonsBlocks.ORE_CRYSTAL_ALAKAZITE)
               .add(MegamonsBlocks.ORE_CRYSTAL_BEEDRILLITE)
               .add(MegamonsBlocks.ORE_CRYSTAL_BLASTOISINITE)
               .add(MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEX)
               .add(MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEY)
               .add(MegamonsBlocks.ORE_CRYSTAL_GENGARITE)
               .add(MegamonsBlocks.ORE_CRYSTAL_GYARADOSITE)
               .add(MegamonsBlocks.ORE_CRYSTAL_KANGASKHANITE)
               .add(MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEX)
               .add(MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEY)
               .add(MegamonsBlocks.ORE_CRYSTAL_PIDGEOTITE)
               .add(MegamonsBlocks.ORE_CRYSTAL_PINSIRITE)
               .add(MegamonsBlocks.ORE_CRYSTAL_SLOWBRONITE)
               .add(MegamonsBlocks.ORE_CRYSTAL_VENUSAURITE)

               // Geode Crystal Evo ores
               .add(MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE)
               .add(MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE)
               .add(MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE)
               .add(MegamonsBlocks.CRYSTAL_ICE_STONE_ORE)
               .add(MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE)
               .add(MegamonsBlocks.CRYSTAL_MOON_STONE_ORE)
               .add(MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE)
               .add(MegamonsBlocks.CRYSTAL_SUN_STONE_ORE)
               .add(MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE)
               .add(MegamonsBlocks.CRYSTAL_WATER_STONE_ORE)

                // Megastone Geode Block
               .add(MegamonsBlocks.GEODE_MEGASTONE_CRYSTAL_WALL)
               .add(MegamonsBlocks.GEODE_MEGASTONE_SHELL_WALL)

            ;



        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)

            ;

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                // Megastone Geode Block
                .add(MegamonsBlocks.GEODE_MEGASTONE_CRYSTAL_WALL)
                .add(MegamonsBlocks.GEODE_MEGASTONE_SHELL_WALL)
            ;

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                // Stone ore
                .add(MegamonsBlocks.ORE_AERODACTYLITE)
                .add(MegamonsBlocks.ORE_ALAKAZITE)
                .add(MegamonsBlocks.ORE_BEEDRILLITE)
                .add(MegamonsBlocks.ORE_BLASTOISINITE)
                .add(MegamonsBlocks.ORE_CHARIZARDITEX)
                .add(MegamonsBlocks.ORE_CHARIZARDITEY)
                .add(MegamonsBlocks.ORE_GENGARITE)
                .add(MegamonsBlocks.ORE_GYARADOSITE)
                .add(MegamonsBlocks.ORE_KANGASKHANITE)
                .add(MegamonsBlocks.ORE_MEWTWONITEX)
                .add(MegamonsBlocks.ORE_MEWTWONITEY)
                .add(MegamonsBlocks.ORE_PIDGEOTITE)
                .add(MegamonsBlocks.ORE_PINSIRITE)
                .add(MegamonsBlocks.ORE_SLOWBRONITE)
                .add(MegamonsBlocks.ORE_VENUSAURITE)
                // Deepslate ore
                .add(MegamonsBlocks.ORE_DEEPSLATE_AERODACTYLITE)
                .add(MegamonsBlocks.ORE_DEEPSLATE_ALAKAZITE)
                .add(MegamonsBlocks.ORE_DEEPSLATE_BEEDRILLITE)
                .add(MegamonsBlocks.ORE_DEEPSLATE_BLASTOISINITE)
                .add(MegamonsBlocks.ORE_DEEPSLATE_CHARIZARDITEX)
                .add(MegamonsBlocks.ORE_DEEPSLATE_CHARIZARDITEY)
                .add(MegamonsBlocks.ORE_DEEPSLATE_GENGARITE)
                .add(MegamonsBlocks.ORE_DEEPSLATE_GYARADOSITE)
                .add(MegamonsBlocks.ORE_DEEPSLATE_KANGASKHANITE)
                .add(MegamonsBlocks.ORE_DEEPSLATE_MEWTWONITEX)
                .add(MegamonsBlocks.ORE_DEEPSLATE_MEWTWONITEY)
                .add(MegamonsBlocks.ORE_DEEPSLATE_PIDGEOTITE)
                .add(MegamonsBlocks.ORE_DEEPSLATE_PINSIRITE)
                .add(MegamonsBlocks.ORE_DEEPSLATE_SLOWBRONITE)
                .add(MegamonsBlocks.ORE_DEEPSLATE_VENUSAURITE)
                // Crystal ore
                .add(MegamonsBlocks.ORE_CRYSTAL_AERODACTYLITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_ALAKAZITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_BEEDRILLITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_BLASTOISINITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEX)
                .add(MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEY)
                .add(MegamonsBlocks.ORE_CRYSTAL_GENGARITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_GYARADOSITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_KANGASKHANITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEX)
                .add(MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEY)
                .add(MegamonsBlocks.ORE_CRYSTAL_PIDGEOTITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_PINSIRITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_SLOWBRONITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_VENUSAURITE)

                // Geode Crystal Evo ores
                .add(MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE)
                .add(MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE)
                .add(MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE)
                .add(MegamonsBlocks.CRYSTAL_ICE_STONE_ORE)
                .add(MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE)
                .add(MegamonsBlocks.CRYSTAL_MOON_STONE_ORE)
                .add(MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE)
                .add(MegamonsBlocks.CRYSTAL_SUN_STONE_ORE)
                .add(MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE)
                .add(MegamonsBlocks.CRYSTAL_WATER_STONE_ORE)


                ;


        getOrCreateTagBuilder(ModTags.Blocks.METAL_DETECTOR_DESTROYABLE_BLOCKS)
                // Megastone Geode Block
                .add(MegamonsBlocks.GEODE_MEGASTONE_CRYSTAL_WALL)
                .add(MegamonsBlocks.GEODE_MEGASTONE_SHELL_WALL)
                ;

         getOrCreateTagBuilder(ModTags.Blocks.METAL_DETECTOR_DETECTABLE_BLOCKS)
                 // Stone ore
                 .add(MegamonsBlocks.ORE_AERODACTYLITE)
                 .add(MegamonsBlocks.ORE_ALAKAZITE)
                 .add(MegamonsBlocks.ORE_BEEDRILLITE)
                 .add(MegamonsBlocks.ORE_BLASTOISINITE)
                 .add(MegamonsBlocks.ORE_CHARIZARDITEX)
                 .add(MegamonsBlocks.ORE_CHARIZARDITEY)
                 .add(MegamonsBlocks.ORE_GENGARITE)
                 .add(MegamonsBlocks.ORE_GYARADOSITE)
                 .add(MegamonsBlocks.ORE_KANGASKHANITE)
                 .add(MegamonsBlocks.ORE_MEWTWONITEX)
                 .add(MegamonsBlocks.ORE_MEWTWONITEY)
                 .add(MegamonsBlocks.ORE_PIDGEOTITE)
                 .add(MegamonsBlocks.ORE_PINSIRITE)
                 .add(MegamonsBlocks.ORE_SLOWBRONITE)
                 .add(MegamonsBlocks.ORE_VENUSAURITE)
                 // Deepslate ore
                 .add(MegamonsBlocks.ORE_DEEPSLATE_AERODACTYLITE)
                 .add(MegamonsBlocks.ORE_DEEPSLATE_ALAKAZITE)
                 .add(MegamonsBlocks.ORE_DEEPSLATE_BEEDRILLITE)
                 .add(MegamonsBlocks.ORE_DEEPSLATE_BLASTOISINITE)
                 .add(MegamonsBlocks.ORE_DEEPSLATE_CHARIZARDITEX)
                 .add(MegamonsBlocks.ORE_DEEPSLATE_CHARIZARDITEY)
                 .add(MegamonsBlocks.ORE_DEEPSLATE_GENGARITE)
                 .add(MegamonsBlocks.ORE_DEEPSLATE_GYARADOSITE)
                 .add(MegamonsBlocks.ORE_DEEPSLATE_KANGASKHANITE)
                 .add(MegamonsBlocks.ORE_DEEPSLATE_MEWTWONITEX)
                 .add(MegamonsBlocks.ORE_DEEPSLATE_MEWTWONITEY)
                 .add(MegamonsBlocks.ORE_DEEPSLATE_PIDGEOTITE)
                 .add(MegamonsBlocks.ORE_DEEPSLATE_PINSIRITE)
                 .add(MegamonsBlocks.ORE_DEEPSLATE_SLOWBRONITE)
                 .add(MegamonsBlocks.ORE_DEEPSLATE_VENUSAURITE)
                 // Crystal ore
                 .add(MegamonsBlocks.ORE_CRYSTAL_AERODACTYLITE)
                 .add(MegamonsBlocks.ORE_CRYSTAL_ALAKAZITE)
                 .add(MegamonsBlocks.ORE_CRYSTAL_BEEDRILLITE)
                 .add(MegamonsBlocks.ORE_CRYSTAL_BLASTOISINITE)
                 .add(MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEX)
                 .add(MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEY)
                 .add(MegamonsBlocks.ORE_CRYSTAL_GENGARITE)
                 .add(MegamonsBlocks.ORE_CRYSTAL_GYARADOSITE)
                 .add(MegamonsBlocks.ORE_CRYSTAL_KANGASKHANITE)
                 .add(MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEX)
                 .add(MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEY)
                 .add(MegamonsBlocks.ORE_CRYSTAL_PIDGEOTITE)
                 .add(MegamonsBlocks.ORE_CRYSTAL_PINSIRITE)
                 .add(MegamonsBlocks.ORE_CRYSTAL_SLOWBRONITE)
                 .add(MegamonsBlocks.ORE_CRYSTAL_VENUSAURITE)

                 // Geode Crystal Evo ores
                 .add(MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE)
                 .add(MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE)
                 .add(MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE)
                 .add(MegamonsBlocks.CRYSTAL_ICE_STONE_ORE)
                 .add(MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE)
                 .add(MegamonsBlocks.CRYSTAL_MOON_STONE_ORE)
                 .add(MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE)
                 .add(MegamonsBlocks.CRYSTAL_SUN_STONE_ORE)
                 .add(MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE)
                 .add(MegamonsBlocks.CRYSTAL_WATER_STONE_ORE)

                ;

    }
}
