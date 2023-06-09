
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.jin.avaritia.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.jin.avaritia.item.TinSingularityItem;
import net.jin.avaritia.item.SkullfireSwordItem;
import net.jin.avaritia.item.SilverSingularityItem;
import net.jin.avaritia.item.RedstoneSingularityItem;
import net.jin.avaritia.item.RecordFragmentItem;
import net.jin.avaritia.item.PlatinumSingularityItem;
import net.jin.avaritia.item.PileofNeutronsItem;
import net.jin.avaritia.item.NickelSingularityItem;
import net.jin.avaritia.item.NeutroniumNuggetItem;
import net.jin.avaritia.item.NeutroniumIngotItem;
import net.jin.avaritia.item.NetheriteSingularityItem;
import net.jin.avaritia.item.NetherQuartzSingularityItem;
import net.jin.avaritia.item.NaturesRuinResetItem;
import net.jin.avaritia.item.NaturesRuinItem;
import net.jin.avaritia.item.LeadSingularityItem;
import net.jin.avaritia.item.LapisSingularityItem;
import net.jin.avaritia.item.IronSingularityItem;
import net.jin.avaritia.item.IridiumSingularityItem;
import net.jin.avaritia.item.InfinitySwordItem;
import net.jin.avaritia.item.InfinitySwordHammerItem;
import net.jin.avaritia.item.InfinityShovelItem;
import net.jin.avaritia.item.InfinityShovelDestroyerItem;
import net.jin.avaritia.item.InfinityPickaxeItem;
import net.jin.avaritia.item.InfinityIngotItem;
import net.jin.avaritia.item.InfinityHoeItem;
import net.jin.avaritia.item.InfinityCatalystItem;
import net.jin.avaritia.item.InfinityBowItem;
import net.jin.avaritia.item.InfinityArmorItem;
import net.jin.avaritia.item.GoldenSingularityItem;
import net.jin.avaritia.item.FluxedSingularityItem;
import net.jin.avaritia.item.EmeraldSingularityItem;
import net.jin.avaritia.item.DiamondSingularityItem;
import net.jin.avaritia.item.DiamondLatticeItem;
import net.jin.avaritia.item.CrystalMatrixIngotItem;
import net.jin.avaritia.item.CopperSingularityItem;
import net.jin.avaritia.item.AmethystSingularityItem;
import net.jin.avaritia.AvaritiaMod;

public class AvaritiaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AvaritiaMod.MODID);
	public static final RegistryObject<Item> DIAMOND_LATTICE = REGISTRY.register("diamond_lattice", () -> new DiamondLatticeItem());
	public static final RegistryObject<Item> CRYSTAL_MATRIX_INGOT = REGISTRY.register("crystal_matrix_ingot", () -> new CrystalMatrixIngotItem());
	public static final RegistryObject<Item> NEUTRONS_PILE = REGISTRY.register("neutrons_pile", () -> new PileofNeutronsItem());
	public static final RegistryObject<Item> NEUTRONIUM_NUGGET = REGISTRY.register("neutronium_nugget", () -> new NeutroniumNuggetItem());
	public static final RegistryObject<Item> NEUTRONIUM_INGOT = REGISTRY.register("neutronium_ingot", () -> new NeutroniumIngotItem());
	public static final RegistryObject<Item> INFINITY_CATALYST = REGISTRY.register("infinity_catalyst", () -> new InfinityCatalystItem());
	public static final RegistryObject<Item> INFINITY_INGOT = REGISTRY.register("infinity_ingot", () -> new InfinityIngotItem());
	public static final RegistryObject<Item> RECORD_FRAGMENT = REGISTRY.register("record_fragment", () -> new RecordFragmentItem());
	public static final RegistryObject<Item> IRON_SINGULARITY = REGISTRY.register("iron_singularity", () -> new IronSingularityItem());
	public static final RegistryObject<Item> GOLDEN_SINGULARITY = REGISTRY.register("golden_singularity", () -> new GoldenSingularityItem());
	public static final RegistryObject<Item> LAPIS_SINGULARITY = REGISTRY.register("lapis_singularity", () -> new LapisSingularityItem());
	public static final RegistryObject<Item> REDSTONE_SINGULARITY = REGISTRY.register("redstone_singularity", () -> new RedstoneSingularityItem());
	public static final RegistryObject<Item> NETHER_QUARTZ_SINGULARITY = REGISTRY.register("nether_quartz_singularity", () -> new NetherQuartzSingularityItem());
	public static final RegistryObject<Item> COPPER_SINGULARITY = REGISTRY.register("copper_singularity", () -> new CopperSingularityItem());
	public static final RegistryObject<Item> TIN_SINGULARITY = REGISTRY.register("tin_singularity", () -> new TinSingularityItem());
	public static final RegistryObject<Item> LEAD_SINGULARITY = REGISTRY.register("lead_singularity", () -> new LeadSingularityItem());
	public static final RegistryObject<Item> SILVER_SINGULARITY = REGISTRY.register("silver_singularity", () -> new SilverSingularityItem());
	public static final RegistryObject<Item> NICKEL_SINGULARITY = REGISTRY.register("nickel_singularity", () -> new NickelSingularityItem());
	public static final RegistryObject<Item> DIAMOND_SINGULARITY = REGISTRY.register("diamond_singularity", () -> new DiamondSingularityItem());
	public static final RegistryObject<Item> EMERALD_SINGULARITY = REGISTRY.register("emerald_singularity", () -> new EmeraldSingularityItem());
	public static final RegistryObject<Item> FLUXED_SINGULARITY = REGISTRY.register("fluxed_singularity", () -> new FluxedSingularityItem());
	public static final RegistryObject<Item> PLATINUM_SINGULARITY = REGISTRY.register("platinum_singularity", () -> new PlatinumSingularityItem());
	public static final RegistryObject<Item> IRIDIUM_SINGULARITY = REGISTRY.register("iridium_singularity", () -> new IridiumSingularityItem());
	public static final RegistryObject<Item> NETHERITE_SINGULARITY = REGISTRY.register("netherite_singularity", () -> new NetheriteSingularityItem());
	public static final RegistryObject<Item> AMETHYST_SINGULARITY = REGISTRY.register("amethyst_singularity", () -> new AmethystSingularityItem());
	public static final RegistryObject<Item> SKULLFIRE_SWORD = REGISTRY.register("skullfire_sword", () -> new SkullfireSwordItem());
	public static final RegistryObject<Item> NATURES_RUIN = REGISTRY.register("natures_ruin", () -> new NaturesRuinItem());
	public static final RegistryObject<Item> NATURES_RUIN_RESET = REGISTRY.register("natures_ruin_reset", () -> new NaturesRuinResetItem());
	public static final RegistryObject<Item> INFINITY_SWORD = REGISTRY.register("infinity_sword", () -> new InfinitySwordItem());
	public static final RegistryObject<Item> INFINITY_BOW = REGISTRY.register("infinity_bow", () -> new InfinityBowItem());
	public static final RegistryObject<Item> INFINITY_HOE = REGISTRY.register("infinity_hoe", () -> new InfinityHoeItem());
	public static final RegistryObject<Item> INFINITY_PICKAXE = REGISTRY.register("infinity_pickaxe", () -> new InfinityPickaxeItem());
	public static final RegistryObject<Item> INFINITY_SWORD_HAMMER = REGISTRY.register("infinity_sword_hammer", () -> new InfinitySwordHammerItem());
	public static final RegistryObject<Item> INFINITY_SHOVEL = REGISTRY.register("infinity_shovel", () -> new InfinityShovelItem());
	public static final RegistryObject<Item> INFINITY_SHOVEL_DESTROYER = REGISTRY.register("infinity_shovel_destroyer", () -> new InfinityShovelDestroyerItem());
	public static final RegistryObject<Item> INFINITY_ARMOR_HELMET = REGISTRY.register("infinity_armor_helmet", () -> new InfinityArmorItem.Helmet());
	public static final RegistryObject<Item> INFINITY_ARMOR_CHESTPLATE = REGISTRY.register("infinity_armor_chestplate", () -> new InfinityArmorItem.Chestplate());
	public static final RegistryObject<Item> INFINITY_ARMOR_LEGGINGS = REGISTRY.register("infinity_armor_leggings", () -> new InfinityArmorItem.Leggings());
	public static final RegistryObject<Item> INFINITY_ARMOR_BOOTS = REGISTRY.register("infinity_armor_boots", () -> new InfinityArmorItem.Boots());
}
