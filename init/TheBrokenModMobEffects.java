/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thebroken.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.thebroken.potion.Br0kenMobEffect;
import net.mcreator.thebroken.TheBrokenMod;

public class TheBrokenModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, TheBrokenMod.MODID);
	public static final RegistryObject<MobEffect> BR_0KEN = REGISTRY.register("br_0ken", () -> new Br0kenMobEffect());
}