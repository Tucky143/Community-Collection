package net.mcreator.communitycollection.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.Entity;

public class CapybaraOutsideWaterProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean returnValue = false;
		if (isInWaterOrBubble(entity)) {
			returnValue = false;
		} else {
			returnValue = true;
		}
		return returnValue;
	}

	private static boolean isInWaterOrBubble(Entity entity) {
		return entity.isInWater() || entity.getInBlockState().is(Blocks.BUBBLE_COLUMN);
	}
}