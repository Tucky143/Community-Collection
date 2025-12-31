package net.mcreator.communitycollection.block;

import net.neoforged.neoforge.common.ItemAbility;
import net.neoforged.neoforge.common.ItemAbilities;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.util.TriState;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class PermafrostBlock extends Block {
	public PermafrostBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.SOUL_SOIL).strength(1f).friction(0.8f).speedFactor(1.1f).instrument(NoteBlockInstrument.CHIME));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}

	@Override
	public BlockState getToolModifiedState(BlockState blockstate, UseOnContext context, ItemAbility itemAbility, boolean simulate) {
		if (ItemAbilities.AXE_STRIP == itemAbility && context.getItemInHand().canPerformAction(itemAbility)) {
			return Blocks.COARSE_DIRT.withPropertiesOf(blockstate);
		}
		return super.getToolModifiedState(blockstate, context, itemAbility, simulate);
	}

	@Override
	public TriState canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction direction, BlockState plant) {
		return TriState.TRUE;
	}
}