/* Copyright (c) 2022 DeflatedPickle under the MIT license */

package com.deflatedpickle.lookatmystuff.mixin;

import com.deflatedpickle.lookatmystuff.client.api.BodyRender;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.SwordItem;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3f;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;

@SuppressWarnings("UnusedMixin")
@Mixin(SwordItem.class)
public class MixinSwordItem implements BodyRender {
  @NotNull
  @Override
  public Vec3f getScale(boolean sneaking) {
    return new Vec3f(0.8f, 0.8f, 0.8f);
  }

  @NotNull
  @Override
  public Vec3d getTranslation(boolean sneaking) {
    return new Vec3d(0.35, 1.0, 0.0);
  }

  @NotNull
  @Override
  public Vec3f getRotation(boolean sneaking) {
    return new Vec3f(0f, 90f, 0f);
  }

  @NotNull
  @Override
  public ModelPart getModelPart(BipedEntityModel<PlayerEntity> model, boolean sneaking) {
    return model.body;
  }
}
