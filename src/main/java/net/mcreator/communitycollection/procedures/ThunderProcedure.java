package net.mcreator.communitycollection.procedures;

import net.neoforged.neoforge.client.event.ViewportEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.communitycollection.network.CommunityCollectionModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber(Dist.CLIENT)
public class ThunderProcedure {
	@SubscribeEvent
	public static void onSkyRendered(ViewportEvent.RenderFog event) {
		Minecraft mc = Minecraft.getInstance();
		execute(event, mc.player.level(), mc.player.getX(), mc.player.getY(), mc.player.getZ(), event);
	}

	public static void execute(LevelAccessor world, double x, double y, double z, ViewportEvent.RenderFog fogRenderEvent) {
		execute(null, world, x, y, z, fogRenderEvent);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, ViewportEvent.RenderFog fogRenderEvent) {
		if (fogRenderEvent == null)
			return;
		if (CommunityCollectionModVariables.MapVariables.get(world).Thundering) {
			if (world.getBiome(BlockPos.containing(x, y, z)).value().getBaseTemperature() * 100f < 95 && world.getBiome(BlockPos.containing(x, y, z)).value().getBaseTemperature() * 100f > 15) {
				if (CommunityCollectionModVariables.MapVariables.get(world).FancyWeather) {
					fogColor = 0x020202;
					fogRenderEvent.setNearPlaneDistance(0);
					fogRenderEvent.setFarPlaneDistance(15);
				}
			}
		}
	}

	private static int fogColor = -1;

	@SubscribeEvent
	public static void setFogColor(ViewportEvent.ComputeFogColor event) {
		if (fogColor != -1) {
			event.setRed(Mth.clamp(Mth.lerp(0.5F, Mth.clamp(event.getRed(), 0.0F, 1.0F), (fogColor >> 16 & 255) / 255.0F), 0.0F, 1.0F));
			event.setGreen(Mth.clamp(Mth.lerp(0.5F, Mth.clamp(event.getGreen(), 0.0F, 1.0F), (fogColor >> 8 & 255) / 255.0F), 0.0F, 1.0F));
			event.setBlue(Mth.clamp(Mth.lerp(0.5F, Mth.clamp(event.getBlue(), 0.0F, 1.0F), (fogColor & 255) / 255.0F), 0.0F, 1.0F));
			fogColor = -1;
		}
	}
}