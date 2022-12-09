/* Copyright (c) 2022 DeflatedPickle under the MIT license */

package com.deflatedpickle.lookatmystuff.client.render

import com.deflatedpickle.lookatmystuff.client.api.BodyRender
import com.deflatedpickle.lookatmystuff.client.api.PlayerData
import net.minecraft.client.render.model.json.ModelTransformation.Mode
import net.minecraft.util.math.Vec3d
import net.minecraft.util.math.Vec3f

object BodySpyglassItem : BodyRender {
    override fun getScale(data: PlayerData) = Vec3f(0.4f, 0.4f, 0.4f)
    override fun getTranslation(data: PlayerData) = when (data.arm) {
        0 -> Vec3d(0.17, 0.4, 0.14)
        1 -> Vec3d(-0.17, 0.4, 0.14)
        else -> Vec3d(0.0, 0.0, 0.0)
    }
    override fun getRotation(data: PlayerData) = Vec3f(95f, 5f, 0f)
    override fun getRenderMode(data: PlayerData) = Mode.HEAD
}
