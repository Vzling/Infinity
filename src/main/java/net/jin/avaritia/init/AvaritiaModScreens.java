
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.jin.avaritia.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.jin.avaritia.client.gui.CraftingGuiScreen;
import net.jin.avaritia.client.gui.CompressorScreen;
import net.jin.avaritia.client.gui.CollectorScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AvaritiaModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(AvaritiaModMenus.COMPRESSOR.get(), CompressorScreen::new);
			MenuScreens.register(AvaritiaModMenus.CRAFTING_GUI.get(), CraftingGuiScreen::new);
			MenuScreens.register(AvaritiaModMenus.COLLECTOR.get(), CollectorScreen::new);
		});
	}
}
