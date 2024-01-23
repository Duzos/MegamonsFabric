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

    // Shard Chance
    private static int commonShardBaseChancePercent = 65;
    private static int uncommonShardBaseChancePercent = 20;
    private static int rareShardBaseChancePercent = 10;
    private static int veryrareShardBaseChancePercent = 4;
    private static int ultrarareShardBaseChancePercent = 1;

    // Shard total required to combine
    private static int commonShardCombineRequired = 9;
    private static int uncommonShardCombineRequired = 7;
    private static int rareShardCombineRequired = 5;
    private static int veryrareShardCombineRequired = 4;
    private static int ultrarareShardCombineRequired = 2;

    // Mega Pokemon allowed
    private static int numberOfMegaPokemonAllowed = 1;

    public static void loadConfig() {
        if (!Files.exists(CONFIG_PATH)) {
            createConfigFile();
        }

        try (BufferedReader reader = Files.newBufferedReader(CONFIG_PATH)) {
            ConfigData configData = GSON.fromJson(reader, ConfigData.class);

            commonShardBaseChancePercent = configData.shardBaseDropChances.commonShardBaseDropChance;
            uncommonShardBaseChancePercent = configData.shardBaseDropChances.uncommonShardBaseDropChance;
            rareShardBaseChancePercent = configData.shardBaseDropChances.rareShardBaseDropChance;
            veryrareShardBaseChancePercent = configData.shardBaseDropChances.veryRareShardBaseDropChance;
            ultrarareShardBaseChancePercent = configData.shardBaseDropChances.ultraRareShardBaseDropChance;

            commonShardCombineRequired = configData.shardCombineTotalRequired.commonShardCombineRequired;
            uncommonShardCombineRequired = configData.shardCombineTotalRequired.uncommonShardCombineRequired;
            rareShardCombineRequired = configData.shardCombineTotalRequired.rareShardCombineRequired;
            veryrareShardCombineRequired = configData.shardCombineTotalRequired.veryRareShardCombineRequired;
            ultrarareShardCombineRequired = configData.shardCombineTotalRequired.ultraRareShardCombineRequired;

            numberOfMegaPokemonAllowed = configData.numberOfMegaPokemonAllowed.count;



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createConfigFile() {
        try {
            Files.createDirectories(CONFIG_PATH.getParent());

            JsonObject configJson = new JsonObject();

            // Shard Base Drop Chances
            JsonObject shardBaseDropChances = new JsonObject();
            shardBaseDropChances.addProperty("comment", "Base Drop chances for the Megastone biome shard ores. Does not need to add up to 100, it is simply a weight system.");
            shardBaseDropChances.addProperty("commonShardBaseDropChance", 65);
            shardBaseDropChances.addProperty("uncommonShardBaseDropChance", 20);
            shardBaseDropChances.addProperty("rareShardBaseDropChance", 10);
            shardBaseDropChances.addProperty("veryRareShardBaseDropChance", 4);
            shardBaseDropChances.addProperty("ultraRareShardBaseDropChance", 1);
            configJson.add("shardBaseDropChances", shardBaseDropChances);

            // Shard Numbers Required to combine
            JsonObject shardCombineTotalRequired = new JsonObject();
            shardCombineTotalRequired.addProperty("comment", "The number of shards required for each rarity to combine into a Raw Megastone");
            shardCombineTotalRequired.addProperty("commonShardCombineRequired", 9);
            shardCombineTotalRequired.addProperty("uncommonShardCombineRequired", 7);
            shardCombineTotalRequired.addProperty("rareShardCombineRequired", 5);
            shardCombineTotalRequired.addProperty("veryRareShardCombineRequired", 4);
            shardCombineTotalRequired.addProperty("ultraRareShardCombineRequired", 2);
            configJson.add("shardCombineTotalRequired", shardCombineTotalRequired);


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

    public static int getCommonShardBaseChancePercent() {
        return commonShardBaseChancePercent;
    }

    public static int getUncommonShardBaseChancePercent() {
        return uncommonShardBaseChancePercent;
    }

    public static int getRareShardBaseChancePercent() {
        return rareShardBaseChancePercent;
    }

    public static int getVeryRareShardBaseChancePercent() {
        return veryrareShardBaseChancePercent;
    }

    public static int getUltraRareShardBaseChancePercent() {
        return ultrarareShardBaseChancePercent;
    }


    public static int getCommonShardCombineRequired() {
        return commonShardCombineRequired;
    }

    public static int getUncommonShardCombineRequired() {
        return uncommonShardCombineRequired;
    }

    public static int getRareShardCombineRequired() {
        return rareShardCombineRequired;
    }

    public static int getVeryRareShardCombineRequired() {
        return veryrareShardCombineRequired;
    }

    public static int getUltraRareShardCombineRequired() {
        return ultrarareShardCombineRequired;
    }


    public static int getNumberOfMegaPokemonAllowed() {
        return numberOfMegaPokemonAllowed;
    }



    private static class ConfigData {
        private ShardBaseDropChances shardBaseDropChances;
        private ShardCombineTotalRequired shardCombineTotalRequired;
        private NumberOfMegaPokemonAllowed numberOfMegaPokemonAllowed;
    }

    private static class ShardBaseDropChances {
        private int commonShardBaseDropChance;
        private int uncommonShardBaseDropChance;
        private int rareShardBaseDropChance;
        private int veryRareShardBaseDropChance;
        private int ultraRareShardBaseDropChance;
    }

    private static class ShardCombineTotalRequired {
        private int commonShardCombineRequired;
        private int uncommonShardCombineRequired;
        private int rareShardCombineRequired;
        private int veryRareShardCombineRequired;
        private int ultraRareShardCombineRequired;
    }

    private static class NumberOfMegaPokemonAllowed {
        private int count;
    }



}
