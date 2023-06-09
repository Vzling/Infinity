package net.jin.avaritia.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.client.gui.screens.Screen;

import net.jin.avaritia.init.AvaritiaModItems;

public class Replace1Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Screen.hasShiftDown()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.NATURES_RUIN.get()) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(AvaritiaModItems.NATURES_RUIN_RESET.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.NATURES_RUIN_RESET.get()) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(AvaritiaModItems.NATURES_RUIN.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.NATURES_RUIN.get()) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(AvaritiaModItems.NATURES_RUIN_RESET.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.NATURES_RUIN_RESET.get()) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(AvaritiaModItems.NATURES_RUIN.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
		}
		if (Screen.hasShiftDown()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_PICKAXE.get()) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(AvaritiaModItems.INFINITY_SWORD_HAMMER.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_SWORD_HAMMER.get()) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(AvaritiaModItems.INFINITY_PICKAXE.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_PICKAXE.get()) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(AvaritiaModItems.INFINITY_SWORD_HAMMER.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_SWORD_HAMMER.get()) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(AvaritiaModItems.INFINITY_PICKAXE.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
		}
		if (Screen.hasShiftDown()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_SHOVEL.get()) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(AvaritiaModItems.INFINITY_SHOVEL_DESTROYER.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_SHOVEL_DESTROYER.get()) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(AvaritiaModItems.INFINITY_SHOVEL.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_SHOVEL.get()) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(AvaritiaModItems.INFINITY_SHOVEL_DESTROYER.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == AvaritiaModItems.INFINITY_SHOVEL_DESTROYER.get()) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = new ItemStack(AvaritiaModItems.INFINITY_SHOVEL.get());
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
		}
	}
}
