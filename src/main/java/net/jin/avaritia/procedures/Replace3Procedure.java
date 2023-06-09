package net.jin.avaritia.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class Replace3Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if (blockstate.getBlock() == Blocks.GRASS_BLOCK || blockstate.getBlock() == Blocks.DIRT) {
			world.setBlock(new BlockPos(x, y, z), Blocks.DIRT_PATH.defaultBlockState(), 3);
		}
	}
}
