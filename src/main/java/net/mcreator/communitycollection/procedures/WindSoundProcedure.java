package net.mcreator.communitycollection.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.communitycollection.network.CommunityCollectionModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class WindSoundProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (CommunityCollectionModVariables.MapVariables.get(world).FancyWeather) {
			if (entity.getData(CommunityCollectionModVariables.PLAYER_VARIABLES).wind_sound_timer <= 0) {
				if (y > 55) {
					if (world.getLevelData().isRaining() || world.getLevelData().isThundering()) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world.isClientSide()) {
								var sound = BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("community_collection:wind"));
								Minecraft.getInstance().getSoundManager().play(net.minecraft.client.resources.sounds.SimpleSoundInstance.forUI(sound, 1.3f, // volume
										1.0f // pitch
								));
							}
							{
								CommunityCollectionModVariables.PlayerVariables _vars = entity.getData(CommunityCollectionModVariables.PLAYER_VARIABLES);
								_vars.wind_sound_timer = 200;
								_vars.markSyncDirty();
							}
						} else {
							{
								CommunityCollectionModVariables.PlayerVariables _vars = entity.getData(CommunityCollectionModVariables.PLAYER_VARIABLES);
								_vars.wind_sound_timer = 0;
								_vars.markSyncDirty();
							}
						}
					} else {
						{
							CommunityCollectionModVariables.PlayerVariables _vars = entity.getData(CommunityCollectionModVariables.PLAYER_VARIABLES);
							_vars.wind_sound_timer = 0;
							_vars.markSyncDirty();
						}
					}
				}
			} else {
				{
					CommunityCollectionModVariables.PlayerVariables _vars = entity.getData(CommunityCollectionModVariables.PLAYER_VARIABLES);
					_vars.wind_sound_timer = entity.getData(CommunityCollectionModVariables.PLAYER_VARIABLES).wind_sound_timer - 1;
					_vars.markSyncDirty();
				}
			}
		}
	}
}