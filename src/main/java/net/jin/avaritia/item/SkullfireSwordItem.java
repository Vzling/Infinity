package net.jin.avaritia.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Rarity;

import net.jin.avaritia.init.AvaritiaModTabs;

import java.util.List;

public class SkullfireSwordItem extends SwordItem {
	public SkullfireSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1561;
			}

			public float getSpeed() {
				return 13f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 23;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.DIAMOND));
			}
		}, 3, -2.4f, new Item.Properties().tab(AvaritiaModTabs.TAB_AVARITIAT).rarity(Rarity.EPIC));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.translatable("tooltip.7"));
	}
}
