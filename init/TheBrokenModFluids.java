/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thebroken.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.thebroken.fluid.ErrorFluid;
import net.mcreator.thebroken.TheBrokenMod;

public class TheBrokenModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, TheBrokenMod.MODID);
	public static final RegistryObject<FlowingFluid> ERROR = REGISTRY.register("error", () -> new ErrorFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_ERROR = REGISTRY.register("flowing_error", () -> new ErrorFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(ERROR.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_ERROR.get(), RenderType.translucent());
		}
	}
}