package net.mcreator.communitycollection.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.InteractionResult;

import net.mcreator.communitycollection.procedures.BlueberryRightclickedOnBlockProcedure;

public class BlueberryItem extends Item {
	public BlueberryItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(2).saturationModifier(2f).alwaysEdible().build(), Consumables.defaultFood().consumeSeconds(0.5F).build()));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		BlueberryRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ());
		return InteractionResult.SUCCESS;
	}
}