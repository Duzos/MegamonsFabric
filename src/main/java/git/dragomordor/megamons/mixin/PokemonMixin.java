package git.dragomordor.megamons.mixin;

import com.cobblemon.mod.common.pokemon.Pokemon;
import git.dragomordor.megamons.event.PokemonHeldItemChangeEvent;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Pokemon.class)
public class PokemonMixin {

    @Inject(method = "swapHeldItem", at = @At("RETURN"))
    private void onSwapHeldItem(ItemStack stack, boolean decrement, CallbackInfoReturnable<ItemStack> info) {
        PokemonHeldItemChangeEvent.INSTANCE.invoker().onPokemonHeldItemChange((Pokemon)(Object)this, info.getReturnValue(), stack);
    }

}
