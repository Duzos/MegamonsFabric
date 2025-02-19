package git.dragomordor.megamons;

import git.dragomordor.megamons.block.MegamonsBlocks;
import git.dragomordor.megamons.item.MegamonsItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MegamonsItemGroups {

    public static final ItemGroup MEGAMONS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MegamonsMod.MODID, "megamons_itemgroup"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup."+MegamonsMod.MODID))
                    .icon(() -> new ItemStack(MegamonsItems.KEY_STONE)).entries((displayContext, entries) -> {

                        // Items
//                        // Metal detector
//                        entries.add(MegamonsItems.METAL_DETECTOR);
                        // KeyStoneItem
                        entries.add(MegamonsItems.KEY_STONE);
                        // MegaCuffItem
                        entries.add(MegamonsItems.MEGA_CUFF);
                        // RawMegaStoneItems
                        entries.add(MegamonsItems.RAW_AERODACTYLITE);
                        entries.add(MegamonsItems.RAW_ALAKAZITE);
                        entries.add(MegamonsItems.RAW_BEEDRILLITE);
                        entries.add(MegamonsItems.RAW_BLASTOISINITE);
                        entries.add(MegamonsItems.RAW_CHARIZARDITEX);
                        entries.add(MegamonsItems.RAW_CHARIZARDITEY);
                        entries.add(MegamonsItems.RAW_GENGARITE);
                        entries.add(MegamonsItems.RAW_GYARADOSITE);
                        entries.add(MegamonsItems.RAW_KANGASKHANITE);
                        entries.add(MegamonsItems.RAW_MEWTWONITEX);
                        entries.add(MegamonsItems.RAW_MEWTWONITEY);
                        entries.add(MegamonsItems.RAW_PIDGEOTITE);
                        entries.add(MegamonsItems.RAW_PINSIRITE);
                        entries.add(MegamonsItems.RAW_SLOWBRONITE);
                        entries.add(MegamonsItems.RAW_VENUSAURITE);
                        // CutMegaStoneItems
                        entries.add(MegamonsItems.CUT_AERODACTYLITE);
                        entries.add(MegamonsItems.CUT_ALAKAZITE);
                        entries.add(MegamonsItems.CUT_BEEDRILLITE);
                        entries.add(MegamonsItems.CUT_BLASTOISINITE);
                        entries.add(MegamonsItems.CUT_CHARIZARDITEX);
                        entries.add(MegamonsItems.CUT_CHARIZARDITEY);
                        entries.add(MegamonsItems.CUT_GENGARITE);
                        entries.add(MegamonsItems.CUT_GYARADOSITE);
                        entries.add(MegamonsItems.CUT_KANGASKHANITE);
                        entries.add(MegamonsItems.CUT_MEWTWONITEX);
                        entries.add(MegamonsItems.CUT_MEWTWONITEY);
                        entries.add(MegamonsItems.CUT_PIDGEOTITE);
                        entries.add(MegamonsItems.CUT_PINSIRITE);
                        entries.add(MegamonsItems.CUT_SLOWBRONITE);
                        entries.add(MegamonsItems.CUT_VENUSAURITE);

                    // Blocks
//                        // Stone ore
//                        entries.add(MegamonsBlocks.ORE_AERODACTYLITE);
//                        entries.add(MegamonsBlocks.ORE_ALAKAZITE);
//                        entries.add(MegamonsBlocks.ORE_BEEDRILLITE);
//                        entries.add(MegamonsBlocks.ORE_BLASTOISINITE);
//                        entries.add(MegamonsBlocks.ORE_CHARIZARDITEX);
//                        entries.add(MegamonsBlocks.ORE_CHARIZARDITEY);
//                        entries.add(MegamonsBlocks.ORE_GENGARITE);
//                        entries.add(MegamonsBlocks.ORE_GYARADOSITE);
//                        entries.add(MegamonsBlocks.ORE_KANGASKHANITE);
//                        entries.add(MegamonsBlocks.ORE_MEWTWONITEX);
//                        entries.add(MegamonsBlocks.ORE_MEWTWONITEY);
//                        entries.add(MegamonsBlocks.ORE_PIDGEOTITE);
//                        entries.add(MegamonsBlocks.ORE_PINSIRITE);
//                        entries.add(MegamonsBlocks.ORE_SLOWBRONITE);
//                        entries.add(MegamonsBlocks.ORE_VENUSAURITE);
//                        // Deepslate ore
//                        entries.add(MegamonsBlocks.ORE_DEEPSLATE_AERODACTYLITE);
//                        entries.add(MegamonsBlocks.ORE_DEEPSLATE_ALAKAZITE);
//                        entries.add(MegamonsBlocks.ORE_DEEPSLATE_BEEDRILLITE);
//                        entries.add(MegamonsBlocks.ORE_DEEPSLATE_BLASTOISINITE);
//                        entries.add(MegamonsBlocks.ORE_DEEPSLATE_CHARIZARDITEX);
//                        entries.add(MegamonsBlocks.ORE_DEEPSLATE_CHARIZARDITEY);
//                        entries.add(MegamonsBlocks.ORE_DEEPSLATE_GENGARITE);
//                        entries.add(MegamonsBlocks.ORE_DEEPSLATE_GYARADOSITE);
//                        entries.add(MegamonsBlocks.ORE_DEEPSLATE_KANGASKHANITE);
//                        entries.add(MegamonsBlocks.ORE_DEEPSLATE_MEWTWONITEX);
//                        entries.add(MegamonsBlocks.ORE_DEEPSLATE_MEWTWONITEY);
//                        entries.add(MegamonsBlocks.ORE_DEEPSLATE_PIDGEOTITE);
//                        entries.add(MegamonsBlocks.ORE_DEEPSLATE_PINSIRITE);
//                        entries.add(MegamonsBlocks.ORE_DEEPSLATE_SLOWBRONITE);
//                        entries.add(MegamonsBlocks.ORE_DEEPSLATE_VENUSAURITE);
                    // Crystal blocks
                        // Megastone Geode wall
                        entries.add(MegamonsBlocks.ANISTARITE_GEODE_BLOCK);
                        entries.add(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK);

                        // Crystal ore
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_AERODACTYLITE);
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_ALAKAZITE);
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_BEEDRILLITE);
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_BLASTOISINITE);
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEX);
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEY);
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_GENGARITE);
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_GYARADOSITE);
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_KANGASKHANITE);
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEX);
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEY);
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_PIDGEOTITE);
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_PINSIRITE);
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_SLOWBRONITE);
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_VENUSAURITE);

                        // Geode Crystal Evo ores
                        entries.add(MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE);
                        entries.add(MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE);
                        entries.add(MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE);
                        entries.add(MegamonsBlocks.CRYSTAL_ICE_STONE_ORE);
                        entries.add(MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE);
                        entries.add(MegamonsBlocks.CRYSTAL_MOON_STONE_ORE);
                        entries.add(MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE);
                        entries.add(MegamonsBlocks.CRYSTAL_SUN_STONE_ORE);
                        entries.add(MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE);
                        entries.add(MegamonsBlocks.CRYSTAL_WATER_STONE_ORE);



                    }).build());

    public static void registerItemGroups() {
        MegamonsMod.LOGGER.info("Registering Item Groups for " + MegamonsMod.MODID);

    }


}
