/* Copyright (c) 2022 DeflatedPickle under the MIT license */

package com.deflatedpickle.lookatmystuff.client.render

import com.deflatedpickle.lookatmystuff.client.api.BodyRender
import com.deflatedpickle.lookatmystuff.client.api.PlayerData
import net.minecraft.util.math.Vec3d
import net.minecraft.util.math.Vec3f

object BodyFlintAndSteelItem : BodyRender {
    override fun getScale(data: PlayerData) = Vec3f(0.4f, 0.4f, 0.4f)
    override fun getTranslation(data: PlayerData) = Vec3d(-0.1, 0.6, 0.15)
    override fun getRotation(data: PlayerData) = Vec3f(0f, -5f, 0f)
}
