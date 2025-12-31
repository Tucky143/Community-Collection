package net.mcreator.communitycollection.procedures;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.Container;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.component.DataComponents;

@EventBusSubscriber
public class TransferInventoryOnUpgradeProcedure {

    @SubscribeEvent
    public static void onItemCrafted(PlayerEvent.ItemCraftedEvent event) {

        Container inv = event.getInventory();
        if (!(inv instanceof CraftingContainer crafting))
            return;

        ItemStack crafted = event.getCrafting();
        if (crafted.isEmpty())
            return;

        for (int slot = 0; slot < crafting.getContainerSize(); slot++) {
            ItemStack input = crafting.getItem(slot);
            if (input.isEmpty())
                continue;

            if (!input.is(ItemTags.create(
                    ResourceLocation.fromNamespaceAndPath("community_collection", "backpack"))))
                continue;

            // Copy inventory
            if (input.has(DataComponents.CONTAINER)) {
                crafted.set(DataComponents.CONTAINER,
                        input.get(DataComponents.CONTAINER));
            }

            // Copy enchantments
            if (input.has(DataComponents.ENCHANTMENTS)) {
                crafted.set(DataComponents.ENCHANTMENTS,
                        input.get(DataComponents.ENCHANTMENTS));
            }

            // Copy ONLY anvil name (not default name)
            if (input.has(DataComponents.CUSTOM_NAME)) {
                crafted.set(DataComponents.CUSTOM_NAME,
                        input.get(DataComponents.CUSTOM_NAME));
            }

            break;
        }
    }
}
