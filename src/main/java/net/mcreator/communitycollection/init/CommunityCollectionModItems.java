/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.communitycollection.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.communitycollection.item.inventory.*;
import net.mcreator.communitycollection.item.*;
import net.mcreator.communitycollection.CommunityCollectionMod;

import java.util.function.Function;

@EventBusSubscriber
public class CommunityCollectionModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CommunityCollectionMod.MODID);
	public static final DeferredItem<Item> OAK_APPLE_LEAVES;
	public static final DeferredItem<Item> APPLE_TREE_SAPLING;
	public static final DeferredItem<Item> BLUEBERRY;
	public static final DeferredItem<Item> LEATHER_BACKPACK;
	public static final DeferredItem<Item> COPPER_BACKPACK;
	public static final DeferredItem<Item> IRON_BACKPACK;
	public static final DeferredItem<Item> GOLD_BACKPACK;
	public static final DeferredItem<Item> DIAMOND_BACKPACK;
	public static final DeferredItem<Item> NETHERITE_BACKPACK;
	public static final DeferredItem<Item> PALM_LOG;
	public static final DeferredItem<Item> PALM_WOOD;
	public static final DeferredItem<Item> STRIPPED_PALM_LOG;
	public static final DeferredItem<Item> STRIPPED_PALM_WOOD;
	public static final DeferredItem<Item> PALM_PLANKS;
	public static final DeferredItem<Item> PALM_LEAVES;
	public static final DeferredItem<Item> PALM_STAIRS;
	public static final DeferredItem<Item> PALM_SLAB;
	public static final DeferredItem<Item> PALM_FENCE;
	public static final DeferredItem<Item> PALM_FENCE_GATE;
	public static final DeferredItem<Item> PALM_DOOR;
	public static final DeferredItem<Item> PALM_TRAPDOOR;
	public static final DeferredItem<Item> PALM_PRESSURE_PLATE;
	public static final DeferredItem<Item> PALM_BUTTON;
	public static final DeferredItem<Item> PALM_TREE_SAPLING;
	public static final DeferredItem<Item> COCONUT_ITEM;
	public static final DeferredItem<Item> COCONUT_PIECE;
	public static final DeferredItem<Item> COCONUT_MILK;
	public static final DeferredItem<Item> COCONUT_BLOCK;
	public static final DeferredItem<Item> ICICLE;
	public static final DeferredItem<Item> PERMAFROST;
	public static final DeferredItem<Item> RABBIT_BOOTS_BOOTS;
	public static final DeferredItem<Item> CAPYBARA_SPAWN_EGG;
	public static final DeferredItem<Item> WHITE_CONCRETE_STAIRS;
	public static final DeferredItem<Item> WHITE_CONCRETE_SLAB;
	public static final DeferredItem<Item> ORANGE_CONCRETE_STAIRS;
	public static final DeferredItem<Item> ORANGE_CONCRETE_SLAB;
	public static final DeferredItem<Item> MAGENTA_CONCRETE_STAIRS;
	public static final DeferredItem<Item> MAGENTA_CONCRETE_SLAB;
	public static final DeferredItem<Item> LIGHT_BLUE_CONCRETE_STAIRS;
	public static final DeferredItem<Item> LIGHT_BLUE_CONCRETE_SLAB;
	public static final DeferredItem<Item> YELLOW_CONCRETE_STAIRS;
	public static final DeferredItem<Item> YELLOW_CONCRETE_SLAB;
	public static final DeferredItem<Item> LIME_CONCRETE_STAIRS;
	public static final DeferredItem<Item> LIME_CONCRETE_SLAB;
	public static final DeferredItem<Item> PINK_CONCRETE_STAIRS;
	public static final DeferredItem<Item> PINK_CONCRETE_SLAB;
	public static final DeferredItem<Item> GRAY_CONCRETE_STAIRS;
	public static final DeferredItem<Item> GRAY_CONCRETE_SLAB;
	public static final DeferredItem<Item> LIGHT_GRAY_CONCRETE_STAIRS;
	public static final DeferredItem<Item> LIGHT_GRAY_CONCRETE_SLAB;
	public static final DeferredItem<Item> CYAN_CONCRETE_STAIRS;
	public static final DeferredItem<Item> CYAN_CONCRETE_SLAB;
	public static final DeferredItem<Item> PURPLE_CONCRETE_STAIRS;
	public static final DeferredItem<Item> PURPLE_CONCRETE_SLAB;
	public static final DeferredItem<Item> BLUE_CONCRETE_STAIRS;
	public static final DeferredItem<Item> BLUE_CONCRETE_SLAB;
	public static final DeferredItem<Item> BROWN_CONCRETE_STAIRS;
	public static final DeferredItem<Item> BROWN_CONCRETE_SLAB;
	public static final DeferredItem<Item> GREEN_CONCRETE_STAIRS;
	public static final DeferredItem<Item> GREEN_CONCRETE_SLAB;
	public static final DeferredItem<Item> RED_CONCRETE_STAIRS;
	public static final DeferredItem<Item> RED_CONCRETE_SLAB;
	public static final DeferredItem<Item> BLACK_CONCRETE_STAIRS;
	public static final DeferredItem<Item> BLACK_CONCRETE_SLAB;
	public static final DeferredItem<Item> JELLYFISH_SPAWN_EGG;
	static {
		OAK_APPLE_LEAVES = block(CommunityCollectionModBlocks.OAK_APPLE_LEAVES);
		APPLE_TREE_SAPLING = block(CommunityCollectionModBlocks.APPLE_TREE_SAPLING);
		BLUEBERRY = register("blueberry", BlueberryItem::new);
		LEATHER_BACKPACK = register("leather_backpack", LeatherBackpackItem::new);
		COPPER_BACKPACK = register("copper_backpack", CopperBackpackItem::new);
		IRON_BACKPACK = register("iron_backpack", IronBackpackItem::new);
		GOLD_BACKPACK = register("gold_backpack", GoldBackpackItem::new);
		DIAMOND_BACKPACK = register("diamond_backpack", DiamondBackpackItem::new);
		NETHERITE_BACKPACK = register("netherite_backpack", NetheriteBackpackItem::new);
		PALM_LOG = block(CommunityCollectionModBlocks.PALM_LOG);
		PALM_WOOD = block(CommunityCollectionModBlocks.PALM_WOOD);
		STRIPPED_PALM_LOG = block(CommunityCollectionModBlocks.STRIPPED_PALM_LOG);
		STRIPPED_PALM_WOOD = block(CommunityCollectionModBlocks.STRIPPED_PALM_WOOD);
		PALM_PLANKS = block(CommunityCollectionModBlocks.PALM_PLANKS);
		PALM_LEAVES = block(CommunityCollectionModBlocks.PALM_LEAVES);
		PALM_STAIRS = block(CommunityCollectionModBlocks.PALM_STAIRS);
		PALM_SLAB = block(CommunityCollectionModBlocks.PALM_SLAB);
		PALM_FENCE = block(CommunityCollectionModBlocks.PALM_FENCE);
		PALM_FENCE_GATE = block(CommunityCollectionModBlocks.PALM_FENCE_GATE);
		PALM_DOOR = doubleBlock(CommunityCollectionModBlocks.PALM_DOOR);
		PALM_TRAPDOOR = block(CommunityCollectionModBlocks.PALM_TRAPDOOR);
		PALM_PRESSURE_PLATE = block(CommunityCollectionModBlocks.PALM_PRESSURE_PLATE);
		PALM_BUTTON = block(CommunityCollectionModBlocks.PALM_BUTTON);
		PALM_TREE_SAPLING = block(CommunityCollectionModBlocks.PALM_TREE_SAPLING);
		COCONUT_ITEM = register("coconut_item", CoconutItemItem::new);
		COCONUT_PIECE = register("coconut_piece", CoconutPieceItem::new);
		COCONUT_MILK = register("coconut_milk", CoconutMilkItem::new);
		COCONUT_BLOCK = block(CommunityCollectionModBlocks.COCONUT_BLOCK);
		ICICLE = block(CommunityCollectionModBlocks.ICICLE);
		PERMAFROST = block(CommunityCollectionModBlocks.PERMAFROST);
		RABBIT_BOOTS_BOOTS = register("rabbit_boots_boots", RabbitBootsItem.Boots::new);
		CAPYBARA_SPAWN_EGG = register("capybara_spawn_egg", properties -> new SpawnEggItem(CommunityCollectionModEntities.CAPYBARA.get(), properties));
		WHITE_CONCRETE_STAIRS = block(CommunityCollectionModBlocks.WHITE_CONCRETE_STAIRS);
		WHITE_CONCRETE_SLAB = block(CommunityCollectionModBlocks.WHITE_CONCRETE_SLAB);
		ORANGE_CONCRETE_STAIRS = block(CommunityCollectionModBlocks.ORANGE_CONCRETE_STAIRS);
		ORANGE_CONCRETE_SLAB = block(CommunityCollectionModBlocks.ORANGE_CONCRETE_SLAB);
		MAGENTA_CONCRETE_STAIRS = block(CommunityCollectionModBlocks.MAGENTA_CONCRETE_STAIRS);
		MAGENTA_CONCRETE_SLAB = block(CommunityCollectionModBlocks.MAGENTA_CONCRETE_SLAB);
		LIGHT_BLUE_CONCRETE_STAIRS = block(CommunityCollectionModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
		LIGHT_BLUE_CONCRETE_SLAB = block(CommunityCollectionModBlocks.LIGHT_BLUE_CONCRETE_SLAB);
		YELLOW_CONCRETE_STAIRS = block(CommunityCollectionModBlocks.YELLOW_CONCRETE_STAIRS);
		YELLOW_CONCRETE_SLAB = block(CommunityCollectionModBlocks.YELLOW_CONCRETE_SLAB);
		LIME_CONCRETE_STAIRS = block(CommunityCollectionModBlocks.LIME_CONCRETE_STAIRS);
		LIME_CONCRETE_SLAB = block(CommunityCollectionModBlocks.LIME_CONCRETE_SLAB);
		PINK_CONCRETE_STAIRS = block(CommunityCollectionModBlocks.PINK_CONCRETE_STAIRS);
		PINK_CONCRETE_SLAB = block(CommunityCollectionModBlocks.PINK_CONCRETE_SLAB);
		GRAY_CONCRETE_STAIRS = block(CommunityCollectionModBlocks.GRAY_CONCRETE_STAIRS);
		GRAY_CONCRETE_SLAB = block(CommunityCollectionModBlocks.GRAY_CONCRETE_SLAB);
		LIGHT_GRAY_CONCRETE_STAIRS = block(CommunityCollectionModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
		LIGHT_GRAY_CONCRETE_SLAB = block(CommunityCollectionModBlocks.LIGHT_GRAY_CONCRETE_SLAB);
		CYAN_CONCRETE_STAIRS = block(CommunityCollectionModBlocks.CYAN_CONCRETE_STAIRS);
		CYAN_CONCRETE_SLAB = block(CommunityCollectionModBlocks.CYAN_CONCRETE_SLAB);
		PURPLE_CONCRETE_STAIRS = block(CommunityCollectionModBlocks.PURPLE_CONCRETE_STAIRS);
		PURPLE_CONCRETE_SLAB = block(CommunityCollectionModBlocks.PURPLE_CONCRETE_SLAB);
		BLUE_CONCRETE_STAIRS = block(CommunityCollectionModBlocks.BLUE_CONCRETE_STAIRS);
		BLUE_CONCRETE_SLAB = block(CommunityCollectionModBlocks.BLUE_CONCRETE_SLAB);
		BROWN_CONCRETE_STAIRS = block(CommunityCollectionModBlocks.BROWN_CONCRETE_STAIRS);
		BROWN_CONCRETE_SLAB = block(CommunityCollectionModBlocks.BROWN_CONCRETE_SLAB);
		GREEN_CONCRETE_STAIRS = block(CommunityCollectionModBlocks.GREEN_CONCRETE_STAIRS);
		GREEN_CONCRETE_SLAB = block(CommunityCollectionModBlocks.GREEN_CONCRETE_SLAB);
		RED_CONCRETE_STAIRS = block(CommunityCollectionModBlocks.RED_CONCRETE_STAIRS);
		RED_CONCRETE_SLAB = block(CommunityCollectionModBlocks.RED_CONCRETE_SLAB);
		BLACK_CONCRETE_STAIRS = block(CommunityCollectionModBlocks.BLACK_CONCRETE_STAIRS);
		BLACK_CONCRETE_SLAB = block(CommunityCollectionModBlocks.BLACK_CONCRETE_SLAB);
		JELLYFISH_SPAWN_EGG = register("jellyfish_spawn_egg", properties -> new SpawnEggItem(CommunityCollectionModEntities.JELLYFISH.get(), properties));
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return doubleBlock(block, new Item.Properties());
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new DoubleHighBlockItem(block.get(), prop), properties);
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(Capabilities.ItemHandler.ITEM, (stack, context) -> new LeatherBackpackInventoryCapability(stack), LEATHER_BACKPACK.get());
		event.registerItem(Capabilities.ItemHandler.ITEM, (stack, context) -> new CopperBackpackInventoryCapability(stack), COPPER_BACKPACK.get());
		event.registerItem(Capabilities.ItemHandler.ITEM, (stack, context) -> new IronBackpackInventoryCapability(stack), IRON_BACKPACK.get());
		event.registerItem(Capabilities.ItemHandler.ITEM, (stack, context) -> new GoldBackpackInventoryCapability(stack), GOLD_BACKPACK.get());
		event.registerItem(Capabilities.ItemHandler.ITEM, (stack, context) -> new DiamondBackpackInventoryCapability(stack), DIAMOND_BACKPACK.get());
		event.registerItem(Capabilities.ItemHandler.ITEM, (stack, context) -> new NetheriteBackpackInventoryCapability(stack), NETHERITE_BACKPACK.get());
	}
}