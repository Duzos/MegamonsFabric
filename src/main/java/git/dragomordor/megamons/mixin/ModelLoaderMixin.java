package git.dragomordor.megamons.mixin;

import git.dragomordor.megamons.MegamonsMod;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.render.model.BlockStatesLoader;
import net.minecraft.client.render.model.ModelLoader;
import net.minecraft.client.render.model.json.JsonUnbakedModel;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;
import java.util.Map;

@Mixin(ModelLoader.class)
public abstract class ModelLoaderMixin {
    @Shadow
    protected abstract void loadInventoryVariantItemModel(Identifier modelId);

    @Inject(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/model/BlockStatesLoader;getStateLookup()Lit/unimi/dsi/fastutil/objects/Object2IntMap;", shift = At.Shift.AFTER))
    public void addMegaCuff(BlockColors blockColors, Profiler profiler, Map<Identifier, JsonUnbakedModel> map, Map<Identifier, List<BlockStatesLoader.SourceTrackedData>> map2, CallbackInfo ci) {
        this.loadInventoryVariantItemModel(Identifier.of(MegamonsMod.MODID, "mega_cuff_3d"));
        this.loadInventoryVariantItemModel(Identifier.of(MegamonsMod.MODID, "mega_cuff"));
    }
}
