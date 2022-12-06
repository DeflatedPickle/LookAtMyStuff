/* Copyright (c) 2022 DeflatedPickle under the MIT license */

package com.deflatedpickle.lookatmystuff.client.render

import com.deflatedpickle.lookatmystuff.client.api.BodyRender
import com.deflatedpickle.lookatmystuff.client.api.PlayerData
import net.minecraft.util.math.Vec3d
import net.minecraft.util.math.Vec3f

object BodySwordItem : BodyRender {
    override fun getScale(data: PlayerData) = Vec3f(0.8f, 0.8f, 0.8f)
    override fun getTranslation(data: PlayerData) = when (data.arm) {
        0 -> Vec3d(-0.26, 0.8, 0.0)
        1 -> Vec3d(0.26, 0.8, 0.0)
        else -> Vec3d(0.0, 0.0, 0.0)
    }
    override fun getRotation(data: PlayerData) = Vec3f(0f, 90f, 0f)
}
