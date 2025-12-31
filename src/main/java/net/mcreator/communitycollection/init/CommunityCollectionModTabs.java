/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.communitycollection.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.communitycollection.CommunityCollectionMod;

@EventBusSubscriber
public class CommunityCollectionModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CommunityCollectionMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(CommunityCollectionModItems.BLUEBERRY.get());
			tabData.accept(CommunityCollectionModItems.COCONUT_PIECE.get());
			tabData.accept(CommunityCollectionModItems.COCONUT_MILK.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(CommunityCollectionModItems.LEATHER_BACKPACK.get());
			tabData.accept(CommunityCollectionModItems.COPPER_BACKPACK.get());
			tabData.accept(CommunityCollectionModItems.IRON_BACKPACK.get());
			tabData.accept(CommunityCollectionModItems.GOLD_BACKPACK.get());
			tabData.accept(CommunityCollectionModItems.DIAMOND_BACKPACK.get());
			tabData.accept(CommunityCollectionModItems.NETHERITE_BACKPACK.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(CommunityCollectionModItems.COCONUT_ITEM.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(CommunityCollectionModItems.CAPYBARA_SPAWN_EGG.get());
			tabData.accept(CommunityCollectionModItems.JELLYFISH_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COLORED_BLOCKS) {
			tabData.accept(CommunityCollectionModBlocks.WHITE_CONCRETE_STAIRS.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.WHITE_CONCRETE_SLAB.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.ORANGE_CONCRETE_STAIRS.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.ORANGE_CONCRETE_SLAB.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.MAGENTA_CONCRETE_STAIRS.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.MAGENTA_CONCRETE_SLAB.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.YELLOW_CONCRETE_STAIRS.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.YELLOW_CONCRETE_SLAB.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.LIME_CONCRETE_STAIRS.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.LIME_CONCRETE_SLAB.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.PINK_CONCRETE_STAIRS.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.PINK_CONCRETE_SLAB.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.GRAY_CONCRETE_STAIRS.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.GRAY_CONCRETE_SLAB.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.CYAN_CONCRETE_STAIRS.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.CYAN_CONCRETE_SLAB.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.PURPLE_CONCRETE_STAIRS.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.PURPLE_CONCRETE_SLAB.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.BLUE_CONCRETE_STAIRS.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.BLUE_CONCRETE_SLAB.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.BROWN_CONCRETE_STAIRS.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.BROWN_CONCRETE_SLAB.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.GREEN_CONCRETE_STAIRS.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.GREEN_CONCRETE_SLAB.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.RED_CONCRETE_STAIRS.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.RED_CONCRETE_SLAB.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.BLACK_CONCRETE_STAIRS.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.BLACK_CONCRETE_SLAB.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(CommunityCollectionModBlocks.APPLE_TREE_SAPLING.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.PALM_TREE_SAPLING.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.COCONUT_BLOCK.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.OAK_APPLE_LEAVES.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.PALM_LEAVES.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.ICICLE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(CommunityCollectionModBlocks.PERMAFROST.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.PALM_LOG.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.PALM_WOOD.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.STRIPPED_PALM_LOG.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.STRIPPED_PALM_WOOD.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.PALM_PLANKS.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.PALM_STAIRS.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.PALM_SLAB.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.PALM_FENCE.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.PALM_FENCE_GATE.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.PALM_DOOR.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.PALM_TRAPDOOR.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.PALM_PRESSURE_PLATE.get().asItem());
			tabData.accept(CommunityCollectionModBlocks.PALM_BUTTON.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(CommunityCollectionModItems.RABBIT_BOOTS_BOOTS.get());
			tabData.accept(CommunityCollectionModItems.COCONUT_ITEM.get());
		}
	}
}