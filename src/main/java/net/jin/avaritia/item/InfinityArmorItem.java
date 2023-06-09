
package net.jin.avaritia.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.jin.avaritia.procedures.Effect4Procedure;
import net.jin.avaritia.procedures.Effect3Procedure;
import net.jin.avaritia.procedures.Effect2Procedure;
import net.jin.avaritia.procedures.Effect1Procedure;
import net.jin.avaritia.init.AvaritiaModTabs;

public abstract class InfinityArmorItem extends ArmorItem {
	public InfinityArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 9999;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 12, 16, 6}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 100;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_iron"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}

			@Override
			public String getName() {
				return "infinity_armor";
			}

			@Override
			public float getToughness() {
				return 1000f;
			}

			@Override
			public float getKnockbackResistance() {
				return 1f;
			}
		}, slot, properties);
	}

	public static class Helmet extends InfinityArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(AvaritiaModTabs.TAB_AVARITIAT).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "avaritia:textures/models/armor/infinity__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			Effect1Procedure.execute(entity);
		}
	}

	public static class Chestplate extends InfinityArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(AvaritiaModTabs.TAB_AVARITIAT).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "avaritia:textures/models/armor/infinity__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			Effect2Procedure.execute(entity);
		}
	}

	public static class Leggings extends InfinityArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(AvaritiaModTabs.TAB_AVARITIAT).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "avaritia:textures/models/armor/infinity__layer_2.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			Effect3Procedure.execute(entity);
		}
	}

	public static class Boots extends InfinityArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(AvaritiaModTabs.TAB_AVARITIAT).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "avaritia:textures/models/armor/infinity__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			Effect4Procedure.execute(entity);
		}
	}
}
