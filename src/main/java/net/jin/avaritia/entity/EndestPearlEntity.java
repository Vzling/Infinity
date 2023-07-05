
package net.jin.avaritia.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

import net.jin.avaritia.procedures.SpawnHoleProcedure;
import net.jin.avaritia.init.AvaritiaModItems;
import net.jin.avaritia.init.AvaritiaModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class EndestPearlEntity extends AbstractArrow implements ItemSupplier {
	public EndestPearlEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(AvaritiaModEntities.ENDEST_PEARL.get(), world);
	}

	public EndestPearlEntity(EntityType<? extends EndestPearlEntity> type, Level world) {
		super(type, world);
	}

	public EndestPearlEntity(EntityType<? extends EndestPearlEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public EndestPearlEntity(EntityType<? extends EndestPearlEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(AvaritiaModItems.ENDEST_PEARL.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return ItemStack.EMPTY;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		SpawnHoleProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		SpawnHoleProcedure.execute(this.level, blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult.getBlockPos().getZ());
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static EndestPearlEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		EndestPearlEntity entityarrow = new EndestPearlEntity(AvaritiaModEntities.ENDEST_PEARL.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		return entityarrow;
	}

	public static EndestPearlEntity shoot(LivingEntity entity, LivingEntity target) {
		EndestPearlEntity entityarrow = new EndestPearlEntity(AvaritiaModEntities.ENDEST_PEARL.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1.5f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(0);
		entityarrow.setKnockback(0);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);
		return entityarrow;
	}
}
