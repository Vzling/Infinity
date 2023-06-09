
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.jin.avaritia.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AvaritiaModTabs {
	public static CreativeModeTab TAB_AVARITIAT;

	public static void load() {
		TAB_AVARITIAT = new CreativeModeTab("tabavaritiat") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AvaritiaModItems.INFINITY_CATALYST.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
