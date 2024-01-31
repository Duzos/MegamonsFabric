package git.dragomordor.megamons.item.list;

import git.dragomordor.megamons.util.megaspecies.MegaSpeciesUtil;

import java.util.ArrayList;
import java.util.List;

public class MegaPokemonList {

    public List<String> getMegaPokemonList() {
        List<String> megaPokemonList = new ArrayList<>();

        // add new Mega Pokemon here
        megaPokemonList.add(MegaSpeciesUtil.AlakazitePostEvolution);
        megaPokemonList.add(MegaSpeciesUtil.AerodactylitePostEvolution);
        megaPokemonList.add(MegaSpeciesUtil.BeedrillitePostEvolution);
        megaPokemonList.add(MegaSpeciesUtil.BlastoisinitePostEvolution);
        megaPokemonList.add(MegaSpeciesUtil.CharizarditeXPostEvolution);
        megaPokemonList.add(MegaSpeciesUtil.CharizarditeYPostEvolution);
        megaPokemonList.add(MegaSpeciesUtil.GengaritePostEvolution);
        megaPokemonList.add(MegaSpeciesUtil.GyaradositePostEvolution);
        megaPokemonList.add(MegaSpeciesUtil.KangaskhanitePostEvolution);
        megaPokemonList.add(MegaSpeciesUtil.MewtwoniteXPostEvolution);
        megaPokemonList.add(MegaSpeciesUtil.MewtwoniteYPostEvolution);
        megaPokemonList.add(MegaSpeciesUtil.PidgeotitePostEvolution);
        megaPokemonList.add(MegaSpeciesUtil.PinsiritePostEvolution);
        megaPokemonList.add(MegaSpeciesUtil.SlowbronitePostEvolution);
        megaPokemonList.add(MegaSpeciesUtil.VenusauritePostEvolution);

        return megaPokemonList;
    }

}
