package git.dragomordor.megastones.datagen;

import git.dragomordor.megastones.item.MegastonesItems;
import git.dragomordor.megastones.util.ModTags;
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
                .add(MegastonesItems.CUT_AERODACTYLITE)
                .add(MegastonesItems.CUT_ALAKAZITE)
                .add(MegastonesItems.CUT_BEEDRILLITE)
                .add(MegastonesItems.CUT_BLASTOISINITE)
                .add(MegastonesItems.CUT_CHARIZARDITEX)
                .add(MegastonesItems.CUT_CHARIZARDITEY)
                .add(MegastonesItems.CUT_GENGARITE)
                .add(MegastonesItems.CUT_GYARADOSITE)
                .add(MegastonesItems.CUT_KANGASKHANITE)
                .add(MegastonesItems.CUT_MEWTWONITEX)
                .add(MegastonesItems.CUT_MEWTWONITEY)
                .add(MegastonesItems.CUT_PIDGEOTITE)
                .add(MegastonesItems.CUT_PINSIRITE)
                .add(MegastonesItems.CUT_SLOWBRONITE)
                .add(MegastonesItems.CUT_VENUSAURITE);

        getOrCreateTagBuilder(ModTags.Items.RAW_MEGASTONES)
                .add(MegastonesItems.RAW_AERODACTYLITE)
                .add(MegastonesItems.RAW_ALAKAZITE)
                .add(MegastonesItems.RAW_BEEDRILLITE)
                .add(MegastonesItems.RAW_BLASTOISINITE)
                .add(MegastonesItems.RAW_CHARIZARDITEX)
                .add(MegastonesItems.RAW_CHARIZARDITEY)
                .add(MegastonesItems.RAW_GENGARITE)
                .add(MegastonesItems.RAW_GYARADOSITE)
                .add(MegastonesItems.RAW_KANGASKHANITE)
                .add(MegastonesItems.RAW_MEWTWONITEX)
                .add(MegastonesItems.RAW_MEWTWONITEY)
                .add(MegastonesItems.RAW_PIDGEOTITE)
                .add(MegastonesItems.RAW_PINSIRITE)
                .add(MegastonesItems.RAW_SLOWBRONITE)
                .add(MegastonesItems.RAW_VENUSAURITE);


        // Biome Shard items


    }
}
