
package net.jin.avaritia.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.jin.avaritia.init.AvaritiaModTabs;

import java.util.List;

public class RecordFragmentItem extends Item {
	public RecordFragmentItem() {
		super(new Item.Properties().tab(AvaritiaModTabs.TAB_AVARITIAT).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.translatable("tooltip.6"));
	}
}
