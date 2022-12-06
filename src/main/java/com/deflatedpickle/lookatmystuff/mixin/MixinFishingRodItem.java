/* Copyright (c) 2022 DeflatedPickle under the MIT license */

package com.deflatedpickle.lookatmystuff.mixin;

import com.deflatedpickle.lookatmystuff.client.api.BodyRender;
import com.deflatedpickle.lookatmystuff.client.api.PlayerData;
import com.deflatedpickle.lookatmystuff.client.render.BodyFishingRodItem;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FishingRodItem;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3f;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;

@SuppressWarnings({"UnusedMixin", "unused"})
@Mixin(FishingRodItem.class)
public class MixinFishingRodItem implements BodyRender {
  @NotNull
  @Override
  public Vec3f getScale(@NotNull PlayerData data) {
    return BodyFishingRodItem.INSTANCE.getScale(data);
  }

  @NotNull
  @Override
  public Vec3d getTranslation(@NotNull PlayerData data) {
    return BodyFishingRodItem.INSTANCE.getTranslation(data);
  }

  @NotNull
  @Override
  public Vec3f getRotation(@NotNull PlayerData data) {
    return BodyFishingRodItem.INSTANCE.getRotation(data);
  }

  @NotNull
  @Override
  public ModelTransformation.Mode getRenderMode(@NotNull PlayerData data) {
    return BodyFishingRodItem.INSTANCE.getRenderMode(data);
  }

  @NotNull
  @Override
  public ModelPart getModelPart(
      @NotNull BipedEntityModel<PlayerEntity> model, @NotNull PlayerData data) {
    return BodyFishingRodItem.INSTANCE.getModelPart(model, data);
  }
}
