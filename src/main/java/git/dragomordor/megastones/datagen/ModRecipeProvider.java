package git.dragomordor.megastones.datagen;

import git.dragomordor.megastones.MegastonesMod;
import git.dragomordor.megastones.block.MegastonesBlocks;
import git.dragomordor.megastones.item.MegastonesItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;




public class ModRecipeProvider extends FabricRecipeProvider {

    // Item lists
    // Megastone smelt tables
    private static final List<ItemConvertible> ORE_SMELT_AERODACTYLITE = List.of(
            MegastonesBlocks.ORE_AERODACTYLITE,
            MegastonesBlocks.ORE_DEEPSLATE_AERODACTYLITE,
            MegastonesBlocks.ORE_CRYSTAL_AERODACTYLITE);

    private static final List<ItemConvertible> ORE_SMELT_ALAKAZITE = List.of(
            MegastonesBlocks.ORE_ALAKAZITE,
            MegastonesBlocks.ORE_DEEPSLATE_ALAKAZITE,
            MegastonesBlocks.ORE_CRYSTAL_ALAKAZITE);

    private static final List<ItemConvertible> ORE_SMELT_BEEDRILLITE = List.of(
            MegastonesBlocks.ORE_BEEDRILLITE,
            MegastonesBlocks.ORE_DEEPSLATE_BEEDRILLITE,
            MegastonesBlocks.ORE_CRYSTAL_BEEDRILLITE);

    private static final List<ItemConvertible> ORE_SMELT_BLASTOISINITE = List.of(
            MegastonesBlocks.ORE_BLASTOISINITE,
            MegastonesBlocks.ORE_DEEPSLATE_BLASTOISINITE,
            MegastonesBlocks.ORE_CRYSTAL_BLASTOISINITE);

    private static final List<ItemConvertible> ORE_SMELT_CHARIZARDITEX = List.of(
            MegastonesBlocks.ORE_CHARIZARDITEX,
            MegastonesBlocks.ORE_DEEPSLATE_CHARIZARDITEX,
            MegastonesBlocks.ORE_CRYSTAL_CHARIZARDITEX);

    private static final List<ItemConvertible> ORE_SMELT_CHARIZARDITEY = List.of(
            MegastonesBlocks.ORE_CHARIZARDITEY,
            MegastonesBlocks.ORE_DEEPSLATE_CHARIZARDITEY,
            MegastonesBlocks.ORE_CRYSTAL_CHARIZARDITEY);

    private static final List<ItemConvertible> ORE_SMELT_GENGARITE = List.of(
            MegastonesBlocks.ORE_GENGARITE,
            MegastonesBlocks.ORE_DEEPSLATE_GENGARITE,
            MegastonesBlocks.ORE_CRYSTAL_GENGARITE);

    private static final List<ItemConvertible> ORE_SMELT_GYARADOSITE = List.of(
            MegastonesBlocks.ORE_GYARADOSITE,
            MegastonesBlocks.ORE_DEEPSLATE_GYARADOSITE,
            MegastonesBlocks.ORE_CRYSTAL_GYARADOSITE);

    private static final List<ItemConvertible> ORE_SMELT_KANGASKHANITE = List.of(
            MegastonesBlocks.ORE_KANGASKHANITE,
            MegastonesBlocks.ORE_DEEPSLATE_KANGASKHANITE,
            MegastonesBlocks.ORE_CRYSTAL_KANGASKHANITE);

    private static final List<ItemConvertible> ORE_SMELT_MEWTWONITEX = List.of(
            MegastonesBlocks.ORE_MEWTWONITEX,
            MegastonesBlocks.ORE_DEEPSLATE_MEWTWONITEX,
            MegastonesBlocks.ORE_CRYSTAL_MEWTWONITEX);

    private static final List<ItemConvertible> ORE_SMELT_MEWTWONITEY = List.of(
            MegastonesBlocks.ORE_MEWTWONITEY,
            MegastonesBlocks.ORE_DEEPSLATE_MEWTWONITEY,
            MegastonesBlocks.ORE_CRYSTAL_MEWTWONITEY);

    private static final List<ItemConvertible> ORE_SMELT_PIDGEOTITE = List.of(
            MegastonesBlocks.ORE_PIDGEOTITE,
            MegastonesBlocks.ORE_DEEPSLATE_PIDGEOTITE,
            MegastonesBlocks.ORE_CRYSTAL_PIDGEOTITE);

    private static final List<ItemConvertible> ORE_SMELT_PINSIRITE = List.of(
            MegastonesBlocks.ORE_PINSIRITE,
            MegastonesBlocks.ORE_DEEPSLATE_PINSIRITE,
            MegastonesBlocks.ORE_CRYSTAL_PINSIRITE);

    private static final List<ItemConvertible> ORE_SMELT_SLOWBRONITE = List.of(
            MegastonesBlocks.ORE_SLOWBRONITE,
            MegastonesBlocks.ORE_DEEPSLATE_SLOWBRONITE,
            MegastonesBlocks.ORE_CRYSTAL_SLOWBRONITE);

    private static final List<ItemConvertible> ORE_SMELT_VENUSAURITE = List.of(
            MegastonesBlocks.ORE_VENUSAURITE,
            MegastonesBlocks.ORE_DEEPSLATE_VENUSAURITE,
            MegastonesBlocks.ORE_CRYSTAL_VENUSAURITE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {


        // Raw Megastone to Cut Megastone via stonecutter
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegastonesItems.CUT_AERODACTYLITE, MegastonesItems.RAW_AERODACTYLITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegastonesItems.CUT_ALAKAZITE, MegastonesItems.RAW_ALAKAZITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegastonesItems.CUT_BEEDRILLITE, MegastonesItems.RAW_BEEDRILLITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegastonesItems.CUT_BLASTOISINITE, MegastonesItems.RAW_BLASTOISINITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegastonesItems.CUT_CHARIZARDITEX, MegastonesItems.RAW_CHARIZARDITEX, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegastonesItems.CUT_CHARIZARDITEY, MegastonesItems.RAW_CHARIZARDITEY, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegastonesItems.CUT_GENGARITE, MegastonesItems.RAW_GENGARITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegastonesItems.CUT_GYARADOSITE, MegastonesItems.RAW_GYARADOSITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegastonesItems.CUT_KANGASKHANITE, MegastonesItems.RAW_KANGASKHANITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegastonesItems.CUT_MEWTWONITEX, MegastonesItems.RAW_MEWTWONITEX, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegastonesItems.CUT_MEWTWONITEY, MegastonesItems.RAW_MEWTWONITEY, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegastonesItems.CUT_PIDGEOTITE, MegastonesItems.RAW_PIDGEOTITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegastonesItems.CUT_PINSIRITE, MegastonesItems.RAW_PINSIRITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegastonesItems.CUT_SLOWBRONITE, MegastonesItems.RAW_SLOWBRONITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegastonesItems.CUT_VENUSAURITE, MegastonesItems.RAW_VENUSAURITE, 1);


    // Smelt Ore Megastone to Raw Megastone
        // Smelting
        offerSmelting(exporter, ORE_SMELT_AERODACTYLITE, RecipeCategory.MISC, MegastonesItems.RAW_AERODACTYLITE, 1.0F, 200, "megastones");
        offerSmelting(exporter, ORE_SMELT_ALAKAZITE, RecipeCategory.MISC, MegastonesItems.RAW_ALAKAZITE, 1.0F, 200, "megastones");
        offerSmelting(exporter, ORE_SMELT_BEEDRILLITE, RecipeCategory.MISC, MegastonesItems.RAW_BEEDRILLITE, 1.0F, 200, "megastones");
        offerSmelting(exporter, ORE_SMELT_BLASTOISINITE, RecipeCategory.MISC, MegastonesItems.RAW_BLASTOISINITE, 1.0F, 200, "megastones");
        offerSmelting(exporter, ORE_SMELT_CHARIZARDITEX, RecipeCategory.MISC, MegastonesItems.RAW_CHARIZARDITEX, 1.0F, 200, "megastones");
        offerSmelting(exporter, ORE_SMELT_CHARIZARDITEY, RecipeCategory.MISC, MegastonesItems.RAW_CHARIZARDITEY, 1.0F, 200, "megastones");
        offerSmelting(exporter, ORE_SMELT_GENGARITE, RecipeCategory.MISC, MegastonesItems.RAW_GENGARITE, 1.0F, 200, "megastones");
        offerSmelting(exporter, ORE_SMELT_GYARADOSITE, RecipeCategory.MISC, MegastonesItems.RAW_GYARADOSITE, 1.0F, 200, "megastones");
        offerSmelting(exporter, ORE_SMELT_KANGASKHANITE, RecipeCategory.MISC, MegastonesItems.RAW_KANGASKHANITE, 1.0F, 200, "megastones");
        offerSmelting(exporter, ORE_SMELT_MEWTWONITEX, RecipeCategory.MISC, MegastonesItems.RAW_MEWTWONITEX, 1.0F, 200, "megastones");
        offerSmelting(exporter, ORE_SMELT_MEWTWONITEY, RecipeCategory.MISC, MegastonesItems.RAW_MEWTWONITEY, 1.0F, 200, "megastones");
        offerSmelting(exporter, ORE_SMELT_PIDGEOTITE, RecipeCategory.MISC, MegastonesItems.RAW_PIDGEOTITE, 1.0F, 200, "megastones");
        offerSmelting(exporter, ORE_SMELT_PINSIRITE, RecipeCategory.MISC, MegastonesItems.RAW_PINSIRITE, 1.0F, 200, "megastones");
        offerSmelting(exporter, ORE_SMELT_SLOWBRONITE, RecipeCategory.MISC, MegastonesItems.RAW_SLOWBRONITE, 1.0F, 200, "megastones");
        offerSmelting(exporter, ORE_SMELT_VENUSAURITE, RecipeCategory.MISC, MegastonesItems.RAW_VENUSAURITE, 1.0F, 200, "megastones");
        // Blasting
        offerBlasting(exporter, ORE_SMELT_AERODACTYLITE, RecipeCategory.MISC, MegastonesItems.RAW_AERODACTYLITE, 1.0F, 100, "megastones");
        offerBlasting(exporter, ORE_SMELT_ALAKAZITE, RecipeCategory.MISC, MegastonesItems.RAW_ALAKAZITE, 1.0F, 100, "megastones");
        offerBlasting(exporter, ORE_SMELT_BEEDRILLITE, RecipeCategory.MISC, MegastonesItems.RAW_BEEDRILLITE, 1.0F, 100, "megastones");
        offerBlasting(exporter, ORE_SMELT_BLASTOISINITE, RecipeCategory.MISC, MegastonesItems.RAW_BLASTOISINITE, 1.0F, 100, "megastones");
        offerBlasting(exporter, ORE_SMELT_CHARIZARDITEX, RecipeCategory.MISC, MegastonesItems.RAW_CHARIZARDITEX, 1.0F, 100, "megastones");
        offerBlasting(exporter, ORE_SMELT_CHARIZARDITEY, RecipeCategory.MISC, MegastonesItems.RAW_CHARIZARDITEY, 1.0F, 100, "megastones");
        offerBlasting(exporter, ORE_SMELT_GENGARITE, RecipeCategory.MISC, MegastonesItems.RAW_GENGARITE, 1.0F, 100, "megastones");
        offerBlasting(exporter, ORE_SMELT_GYARADOSITE, RecipeCategory.MISC, MegastonesItems.RAW_GYARADOSITE, 1.0F, 100, "megastones");
        offerBlasting(exporter, ORE_SMELT_KANGASKHANITE, RecipeCategory.MISC, MegastonesItems.RAW_KANGASKHANITE, 1.0F, 100, "megastones");
        offerBlasting(exporter, ORE_SMELT_MEWTWONITEX, RecipeCategory.MISC, MegastonesItems.RAW_MEWTWONITEX, 1.0F, 100, "megastones");
        offerBlasting(exporter, ORE_SMELT_MEWTWONITEY, RecipeCategory.MISC, MegastonesItems.RAW_MEWTWONITEY, 1.0F, 100, "megastones");
        offerBlasting(exporter, ORE_SMELT_PIDGEOTITE, RecipeCategory.MISC, MegastonesItems.RAW_PIDGEOTITE, 1.0F, 100, "megastones");
        offerBlasting(exporter, ORE_SMELT_PINSIRITE, RecipeCategory.MISC, MegastonesItems.RAW_PINSIRITE, 1.0F, 100, "megastones");
        offerBlasting(exporter, ORE_SMELT_SLOWBRONITE, RecipeCategory.MISC, MegastonesItems.RAW_SLOWBRONITE, 1.0F, 100, "megastones");
        offerBlasting(exporter, ORE_SMELT_VENUSAURITE, RecipeCategory.MISC, MegastonesItems.RAW_VENUSAURITE, 1.0F, 100, "megastones");

    //Mega Cuff recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, MegastonesItems.MEGA_CUFF,1)
                .pattern("iKi")
                .pattern("i i")
                .pattern("i i")
                .input('i', Items.IRON_INGOT)
                .input('K', MegastonesItems.KEY_STONE)
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(MegastonesItems.KEY_STONE),conditionsFromItem(MegastonesItems.KEY_STONE))
                .offerTo(exporter, new Identifier(MegastonesMod.MODID,getRecipeName(MegastonesItems.KEY_STONE)));
    }




}
