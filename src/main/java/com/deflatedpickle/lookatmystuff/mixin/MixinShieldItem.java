/* Copyright (c) 2022 DeflatedPickle under the MIT license */

package com.deflatedpickle.lookatmystuff.mixin;

import com.deflatedpickle.lookatmystuff.client.api.BodyRender;
import com.deflatedpickle.lookatmystuff.client.render.BodyShieldItem;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ShieldItem;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3f;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;

@SuppressWarnings({"UnusedMixin", "unused"})
@Mixin(ShieldItem.class)
public class MixinShieldItem implements BodyRender {
  @NotNull
  @Override
  public Vec3f getScale(boolean sneaking) {
    return BodyShieldItem.INSTANCE.getScale(sneaking);
  }

  @NotNull
  @Override
  public Vec3d getTranslation(boolean sneaking) {
    return BodyShieldItem.INSTANCE.getTranslation(sneaking);
  }

  @NotNull
  @Override
  public Vec3f getRotation(boolean sneaking) {
    return BodyShieldItem.INSTANCE.getRotation(sneaking);
  }

  @NotNull
  @Override
  public ModelTransformation.Mode getRenderMode(boolean sneaking) {
    return BodyShieldItem.INSTANCE.getRenderMode(sneaking);
  }

  @NotNull
  @Override
  public ModelPart getModelPart(@NotNull BipedEntityModel<PlayerEntity> model, boolean sneaking) {
    return BodyShieldItem.INSTANCE.getModelPart(model, sneaking);
  }
}
