package net.mcreator.communitycollection.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.communitycollection.init.CommunityCollectionModBlocks;

public class CoconutBlockNeighbourBlockChangesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CommunityCollectionModBlocks.PALM_LOG.get()
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CommunityCollectionModBlocks.PALM_LEAVES.get())) {
			world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(CommunityCollectionModBlocks.COCONUT_BLOCK.get().defaultBlockState()));
			{
				BlockPos _pos = BlockPos.containing(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
	}
}