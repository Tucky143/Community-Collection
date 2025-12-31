/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.communitycollection.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.client.network.ClientPacketDistributor;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.Minecraft;

import net.mcreator.communitycollection.world.inventory.*;
import net.mcreator.communitycollection.network.MenuStateUpdateMessage;
import net.mcreator.communitycollection.CommunityCollectionMod;

import java.util.Map;

public class CommunityCollectionModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, CommunityCollectionMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<LeatherBackpackGUIMenu>> LEATHER_BACKPACK_GUI = REGISTRY.register("leather_backpack_gui", () -> IMenuTypeExtension.create(LeatherBackpackGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<CopperBackpackGUIMenu>> COPPER_BACKPACK_GUI = REGISTRY.register("copper_backpack_gui", () -> IMenuTypeExtension.create(CopperBackpackGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<IronBackpackGUIMenu>> IRON_BACKPACK_GUI = REGISTRY.register("iron_backpack_gui", () -> IMenuTypeExtension.create(IronBackpackGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<GoldBackpackGUIMenu>> GOLD_BACKPACK_GUI = REGISTRY.register("gold_backpack_gui", () -> IMenuTypeExtension.create(GoldBackpackGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<DiamondBackpackGUIMenu>> DIAMOND_BACKPACK_GUI = REGISTRY.register("diamond_backpack_gui", () -> IMenuTypeExtension.create(DiamondBackpackGUIMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<NetheriteBackpackGUIMenu>> NETHERITE_BACKPACK_GUI = REGISTRY.register("netherite_backpack_gui", () -> IMenuTypeExtension.create(NetheriteBackpackGUIMenu::new));

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				PacketDistributor.sendToPlayer(serverPlayer, new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level().isClientSide) {
				if (Minecraft.getInstance().screen instanceof CommunityCollectionModScreens.ScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				ClientPacketDistributor.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
			}
		}

		default <T> T getMenuState(int elementType, String name, T defaultValue) {
			try {
				return (T) getMenuState().getOrDefault(elementType + ":" + name, defaultValue);
			} catch (ClassCastException e) {
				return defaultValue;
			}
		}
	}
}