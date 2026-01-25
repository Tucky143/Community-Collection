package net.mcreator.communitycollection.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.InteractionResult;

import net.mcreator.communitycollection.procedures.RiceRightclickedOnBlockProcedure;

public class BowlOfRiceItem extends Item {
	public BowlOfRiceItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(7).saturationModifier(4f).alwaysEdible().build(), Consumables.defaultFood().consumeSeconds(0.8F).build()).usingConvertsTo(Items.BOWL));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		RiceRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ());
		return InteractionResult.SUCCESS;
	}
}