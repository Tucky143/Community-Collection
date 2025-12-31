package net.mcreator.communitycollection.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SlabBlock;

public class BlueConcreteSlabBlock extends SlabBlock {
	public BlueConcreteSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1.8f, 10f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASS));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}
}