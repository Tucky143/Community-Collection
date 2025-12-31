package net.mcreator.communitycollection.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.animation.KeyframeAnimation;
import net.minecraft.client.Minecraft;

import net.mcreator.communitycollection.entity.JellyfishEntity;
import net.mcreator.communitycollection.client.model.animations.jellyfishAnimation;
import net.mcreator.communitycollection.client.model.Modeljellyfish;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class JellyfishRenderer extends MobRenderer<JellyfishEntity, LivingEntityRenderState, Modeljellyfish> {
	private JellyfishEntity entity = null;

	public JellyfishRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modeljellyfish.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("community_collection:textures/entities/jellyfish.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LivingEntityRenderState state, float headYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
				EntityModel model = new Modeljellyfish(Minecraft.getInstance().getEntityModels().bakeLayer(Modeljellyfish.LAYER_LOCATION));
				model.setupAnim(state);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(state, 0));
			}
		});
		this.addLayer(new RenderLayer<>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("community_collection:textures/entities/jellyfish_glowing.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, LivingEntityRenderState state, float headYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				EntityModel model = new Modeljellyfish(Minecraft.getInstance().getEntityModels().bakeLayer(Modeljellyfish.LAYER_LOCATION));
				model.setupAnim(state);
				model.renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(state, 0));
			}
		});
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(JellyfishEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		if (entity != null)
			return ResourceLocation.parse("community_collection:textures/entities/" + entity.getTexture() + ".png");
		return ResourceLocation.parse("community_collection:textures/entities/jellyfish.png");
	}

	@Override
	protected boolean isBodyVisible(LivingEntityRenderState state) {
		return false;
	}

	private static final class AnimatedModel extends Modeljellyfish {
		private JellyfishEntity entity = null;
		private final KeyframeAnimation keyframeAnimation0;
		private final KeyframeAnimation keyframeAnimation1;

		public AnimatedModel(ModelPart root) {
			super(root);
			this.keyframeAnimation0 = jellyfishAnimation.idle.bake(root);
			this.keyframeAnimation1 = jellyfishAnimation.attacking.bake(root);
		}

		public void setEntity(JellyfishEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.keyframeAnimation0.applyWalk(state.walkAnimationPos, state.walkAnimationSpeed, 1f, 1f);
			this.keyframeAnimation1.apply(entity.animationState1, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}
}