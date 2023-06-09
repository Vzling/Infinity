
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.jin.avaritia.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AvaritiaModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> BREAKBEDROCK = GameRules.register("breakBedrock", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
}
