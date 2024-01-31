package git.dragomordor.megamons.world.gen;

public class ModWorldGeneration {
    public static void generateModWorldGen() {

        ModOreGeneration.generateOres();
        ModGeodeGeneration.generateGeodes();

    }
}
