/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.communitycollection.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.communitycollection.client.gui.*;

@EventBusSubscriber(Dist.CLIENT)
public class CommunityCollectionModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(CommunityCollectionModMenus.LEATHER_BACKPACK_GUI.get(), LeatherBackpackGUIScreen::new);
		event.register(CommunityCollectionModMenus.COPPER_BACKPACK_GUI.get(), CopperBackpackGUIScreen::new);
		event.register(CommunityCollectionModMenus.IRON_BACKPACK_GUI.get(), IronBackpackGUIScreen::new);
		event.register(CommunityCollectionModMenus.GOLD_BACKPACK_GUI.get(), GoldBackpackGUIScreen::new);
		event.register(CommunityCollectionModMenus.DIAMOND_BACKPACK_GUI.get(), DiamondBackpackGUIScreen::new);
		event.register(CommunityCollectionModMenus.NETHERITE_BACKPACK_GUI.get(), NetheriteBackpackGUIScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}