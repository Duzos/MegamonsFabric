package git.dragomordor.megastones;

import git.dragomordor.megastones.block.MegastonesBlocks;
import git.dragomordor.megastones.config.ModConfig;
import git.dragomordor.megastones.item.MegastonesItems;
import git.dragomordor.megastones.util.RarityMaps;
import git.dragomordor.megastones.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MegastonesMod implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger(MegastonesMod.class); // create logger
    public static final String MODID = "megastones"; // mod ID

    @Override
    public void onInitialize() {
        // Load config file
        ModConfig.loadConfig();
        // Register all items
        MegastonesItems.registerModItems();
        // Register all blocks
        MegastonesBlocks.registerMegastonesBlocks();

        // Register creative tabs
        MegaStonesItemGroups.registerItemGroups();

        // Register BiomeRarityCutMegastones
        RarityMaps.initializeBiomeRarityCutMegastones();

        // Generate World
        ModWorldGeneration.generateModWorldGen();
    }
}
