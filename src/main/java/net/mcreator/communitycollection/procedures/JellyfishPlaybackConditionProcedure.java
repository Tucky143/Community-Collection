package net.mcreator.communitycollection.procedures;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

public class JellyfishPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean returnLogic = false;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) != null) {
			returnLogic = true;
		} else {
			returnLogic = false;
		}
		return returnLogic;
	}
}