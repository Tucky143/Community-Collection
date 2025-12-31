package net.mcreator.communitycollection.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.communitycollection.entity.CapybaraEntity;
import net.mcreator.communitycollection.client.model.Modelcapybara;

import com.mojang.blaze3d.vertex.PoseStack;

public class CapybaraRenderer extends MobRenderer<CapybaraEntity, LivingEntityRenderState, Modelcapybara> {
	private CapybaraEntity entity = null;

	public CapybaraRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcapybara(context.bakeLayer(Modelcapybara.LAYER_LOCATION)), 0.45f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CapybaraEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		if (entity != null)
			return ResourceLocation.parse("community_collection:textures/entities/" + entity.getTexture() + ".png");
		return ResourceLocation.parse("community_collection:textures/entities/capybara.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(entity.getAgeScale(), entity.getAgeScale(), entity.getAgeScale());
	}
}