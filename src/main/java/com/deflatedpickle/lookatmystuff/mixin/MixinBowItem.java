/* Copyright (c) 2022 DeflatedPickle under the MIT license */

package com.deflatedpickle.lookatmystuff.mixin;

import com.deflatedpickle.lookatmystuff.client.api.BodyRender;
import com.deflatedpickle.lookatmystuff.client.render.BodyBowItem;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BowItem;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3f;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;

@SuppressWarnings({"UnusedMixin", "unused"})
@Mixin(BowItem.class)
public class MixinBowItem implements BodyRender {
  @NotNull
  @Override
  public Vec3f getScale(boolean sneaking) {
    return BodyBowItem.INSTANCE.getScale(sneaking);
  }

  @NotNull
  @Override
  public Vec3d getTranslation(boolean sneaking) {
    return BodyBowItem.INSTANCE.getTranslation(sneaking);
  }

  @NotNull
  @Override
  public Vec3f getRotation(boolean sneaking) {
    return BodyBowItem.INSTANCE.getRotation(sneaking);
  }

  @NotNull
  @Override
  public ModelTransformation.Mode getRenderMode(boolean sneaking) {
    return BodyBowItem.INSTANCE.getRenderMode(sneaking);
  }

  @NotNull
  @Override
  public ModelPart getModelPart(@NotNull BipedEntityModel<PlayerEntity> model, boolean sneaking) {
    return BodyBowItem.INSTANCE.getModelPart(model, sneaking);
  }
}
