package git.dragomordor.megamons.datagen;

import git.dragomordor.megamons.item.MegamonsItems;
import git.dragomordor.megamons.tags.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ModTags.Items.CUT_MEGASTONES)
                .add(MegamonsItems.CUT_AERODACTYLITE)
                .add(MegamonsItems.CUT_ALAKAZITE)
                .add(MegamonsItems.CUT_BEEDRILLITE)
                .add(MegamonsItems.CUT_BLASTOISINITE)
                .add(MegamonsItems.CUT_CHARIZARDITEX)
                .add(MegamonsItems.CUT_CHARIZARDITEY)
                .add(MegamonsItems.CUT_GENGARITE)
                .add(MegamonsItems.CUT_GYARADOSITE)
                .add(MegamonsItems.CUT_KANGASKHANITE)
                .add(MegamonsItems.CUT_MEWTWONITEX)
                .add(MegamonsItems.CUT_MEWTWONITEY)
                .add(MegamonsItems.CUT_PIDGEOTITE)
                .add(MegamonsItems.CUT_PINSIRITE)
                .add(MegamonsItems.CUT_SLOWBRONITE)
                .add(MegamonsItems.CUT_VENUSAURITE);

        getOrCreateTagBuilder(ModTags.Items.RAW_MEGASTONES)
                .add(MegamonsItems.RAW_AERODACTYLITE)
                .add(MegamonsItems.RAW_ALAKAZITE)
                .add(MegamonsItems.RAW_BEEDRILLITE)
                .add(MegamonsItems.RAW_BLASTOISINITE)
                .add(MegamonsItems.RAW_CHARIZARDITEX)
                .add(MegamonsItems.RAW_CHARIZARDITEY)
                .add(MegamonsItems.RAW_GENGARITE)
                .add(MegamonsItems.RAW_GYARADOSITE)
                .add(MegamonsItems.RAW_KANGASKHANITE)
                .add(MegamonsItems.RAW_MEWTWONITEX)
                .add(MegamonsItems.RAW_MEWTWONITEY)
                .add(MegamonsItems.RAW_PIDGEOTITE)
                .add(MegamonsItems.RAW_PINSIRITE)
                .add(MegamonsItems.RAW_SLOWBRONITE)
                .add(MegamonsItems.RAW_VENUSAURITE);


        // Biome Shard items


    }
}
