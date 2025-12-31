package net.mcreator.communitycollection.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CoconutPieceItem extends Item {
	public CoconutPieceItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(3).saturationModifier(0.5f).build(), Consumables.defaultFood().consumeSeconds(2F).build()));
	}
}