
package net.jin.avaritia.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.BlockPos;

import net.jin.avaritia.procedures.Replace1Procedure;
import net.jin.avaritia.procedures.FortuneEnchantmentProcedure;
import net.jin.avaritia.procedures.FlyProcedure;
import net.jin.avaritia.procedures.BreakBlock3Procedure;

public class InfinitySwordHammerItem extends PickaxeItem {
	public InfinitySwordHammerItem() {
		super(new Tier() {
			public int getUses() {
				return 9999;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 13f;
			}

			public int getLevel() {
				return 32;
			}

			public int getEnchantmentValue() {
				return 100;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -2.8f, new Item.Properties().tab(null).fireResistant());
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		BreakBlock3Procedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
		return retval;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		FlyProcedure.execute(entity, sourceentity);
		return retval;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		Replace1Procedure.execute(entity);
		return ar;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		FortuneEnchantmentProcedure.execute(entity, itemstack);
	}
}
