package net.mcreator.communitycollection.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CapybaraHideItem extends Item {
	public CapybaraHideItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}
}