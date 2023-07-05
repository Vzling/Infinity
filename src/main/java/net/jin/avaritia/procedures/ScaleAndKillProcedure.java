package net.jin.avaritia.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import net.jin.avaritia.AvaritiaMod;

public class ScaleAndKillProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		AvaritiaMod.queueServerWork(222, () -> {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 10, Level.ExplosionInteraction.BLOCK);
			if (!entity.level.isClientSide())
				entity.discard();
		});
	}
}
