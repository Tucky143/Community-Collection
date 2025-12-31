package net.mcreator.communitycollection.block;

import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.InteractionResult;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.BiomeColors;

import net.mcreator.communitycollection.procedures.GrownBlueberryBushPlantRightclickedProcedure;
import net.mcreator.communitycollection.init.CommunityCollectionModItems;
import net.mcreator.communitycollection.init.CommunityCollectionModBlocks;

public class GrownBlueberryBushBlock extends FlowerBlock {
	public GrownBlueberryBushBlock(BlockBehaviour.Properties properties) {
		super(MobEffects.NIGHT_VISION, 100, properties.mapColor(MapColor.PLANT).sound(SoundType.GRASS).instabreak().noCollission().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY));
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public ItemStack getCloneItemStack(LevelReader world, BlockPos pos, BlockState state, boolean includeData, Player entity) {
		return new ItemStack(CommunityCollectionModItems.BLUEBERRY.get());
	}

	@Override
	public InteractionResult useWithoutItem(BlockState blockstate, Level world, BlockPos pos, Player entity, BlockHitResult hit) {
		super.useWithoutItem(blockstate, world, pos, entity, hit);
		GrownBlueberryBushPlantRightclickedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		return InteractionResult.SUCCESS;
	}

	public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
		event.getBlockColors().register((bs, world, pos, index) -> {
			return world != null && pos != null ? BiomeColors.getAverageGrassColor(world, pos) : GrassColor.get(0.5D, 1.0D);
		}, CommunityCollectionModBlocks.GROWN_BLUEBERRY_BUSH.get());
	}
}