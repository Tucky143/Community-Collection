package net.mcreator.communitycollection.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SlabBlock;

public class WhiteConcreteSlabBlock extends SlabBlock {
	public WhiteConcreteSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1.8f, 10f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASS));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}
}