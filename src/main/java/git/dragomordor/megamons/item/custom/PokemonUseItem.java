package git.dragomordor.megamons.item.custom;

import com.cobblemon.mod.common.api.interaction.PokemonEntityInteraction.Ownership;
import com.cobblemon.mod.common.api.storage.NoPokemonStoreException;
import com.cobblemon.mod.common.api.storage.StoreCoordinates;
import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.cobblemon.mod.common.pokemon.Pokemon;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;

public abstract class PokemonUseItem extends Item {
    public PokemonUseItem(Item.Settings arg) {
        super(arg);
    }

    @Override
    public ActionResult useOnEntity(ItemStack itemStack, PlayerEntity player, LivingEntity target, Hand hand) {
        // ensures code is running on client side only
        if (player.getWorld().isClient) {
            return ActionResult.PASS;
        }

        //checks whether target is Pokémon
        if (!(target instanceof PokemonEntity pokemonEntity)) {
            player.sendMessage(Text.of("Not a Pokémon"),true);
            return ActionResult.FAIL;
        }

        // stores pokemon information
        Pokemon pokemon = pokemonEntity.getPokemon();
        StoreCoordinates<?> storeCoordinates = pokemon.getStoreCoordinates().get();

        // determines Pokémon ownership
        Ownership ownership;
        if (storeCoordinates == null) {
            ownership = Ownership.WILD;
        } else if (storeCoordinates.getStore().getUuid().equals(player.getUuid())) {
            ownership = Ownership.OWNER;
        } else {
            ownership = Ownership.OWNED_ANOTHER;
        }

        // when you are not Pokémon's owner, give error
        if (ownership != Ownership.OWNER) {
            player.sendMessage(Text.of("Not your Pokémon"),true);
            return ActionResult.FAIL;
        }

        try {
            return processInteraction(itemStack, (ServerPlayerEntity) player, pokemonEntity, pokemon);
        } catch (NoPokemonStoreException e) {
            throw new RuntimeException(e);
        }
    }
    public abstract ActionResult processInteraction(ItemStack itemStack, ServerPlayerEntity player, PokemonEntity target, Pokemon pokemon) throws NoPokemonStoreException;
}