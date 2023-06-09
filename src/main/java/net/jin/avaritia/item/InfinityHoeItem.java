
package net.jin.avaritia.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.InteractionResult;

import net.jin.avaritia.procedures.Replace2Procedure;
import net.jin.avaritia.init.AvaritiaModTabs;

public class InfinityHoeItem extends HoeItem {
	public InfinityHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 9999;
			}

			public float getSpeed() {
				return 100f;
			}

			public float getAttackDamageBonus() {
				return 27f;
			}

			public int getLevel() {
				return 100;
			}

			public int getEnchantmentValue() {
				return 100;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 0, 0f, new Item.Properties().tab(AvaritiaModTabs.TAB_AVARITIAT).fireResistant());
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		Replace2Procedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getLevel().getBlockState(context.getClickedPos()));
		return InteractionResult.SUCCESS;
	}
}
