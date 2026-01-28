package net.mcreator.communitycollection.procedures;

import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.communitycollection.network.CommunityCollectionModVariables;
import net.mcreator.communitycollection.init.CommunityCollectionModGameRules;

import javax.annotation.Nullable;

@EventBusSubscriber
public class GetWeatherGameruleOnWorldLoadProcedure {
	@SubscribeEvent
	public static void onWorldLoad(net.neoforged.neoforge.event.level.LevelEvent.Load event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		CommunityCollectionModVariables.MapVariables.get(world).FancyWeather = world instanceof ServerLevel _serverLevelGR0 && _serverLevelGR0.getGameRules().getBoolean(CommunityCollectionModGameRules.IMPROVED_WEATHER_RULE);
		CommunityCollectionModVariables.MapVariables.get(world).markSyncDirty();
	}
}