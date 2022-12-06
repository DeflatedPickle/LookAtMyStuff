/* Copyright (c) 2022 DeflatedPickle under the MIT license */

package com.deflatedpickle.lookatmystuff.client.render

import com.deflatedpickle.lookatmystuff.client.api.BodyRender
import com.deflatedpickle.lookatmystuff.client.api.PlayerData
import net.minecraft.util.math.Vec3d
import net.minecraft.util.math.Vec3f

object BodyShieldItem : BodyRender {
    override fun getScale(data: PlayerData) = Vec3f(1.4f, 1.4f, 1.4f)
    override fun getTranslation(data: PlayerData) = Vec3d(0.0, 0.3, 0.065)
    override fun getRotation(data: PlayerData) = Vec3f(0f, 180f, 25f)
}
