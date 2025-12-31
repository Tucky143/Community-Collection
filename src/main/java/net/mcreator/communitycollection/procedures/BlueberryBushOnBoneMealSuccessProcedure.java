package net.mcreator.communitycollection.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.communitycollection.init.CommunityCollectionModBlocks;

public class BlueberryBushOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), CommunityCollectionModBlocks.GROWN_BLUEBERRY_BUSH.get().defaultBlockState(), 3);
	}
}