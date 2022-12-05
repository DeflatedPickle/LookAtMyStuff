/* Copyright (c) 2022 DeflatedPickle under the MIT license */

package com.deflatedpickle.lookatmystuff.client

import com.deflatedpickle.lookatmystuff.client.api.BodyRender
import net.minecraft.client.MinecraftClient
import net.minecraft.client.render.VertexConsumerProvider
import net.minecraft.client.render.entity.EntityRendererFactory
import net.minecraft.client.render.entity.LivingEntityRenderer
import net.minecraft.client.render.entity.feature.FeatureRenderer
import net.minecraft.client.render.entity.model.BipedEntityModel
import net.minecraft.client.render.model.json.ModelTransformation
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
        val stackList = (entity as PlayerEntity).inventory.main
            .subList(0, 9)
            .filter { it.item is BodyRender }
            .distinctBy { it::class }

        for (stack in stackList) {
            if (stack == entity.mainHandStack) continue

            stack?.let { stack ->
                val renderStack = stack.item as BodyRender

                matrices.push()

                with(renderStack.getScale(entity.isSneaking)) {
                    matrices.scale(x, y, z)
                }

                with(renderStack.getTranslation(entity.isSneaking)) {
                    matrices.translate(x, y, z)
                }

                with(renderStack.getModelPart(contextModel as BipedEntityModel<PlayerEntity>, entity.isSneaking)) {
                    rotate(matrices)
                }

                with(renderStack.getRotation(entity.isSneaking)) {
                    matrices.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(x))
                    matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(y))
                    matrices.multiply(Vec3f.POSITIVE_Z.getDegreesQuaternion(z))
                }

                MinecraftClient.getInstance()
                    .itemRenderer
                    .renderItem(
                        entity,
                        stack,
                        ModelTransformation.Mode.FIXED,
                        false,
                        matrices,
                        vertexConsumers,
                        entity.world,
                        light,
                        0,
                        0
                    )

                matrices.pop()
            }
        }
    }
}
