/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thebroken.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.thebroken.item.ErrorItem;
import net.mcreator.thebroken.item.BrokensowrdItem;
import net.mcreator.thebroken.item.BrokenerrorItem;
import net.mcreator.thebroken.TheBrokenMod;

public class TheBrokenModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheBrokenMod.MODID);
	public static final RegistryObject<Item> BROKENBLOCK;
	public static final RegistryObject<Item> BROKENGUY_SPAWN_EGG;
	public static final RegistryObject<Item> BROKENERROR;
	public static final RegistryObject<Item> BROKENANNOM;
	public static final RegistryObject<Item> ERROR_BUCKET;
	public static final RegistryObject<Item> BROKENSOWRD;
	static {
		BROKENBLOCK = block(TheBrokenModBlocks.BROKENBLOCK);
		BROKENGUY_SPAWN_EGG = REGISTRY.register("brokenguy_spawn_egg", () -> new ForgeSpawnEggItem(TheBrokenModEntities.BROKENGUY, -1, -1, new Item.Properties()));
		BROKENERROR = REGISTRY.register("brokenerror", BrokenerrorItem::new);
		BROKENANNOM = block(TheBrokenModBlocks.BROKENANNOM, new Item.Properties().rarity(Rarity.EPIC));
		ERROR_BUCKET = REGISTRY.register("error_bucket", ErrorItem::new);
		BROKENSOWRD = REGISTRY.register("brokensowrd", BrokensowrdItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}