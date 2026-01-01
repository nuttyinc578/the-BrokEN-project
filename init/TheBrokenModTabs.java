/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thebroken.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.thebroken.TheBrokenMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheBrokenModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheBrokenMod.MODID);
	public static final RegistryObject<CreativeModeTab> THEBROKENMOD = REGISTRY.register("thebrokenmod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_broken.thebrokenmod")).icon(() -> new ItemStack(TheBrokenModItems.BROKENERROR.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TheBrokenModBlocks.BROKENBLOCK.get().asItem());
				tabData.accept(TheBrokenModItems.BROKENGUY_SPAWN_EGG.get());
				tabData.accept(TheBrokenModBlocks.BROKENANNOM.get().asItem());
				tabData.accept(TheBrokenModItems.ERROR_BUCKET.get());
				tabData.accept(TheBrokenModItems.BROKENSOWRD.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(TheBrokenModItems.BROKENERROR.get());
		}
	}
}