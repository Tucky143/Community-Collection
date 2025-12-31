package net.mcreator.communitycollection.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.Blocks;

public class LightGrayConcreteStairsBlock extends StairBlock {
	public LightGrayConcreteStairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.strength(1.8f, 10f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASS));
	}

	@Override
	public float getExplosionResistance() {
		return 10f;
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}
}