package net.jin.avaritia.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

public class KillEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _entToDamage = entity;
			_entToDamage.hurt(new DamageSource(_entToDamage.level.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.OUT_OF_WORLD)), entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
		}
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(0);
	}
}
