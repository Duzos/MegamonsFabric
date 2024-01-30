package git.dragomordor.megastones;

import git.dragomordor.megastones.block.MegastonesBlocks;
import git.dragomordor.megastones.item.MegastonesItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MegaStonesItemGroups {

    public static final ItemGroup TM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MegastonesMod.MODID, "key_stone"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.megastones"))
                    .icon(() -> new ItemStack(MegastonesItems.KEY_STONE)).entries((displayContext, entries) -> {

                        // Items
                        // KeyStoneItem
                        entries.add(MegastonesItems.KEY_STONE);
                        // MegaCuffItem
                        entries.add(MegastonesItems.MEGA_CUFF);
                        // RawMegaStoneItems
                        entries.add(MegastonesItems.RAW_AERODACTYLITE);
                        entries.add(MegastonesItems.RAW_ALAKAZITE);
                        entries.add(MegastonesItems.RAW_BEEDRILLITE);
                        entries.add(MegastonesItems.RAW_BLASTOISINITE);
                        entries.add(MegastonesItems.RAW_CHARIZARDITEX);
                        entries.add(MegastonesItems.RAW_CHARIZARDITEY);
                        entries.add(MegastonesItems.RAW_GENGARITE);
                        entries.add(MegastonesItems.RAW_GYARADOSITE);
                        entries.add(MegastonesItems.RAW_KANGASKHANITE);
                        entries.add(MegastonesItems.RAW_MEWTWONITEX);
                        entries.add(MegastonesItems.RAW_MEWTWONITEY);
                        entries.add(MegastonesItems.RAW_PIDGEOTITE);
                        entries.add(MegastonesItems.RAW_PINSIRITE);
                        entries.add(MegastonesItems.RAW_SLOWBRONITE);
                        entries.add(MegastonesItems.RAW_VENUSAURITE);
                        // CutMegaStoneItems
                        entries.add(MegastonesItems.CUT_AERODACTYLITE);
                        entries.add(MegastonesItems.CUT_ALAKAZITE);
                        entries.add(MegastonesItems.CUT_BEEDRILLITE);
                        entries.add(MegastonesItems.CUT_BLASTOISINITE);
                        entries.add(MegastonesItems.CUT_CHARIZARDITEX);
                        entries.add(MegastonesItems.CUT_CHARIZARDITEY);
                        entries.add(MegastonesItems.CUT_GENGARITE);
                        entries.add(MegastonesItems.CUT_GYARADOSITE);
                        entries.add(MegastonesItems.CUT_KANGASKHANITE);
                        entries.add(MegastonesItems.CUT_MEWTWONITEX);
                        entries.add(MegastonesItems.CUT_MEWTWONITEY);
                        entries.add(MegastonesItems.CUT_PIDGEOTITE);
                        entries.add(MegastonesItems.CUT_PINSIRITE);
                        entries.add(MegastonesItems.CUT_SLOWBRONITE);
                        entries.add(MegastonesItems.CUT_VENUSAURITE);

                    // Blocks
                        // Stone ore
                        entries.add(MegastonesBlocks.ORE_AERODACTYLITE);
                        entries.add(MegastonesBlocks.ORE_ALAKAZITE);
                        entries.add(MegastonesBlocks.ORE_BEEDRILLITE);
                        entries.add(MegastonesBlocks.ORE_BLASTOISINITE);
                        entries.add(MegastonesBlocks.ORE_CHARIZARDITEX);
                        entries.add(MegastonesBlocks.ORE_CHARIZARDITEY);
                        entries.add(MegastonesBlocks.ORE_GENGARITE);
                        entries.add(MegastonesBlocks.ORE_GYARADOSITE);
                        entries.add(MegastonesBlocks.ORE_KANGASKHANITE);
                        entries.add(MegastonesBlocks.ORE_MEWTWONITEX);
                        entries.add(MegastonesBlocks.ORE_MEWTWONITEY);
                        entries.add(MegastonesBlocks.ORE_PIDGEOTITE);
                        entries.add(MegastonesBlocks.ORE_PINSIRITE);
                        entries.add(MegastonesBlocks.ORE_SLOWBRONITE);
                        entries.add(MegastonesBlocks.ORE_VENUSAURITE);
                        // Deepslate ore
                        entries.add(MegastonesBlocks.ORE_DEEPSLATE_AERODACTYLITE);
                        entries.add(MegastonesBlocks.ORE_DEEPSLATE_ALAKAZITE);
                        entries.add(MegastonesBlocks.ORE_DEEPSLATE_BEEDRILLITE);
                        entries.add(MegastonesBlocks.ORE_DEEPSLATE_BLASTOISINITE);
                        entries.add(MegastonesBlocks.ORE_DEEPSLATE_CHARIZARDITEX);
                        entries.add(MegastonesBlocks.ORE_DEEPSLATE_CHARIZARDITEY);
                        entries.add(MegastonesBlocks.ORE_DEEPSLATE_GENGARITE);
                        entries.add(MegastonesBlocks.ORE_DEEPSLATE_GYARADOSITE);
                        entries.add(MegastonesBlocks.ORE_DEEPSLATE_KANGASKHANITE);
                        entries.add(MegastonesBlocks.ORE_DEEPSLATE_MEWTWONITEX);
                        entries.add(MegastonesBlocks.ORE_DEEPSLATE_MEWTWONITEY);
                        entries.add(MegastonesBlocks.ORE_DEEPSLATE_PIDGEOTITE);
                        entries.add(MegastonesBlocks.ORE_DEEPSLATE_PINSIRITE);
                        entries.add(MegastonesBlocks.ORE_DEEPSLATE_SLOWBRONITE);
                        entries.add(MegastonesBlocks.ORE_DEEPSLATE_VENUSAURITE);
                        // Crystal ore
                        entries.add(MegastonesBlocks.ORE_CRYSTAL_AERODACTYLITE);
                        entries.add(MegastonesBlocks.ORE_CRYSTAL_ALAKAZITE);
                        entries.add(MegastonesBlocks.ORE_CRYSTAL_BEEDRILLITE);
                        entries.add(MegastonesBlocks.ORE_CRYSTAL_BLASTOISINITE);
                        entries.add(MegastonesBlocks.ORE_CRYSTAL_CHARIZARDITEX);
                        entries.add(MegastonesBlocks.ORE_CRYSTAL_CHARIZARDITEY);
                        entries.add(MegastonesBlocks.ORE_CRYSTAL_GENGARITE);
                        entries.add(MegastonesBlocks.ORE_CRYSTAL_GYARADOSITE);
                        entries.add(MegastonesBlocks.ORE_CRYSTAL_KANGASKHANITE);
                        entries.add(MegastonesBlocks.ORE_CRYSTAL_MEWTWONITEX);
                        entries.add(MegastonesBlocks.ORE_CRYSTAL_MEWTWONITEY);
                        entries.add(MegastonesBlocks.ORE_CRYSTAL_PIDGEOTITE);
                        entries.add(MegastonesBlocks.ORE_CRYSTAL_PINSIRITE);
                        entries.add(MegastonesBlocks.ORE_CRYSTAL_SLOWBRONITE);
                        entries.add(MegastonesBlocks.ORE_CRYSTAL_VENUSAURITE);

                    // megastone Geode wall
                        entries.add(MegastonesBlocks.GEODE_MEGASTONE_CRYSTAL_WALL);
                        entries.add(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL);

                        // metal detector
                        entries.add(MegastonesItems.METAL_DETECTOR);


                    }).build());

    public static void registerItemGroups() {
        MegastonesMod.LOGGER.info("Registering Item Groups for " + MegastonesMod.MODID);

    }


}
