package net.jin.avaritia.procedures;

import net.minecraft.world.entity.Entity;

public class Effect3Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isOnFire()) {
			entity.clearFire();
		}
	}
}
