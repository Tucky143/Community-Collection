/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.communitycollection.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.communitycollection.client.model.Modeljellyfish;
import net.mcreator.communitycollection.client.model.Modelcapybara;

@EventBusSubscriber(Dist.CLIENT)
public class CommunityCollectionModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeljellyfish.LAYER_LOCATION, Modeljellyfish::createBodyLayer);
		event.registerLayerDefinition(Modelcapybara.LAYER_LOCATION, Modelcapybara::createBodyLayer);
	}
}