package git.dragomordor.megastones.util;

import git.dragomordor.megastones.MegastonesMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> ORE_MEGASTONES =
                createTag("ore_megastones");

        public static final TagKey<Block> ORE_BIOMESHARDS =
                createTag("ore_biomeshards");

        public static final TagKey<Block> GEODE_WALLS =
                createTag("geode_walls");


        public static final TagKey<Block> METAL_DETECTOR_DESTROYABLE_BLOCKS =
                createTag("metal_detector_destroyable_blocks");

        public static final TagKey<Block> METAL_DETECTOR_DETECTABLE_BLOCKS =
                createTag("metal_detector_detectable_blocks");








        private static TagKey<Block> createTag(String name) {
            return  TagKey.of(RegistryKeys.BLOCK, new Identifier(MegastonesMod.MODID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item> RAW_MEGASTONES =
                createTag("raw_megastones");
        public static final TagKey<Item> CUT_MEGASTONES =
                        createTag("cut_megastones");

        private static TagKey<Item> createTag(String name) {
            return  TagKey.of(RegistryKeys.ITEM, new Identifier(MegastonesMod.MODID, name));
        }
    }

    public static class Biomes {




    }







}
