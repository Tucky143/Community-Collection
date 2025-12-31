/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.communitycollection.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.communitycollection.client.renderer.JellyfishRenderer;
import net.mcreator.communitycollection.client.renderer.CapybaraRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class CommunityCollectionModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CommunityCollectionModEntities.COCONUT_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CommunityCollectionModEntities.ICICLE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CommunityCollectionModEntities.CAPYBARA.get(), CapybaraRenderer::new);
		event.registerEntityRenderer(CommunityCollectionModEntities.JELLYFISH.get(), JellyfishRenderer::new);
	}
}