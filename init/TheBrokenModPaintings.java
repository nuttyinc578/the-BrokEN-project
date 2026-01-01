/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thebroken.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.thebroken.TheBrokenMod;

public class TheBrokenModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, TheBrokenMod.MODID);
	public static final RegistryObject<PaintingVariant> BROKENHESWATCHING = REGISTRY.register("brokenheswatching", () -> new PaintingVariant(32, 16));
}