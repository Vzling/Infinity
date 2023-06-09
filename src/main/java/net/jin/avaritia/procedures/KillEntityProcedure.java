package net.jin.avaritia.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class KillEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.hurt(DamageSource.OUT_OF_WORLD, entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(0);
	}
}
