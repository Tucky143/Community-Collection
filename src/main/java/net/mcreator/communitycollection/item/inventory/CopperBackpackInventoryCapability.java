package net.mcreator.communitycollection.item.inventory;

import net.neoforged.neoforge.items.ComponentItemHandler;
import net.neoforged.neoforge.event.entity.item.ItemTossEvent;
import net.neoforged.neoforge.common.MutableDataComponentHolder;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.component.DataComponents;

import net.mcreator.communitycollection.world.inventory.CopperBackpackGUIMenu;
import net.mcreator.communitycollection.init.CommunityCollectionModItems;

import javax.annotation.Nonnull;

@EventBusSubscriber
public class CopperBackpackInventoryCapability extends ComponentItemHandler {
	@SubscribeEvent
	public static void onItemDropped(ItemTossEvent event) {
		if (event.getEntity().getItem().getItem() == CommunityCollectionModItems.COPPER_BACKPACK.get()) {
			Player player = event.getPlayer();
			if (player.containerMenu instanceof CopperBackpackGUIMenu)
				player.closeContainer();
		}
	}

	public CopperBackpackInventoryCapability(MutableDataComponentHolder parent) {
		super(parent, DataComponents.CONTAINER, 13);
	}

	@Override
	public int getSlotLimit(int slot) {
		return 64;
	}

	@Override
	public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
		return stack.getItem() != CommunityCollectionModItems.COPPER_BACKPACK.get();
	}

	@Override
	public ItemStack getStackInSlot(int slot) {
		return super.getStackInSlot(slot).copy();
	}
}