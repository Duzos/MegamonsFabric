package git.dragomordor.megastones.datagen;


import git.dragomordor.megastones.block.MegastonesBlocks;
import git.dragomordor.megastones.item.MegastonesItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.LootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {



    // ores drop raw stones
        // stone ores
        addDrop(MegastonesBlocks.ORE_AERODACTYLITE, megastoneOreDrops(MegastonesBlocks.ORE_AERODACTYLITE, MegastonesItems.RAW_AERODACTYLITE));
        addDrop(MegastonesBlocks.ORE_ALAKAZITE, megastoneOreDrops(MegastonesBlocks.ORE_ALAKAZITE, MegastonesItems.RAW_ALAKAZITE));
        addDrop(MegastonesBlocks.ORE_BEEDRILLITE, megastoneOreDrops(MegastonesBlocks.ORE_BEEDRILLITE, MegastonesItems.RAW_BEEDRILLITE));
        addDrop(MegastonesBlocks.ORE_BLASTOISINITE, megastoneOreDrops(MegastonesBlocks.ORE_BLASTOISINITE, MegastonesItems.RAW_BLASTOISINITE));
        addDrop(MegastonesBlocks.ORE_CHARIZARDITEX, megastoneOreDrops(MegastonesBlocks.ORE_CHARIZARDITEX, MegastonesItems.RAW_CHARIZARDITEX));
        addDrop(MegastonesBlocks.ORE_CHARIZARDITEY, megastoneOreDrops(MegastonesBlocks.ORE_CHARIZARDITEY, MegastonesItems.RAW_CHARIZARDITEY));
        addDrop(MegastonesBlocks.ORE_GENGARITE, megastoneOreDrops(MegastonesBlocks.ORE_GENGARITE, MegastonesItems.RAW_GENGARITE));
        addDrop(MegastonesBlocks.ORE_GYARADOSITE, megastoneOreDrops(MegastonesBlocks.ORE_GYARADOSITE, MegastonesItems.RAW_GYARADOSITE));
        addDrop(MegastonesBlocks.ORE_KANGASKHANITE, megastoneOreDrops(MegastonesBlocks.ORE_KANGASKHANITE, MegastonesItems.RAW_KANGASKHANITE));
        addDrop(MegastonesBlocks.ORE_MEWTWONITEX, megastoneOreDrops(MegastonesBlocks.ORE_MEWTWONITEX, MegastonesItems.RAW_MEWTWONITEX));
        addDrop(MegastonesBlocks.ORE_MEWTWONITEY, megastoneOreDrops(MegastonesBlocks.ORE_MEWTWONITEY, MegastonesItems.RAW_MEWTWONITEY));
        addDrop(MegastonesBlocks.ORE_PIDGEOTITE, megastoneOreDrops(MegastonesBlocks.ORE_PIDGEOTITE, MegastonesItems.RAW_PIDGEOTITE));
        addDrop(MegastonesBlocks.ORE_PINSIRITE, megastoneOreDrops(MegastonesBlocks.ORE_PINSIRITE, MegastonesItems.RAW_PINSIRITE));
        addDrop(MegastonesBlocks.ORE_SLOWBRONITE, megastoneOreDrops(MegastonesBlocks.ORE_SLOWBRONITE, MegastonesItems.RAW_SLOWBRONITE));
        addDrop(MegastonesBlocks.ORE_VENUSAURITE, megastoneOreDrops(MegastonesBlocks.ORE_VENUSAURITE, MegastonesItems.RAW_VENUSAURITE));
        // deepslate ores
        addDrop(MegastonesBlocks.ORE_DEEPSLATE_AERODACTYLITE, megastoneOreDrops(MegastonesBlocks.ORE_DEEPSLATE_AERODACTYLITE, MegastonesItems.RAW_AERODACTYLITE));
        addDrop(MegastonesBlocks.ORE_DEEPSLATE_ALAKAZITE, megastoneOreDrops(MegastonesBlocks.ORE_DEEPSLATE_ALAKAZITE, MegastonesItems.RAW_ALAKAZITE));
        addDrop(MegastonesBlocks.ORE_DEEPSLATE_BEEDRILLITE, megastoneOreDrops(MegastonesBlocks.ORE_DEEPSLATE_BEEDRILLITE, MegastonesItems.RAW_BEEDRILLITE));
        addDrop(MegastonesBlocks.ORE_DEEPSLATE_BLASTOISINITE, megastoneOreDrops(MegastonesBlocks.ORE_DEEPSLATE_BLASTOISINITE, MegastonesItems.RAW_BLASTOISINITE));
        addDrop(MegastonesBlocks.ORE_DEEPSLATE_CHARIZARDITEX, megastoneOreDrops(MegastonesBlocks.ORE_DEEPSLATE_CHARIZARDITEX, MegastonesItems.RAW_CHARIZARDITEX));
        addDrop(MegastonesBlocks.ORE_DEEPSLATE_CHARIZARDITEY, megastoneOreDrops(MegastonesBlocks.ORE_DEEPSLATE_CHARIZARDITEY, MegastonesItems.RAW_CHARIZARDITEY));
        addDrop(MegastonesBlocks.ORE_DEEPSLATE_GENGARITE, megastoneOreDrops(MegastonesBlocks.ORE_DEEPSLATE_GENGARITE, MegastonesItems.RAW_GENGARITE));
        addDrop(MegastonesBlocks.ORE_DEEPSLATE_GYARADOSITE, megastoneOreDrops(MegastonesBlocks.ORE_DEEPSLATE_GYARADOSITE, MegastonesItems.RAW_GYARADOSITE));
        addDrop(MegastonesBlocks.ORE_DEEPSLATE_KANGASKHANITE, megastoneOreDrops(MegastonesBlocks.ORE_DEEPSLATE_KANGASKHANITE, MegastonesItems.RAW_KANGASKHANITE));
        addDrop(MegastonesBlocks.ORE_DEEPSLATE_MEWTWONITEX, megastoneOreDrops(MegastonesBlocks.ORE_DEEPSLATE_MEWTWONITEX, MegastonesItems.RAW_MEWTWONITEX));
        addDrop(MegastonesBlocks.ORE_DEEPSLATE_MEWTWONITEY, megastoneOreDrops(MegastonesBlocks.ORE_DEEPSLATE_MEWTWONITEY, MegastonesItems.RAW_MEWTWONITEY));
        addDrop(MegastonesBlocks.ORE_DEEPSLATE_PIDGEOTITE, megastoneOreDrops(MegastonesBlocks.ORE_DEEPSLATE_PIDGEOTITE, MegastonesItems.RAW_PIDGEOTITE));
        addDrop(MegastonesBlocks.ORE_DEEPSLATE_PINSIRITE, megastoneOreDrops(MegastonesBlocks.ORE_DEEPSLATE_PINSIRITE, MegastonesItems.RAW_PINSIRITE));
        addDrop(MegastonesBlocks.ORE_DEEPSLATE_SLOWBRONITE, megastoneOreDrops(MegastonesBlocks.ORE_DEEPSLATE_SLOWBRONITE, MegastonesItems.RAW_SLOWBRONITE));
        addDrop(MegastonesBlocks.ORE_DEEPSLATE_VENUSAURITE, megastoneOreDrops(MegastonesBlocks.ORE_DEEPSLATE_VENUSAURITE, MegastonesItems.RAW_VENUSAURITE));

        // Megastone Geode Block
        addDrop(MegastonesBlocks.GEODE_MEGASTONE_WALL);


    }


    public LootTable.Builder megastoneOreDrops(Block drop, Item item) {
        return dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ItemEntry.builder(item)
                        .apply(SetCountLootFunction.
                                builder(UniformLootNumberProvider.
                                        create(1.0F,1.0F))).
                        apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE)))); // last line adds fortune modifier
    }

}
