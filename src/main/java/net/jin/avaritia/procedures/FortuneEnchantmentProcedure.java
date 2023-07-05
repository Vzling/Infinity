package net.jin.avaritia.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.jin.avaritia.init.AvaritiaModItems;

public class FortuneEnchantmentProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AvaritiaModItems.INFINITY_PICKAXE.get())) : false) {
			if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, itemstack) != 0)) {
				itemstack.enchant(Enchantments.BLOCK_FORTUNE, 10);
			}
		} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(AvaritiaModItems.INFINITY_SWORD_HAMMER.get())) : false) {
			if (!(EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, itemstack) != 0)) {
				itemstack.enchant(Enchantments.BLOCK_FORTUNE, 10);
			}
		}
	}
}
