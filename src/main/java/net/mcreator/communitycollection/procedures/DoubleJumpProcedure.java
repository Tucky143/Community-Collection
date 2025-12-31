package net.mcreator.communitycollection.procedures;

import net.neoforged.neoforge.event.entity.living.LivingEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.communitycollection.init.CommunityCollectionModItems;
import net.mcreator.communitycollection.CommunityCollectionMod;

import javax.annotation.Nullable;

import java.util.function.Function;

@EventBusSubscriber
public class DoubleJumpProcedure {
	@SubscribeEvent
	public static void onEntityJump(LivingEvent.LivingJumpEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == CommunityCollectionModItems.RABBIT_BOOTS_BOOTS.get()) {
			if (!entity.isShiftKeyDown()) {
				entity.push(0, 0.2, 0);
				new RedwiresTimedLoop(12, 5, _timedLoop -> {
					entity.fallDistance = 1;
					return true;
				}).run();
			}
		}
	}

	private static class RedwiresTimedLoop {
		private int iterator = 0;
		private int ticks = 0;
		private final int total;
		private final Function<RedwiresTimedLoop, Boolean> forEach;

		private RedwiresTimedLoop(int total, int ticks, Function<RedwiresTimedLoop, Boolean> forEach) {
			this.total = total;
			this.ticks = ticks;
			this.forEach = forEach;
		}

		private void run() {
			if (forEach.apply(this))
				CommunityCollectionMod.queueServerWork(ticks, this::next);
		}

		private void setTicks(int ticks) {
			this.ticks = ticks;
		}

		private int getIterator() {
			return iterator;
		}

		private void next() {
			if (total > ++iterator)
				run();
		}
	}
}