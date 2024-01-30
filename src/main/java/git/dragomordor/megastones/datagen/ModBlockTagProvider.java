package git.dragomordor.megastones.datagen;

import com.cobblemon.mod.common.CobblemonBlocks;
import git.dragomordor.megastones.block.MegastonesBlocks;
import git.dragomordor.megastones.util.ModTags;
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
                .add(MegastonesBlocks.ORE_AERODACTYLITE)
                .add(MegastonesBlocks.ORE_ALAKAZITE)
                .add(MegastonesBlocks.ORE_BEEDRILLITE)
                .add(MegastonesBlocks.ORE_BLASTOISINITE)
                .add(MegastonesBlocks.ORE_CHARIZARDITEX)
                .add(MegastonesBlocks.ORE_CHARIZARDITEY)
                .add(MegastonesBlocks.ORE_GENGARITE)
                .add(MegastonesBlocks.ORE_GYARADOSITE)
                .add(MegastonesBlocks.ORE_KANGASKHANITE)
                .add(MegastonesBlocks.ORE_MEWTWONITEX)
                .add(MegastonesBlocks.ORE_MEWTWONITEY)
                .add(MegastonesBlocks.ORE_PIDGEOTITE)
                .add(MegastonesBlocks.ORE_PINSIRITE)
                .add(MegastonesBlocks.ORE_SLOWBRONITE)
                .add(MegastonesBlocks.ORE_VENUSAURITE)
                // Deepslate ore
                .add(MegastonesBlocks.ORE_DEEPSLATE_AERODACTYLITE)
                .add(MegastonesBlocks.ORE_DEEPSLATE_ALAKAZITE)
                .add(MegastonesBlocks.ORE_DEEPSLATE_BEEDRILLITE)
                .add(MegastonesBlocks.ORE_DEEPSLATE_BLASTOISINITE)
                .add(MegastonesBlocks.ORE_DEEPSLATE_CHARIZARDITEX)
                .add(MegastonesBlocks.ORE_DEEPSLATE_CHARIZARDITEY)
                .add(MegastonesBlocks.ORE_DEEPSLATE_GENGARITE)
                .add(MegastonesBlocks.ORE_DEEPSLATE_GYARADOSITE)
                .add(MegastonesBlocks.ORE_DEEPSLATE_KANGASKHANITE)
                .add(MegastonesBlocks.ORE_DEEPSLATE_MEWTWONITEX)
                .add(MegastonesBlocks.ORE_DEEPSLATE_MEWTWONITEY)
                .add(MegastonesBlocks.ORE_DEEPSLATE_PIDGEOTITE)
                .add(MegastonesBlocks.ORE_DEEPSLATE_PINSIRITE)
                .add(MegastonesBlocks.ORE_DEEPSLATE_SLOWBRONITE)
                .add(MegastonesBlocks.ORE_DEEPSLATE_VENUSAURITE)
                // Crystal ore
                .add(MegastonesBlocks.ORE_CRYSTAL_AERODACTYLITE)
                .add(MegastonesBlocks.ORE_CRYSTAL_ALAKAZITE)
                .add(MegastonesBlocks.ORE_CRYSTAL_BEEDRILLITE)
                .add(MegastonesBlocks.ORE_CRYSTAL_BLASTOISINITE)
                .add(MegastonesBlocks.ORE_CRYSTAL_CHARIZARDITEX)
                .add(MegastonesBlocks.ORE_CRYSTAL_CHARIZARDITEY)
                .add(MegastonesBlocks.ORE_CRYSTAL_GENGARITE)
                .add(MegastonesBlocks.ORE_CRYSTAL_GYARADOSITE)
                .add(MegastonesBlocks.ORE_CRYSTAL_KANGASKHANITE)
                .add(MegastonesBlocks.ORE_CRYSTAL_MEWTWONITEX)
                .add(MegastonesBlocks.ORE_CRYSTAL_MEWTWONITEY)
                .add(MegastonesBlocks.ORE_CRYSTAL_PIDGEOTITE)
                .add(MegastonesBlocks.ORE_CRYSTAL_PINSIRITE)
                .add(MegastonesBlocks.ORE_CRYSTAL_SLOWBRONITE)
                .add(MegastonesBlocks.ORE_CRYSTAL_VENUSAURITE)

                ;

        getOrCreateTagBuilder(ModTags.Blocks.GEODE_WALLS)
                .add(MegastonesBlocks.GEODE_MEGASTONE_CRYSTAL_WALL)
                .add(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL)
                ;


       getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
               // Stone ore
               .add(MegastonesBlocks.ORE_AERODACTYLITE)
               .add(MegastonesBlocks.ORE_ALAKAZITE)
               .add(MegastonesBlocks.ORE_BEEDRILLITE)
               .add(MegastonesBlocks.ORE_BLASTOISINITE)
               .add(MegastonesBlocks.ORE_CHARIZARDITEX)
               .add(MegastonesBlocks.ORE_CHARIZARDITEY)
               .add(MegastonesBlocks.ORE_GENGARITE)
               .add(MegastonesBlocks.ORE_GYARADOSITE)
               .add(MegastonesBlocks.ORE_KANGASKHANITE)
               .add(MegastonesBlocks.ORE_MEWTWONITEX)
               .add(MegastonesBlocks.ORE_MEWTWONITEY)
               .add(MegastonesBlocks.ORE_PIDGEOTITE)
               .add(MegastonesBlocks.ORE_PINSIRITE)
               .add(MegastonesBlocks.ORE_SLOWBRONITE)
               .add(MegastonesBlocks.ORE_VENUSAURITE)
               // Deepslate ore
               .add(MegastonesBlocks.ORE_DEEPSLATE_AERODACTYLITE)
               .add(MegastonesBlocks.ORE_DEEPSLATE_ALAKAZITE)
               .add(MegastonesBlocks.ORE_DEEPSLATE_BEEDRILLITE)
               .add(MegastonesBlocks.ORE_DEEPSLATE_BLASTOISINITE)
               .add(MegastonesBlocks.ORE_DEEPSLATE_CHARIZARDITEX)
               .add(MegastonesBlocks.ORE_DEEPSLATE_CHARIZARDITEY)
               .add(MegastonesBlocks.ORE_DEEPSLATE_GENGARITE)
               .add(MegastonesBlocks.ORE_DEEPSLATE_GYARADOSITE)
               .add(MegastonesBlocks.ORE_DEEPSLATE_KANGASKHANITE)
               .add(MegastonesBlocks.ORE_DEEPSLATE_MEWTWONITEX)
               .add(MegastonesBlocks.ORE_DEEPSLATE_MEWTWONITEY)
               .add(MegastonesBlocks.ORE_DEEPSLATE_PIDGEOTITE)
               .add(MegastonesBlocks.ORE_DEEPSLATE_PINSIRITE)
               .add(MegastonesBlocks.ORE_DEEPSLATE_SLOWBRONITE)
               .add(MegastonesBlocks.ORE_DEEPSLATE_VENUSAURITE)
               // Crystal ore
               .add(MegastonesBlocks.ORE_CRYSTAL_AERODACTYLITE)
               .add(MegastonesBlocks.ORE_CRYSTAL_ALAKAZITE)
               .add(MegastonesBlocks.ORE_CRYSTAL_BEEDRILLITE)
               .add(MegastonesBlocks.ORE_CRYSTAL_BLASTOISINITE)
               .add(MegastonesBlocks.ORE_CRYSTAL_CHARIZARDITEX)
               .add(MegastonesBlocks.ORE_CRYSTAL_CHARIZARDITEY)
               .add(MegastonesBlocks.ORE_CRYSTAL_GENGARITE)
               .add(MegastonesBlocks.ORE_CRYSTAL_GYARADOSITE)
               .add(MegastonesBlocks.ORE_CRYSTAL_KANGASKHANITE)
               .add(MegastonesBlocks.ORE_CRYSTAL_MEWTWONITEX)
               .add(MegastonesBlocks.ORE_CRYSTAL_MEWTWONITEY)
               .add(MegastonesBlocks.ORE_CRYSTAL_PIDGEOTITE)
               .add(MegastonesBlocks.ORE_CRYSTAL_PINSIRITE)
               .add(MegastonesBlocks.ORE_CRYSTAL_SLOWBRONITE)
               .add(MegastonesBlocks.ORE_CRYSTAL_VENUSAURITE)

                // Megastone Geode Block
               .add(MegastonesBlocks.GEODE_MEGASTONE_CRYSTAL_WALL)
               .add(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL)

            ;



        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)

            ;

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                // Megastone Geode Block
                .add(MegastonesBlocks.GEODE_MEGASTONE_CRYSTAL_WALL)
                .add(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL)
            ;

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                // Stone ore
                .add(MegastonesBlocks.ORE_AERODACTYLITE)
                .add(MegastonesBlocks.ORE_ALAKAZITE)
                .add(MegastonesBlocks.ORE_BEEDRILLITE)
                .add(MegastonesBlocks.ORE_BLASTOISINITE)
                .add(MegastonesBlocks.ORE_CHARIZARDITEX)
                .add(MegastonesBlocks.ORE_CHARIZARDITEY)
                .add(MegastonesBlocks.ORE_GENGARITE)
                .add(MegastonesBlocks.ORE_GYARADOSITE)
                .add(MegastonesBlocks.ORE_KANGASKHANITE)
                .add(MegastonesBlocks.ORE_MEWTWONITEX)
                .add(MegastonesBlocks.ORE_MEWTWONITEY)
                .add(MegastonesBlocks.ORE_PIDGEOTITE)
                .add(MegastonesBlocks.ORE_PINSIRITE)
                .add(MegastonesBlocks.ORE_SLOWBRONITE)
                .add(MegastonesBlocks.ORE_VENUSAURITE)
                // Deepslate ore
                .add(MegastonesBlocks.ORE_DEEPSLATE_AERODACTYLITE)
                .add(MegastonesBlocks.ORE_DEEPSLATE_ALAKAZITE)
                .add(MegastonesBlocks.ORE_DEEPSLATE_BEEDRILLITE)
                .add(MegastonesBlocks.ORE_DEEPSLATE_BLASTOISINITE)
                .add(MegastonesBlocks.ORE_DEEPSLATE_CHARIZARDITEX)
                .add(MegastonesBlocks.ORE_DEEPSLATE_CHARIZARDITEY)
                .add(MegastonesBlocks.ORE_DEEPSLATE_GENGARITE)
                .add(MegastonesBlocks.ORE_DEEPSLATE_GYARADOSITE)
                .add(MegastonesBlocks.ORE_DEEPSLATE_KANGASKHANITE)
                .add(MegastonesBlocks.ORE_DEEPSLATE_MEWTWONITEX)
                .add(MegastonesBlocks.ORE_DEEPSLATE_MEWTWONITEY)
                .add(MegastonesBlocks.ORE_DEEPSLATE_PIDGEOTITE)
                .add(MegastonesBlocks.ORE_DEEPSLATE_PINSIRITE)
                .add(MegastonesBlocks.ORE_DEEPSLATE_SLOWBRONITE)
                .add(MegastonesBlocks.ORE_DEEPSLATE_VENUSAURITE)
                // Crystal ore
                .add(MegastonesBlocks.ORE_CRYSTAL_AERODACTYLITE)
                .add(MegastonesBlocks.ORE_CRYSTAL_ALAKAZITE)
                .add(MegastonesBlocks.ORE_CRYSTAL_BEEDRILLITE)
                .add(MegastonesBlocks.ORE_CRYSTAL_BLASTOISINITE)
                .add(MegastonesBlocks.ORE_CRYSTAL_CHARIZARDITEX)
                .add(MegastonesBlocks.ORE_CRYSTAL_CHARIZARDITEY)
                .add(MegastonesBlocks.ORE_CRYSTAL_GENGARITE)
                .add(MegastonesBlocks.ORE_CRYSTAL_GYARADOSITE)
                .add(MegastonesBlocks.ORE_CRYSTAL_KANGASKHANITE)
                .add(MegastonesBlocks.ORE_CRYSTAL_MEWTWONITEX)
                .add(MegastonesBlocks.ORE_CRYSTAL_MEWTWONITEY)
                .add(MegastonesBlocks.ORE_CRYSTAL_PIDGEOTITE)
                .add(MegastonesBlocks.ORE_CRYSTAL_PINSIRITE)
                .add(MegastonesBlocks.ORE_CRYSTAL_SLOWBRONITE)
                .add(MegastonesBlocks.ORE_CRYSTAL_VENUSAURITE)

                ;


        getOrCreateTagBuilder(ModTags.Blocks.METAL_DETECTOR_DESTROYABLE_BLOCKS)
                // Megastone Geode Block
                .add(MegastonesBlocks.GEODE_MEGASTONE_CRYSTAL_WALL)
                .add(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL)
                ;

         getOrCreateTagBuilder(ModTags.Blocks.METAL_DETECTOR_DETECTABLE_BLOCKS)
                 // Stone ore
                 .add(MegastonesBlocks.ORE_AERODACTYLITE)
                 .add(MegastonesBlocks.ORE_ALAKAZITE)
                 .add(MegastonesBlocks.ORE_BEEDRILLITE)
                 .add(MegastonesBlocks.ORE_BLASTOISINITE)
                 .add(MegastonesBlocks.ORE_CHARIZARDITEX)
                 .add(MegastonesBlocks.ORE_CHARIZARDITEY)
                 .add(MegastonesBlocks.ORE_GENGARITE)
                 .add(MegastonesBlocks.ORE_GYARADOSITE)
                 .add(MegastonesBlocks.ORE_KANGASKHANITE)
                 .add(MegastonesBlocks.ORE_MEWTWONITEX)
                 .add(MegastonesBlocks.ORE_MEWTWONITEY)
                 .add(MegastonesBlocks.ORE_PIDGEOTITE)
                 .add(MegastonesBlocks.ORE_PINSIRITE)
                 .add(MegastonesBlocks.ORE_SLOWBRONITE)
                 .add(MegastonesBlocks.ORE_VENUSAURITE)
                 // Deepslate ore
                 .add(MegastonesBlocks.ORE_DEEPSLATE_AERODACTYLITE)
                 .add(MegastonesBlocks.ORE_DEEPSLATE_ALAKAZITE)
                 .add(MegastonesBlocks.ORE_DEEPSLATE_BEEDRILLITE)
                 .add(MegastonesBlocks.ORE_DEEPSLATE_BLASTOISINITE)
                 .add(MegastonesBlocks.ORE_DEEPSLATE_CHARIZARDITEX)
                 .add(MegastonesBlocks.ORE_DEEPSLATE_CHARIZARDITEY)
                 .add(MegastonesBlocks.ORE_DEEPSLATE_GENGARITE)
                 .add(MegastonesBlocks.ORE_DEEPSLATE_GYARADOSITE)
                 .add(MegastonesBlocks.ORE_DEEPSLATE_KANGASKHANITE)
                 .add(MegastonesBlocks.ORE_DEEPSLATE_MEWTWONITEX)
                 .add(MegastonesBlocks.ORE_DEEPSLATE_MEWTWONITEY)
                 .add(MegastonesBlocks.ORE_DEEPSLATE_PIDGEOTITE)
                 .add(MegastonesBlocks.ORE_DEEPSLATE_PINSIRITE)
                 .add(MegastonesBlocks.ORE_DEEPSLATE_SLOWBRONITE)
                 .add(MegastonesBlocks.ORE_DEEPSLATE_VENUSAURITE)
                 // Crystal ore
                 .add(MegastonesBlocks.ORE_CRYSTAL_AERODACTYLITE)
                 .add(MegastonesBlocks.ORE_CRYSTAL_ALAKAZITE)
                 .add(MegastonesBlocks.ORE_CRYSTAL_BEEDRILLITE)
                 .add(MegastonesBlocks.ORE_CRYSTAL_BLASTOISINITE)
                 .add(MegastonesBlocks.ORE_CRYSTAL_CHARIZARDITEX)
                 .add(MegastonesBlocks.ORE_CRYSTAL_CHARIZARDITEY)
                 .add(MegastonesBlocks.ORE_CRYSTAL_GENGARITE)
                 .add(MegastonesBlocks.ORE_CRYSTAL_GYARADOSITE)
                 .add(MegastonesBlocks.ORE_CRYSTAL_KANGASKHANITE)
                 .add(MegastonesBlocks.ORE_CRYSTAL_MEWTWONITEX)
                 .add(MegastonesBlocks.ORE_CRYSTAL_MEWTWONITEY)
                 .add(MegastonesBlocks.ORE_CRYSTAL_PIDGEOTITE)
                 .add(MegastonesBlocks.ORE_CRYSTAL_PINSIRITE)
                 .add(MegastonesBlocks.ORE_CRYSTAL_SLOWBRONITE)
                 .add(MegastonesBlocks.ORE_CRYSTAL_VENUSAURITE)

                .add(CobblemonBlocks.DAWN_STONE_ORE)
                .add(CobblemonBlocks.DUSK_STONE_ORE)
                 .add(CobblemonBlocks.FIRE_STONE_ORE)
                .add(CobblemonBlocks.ICE_STONE_ORE)
                .add(CobblemonBlocks.LEAF_STONE_ORE)
                .add(CobblemonBlocks.MOON_STONE_ORE)
                .add(CobblemonBlocks.SHINY_STONE_ORE)
                .add(CobblemonBlocks.SUN_STONE_ORE)
                .add(CobblemonBlocks.THUNDER_STONE_ORE)
                .add(CobblemonBlocks.WATER_STONE_ORE)
                ;






    }
}
