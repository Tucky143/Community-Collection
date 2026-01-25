package net.mcreator.communitycollection.procedures;

import net.neoforged.neoforge.event.tick.LevelTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.communitycollection.network.CommunityCollectionModVariables;
import net.mcreator.communitycollection.CommunityCollectionMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class ServerSyncProcedure {
	@SubscribeEvent
	public static void onWorldTick(LevelTickEvent.Post event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (world instanceof ServerLevel _origLevel) {
			LevelAccessor _worldorig = world;
			world = _origLevel.getServer().getLevel(Level.OVERWORLD);
			if (world != null) {
				if (CommunityCollectionModVariables.MapVariables.get(world).Thundering != world.getLevelData().isThundering()) {
					CommunityCollectionModVariables.MapVariables.get(world).Thundering = world.getLevelData().isThundering();
					CommunityCollectionModVariables.MapVariables.get(world).markSyncDirty();
					CommunityCollectionMod.LOGGER.info("World Thunder" + world.getLevelData().isThundering());
					CommunityCollectionMod.LOGGER.info("Variable Thunder" + CommunityCollectionModVariables.MapVariables.get(world).Thundering);
				}
			}
			world = _worldorig;
		}
	}
}