/* Copyright (c) 2022 DeflatedPickle under the MIT license */

package com.deflatedpickle.lookatmystuff.client.render

import com.deflatedpickle.lookatmystuff.client.api.BodyRender
import net.minecraft.util.math.Vec3d
import net.minecraft.util.math.Vec3f

object BodyShieldItem : BodyRender {
    override fun getScale(sneaking: Boolean) = Vec3f(1.2f, 1.2f, 1.2f)
    override fun getTranslation(sneaking: Boolean) = Vec3d(0.0, 0.3, 0.05)
    override fun getRotation(sneaking: Boolean) = Vec3f(0f, 180f, 25f)
}
