/* Copyright (c) 2022 DeflatedPickle under the MIT license */

package com.deflatedpickle.lookatmystuff.client

import com.deflatedpickle.lookatmystuff.LookAtMyStuff
import com.deflatedpickle.lookatmystuff.client.api.BodyRender
import com.deflatedpickle.lookatmystuff.client.api.PlayerData
import net.minecraft.client.MinecraftClient
import net.minecraft.client.render.OverlayTexture
import net.minecraft.client.render.VertexConsumerProvider
import net.minecraft.client.render.entity.EntityRendererFactory
import net.minecraft.client.render.entity.LivingEntityRenderer
import net.minecraft.client.render.entity.feature.FeatureRenderer
import net.minecraft.client.render.entity.model.BipedEntityModel
import net.minecraft.client.util.math.MatrixStack
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.util.math.Vec3f

@Suppress("UNCHECKED_CAST")
class ToolFeatureRenderer<T : PlayerEntity, M : BipedEntityModel<T>>(
    context: EntityRendererFactory.Context,
    entityRenderer: LivingEntityRenderer<T, M>
) : FeatureRenderer<T, M>(entityRenderer) {
    override fun render(
        matrices: MatrixStack,
        vertexConsumers: VertexConsumerProvider,
        light: Int,
        entity: T,
        limbAngle: Float,
        limbDistance: Float,
        tickDelta: Float,
        animationProgress: Float,
        headYaw: Float,
        headPitch: Float
    ) {
        val stackList = entity.inventory.main.subList(0, 9)

        val data = PlayerData(
            entity.isSneaking,
            entity.mainArm.ordinal
        )

        for (stack in stackList) {
            if (stack == entity.mainHandStack) continue

            stack?.let {
                val renderStack = if (stack.item is BodyRender) {
                    stack.item as BodyRender
                } else {
                    LookAtMyStuff.registry[stack.item]
                }

                renderStack?.let {
                    matrices.push()

                    with(renderStack.getTranslation(data)) {
                        matrices.translate(x, y, z)
                    }

                    with(renderStack.getModelPart(contextModel as BipedEntityModel<PlayerEntity>, data)) {
                        rotate(matrices)
                    }

                    with(renderStack.getRotation(data)) {
                        matrices.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(x))
                        matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(y))
                        matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(z))
                    }

                    with(renderStack.getScale(data)) {
                        matrices.scale(x, y, z)
                    }

                    MinecraftClient.getInstance()
                        .itemRenderer
                        .renderItem(
                            entity,
                            stack,
                            renderStack.getRenderMode(data),
                            false,
                            matrices,
                            vertexConsumers,
                            entity.world,
                            light,
                            OverlayTexture.DEFAULT_UV,
                            0
                        )

                    matrices.pop()
                }
            }
        }
    }
}
