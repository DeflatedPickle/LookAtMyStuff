/* Copyright (c) 2022 DeflatedPickle under the MIT license */

package com.deflatedpickle.lookatmystuff.client.api

import net.minecraft.client.model.ModelPart
import net.minecraft.client.render.entity.model.BipedEntityModel
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.util.math.Vec3d
import net.minecraft.util.math.Vec3f

interface BodyRender {
    fun getScale(sneaking: Boolean): Vec3f
    fun getTranslation(sneaking: Boolean): Vec3d
    fun getRotation(sneaking: Boolean): Vec3f
    fun getModelPart(model: BipedEntityModel<PlayerEntity>, sneaking: Boolean): ModelPart
}
