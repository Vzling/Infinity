package net.jin.avaritia.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class FlyProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		entity.setDeltaMovement(new Vec3((Math.sin(sourceentity.getLookAngle().x) * 5.5), 2.6, (Math.sin(sourceentity.getLookAngle().z) * 5.5)));
	}
}
