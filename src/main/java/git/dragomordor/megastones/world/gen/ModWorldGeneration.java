package git.dragomordor.megastones.world.gen;

public class ModWorldGeneration {
    public static void generateModWorldGen() {

        ModOreGeneration.generateOres();
        ModGeodeGeneration.generateGeodes();

    }
}
