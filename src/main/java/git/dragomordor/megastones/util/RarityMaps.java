package git.dragomordor.megastones.util;

import git.dragomordor.megastones.MegastonesMod;
import git.dragomordor.megastones.item.MegastonesItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.Formatting;

import java.util.*;

public class RarityMaps {

    static final Map<String, String> rarityNames = new HashMap<>();

    static {
        rarityNames.put("common", "Common");
        rarityNames.put("uncommon", "Uncommon");
        rarityNames.put("rare", "Rare");
        rarityNames.put("very_rare", "Very Rare");
        rarityNames.put("ultra_rare", "Ultra Rare");
    }

    // Rarity Colors
    static final Map<String, Formatting> rarityColors = new HashMap<>();

    static {
        rarityColors.put("common", Formatting.GRAY);
        rarityColors.put("uncommon", Formatting.GREEN);
        rarityColors.put("rare", Formatting.BLUE);
        rarityColors.put("very_rare", Formatting.LIGHT_PURPLE);
        rarityColors.put("ultra_rare", Formatting.GOLD);
    }

    public static Map<String, String> getRarityNames() {
        return rarityNames;
    }

    public static Map<String, Formatting> getRarityColors() {
        return rarityColors;
    }


    public static String getRarityFromItem(ItemStack stack) {
        NbtCompound nbt = stack.getNbt();
        return (nbt != null && nbt.contains("Rarity")) ? nbt.getString("Rarity") : null;
    }

    // Placeholder data structure to store associations between biomes, rarities, and Cut Megastones
    private static final Map<String, Map<String, List<Item>>> biomeRarityCutMegastones = new HashMap<>();

    // Method to initialize the associations
    public static void initializeBiomeRarityCutMegastones() {
        MegastonesMod.LOGGER.info("Registering Megastone Rarities " + MegastonesMod.MODID);

        // COMMON
        Map<String, List<Item>> commonCutMegastones = new HashMap<>();
        commonCutMegastones.put("forest", Arrays.asList(MegastonesItems.CUT_ALAKAZITE, MegastonesItems.CUT_AERODACTYLITE)); // Forest
        //commonCutMegastones.put("desert", Arrays.asList(/* Add desert common cut megastones */)); // Desert
        biomeRarityCutMegastones.put("common", commonCutMegastones);

        // UNCOMMON
        Map<String, List<Item>> uncommonCutMegastones = new HashMap<>();
        uncommonCutMegastones.put("forest", Arrays.asList(MegastonesItems.CUT_BEEDRILLITE, MegastonesItems.CUT_BLASTOISINITE)); // Forest
        //uncommonCutMegastones.put("desert", Arrays.asList(/* Add desert uncommon cut megastones */)); // desert
        biomeRarityCutMegastones.put("uncommon", uncommonCutMegastones);

        // RARE
        Map<String, List<Item>> rareCutMegastones = new HashMap<>();
        rareCutMegastones.put("forest", Arrays.asList(MegastonesItems.CUT_CHARIZARDITEX, MegastonesItems.CUT_CHARIZARDITEY));
        //rareCutMegastones.put("desert", Arrays.asList(/* Add desert rare cut megastones */)); // desert
        biomeRarityCutMegastones.put("rare", rareCutMegastones);

        // VERY RARE
        Map<String, List<Item>> veryRareCutMegastones = new HashMap<>();
        veryRareCutMegastones.put("forest", Arrays.asList(MegastonesItems.CUT_GENGARITE, MegastonesItems.CUT_GYARADOSITE)); // Forest
        //veryRareCutMegastones.put("desert", Arrays.asList(/* Add desert very rare cut megastones */)); // Desert
        biomeRarityCutMegastones.put("very_rare", veryRareCutMegastones);

        // ULTRA RARE
        Map<String, List<Item>> ultraRareCutMegastones = new HashMap<>();
        ultraRareCutMegastones.put("forest", Arrays.asList(MegastonesItems.CUT_KANGASKHANITE, MegastonesItems.CUT_MEWTWONITEX)); // Forest
        //ultraRareCutMegastones.put("desert", Arrays.asList(/* Add desert ultra rare cut megastones */));
        biomeRarityCutMegastones.put("ultra_rare", ultraRareCutMegastones);
    }

    // Method to retrieve possible Cut Megastones based on biome and rarity
    public static List<Item> getCutMegastonesForBiomeAndRarity(String biome, String rarity) {
        Map<String, List<Item>> rarityCutMegastones = biomeRarityCutMegastones.get(rarity);

        if (rarityCutMegastones != null) {
            List<Item> biomeCutMegastones = rarityCutMegastones.get(biome);

            if (biomeCutMegastones != null) {
                return biomeCutMegastones;
            }
        }

        return Collections.emptyList();
    }

    public static ItemStack generateRandomCutMegastone(String biome, String rarity) {
        // Use the biome and rarity information to determine the possible Cut Megastones
        List<Item> possibleCutMegastone = RarityMaps.getCutMegastonesForBiomeAndRarity(biome, rarity);

        if (!possibleCutMegastone.isEmpty()) {
            Item selectedCutMegastone = possibleCutMegastone.get(
                    new Random().nextInt(possibleCutMegastone.size()));
            // Create and return the ItemStack for the selected Cut Megastone
            return new ItemStack(selectedCutMegastone);
        }
        // If no megastones are present for that biome and rarity
        return ItemStack.EMPTY;
    }
}