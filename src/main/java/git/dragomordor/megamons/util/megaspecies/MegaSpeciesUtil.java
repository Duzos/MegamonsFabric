package git.dragomordor.megamons.util.megaspecies;

import git.dragomordor.megamons.MegamonsMod;

import java.util.ArrayList;
import java.util.List;

public class MegaSpeciesUtil {

    // Alakazite
    public static String AlakazitePreEvolution = "alakazam";
    public static String AlakazitePostEvolution = "megaalakazam";

    // Aerodactylite
    public static String AerodactylitePreEvolution = "aerodactyl";
    public static String AerodactylitePostEvolution = "megaaerodactyl";

    // Beedrillite
    public static String BeedrillitePreEvolution = "beedrill";
    public static String BeedrillitePostEvolution = "megabeedrill";

    // Blastoisinite
    public static String BlastoisinitePreEvolution = "blastoise";
    public static String BlastoisinitePostEvolution = "megablastoise";

    // Charizardite X
    public static String CharizarditeXPreEvolution = "charizard";
    public static String CharizarditeXPostEvolution = "megacharizardx";

    // Charizardite Y
    public static String CharizarditeYPreEvolution = "charizard";
    public static String CharizarditeYPostEvolution = "megacharizardy";

    // Gengarite
    public static String GengaritePreEvolution = "gengar";
    public static String GengaritePostEvolution = "megagengar";

    // Gyaradosite
    public static String GyaradositePreEvolution = "gyarados";
    public static String GyaradositePostEvolution = "megagyrados";

    // Kangaskhanite
    public static String KangaskhanitePreEvolution = "kangaskhan";
    public static String KangaskhanitePostEvolution = "megakangaskhan";

    // Mewtwonite X
    public static String MewtwoniteXPreEvolution = "mewtwo";
    public static String MewtwoniteXPostEvolution = "megamewtwox";

    // Mewtwonite Y
    public static String MewtwoniteYPreEvolution = "mewtwo";
    public static String MewtwoniteYPostEvolution = "megamewtwoy";

    // Pidgeotite
    public static String PidgeotitePreEvolution = "pidgeot";
    public static String PidgeotitePostEvolution = "megapidgeot";

    // Pinsirite
    public static String PinsiritePreEvolution = "pinsir";
    public static String PinsiritePostEvolution = "megapinsir";

    // Slowbronite
    public static String SlowbronitePreEvolution = "slowbro";
    public static String SlowbronitePostEvolution = "megaslowbro";

    // Venusaurite
    public static String VenusauritePreEvolution = "venusaur";
    public static String VenusauritePostEvolution = "megavenusaur";

    // Mega Species List
    private static final List<String> MEGA_SPECIES = new ArrayList<>();
    static {
        MEGA_SPECIES.add(AlakazitePostEvolution);
        MEGA_SPECIES.add(AerodactylitePostEvolution);
        MEGA_SPECIES.add(BeedrillitePostEvolution);
        MEGA_SPECIES.add(BlastoisinitePostEvolution);
        MEGA_SPECIES.add(CharizarditeXPostEvolution);
        MEGA_SPECIES.add(CharizarditeYPostEvolution);
        MEGA_SPECIES.add(GengaritePostEvolution);
        MEGA_SPECIES.add(GyaradositePostEvolution);
        MEGA_SPECIES.add(KangaskhanitePostEvolution);
        MEGA_SPECIES.add(MewtwoniteXPostEvolution);
        MEGA_SPECIES.add(MewtwoniteYPostEvolution);
        MEGA_SPECIES.add(PidgeotitePostEvolution);
        MEGA_SPECIES.add(PinsiritePostEvolution);
        MEGA_SPECIES.add(SlowbronitePostEvolution);
        MEGA_SPECIES.add(VenusauritePostEvolution);
    }
    public static void registerMegaList() {
        MegamonsMod.LOGGER.info("Register Mega Species list for " + MegamonsMod.MODID) ;
    }
    public static List<String> getMegaSpecies() {
        return MEGA_SPECIES;
    }


    public static String getPreSpeciesFromPostSpecies(String pokemonPostSpecies) {
        String pokemonPreSpecies = "weedle";
        if (pokemonPostSpecies.equals(AlakazitePostEvolution)) {
           pokemonPreSpecies = AlakazitePreEvolution;
        }
        if (pokemonPostSpecies.equals(AerodactylitePostEvolution)) {
           pokemonPreSpecies = AerodactylitePreEvolution;
        }
        if (pokemonPostSpecies.equals(BeedrillitePostEvolution)) {
           pokemonPreSpecies = BeedrillitePreEvolution;
        }
        if (pokemonPostSpecies.equals(BlastoisinitePostEvolution)) {
           pokemonPreSpecies = BlastoisinitePreEvolution;
        }
        if (pokemonPostSpecies.equals(CharizarditeXPostEvolution)) {
           pokemonPreSpecies = CharizarditeXPreEvolution;
        }
        if (pokemonPostSpecies.equals(CharizarditeYPostEvolution)) {
           pokemonPreSpecies = CharizarditeYPreEvolution;
        }
        if (pokemonPostSpecies.equals(GengaritePostEvolution)) {
           pokemonPreSpecies = GengaritePreEvolution;
        }
        if (pokemonPostSpecies.equals(GyaradositePostEvolution)) {
           pokemonPreSpecies = GyaradositePreEvolution;
        }
        if (pokemonPostSpecies.equals(KangaskhanitePostEvolution)) {
           pokemonPreSpecies = KangaskhanitePreEvolution;
        }
        if (pokemonPostSpecies.equals(MewtwoniteXPostEvolution)) {
           pokemonPreSpecies = MewtwoniteXPreEvolution;
        }
        if (pokemonPostSpecies.equals(MewtwoniteYPostEvolution)) {
           pokemonPreSpecies = MewtwoniteYPreEvolution;
        }
        if (pokemonPostSpecies.equals(PidgeotitePostEvolution)) {
           pokemonPreSpecies = PidgeotitePreEvolution;
        }
        if (pokemonPostSpecies.equals(PinsiritePostEvolution)) {
           pokemonPreSpecies = PinsiritePreEvolution;
        }
        if (pokemonPostSpecies.equals(SlowbronitePostEvolution)) {
           pokemonPreSpecies = SlowbronitePreEvolution;
        }
        if (pokemonPostSpecies.equals(VenusauritePostEvolution)) {
           pokemonPreSpecies = VenusauritePreEvolution;
        }
        return pokemonPreSpecies;
    }

}
