package net.jin.avaritia.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class Effect1Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setAirSupply(300);
		if (entity instanceof Player _player)
			_player.getFoodData().setFoodLevel(20);
		if (entity instanceof Player _player)
			_player.getFoodData().setSaturation(20);
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 300, 100, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 300, 100, false, false));
	}
}
