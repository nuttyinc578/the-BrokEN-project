/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thebroken.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.thebroken.TheBrokenMod;

public class TheBrokenModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TheBrokenMod.MODID);
	public static final RegistryObject<SoundEvent> CREEPY = REGISTRY.register("creepy", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_broken", "creepy")));
	public static final RegistryObject<SoundEvent> CREEPY2 = REGISTRY.register("creepy2", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_broken", "creepy2")));
	public static final RegistryObject<SoundEvent> CREEPY3 = REGISTRY.register("creepy3", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_broken", "creepy3")));
}