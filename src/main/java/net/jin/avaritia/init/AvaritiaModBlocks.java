
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.jin.avaritia.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.jin.avaritia.block.NeutroniumCompressorBlock;
import net.jin.avaritia.block.NeutroniumBlockBlock;
import net.jin.avaritia.block.NeutronCollectorBlock;
import net.jin.avaritia.block.InfinityBlockBlock;
import net.jin.avaritia.block.ExtremeCraftingTableBlock;
import net.jin.avaritia.block.DoubleCompressedCraftingTableBlock;
import net.jin.avaritia.block.CrystalMatrixBlockBlock;
import net.jin.avaritia.block.CompressedCraftingTableBlock;
import net.jin.avaritia.AvaritiaMod;

public class AvaritiaModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AvaritiaMod.MODID);
	public static final RegistryObject<Block> NEUTRONIUM_BLOCK = REGISTRY.register("neutronium_block", () -> new NeutroniumBlockBlock());
	public static final RegistryObject<Block> INFINITY_BLOCK = REGISTRY.register("infinity_block", () -> new InfinityBlockBlock());
	public static final RegistryObject<Block> CRYSTAL_MATRIX_BLOCK = REGISTRY.register("crystal_matrix_block", () -> new CrystalMatrixBlockBlock());
	public static final RegistryObject<Block> COMPRESSED_CRAFTING_TABLE = REGISTRY.register("compressed_crafting_table", () -> new CompressedCraftingTableBlock());
	public static final RegistryObject<Block> DOUBLE_COMPRESSED_CRAFTING_TABLE = REGISTRY.register("double_compressed_crafting_table", () -> new DoubleCompressedCraftingTableBlock());
	public static final RegistryObject<Block> EXTREME_CRAFTING_TABLE = REGISTRY.register("extreme_crafting_table", () -> new ExtremeCraftingTableBlock());
	public static final RegistryObject<Block> NEUTRONIUM_COMPRESSOR = REGISTRY.register("neutronium_compressor", () -> new NeutroniumCompressorBlock());
	public static final RegistryObject<Block> NEUTRON_COLLECTOR = REGISTRY.register("neutron_collector", () -> new NeutronCollectorBlock());
}
