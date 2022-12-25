/* Copyright (c) 2021-2022 DeflatedPickle under the MIT license */

package com.deflatedpickle.lookatmystuff

import com.deflatedpickle.lookatmystuff.client.api.BodyRender
import com.deflatedpickle.lookatmystuff.client.render.BodyClockItem
import net.minecraft.item.Item
import net.minecraft.item.Items
import org.quiltmc.loader.api.ModContainer
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer

@Suppress("UNUSED")
object LookAtMyStuff : ClientModInitializer {
    private const val MOD_ID = "$[id]"
    private const val NAME = "$[name]"
    private const val GROUP = "$[group]"
    private const val AUTHOR = "$[author]"
    private const val VERSION = "$[version]"

    val registry = mutableMapOf<Item, BodyRender>()

    override fun onInitializeClient(mod: ModContainer) {
        println(listOf(MOD_ID, NAME, GROUP, AUTHOR, VERSION))

        registry[Items.CLOCK] = BodyClockItem
    }
}
