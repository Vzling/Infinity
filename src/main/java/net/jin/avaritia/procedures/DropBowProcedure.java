package net.jin.avaritia.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import net.jin.avaritia.AvaritiaMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class DropBowProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		for (int index0 = 0; index0 < 9; index0++) {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
						AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
						entityToSpawn.setOwner(shooter);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setCritArrow(true);
						entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, entity, (float) Double.POSITIVE_INFINITY, 1);
				_entityToSpawn.setPos(((x + Mth.nextDouble(RandomSource.create(), 0.15, 4.5)) - 1.5), (y + 20), ((z + Mth.nextDouble(RandomSource.create(), 0.15, 4.5)) - 1.5));
				_entityToSpawn.shoot(0, (-1), 0, 3, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
		AvaritiaMod.queueServerWork(5, () -> {
			for (int index1 = 0; index1 < 9; index1++) {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setCritArrow(true);
							entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, (float) Double.POSITIVE_INFINITY, 1);
					_entityToSpawn.setPos(((x + Mth.nextDouble(RandomSource.create(), 0.15, 4.5)) - 1.5), (y + 20), ((z + Mth.nextDouble(RandomSource.create(), 0.15, 4.5)) - 1.5));
					_entityToSpawn.shoot(0, (-1), 0, 3, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		});
		AvaritiaMod.queueServerWork(10, () -> {
			for (int index2 = 0; index2 < 9; index2++) {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setCritArrow(true);
							entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, (float) Double.POSITIVE_INFINITY, 1);
					_entityToSpawn.setPos(((x + Mth.nextDouble(RandomSource.create(), 0.15, 4.5)) - 1.5), (y + 20), ((z + Mth.nextDouble(RandomSource.create(), 0.15, 4.5)) - 1.5));
					_entityToSpawn.shoot(0, (-1), 0, 3, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		});
		AvaritiaMod.queueServerWork(15, () -> {
			for (int index3 = 0; index3 < 9; index3++) {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new Arrow(EntityType.ARROW, level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setCritArrow(true);
							entityToSpawn.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, (float) Double.POSITIVE_INFINITY, 1);
					_entityToSpawn.setPos(((x + Mth.nextDouble(RandomSource.create(), 0.15, 4.5)) - 1.5), (y + 20), ((z + Mth.nextDouble(RandomSource.create(), 0.15, 4.5)) - 1.5));
					_entityToSpawn.shoot(0, (-1), 0, 3, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		});
		AvaritiaMod.queueServerWork(50, () -> {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Arrow) {
						if (!entityiterator.level.isClientSide())
							entityiterator.discard();
					}
				}
			}
		});
	}
}
