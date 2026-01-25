/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.communitycollection.init;

import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.communitycollection.client.particle.WeatherDustParticle;

@EventBusSubscriber(Dist.CLIENT)
public class CommunityCollectionModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(CommunityCollectionModParticleTypes.WEATHER_DUST.get(), WeatherDustParticle::provider);
	}
}