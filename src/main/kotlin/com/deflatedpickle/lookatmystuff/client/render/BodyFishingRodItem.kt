/* Copyright (c) 2022 DeflatedPickle under the MIT license */

package com.deflatedpickle.lookatmystuff.client.render

import com.deflatedpickle.lookatmystuff.client.api.BodyRender
import com.deflatedpickle.lookatmystuff.client.api.PlayerData
import net.minecraft.util.math.Vec3d
import net.minecraft.util.math.Vec3f

object BodyFishingRodItem : BodyRender {
    override fun getScale(data: PlayerData) = Vec3f(0.8f, 0.8f, 0.8f)
    override fun getTranslation(data: PlayerData) = Vec3d(0.0, 0.6, 0.15)
    override fun getRotation(data: PlayerData) = Vec3f(180f, 180f, 25f)
}
