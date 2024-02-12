package git.dragomordor.megamons;

import git.dragomordor.megamons.block.MegamonsBlocks;
import git.dragomordor.megamons.config.ModConfig;
import git.dragomordor.megamons.event.ModEvents;
import git.dragomordor.megamons.item.MegamonsItems;
import git.dragomordor.megamons.util.megaspecies.MegaSpeciesUtil;
import git.dragomordor.megamons.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MegamonsMod implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger(MegamonsMod.class); // create logger
    public static final String MODID = "megamons"; // mod ID

    @Override
    public void onInitialize() {
        // Load config file
        ModConfig.loadConfig();
        // Register all items
        MegamonsItems.registerModItems();
        // Register all blocks
        MegamonsBlocks.registerMegastonesBlocks();

        // Register creative tabs
        MegamonsItemGroups.registerItemGroups();

        // Register lists
        MegaSpeciesUtil.registerMegaSpeciesUtil();
        // Register events
        ModEvents.registerEvents();

        // Generate World
        ModWorldGeneration.generateModWorldGen();




    }
}
