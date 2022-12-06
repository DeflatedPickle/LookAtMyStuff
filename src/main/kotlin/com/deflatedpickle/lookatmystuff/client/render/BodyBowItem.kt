/* Copyright (c) 2022 DeflatedPickle under the MIT license */

package com.deflatedpickle.lookatmystuff.client.render

import com.deflatedpickle.lookatmystuff.client.api.BodyRender
import net.minecraft.util.math.Vec3d
import net.minecraft.util.math.Vec3f

object BodyBowItem : BodyRender {
    override fun getScale(sneaking: Boolean) = Vec3f(0.8f, 0.8f, 0.8f)
    override fun getTranslation(sneaking: Boolean) = Vec3d(0.0, 0.1, 0.15)
    override fun getRotation(sneaking: Boolean) = Vec3f(25f, 0f, 25f)
}