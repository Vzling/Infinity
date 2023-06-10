package net.jin.avaritia.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;
import net.minecraft.client.gui.screens.Screen;

public class BreakBlock2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Screen.hasShiftDown()) {
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
							if (_fbs.getBlock() == Blocks.GRASS_BLOCK) {
								world.setBlock(new BlockPos(_bx, _by, _bz), Blocks.DIRT.defaultBlockState(), 3);
							}
							if (_fbs.getBlock() == Blocks.OAK_LOG || _fbs.getBlock() == Blocks.SPRUCE_LOG || _fbs.getBlock() == Blocks.BIRCH_LOG || _fbs.getBlock() == Blocks.JUNGLE_LOG || _fbs.getBlock() == Blocks.ACACIA_LOG
									|| _fbs.getBlock() == Blocks.DARK_OAK_LOG) {
								world.setBlock(new BlockPos(_bx, _by, _bz), Blocks.AIR.defaultBlockState(), 3);
								if (entity instanceof Player _player) {
									ItemStack _setstack = (new ItemStack(_fbs.getBlock()));
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
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
}
