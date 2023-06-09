package net.jin.avaritia.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;
import net.minecraft.client.gui.screens.Screen;

public class Replace2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if (Screen.hasShiftDown()) {
			if (blockstate.getBlock() == Blocks.GRASS_BLOCK || blockstate.getBlock() == Blocks.DIRT) {
				world.setBlock(new BlockPos(x, y, z), Blocks.FARMLAND.defaultBlockState(), 3);
			}
		} else if (!Screen.hasShiftDown()) {
			{
				int _x = (int) ((x - 4));
				int _y = (int) ((y - 4));
				int _z = (int) ((z - 4));
				int _dx = 0;
				int _dy = 0;
				int _dz = 0;
				boolean _bdx = (Math.abs((int) (8)) == (int) (8));
				boolean _bdy = (Math.abs((int) (8)) == (int) (8));
				boolean _bdz = (Math.abs((int) (8)) == (int) (8));
				boolean _break = false;
				for (int _fx = 0; _fx <= (Math.abs((int) (8))); _fx++) {
					_dy = 0;
					int _bx = _x + _dx;
					for (int _fy = 0; _fy <= (Math.abs((int) (8))); _fy++) {
						_dz = 0;
						int _by = _y + _dy;
						for (int _fz = 0; _fz <= (Math.abs((int) (8))); _fz++) {
							int _bz = _z + _dz;
							BlockState _fbs = world.getBlockState(new BlockPos(_bx, _by, _bz));
							if (_fbs.getBlock() == Blocks.GRASS_BLOCK || _fbs.getBlock() == Blocks.DIRT) {
								world.setBlock(new BlockPos(_bx, _by, _bz), Blocks.FARMLAND.defaultBlockState(), 3);
							}
							_break = (false);
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
}
