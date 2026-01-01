/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thebroken.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.thebroken.TheBrokenMod;

public class TheBrokenModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, TheBrokenMod.MODID);
	public static final RegistryObject<Potion> THEBROKEN = REGISTRY.register("thebroken", () -> new Potion(new MobEffectInstance(MobEffects.CONFUSION, 3733, 0, false, true), new MobEffectInstance(MobEffects.WEAKNESS, 3600, 0, false, true),
			new MobEffectInstance(MobEffects.SATURATION, 3600, 0, false, true), new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3600, 0, false, true), new MobEffectInstance(MobEffects.UNLUCK, 3600, 0, false, true)));
	public static final RegistryObject<Potion> BR_0KENA = REGISTRY.register("br_0kena", () -> new Potion(new MobEffectInstance(TheBrokenModMobEffects.BR_0KEN.get(), -1, 49, true, true)));
}