/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.communitycollection.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.GameRules;

@EventBusSubscriber
public class CommunityCollectionModGameRules {
	public static GameRules.Key<GameRules.BooleanValue> IMPROVED_WEATHER_RULE;

	@SubscribeEvent
	public static void registerGameRules(FMLCommonSetupEvent event) {
		IMPROVED_WEATHER_RULE = GameRules.register("improvedWeatherRule", GameRules.Category.UPDATES, GameRules.BooleanValue.create(true));
	}
}