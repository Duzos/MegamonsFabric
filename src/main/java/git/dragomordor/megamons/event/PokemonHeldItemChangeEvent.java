package git.dragomordor.megamons.event;

import com.cobblemon.mod.common.pokemon.Pokemon;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.item.ItemStack;

public interface PokemonHeldItemChangeEvent {
    Event<PokemonHeldItemChangeEvent> INSTANCE = EventFactory.createArrayBacked(
            PokemonHeldItemChangeEvent.class,
            (listeners) -> (pokemon, previousItem, newItem) -> {
                for (PokemonHeldItemChangeEvent listener : listeners) {
                    listener.onPokemonHeldItemChange(pokemon, previousItem, newItem);
                }
            }
    );

    void onPokemonHeldItemChange(Pokemon pokemon, ItemStack previousItem, ItemStack newItem);
}
