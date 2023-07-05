
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.jin.avaritia.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.jin.avaritia.world.inventory.CraftingGuiMenu;
import net.jin.avaritia.world.inventory.CompressorMenu;
import net.jin.avaritia.world.inventory.CollectorMenu;
import net.jin.avaritia.AvaritiaMod;

public class AvaritiaModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, AvaritiaMod.MODID);
	public static final RegistryObject<MenuType<CompressorMenu>> COMPRESSOR = REGISTRY.register("compressor", () -> IForgeMenuType.create(CompressorMenu::new));
	public static final RegistryObject<MenuType<CraftingGuiMenu>> CRAFTING_GUI = REGISTRY.register("crafting_gui", () -> IForgeMenuType.create(CraftingGuiMenu::new));
	public static final RegistryObject<MenuType<CollectorMenu>> COLLECTOR = REGISTRY.register("collector", () -> IForgeMenuType.create(CollectorMenu::new));
}
