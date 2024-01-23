package git.dragomordor.megastones.datagen;

import git.dragomordor.megastones.block.MegastonesBlocks;
import git.dragomordor.megastones.item.MegastonesItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    // Blocks
        // Stone Ore -Megastone
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_AERODACTYLITE);
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_ALAKAZITE);
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_BEEDRILLITE);
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_BLASTOISINITE);
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_CHARIZARDITEX);
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_CHARIZARDITEY);
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_GENGARITE);
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_GYARADOSITE);
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_KANGASKHANITE);
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_MEWTWONITEX);
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_MEWTWONITEY);
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_PIDGEOTITE);
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_PINSIRITE);
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_SLOWBRONITE);
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_VENUSAURITE);
        // Deepslate Ore -Megastone
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_DEEPSLATE_AERODACTYLITE);
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_DEEPSLATE_ALAKAZITE);
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_DEEPSLATE_BEEDRILLITE);
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_DEEPSLATE_BLASTOISINITE);
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_DEEPSLATE_CHARIZARDITEX);
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_DEEPSLATE_CHARIZARDITEY);
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_DEEPSLATE_GENGARITE);
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_DEEPSLATE_GYARADOSITE);
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_DEEPSLATE_KANGASKHANITE);
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_DEEPSLATE_MEWTWONITEX);
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_DEEPSLATE_MEWTWONITEY);
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_DEEPSLATE_PIDGEOTITE);
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_DEEPSLATE_PINSIRITE);
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_DEEPSLATE_SLOWBRONITE);
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_DEEPSLATE_VENUSAURITE);

        // Biome/ Shard ore
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_FOREST_SHARD);
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.ORE_DEEPSLATE_FOREST_SHARD);

        // Megastone Geode Block
        blockStateModelGenerator.registerSimpleCubeAll(MegastonesBlocks.GEODE_MEGASTONE_WALL);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        // KeyStoneItem
        itemModelGenerator.register(MegastonesItems.KEY_STONE, Models.GENERATED);

        // RawMegaStoneItems
        itemModelGenerator.register(MegastonesItems.RAW_AERODACTYLITE, Models.GENERATED);
        itemModelGenerator.register(MegastonesItems.RAW_ALAKAZITE, Models.GENERATED);
        itemModelGenerator.register(MegastonesItems.RAW_BEEDRILLITE, Models.GENERATED);
        itemModelGenerator.register(MegastonesItems.RAW_BLASTOISINITE, Models.GENERATED);
        itemModelGenerator.register(MegastonesItems.RAW_CHARIZARDITEX, Models.GENERATED);
        itemModelGenerator.register(MegastonesItems.RAW_CHARIZARDITEY, Models.GENERATED);
        itemModelGenerator.register(MegastonesItems.RAW_GENGARITE, Models.GENERATED);
        itemModelGenerator.register(MegastonesItems.RAW_GYARADOSITE, Models.GENERATED);
        itemModelGenerator.register(MegastonesItems.RAW_KANGASKHANITE, Models.GENERATED);
        itemModelGenerator.register(MegastonesItems.RAW_MEWTWONITEX, Models.GENERATED);
        itemModelGenerator.register(MegastonesItems.RAW_MEWTWONITEY, Models.GENERATED);
        itemModelGenerator.register(MegastonesItems.RAW_PIDGEOTITE, Models.GENERATED);
        itemModelGenerator.register(MegastonesItems.RAW_PINSIRITE, Models.GENERATED);
        itemModelGenerator.register(MegastonesItems.RAW_SLOWBRONITE, Models.GENERATED);
        itemModelGenerator.register(MegastonesItems.RAW_VENUSAURITE, Models.GENERATED);

        // CutMegaStoneItems
        itemModelGenerator.register(MegastonesItems.CUT_AERODACTYLITE, Models.GENERATED);
        itemModelGenerator.register(MegastonesItems.CUT_ALAKAZITE, Models.GENERATED);
        itemModelGenerator.register(MegastonesItems.CUT_BEEDRILLITE, Models.GENERATED);
        itemModelGenerator.register(MegastonesItems.CUT_BLASTOISINITE, Models.GENERATED);
        itemModelGenerator.register(MegastonesItems.CUT_CHARIZARDITEX, Models.GENERATED);
        itemModelGenerator.register(MegastonesItems.CUT_CHARIZARDITEY, Models.GENERATED);
        itemModelGenerator.register(MegastonesItems.CUT_GENGARITE, Models.GENERATED);
        itemModelGenerator.register(MegastonesItems.CUT_GYARADOSITE, Models.GENERATED);
        itemModelGenerator.register(MegastonesItems.CUT_KANGASKHANITE, Models.GENERATED);
        itemModelGenerator.register(MegastonesItems.CUT_MEWTWONITEX, Models.GENERATED);
        itemModelGenerator.register(MegastonesItems.CUT_MEWTWONITEY, Models.GENERATED);
        itemModelGenerator.register(MegastonesItems.CUT_PIDGEOTITE, Models.GENERATED);
        itemModelGenerator.register(MegastonesItems.CUT_PINSIRITE, Models.GENERATED);
        itemModelGenerator.register(MegastonesItems.CUT_SLOWBRONITE, Models.GENERATED);
        itemModelGenerator.register(MegastonesItems.CUT_VENUSAURITE, Models.GENERATED);

        // MegaCuffItem
        itemModelGenerator.register(MegastonesItems.MEGA_CUFF, Models.GENERATED);

        // Biome Shard Items
        itemModelGenerator.register(MegastonesItems.FOREST_SHARD, Models.GENERATED);

        // Biome Raw Megastone
        itemModelGenerator.register(MegastonesItems.FOREST_RAW_MEGASTONE, Models.GENERATED);

        // metal Detector item
        itemModelGenerator.register(MegastonesItems.METAL_DETECTOR, Models.GENERATED);


    }
}
