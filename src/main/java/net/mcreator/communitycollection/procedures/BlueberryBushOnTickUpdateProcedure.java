package net.mcreator.communitycollection.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.communitycollection.init.CommunityCollectionModBlocks;

public class BlueberryBushOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if (1 == Mth.nextDouble(RandomSource.create(), 0, 20)) {
			{
				int _value = (blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip2 ? blockstate.getValue(_getip2) : -1) + 1;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
		}
		if (480 <= (blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip5 ? blockstate.getValue(_getip5) : -1)) {
			world.setBlock(BlockPos.containing(x, y, z), CommunityCollectionModBlocks.GROWN_BLUEBERRY_BUSH.get().defaultBlockState(), 3);
		}
	}
}