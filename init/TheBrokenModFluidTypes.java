/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thebroken.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.thebroken.fluid.types.ErrorFluidType;
import net.mcreator.thebroken.TheBrokenMod;

public class TheBrokenModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, TheBrokenMod.MODID);
	public static final RegistryObject<FluidType> ERROR_TYPE = REGISTRY.register("error", () -> new ErrorFluidType());
}