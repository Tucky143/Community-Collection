package net.mcreator.communitycollection.procedures;

import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class BlueberryBushBoneMealSuccessConditionProcedure {
	public static boolean execute() {
		boolean grow = false;
		if (Mth.nextInt(RandomSource.create(), 0, 3) == 1) {
			grow = true;
		} else {
			grow = false;
		}
		return grow;
	}
}