package git.dragomordor.megastones.event;

public class ModEvents {
    public static void registerEvents() {
        PokemonHeldItemChangeEvent.INSTANCE.register(MegaDevolveEvent::onPokemonHeldItemChange);
    }


}
