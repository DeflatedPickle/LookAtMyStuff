/* Copyright (c) 2022 DeflatedPickle under the MIT license */

package com.deflatedpickle.lookatmystuff.client.api

import net.minecraft.client.model.ModelPart
import net.minecraft.client.render.entity.model.BipedEntityModel
import net.minecraft.client.render.model.json.ModelTransformation.Mode
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.util.math.Vec3d
import net.minecraft.util.math.Vec3f

interface BodyRender {
    fun getScale(data: PlayerData): Vec3f
    fun getTranslation(data: PlayerData): Vec3d
    fun getRotation(data: PlayerData): Vec3f

    fun getRenderMode(data: PlayerData): Mode = Mode.FIXED
    fun getModelPart(model: BipedEntityModel<PlayerEntity>, data: PlayerData): ModelPart = model.body
}
