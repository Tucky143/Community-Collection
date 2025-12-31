package net.mcreator.communitycollection.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.communitycollection.init.CommunityCollectionModBlocks;

public class BlueberryRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (CommunityCollectionModBlocks.BLUEBERRY_BUSH.get().defaultBlockState().canSurvive(world, BlockPos.containing(x, y + 1, z))) {
			world.setBlock(BlockPos.containing(x, y + 1, z), CommunityCollectionModBlocks.BLUEBERRY_BUSH.get().defaultBlockState(), 3);
		}
	}
}