/* Copyright (c) 2022 DeflatedPickle under the MIT license */

package com.deflatedpickle.lookatmystuff.mixin;

import com.deflatedpickle.lookatmystuff.client.api.BodyRender;
import com.deflatedpickle.lookatmystuff.client.api.PlayerData;
import com.deflatedpickle.lookatmystuff.client.render.BodyToolItem;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3f;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;

@SuppressWarnings({"UnusedMixin", "unused"})
@Mixin(PickaxeItem.class)
public class MixinPickaxeItem implements BodyRender {
  @NotNull
  @Override
  public Vec3f getScale(@NotNull PlayerData data) {
    return BodyToolItem.INSTANCE.getScale(data);
  }

  @NotNull
  @Override
  public Vec3d getTranslation(@NotNull PlayerData data) {
    return BodyToolItem.INSTANCE.getTranslation(data);
  }

  @NotNull
  @Override
  public Vec3f getRotation(@NotNull PlayerData data) {
    return BodyToolItem.INSTANCE.getRotation(data);
  }

  @NotNull
  @Override
  public ModelTransformation.Mode getRenderMode(@NotNull PlayerData data) {
    return BodyToolItem.INSTANCE.getRenderMode(data);
  }

  @NotNull
  @Override
  public ModelPart getModelPart(
      @NotNull BipedEntityModel<PlayerEntity> model, @NotNull PlayerData data) {
    return BodyToolItem.INSTANCE.getModelPart(model, data);
  }
}
