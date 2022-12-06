/* Copyright (c) 2022 DeflatedPickle under the MIT license */

package com.deflatedpickle.lookatmystuff.client.render

import com.deflatedpickle.lookatmystuff.client.api.BodyRender
import com.deflatedpickle.lookatmystuff.client.api.PlayerData
import net.minecraft.util.math.Vec3d
import net.minecraft.util.math.Vec3f

object BodyCompassItem : BodyRender {
    override fun getScale(data: PlayerData) = Vec3f(0.2f, 0.2f, 0.2f)
    override fun getTranslation(data: PlayerData) = Vec3d(-0.15, 0.6, -0.13)
    override fun getRotation(data: PlayerData) = Vec3f(0.0f, 0.0f, 180f)
}
