package git.dragomordor.megastones.util;

import com.cobblemon.mod.common.api.pokemon.PokemonSpecies;
import com.cobblemon.mod.common.pokemon.Pokemon;
import com.cobblemon.mod.common.pokemon.Species;
import git.dragomordor.megastones.item.MegastonesItems;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

public class MegaEvolveMegastoneSpecies {

    public static Species getApplicablePokemonPreEvolutionSpeciesFromMegastone(Item heldMegastone) {

        // Alakazite
        if (heldMegastone.equals(MegastonesItems.CUT_ALAKAZITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegastoneMegaSpecies.AlakazitePreEvolution);
        }

        // Aerodactyl
        if (heldMegastone.equals(MegastonesItems.CUT_AERODACTYLITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegastoneMegaSpecies.AerodactylitePreEvolution);
        }
        // Beedrill
        if (heldMegastone.equals(MegastonesItems.CUT_BEEDRILLITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegastoneMegaSpecies.BeedrillitePreEvolution);
        }
        // Blastois
        if (heldMegastone.equals(MegastonesItems.CUT_BLASTOISINITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegastoneMegaSpecies.BlastoisinitePreEvolution);
        }
        // Charizard X
        if (heldMegastone.equals(MegastonesItems.CUT_CHARIZARDITEX)) {
            return PokemonSpecies.INSTANCE.getByName(MegastoneMegaSpecies.CharizarditeXPreEvolution);
        }
        // Charizard Y
        if (heldMegastone.equals(MegastonesItems.CUT_CHARIZARDITEY)) {
            return PokemonSpecies.INSTANCE.getByName(MegastoneMegaSpecies.CharizarditeYPreEvolution);
        }
        // Gengar
        if (heldMegastone.equals(MegastonesItems.CUT_GENGARITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegastoneMegaSpecies.GengaritePreEvolution);
        }
        // Gyarados
        if (heldMegastone.equals(MegastonesItems.CUT_GYARADOSITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegastoneMegaSpecies.GyaradositePreEvolution);
        }
        // Kangaskhan
        if (heldMegastone.equals(MegastonesItems.CUT_KANGASKHANITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegastoneMegaSpecies.KangaskhanitePreEvolution);
        }
        // Mewtwo X
        if (heldMegastone.equals(MegastonesItems.CUT_MEWTWONITEX)) {
            return PokemonSpecies.INSTANCE.getByName(MegastoneMegaSpecies.MewtwoniteXPreEvolution);
        }
        // Mewtwo Y
        if (heldMegastone.equals(MegastonesItems.CUT_MEWTWONITEY)) {
            return PokemonSpecies.INSTANCE.getByName(MegastoneMegaSpecies.MewtwoniteYPreEvolution);
        }
        // Pidgeot
        if (heldMegastone.equals(MegastonesItems.CUT_PIDGEOTITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegastoneMegaSpecies.PidgeotitePreEvolution);
        }
        // Pinsir
        if (heldMegastone.equals(MegastonesItems.CUT_PINSIRITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegastoneMegaSpecies.PinsiritePreEvolution);
        }
        // Slowbro
        if (heldMegastone.equals(MegastonesItems.CUT_SLOWBRONITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegastoneMegaSpecies.SlowbronitePreEvolution);
        }
        // Venusaur
        if (heldMegastone.equals(MegastonesItems.CUT_VENUSAURITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegastoneMegaSpecies.VenusauritePreEvolution);
        }

        // Default, held item is not in mega stone list (need to return something, not null)
        return PokemonSpecies.INSTANCE.getByName("weedle");
    }

    public static Species getApplicablePokemonPostEvolutionSpeciesFromMegastone(Item heldMegastone) {

        // Alakazite
        if (heldMegastone.equals(MegastonesItems.CUT_ALAKAZITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegastoneMegaSpecies.AlakazitePostEvolution);
        }

        // Aerodactyl
        if (heldMegastone.equals(MegastonesItems.CUT_AERODACTYLITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegastoneMegaSpecies.AerodactylitePostEvolution);
        }
        // Beedrill
        if (heldMegastone.equals(MegastonesItems.CUT_BEEDRILLITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegastoneMegaSpecies.BeedrillitePostEvolution);
        }
        // Blastois
        if (heldMegastone.equals(MegastonesItems.CUT_BLASTOISINITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegastoneMegaSpecies.BlastoisinitePostEvolution);
        }
        // Charizard X
        if (heldMegastone.equals(MegastonesItems.CUT_CHARIZARDITEX)) {
            return PokemonSpecies.INSTANCE.getByName(MegastoneMegaSpecies.CharizarditeXPostEvolution);
        }
        // Charizard Y
        if (heldMegastone.equals(MegastonesItems.CUT_CHARIZARDITEY)) {
            return PokemonSpecies.INSTANCE.getByName(MegastoneMegaSpecies.CharizarditeYPostEvolution);
        }
        // Gengar
        if (heldMegastone.equals(MegastonesItems.CUT_GENGARITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegastoneMegaSpecies.GengaritePostEvolution);
        }
        // Gyarados
        if (heldMegastone.equals(MegastonesItems.CUT_GYARADOSITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegastoneMegaSpecies.GyaradositePostEvolution);
        }
        // Kangaskhan
        if (heldMegastone.equals(MegastonesItems.CUT_KANGASKHANITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegastoneMegaSpecies.KangaskhanitePostEvolution);
        }
        // Mewtwo X
        if (heldMegastone.equals(MegastonesItems.CUT_MEWTWONITEX)) {
            return PokemonSpecies.INSTANCE.getByName(MegastoneMegaSpecies.MewtwoniteXPostEvolution);
        }
        // Mewtwo Y
        if (heldMegastone.equals(MegastonesItems.CUT_MEWTWONITEY)) {
            return PokemonSpecies.INSTANCE.getByName(MegastoneMegaSpecies.MewtwoniteYPostEvolution);
        }
        // Pidgeot
        if (heldMegastone.equals(MegastonesItems.CUT_PIDGEOTITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegastoneMegaSpecies.PidgeotitePostEvolution);
        }
        // Pinsir
        if (heldMegastone.equals(MegastonesItems.CUT_PINSIRITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegastoneMegaSpecies.PinsiritePostEvolution);
        }
        // Slowbro
        if (heldMegastone.equals(MegastonesItems.CUT_SLOWBRONITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegastoneMegaSpecies.SlowbronitePostEvolution);
        }
        // Venusaur
        if (heldMegastone.equals(MegastonesItems.CUT_VENUSAURITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegastoneMegaSpecies.VenusauritePostEvolution);
        }

        // Default, held item is not in mega stone list (need to return something, not null)
        return PokemonSpecies.INSTANCE.getByName("weedle");
    }

}
