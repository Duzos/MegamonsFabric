package git.dragomordor.megastones.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import git.dragomordor.megastones.MegastonesMod;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ModConfig {
    private static final Identifier CONFIG_ID = new Identifier(MegastonesMod.MODID, MegastonesMod.MODID+"_config.json");
    private static final Path CONFIG_PATH = FabricLoader.getInstance().getConfigDir().resolve(MegastonesMod.MODID).resolve(MegastonesMod.MODID+"_config.json");
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    // Mega Pokemon allowed
    private static int numberOfMegaPokemonAllowed = 1;

    public static void loadConfig() {
        if (!Files.exists(CONFIG_PATH)) {
            createConfigFile();
        }

        try (BufferedReader reader = Files.newBufferedReader(CONFIG_PATH)) {
            ConfigData configData = GSON.fromJson(reader, ConfigData.class);

            numberOfMegaPokemonAllowed = configData.numberOfMegaPokemonAllowed.count;

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createConfigFile() {
        try {
            Files.createDirectories(CONFIG_PATH.getParent());

            JsonObject configJson = new JsonObject();

            // Number of Mega Pokemon Allowed
            JsonObject numberOfMegaPokemonAllowed = new JsonObject();
            numberOfMegaPokemonAllowed.addProperty("comment", "Number of Mega Pokemon allowed by a player at a time. At 0 it disables Mega transformations.");
            numberOfMegaPokemonAllowed.addProperty("count", 1);
            configJson.add("numberOfMegaPokemonAllowed", numberOfMegaPokemonAllowed);

            try (BufferedWriter writer = Files.newBufferedWriter(CONFIG_PATH)) {
                GSON.toJson(configJson, writer);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int getNumberOfMegaPokemonAllowed() {
        return numberOfMegaPokemonAllowed;
    }



    private static class ConfigData {
        private NumberOfMegaPokemonAllowed numberOfMegaPokemonAllowed;
    }

    private static class NumberOfMegaPokemonAllowed {
        private int count;
    }



}
