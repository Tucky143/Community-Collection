package net.mcreator.communitycollection.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.communitycollection.procedures.CoconutMilkPlayerFinishesUsingItemProcedure;

public class CoconutMilkItem extends Item {
	public CoconutMilkItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(8).saturationModifier(4f).build(), Consumables.defaultDrink().consumeSeconds(1.5F).build()).usingConvertsTo(Items.BOWL));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		CoconutMilkPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}