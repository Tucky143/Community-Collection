package net.mcreator.communitycollection.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

public class IcicleEntityFallsOnTheBlockProcedure {
	public static void execute(LevelAccessor world, Entity entity, double distance) {
		if (entity == null)
			return;
		entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.STALAGMITE)), (float) (0.5 * distance));
	}
}