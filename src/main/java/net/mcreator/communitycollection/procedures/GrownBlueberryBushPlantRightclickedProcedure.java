package net.mcreator.communitycollection.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.communitycollection.init.CommunityCollectionModBlocks;

public class GrownBlueberryBushPlantRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			BlockPos _pos = BlockPos.containing(x, y, z);
			Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
			world.destroyBlock(_pos, false);
		}
		world.setBlock(BlockPos.containing(x, y, z), CommunityCollectionModBlocks.BLUEBERRY_BUSH.get().defaultBlockState(), 3);
	}
}