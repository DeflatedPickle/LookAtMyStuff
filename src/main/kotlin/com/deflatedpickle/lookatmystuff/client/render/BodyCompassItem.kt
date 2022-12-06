/* Copyright (c) 2022 DeflatedPickle under the MIT license */

package com.deflatedpickle.lookatmystuff.client.render

import com.deflatedpickle.lookatmystuff.client.api.BodyRender
import net.minecraft.util.math.Vec3d
import net.minecraft.util.math.Vec3f

object BodyCompassItem : BodyRender {
    override fun getScale(sneaking: Boolean) = Vec3f(0.2f, 0.2f, 0.2f)
    override fun getTranslation(sneaking: Boolean) = Vec3d(-0.15, 0.6, -0.12)
    override fun getRotation(sneaking: Boolean) = Vec3f(0.0f, 0.0f, 180f)
}
