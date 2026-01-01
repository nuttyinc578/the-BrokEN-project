/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thebroken.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheBrokenModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> BROKEN = GameRules.register("broken", GameRules.Category.UPDATES, GameRules.BooleanValue.create(false));
}