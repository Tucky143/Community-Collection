/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.communitycollection.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.communitycollection.block.*;
import net.mcreator.communitycollection.CommunityCollectionMod;

import java.util.function.Function;

public class CommunityCollectionModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(CommunityCollectionMod.MODID);
	public static final DeferredBlock<Block> OAK_APPLE_LEAVES;
	public static final DeferredBlock<Block> APPLE_TREE_SAPLING;
	public static final DeferredBlock<Block> BLUEBERRY_BUSH;
	public static final DeferredBlock<Block> GROWN_BLUEBERRY_BUSH;
	public static final DeferredBlock<Block> PALM_LOG;
	public static final DeferredBlock<Block> PALM_WOOD;
	public static final DeferredBlock<Block> STRIPPED_PALM_LOG;
	public static final DeferredBlock<Block> STRIPPED_PALM_WOOD;
	public static final DeferredBlock<Block> PALM_PLANKS;
	public static final DeferredBlock<Block> PALM_LEAVES;
	public static final DeferredBlock<Block> PALM_STAIRS;
	public static final DeferredBlock<Block> PALM_SLAB;
	public static final DeferredBlock<Block> PALM_FENCE;
	public static final DeferredBlock<Block> PALM_FENCE_GATE;
	public static final DeferredBlock<Block> PALM_DOOR;
	public static final DeferredBlock<Block> PALM_TRAPDOOR;
	public static final DeferredBlock<Block> PALM_PRESSURE_PLATE;
	public static final DeferredBlock<Block> PALM_BUTTON;
	public static final DeferredBlock<Block> PALM_TREE_SAPLING;
	public static final DeferredBlock<Block> COCONUT_BLOCK;
	public static final DeferredBlock<Block> ICICLE;
	public static final DeferredBlock<Block> PERMAFROST;
	public static final DeferredBlock<Block> WHITE_CONCRETE_STAIRS;
	public static final DeferredBlock<Block> WHITE_CONCRETE_SLAB;
	public static final DeferredBlock<Block> ORANGE_CONCRETE_STAIRS;
	public static final DeferredBlock<Block> ORANGE_CONCRETE_SLAB;
	public static final DeferredBlock<Block> MAGENTA_CONCRETE_STAIRS;
	public static final DeferredBlock<Block> MAGENTA_CONCRETE_SLAB;
	public static final DeferredBlock<Block> LIGHT_BLUE_CONCRETE_STAIRS;
	public static final DeferredBlock<Block> LIGHT_BLUE_CONCRETE_SLAB;
	public static final DeferredBlock<Block> YELLOW_CONCRETE_STAIRS;
	public static final DeferredBlock<Block> YELLOW_CONCRETE_SLAB;
	public static final DeferredBlock<Block> LIME_CONCRETE_STAIRS;
	public static final DeferredBlock<Block> LIME_CONCRETE_SLAB;
	public static final DeferredBlock<Block> PINK_CONCRETE_STAIRS;
	public static final DeferredBlock<Block> PINK_CONCRETE_SLAB;
	public static final DeferredBlock<Block> GRAY_CONCRETE_STAIRS;
	public static final DeferredBlock<Block> GRAY_CONCRETE_SLAB;
	public static final DeferredBlock<Block> LIGHT_GRAY_CONCRETE_STAIRS;
	public static final DeferredBlock<Block> LIGHT_GRAY_CONCRETE_SLAB;
	public static final DeferredBlock<Block> CYAN_CONCRETE_STAIRS;
	public static final DeferredBlock<Block> CYAN_CONCRETE_SLAB;
	public static final DeferredBlock<Block> PURPLE_CONCRETE_STAIRS;
	public static final DeferredBlock<Block> PURPLE_CONCRETE_SLAB;
	public static final DeferredBlock<Block> BLUE_CONCRETE_STAIRS;
	public static final DeferredBlock<Block> BLUE_CONCRETE_SLAB;
	public static final DeferredBlock<Block> BROWN_CONCRETE_STAIRS;
	public static final DeferredBlock<Block> BROWN_CONCRETE_SLAB;
	public static final DeferredBlock<Block> GREEN_CONCRETE_STAIRS;
	public static final DeferredBlock<Block> GREEN_CONCRETE_SLAB;
	public static final DeferredBlock<Block> RED_CONCRETE_STAIRS;
	public static final DeferredBlock<Block> RED_CONCRETE_SLAB;
	public static final DeferredBlock<Block> BLACK_CONCRETE_STAIRS;
	public static final DeferredBlock<Block> BLACK_CONCRETE_SLAB;
	public static final DeferredBlock<Block> RICE_PLANT;
	static {
		OAK_APPLE_LEAVES = register("oak_apple_leaves", OakAppleLeavesBlock::new);
		APPLE_TREE_SAPLING = register("apple_tree_sapling", AppleTreeSaplingBlock::new);
		BLUEBERRY_BUSH = register("blueberry_bush", BlueberryBushBlock::new);
		GROWN_BLUEBERRY_BUSH = register("grown_blueberry_bush", GrownBlueberryBushBlock::new);
		PALM_LOG = register("palm_log", PalmLogBlock::new);
		PALM_WOOD = register("palm_wood", PalmWoodBlock::new);
		STRIPPED_PALM_LOG = register("stripped_palm_log", StrippedPalmLogBlock::new);
		STRIPPED_PALM_WOOD = register("stripped_palm_wood", StrippedPalmWoodBlock::new);
		PALM_PLANKS = register("palm_planks", PalmPlanksBlock::new);
		PALM_LEAVES = register("palm_leaves", PalmLeavesBlock::new);
		PALM_STAIRS = register("palm_stairs", PalmStairsBlock::new);
		PALM_SLAB = register("palm_slab", PalmSlabBlock::new);
		PALM_FENCE = register("palm_fence", PalmFenceBlock::new);
		PALM_FENCE_GATE = register("palm_fence_gate", PalmFenceGateBlock::new);
		PALM_DOOR = register("palm_door", PalmDoorBlock::new);
		PALM_TRAPDOOR = register("palm_trapdoor", PalmTrapdoorBlock::new);
		PALM_PRESSURE_PLATE = register("palm_pressure_plate", PalmPressurePlateBlock::new);
		PALM_BUTTON = register("palm_button", PalmButtonBlock::new);
		PALM_TREE_SAPLING = register("palm_tree_sapling", PalmTreeSaplingBlock::new);
		COCONUT_BLOCK = register("coconut_block", CoconutBlockBlock::new);
		ICICLE = register("icicle", IcicleBlock::new);
		PERMAFROST = register("permafrost", PermafrostBlock::new);
		WHITE_CONCRETE_STAIRS = register("white_concrete_stairs", WhiteConcreteStairsBlock::new);
		WHITE_CONCRETE_SLAB = register("white_concrete_slab", WhiteConcreteSlabBlock::new);
		ORANGE_CONCRETE_STAIRS = register("orange_concrete_stairs", OrangeConcreteStairsBlock::new);
		ORANGE_CONCRETE_SLAB = register("orange_concrete_slab", OrangeConcreteSlabBlock::new);
		MAGENTA_CONCRETE_STAIRS = register("magenta_concrete_stairs", MagentaConcreteStairsBlock::new);
		MAGENTA_CONCRETE_SLAB = register("magenta_concrete_slab", MagentaConcreteSlabBlock::new);
		LIGHT_BLUE_CONCRETE_STAIRS = register("light_blue_concrete_stairs", LightBlueConcreteStairsBlock::new);
		LIGHT_BLUE_CONCRETE_SLAB = register("light_blue_concrete_slab", LightBlueConcreteSlabBlock::new);
		YELLOW_CONCRETE_STAIRS = register("yellow_concrete_stairs", YellowConcreteStairsBlock::new);
		YELLOW_CONCRETE_SLAB = register("yellow_concrete_slab", YellowConcreteSlabBlock::new);
		LIME_CONCRETE_STAIRS = register("lime_concrete_stairs", LimeConcreteStairsBlock::new);
		LIME_CONCRETE_SLAB = register("lime_concrete_slab", LimeConcreteSlabBlock::new);
		PINK_CONCRETE_STAIRS = register("pink_concrete_stairs", PinkConcreteStairsBlock::new);
		PINK_CONCRETE_SLAB = register("pink_concrete_slab", PinkConcreteSlabBlock::new);
		GRAY_CONCRETE_STAIRS = register("gray_concrete_stairs", GrayConcreteStairsBlock::new);
		GRAY_CONCRETE_SLAB = register("gray_concrete_slab", GrayConcreteSlabBlock::new);
		LIGHT_GRAY_CONCRETE_STAIRS = register("light_gray_concrete_stairs", LightGrayConcreteStairsBlock::new);
		LIGHT_GRAY_CONCRETE_SLAB = register("light_gray_concrete_slab", LightGrayConcreteSlabBlock::new);
		CYAN_CONCRETE_STAIRS = register("cyan_concrete_stairs", CyanConcreteStairsBlock::new);
		CYAN_CONCRETE_SLAB = register("cyan_concrete_slab", CyanConcreteSlabBlock::new);
		PURPLE_CONCRETE_STAIRS = register("purple_concrete_stairs", PurpleConcreteStairsBlock::new);
		PURPLE_CONCRETE_SLAB = register("purple_concrete_slab", PurpleConcreteSlabBlock::new);
		BLUE_CONCRETE_STAIRS = register("blue_concrete_stairs", BlueConcreteStairsBlock::new);
		BLUE_CONCRETE_SLAB = register("blue_concrete_slab", BlueConcreteSlabBlock::new);
		BROWN_CONCRETE_STAIRS = register("brown_concrete_stairs", BrownConcreteStairsBlock::new);
		BROWN_CONCRETE_SLAB = register("brown_concrete_slab", BrownConcreteSlabBlock::new);
		GREEN_CONCRETE_STAIRS = register("green_concrete_stairs", GreenConcreteStairsBlock::new);
		GREEN_CONCRETE_SLAB = register("green_concrete_slab", GreenConcreteSlabBlock::new);
		RED_CONCRETE_STAIRS = register("red_concrete_stairs", RedConcreteStairsBlock::new);
		RED_CONCRETE_SLAB = register("red_concrete_slab", RedConcreteSlabBlock::new);
		BLACK_CONCRETE_STAIRS = register("black_concrete_stairs", BlackConcreteStairsBlock::new);
		BLACK_CONCRETE_SLAB = register("black_concrete_slab", BlackConcreteSlabBlock::new);
		RICE_PLANT = register("rice_plant", RicePlantBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}

	@EventBusSubscriber(Dist.CLIENT)
	public static class BlocksClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			OakAppleLeavesBlock.blockColorLoad(event);
			BlueberryBushBlock.blockColorLoad(event);
			GrownBlueberryBushBlock.blockColorLoad(event);
			PalmLeavesBlock.blockColorLoad(event);
			RicePlantBlock.blockColorLoad(event);
		}
	}
}