package net.jin.avaritia.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class BreakBlock4Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			int _x = (int) ((x - 8));
			int _y = (int) ((y - 8));
			int _z = (int) ((z - 8));
			int _dx = 0;
			int _dy = 0;
			int _dz = 0;
			boolean _bdx = (Math.abs((int) (15)) == (int) (15));
			boolean _bdy = (Math.abs((int) (15)) == (int) (15));
			boolean _bdz = (Math.abs((int) (15)) == (int) (15));
			boolean _break = false;
			for (int _fx = 0; _fx <= (Math.abs((int) (15))); _fx++) {
				_dy = 0;
				int _bx = _x + _dx;
				for (int _fy = 0; _fy <= (Math.abs((int) (15))); _fy++) {
					_dz = 0;
					int _by = _y + _dy;
					for (int _fz = 0; _fz <= (Math.abs((int) (15))); _fz++) {
						int _bz = _z + _dz;
						BlockState _fbs = world.getBlockState(new BlockPos(_bx, _by, _bz));
						if ((world.getBlockState(new BlockPos(_bx, _by, _by))).getBlock() == Blocks.GRASS_BLOCK || (world.getBlockState(new BlockPos(_bx, _by, _by))).getBlock() == Blocks.DIRT) {
							world.setBlock(new BlockPos(_bx, _by, _bz), Blocks.AIR.defaultBlockState(), 3);
							if (world instanceof Level _level && !_level.isClientSide()) {
								ItemEntity entityToSpawn = new ItemEntity(_level, (entity.getX()), (entity.getY()), (entity.getZ()), (new ItemStack(_fbs.getBlock())));
								entityToSpawn.setPickUpDelay(1);
								_level.addFreshEntity(entityToSpawn);
							}
						}
						_break = false;
						if (_bdz) {
							_dz++;
						} else {
							_dz--;
						}
						if (_break)
							break;
					}
					if (_bdy) {
						_dy++;
					} else {
						_dy--;
					}
					if (_break)
						break;
				}
				if (_bdx) {
					_dx++;
				} else {
					_dx--;
				}
				if (_break)
					break;
			}
		}
	}
}
