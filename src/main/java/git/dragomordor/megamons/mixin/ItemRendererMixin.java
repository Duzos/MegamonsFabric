package git.dragomordor.megamons.mixin;

import git.dragomordor.megamons.MegamonsMod;
import git.dragomordor.megamons.item.MegamonsItems;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ItemRenderer.class)
public abstract class ItemRendererMixin {
//    @ModifyVariable(method = "renderItem", at = @At(value = "HEAD"), argsOnly = true)
//    public BakedModel useMegaCuffModel(BakedModel value, ItemStack stack, ModelTransformationMode renderMode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
//        if (stack.isOf(MegamonsItems.MEGA_CUFF)) {
//            if (renderMode == ModelTransformationMode.GUI || renderMode == ModelTransformationMode.GROUND || renderMode == ModelTransformationMode.FIXED) {
//                return ((ItemRendererAccessor) this).getModels().getModelManager().getModel(new ModelIdentifier(MegamonsMod.MODID, "mega_cuff", "inventory"));
//            } else {
//                return ((ItemRendererAccessor) this).getModels().getModelManager().getModel(new ModelIdentifier(MegamonsMod.MODID, "mega_cuff_3d", "inventory"));
//            }
//        }
//        return value;
//    }

    @ModifyVariable(method = "renderItem", at = @At(value = "HEAD"), argsOnly = true)
    public BakedModel useMegaCuffModel(BakedModel value, ItemStack stack, ModelTransformationMode renderMode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        if (stack.isOf(MegamonsItems.MEGA_CUFF)) {
            if (renderMode == ModelTransformationMode.GUI || renderMode == ModelTransformationMode.GROUND || renderMode == ModelTransformationMode.FIXED) {
                return ((ItemRendererAccessor) this).getModels().getModelManager().getModel(new ModelIdentifier(MegamonsMod.MODID, "mega_cuff", "inventory"));
            } else if (renderMode == ModelTransformationMode.FIRST_PERSON_LEFT_HAND || renderMode == ModelTransformationMode.FIRST_PERSON_RIGHT_HAND) {
                return ((ItemRendererAccessor) this).getModels().getModelManager().getModel(new ModelIdentifier(MegamonsMod.MODID, "mega_cuff", "inventory"));
            } else {
                return ((ItemRendererAccessor) this).getModels().getModelManager().getModel(new ModelIdentifier(MegamonsMod.MODID, "mega_cuff_3d", "inventory"));
            }
        }
        return value;
    }

}
