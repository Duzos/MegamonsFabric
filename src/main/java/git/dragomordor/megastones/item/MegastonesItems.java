package git.dragomordor.megastones.item;

import git.dragomordor.megastones.MegastonesMod;
import git.dragomordor.megastones.item.custom.*;
import git.dragomordor.megastones.item.custom.metaldetector.MetalDetectorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MegastonesItems {

    // register RawMegaStoneItem
    public static final RawMegaStoneItem RAW_AERODACTYLITE = registerRawMegaStoneItem("raw_aerodactylite",new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_ALAKAZITE = registerRawMegaStoneItem("raw_alakazite", new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_BEEDRILLITE = registerRawMegaStoneItem("raw_beedrillite", new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_BLASTOISINITE = registerRawMegaStoneItem("raw_blastoisinite", new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_CHARIZARDITEX = registerRawMegaStoneItem("raw_charizarditex", new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_CHARIZARDITEY = registerRawMegaStoneItem("raw_charizarditey", new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_GENGARITE = registerRawMegaStoneItem("raw_gengarite", new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_GYARADOSITE = registerRawMegaStoneItem("raw_gyaradosite", new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_KANGASKHANITE = registerRawMegaStoneItem("raw_kangaskhanite", new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_MEWTWONITEX = registerRawMegaStoneItem("raw_mewtwonitex", new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_MEWTWONITEY = registerRawMegaStoneItem("raw_mewtwonitey", new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_PIDGEOTITE = registerRawMegaStoneItem("raw_pidgeotite", new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_PINSIRITE = registerRawMegaStoneItem("raw_pinsirite", new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_SLOWBRONITE = registerRawMegaStoneItem("raw_slowbronite", new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_VENUSAURITE = registerRawMegaStoneItem("raw_venusaurite", new RawMegaStoneItem());

    // register CutMegaStoneItem
    public static final CutMegaStoneItem CUT_ALAKAZITE = registerCutMegaStoneItem("cut_alakazite", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_AERODACTYLITE = registerCutMegaStoneItem("cut_aerodactylite", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_BEEDRILLITE = registerCutMegaStoneItem("cut_beedrillite", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_BLASTOISINITE = registerCutMegaStoneItem("cut_blastoisinite", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_CHARIZARDITEX = registerCutMegaStoneItem("cut_charizarditex", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_CHARIZARDITEY = registerCutMegaStoneItem("cut_charizarditey", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_GENGARITE = registerCutMegaStoneItem("cut_gengarite", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_GYARADOSITE = registerCutMegaStoneItem("cut_gyaradosite", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_KANGASKHANITE = registerCutMegaStoneItem("cut_kangaskhanite", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_MEWTWONITEX = registerCutMegaStoneItem("cut_mewtwonitex", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_MEWTWONITEY = registerCutMegaStoneItem("cut_mewtwonitey", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_PIDGEOTITE = registerCutMegaStoneItem("cut_pidgeotite", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_PINSIRITE = registerCutMegaStoneItem("cut_pinsirite", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_SLOWBRONITE = registerCutMegaStoneItem("cut_slowbronite", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_VENUSAURITE = registerCutMegaStoneItem("cut_venusaurite", new CutMegaStoneItem());

    // Register KeyStoneItem
    public static final KeyStoneItem KEY_STONE = registerKeyStoneItem("key_stone", new KeyStoneItem());

    // Register Mega Cuff Item
    public static final MegaCuffItem MEGA_CUFF = registerMegaCuffItem("mega_cuff", new MegaCuffItem());


    // Register Biome Shard Items
    public static final BiomeShardItem FOREST_SHARD = registerBiomeShardItem("forest_shard",new BiomeShardItem("forest"));


    // Register Biome Raw stone Items
    public static final BiomeRawMegastoneItem FOREST_RAW_MEGASTONE = registerBiomeRawMegastoneItem("forest_raw_megastone",new BiomeRawMegastoneItem("forest"));

    // Register metal Detector item
    public static final MetalDetectorItem METAL_DETECTOR = registerMetalDetectoritem("metal_detector",new MetalDetectorItem());



    // Helper method to register items
    // register RawMegaStoneItem
    private static RawMegaStoneItem registerRawMegaStoneItem(String name, RawMegaStoneItem rawMegaStoneItem) {
        return Registry.register(Registries.ITEM, new Identifier(MegastonesMod.MODID, name),rawMegaStoneItem);
    }
    // register CutMegaStoneItem
    private static CutMegaStoneItem registerCutMegaStoneItem(String name, CutMegaStoneItem cutMegaStoneItem) {
        return Registry.register(Registries.ITEM, new Identifier(MegastonesMod.MODID, name),cutMegaStoneItem);
    }
   // register CutMegaStoneItem
    private static KeyStoneItem registerKeyStoneItem(String name, KeyStoneItem keyStoneItem) {
        return Registry.register(Registries.ITEM, new Identifier(MegastonesMod.MODID, name),keyStoneItem);
    }

    // Register Mega cuff
    private static MegaCuffItem registerMegaCuffItem(String name, MegaCuffItem megaCuffItem) {
        return Registry.register(Registries.ITEM, new Identifier(MegastonesMod.MODID, name),megaCuffItem);
    }

    // Register BiomeShardItem
    private static BiomeShardItem registerBiomeShardItem(String name, BiomeShardItem biomeShardItem) {
        return Registry.register(Registries.ITEM, new Identifier(MegastonesMod.MODID, name),biomeShardItem);
    }
    // Register BiomeRawMegastoneItem
    private static BiomeRawMegastoneItem registerBiomeRawMegastoneItem(String name, BiomeRawMegastoneItem biomeRawMegastoneItem) {
        return Registry.register(Registries.ITEM, new Identifier(MegastonesMod.MODID, name),biomeRawMegastoneItem);
    }

    // register MetalDetectorItem
    private static MetalDetectorItem registerMetalDetectoritem(String name, MetalDetectorItem metalDetectorItem) {
        return Registry.register(Registries.ITEM, new Identifier(MegastonesMod.MODID, name),metalDetectorItem);
    }


    // Other functions
    // Register all mod items
    public static void registerModItems() {
        MegastonesMod.LOGGER.info("Register Mod Items for " + MegastonesMod.MODID) ;


    }

    public static ItemStack getItemStackByName(String name) {
        Identifier identifier = new Identifier(MegastonesMod.MODID, name);
        Item item = Registries.ITEM.get(identifier);
        if (item!=null) {
            return new ItemStack(item);
        } else {
            return ItemStack.EMPTY;
        }

    }

    public static Item getItemByName(String name) {
          Identifier identifier  = new Identifier(MegastonesMod.MODID,name);
        return Registries.ITEM.get(identifier);
    }





}
