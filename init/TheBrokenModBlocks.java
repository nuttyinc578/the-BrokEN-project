/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thebroken.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.thebroken.block.ErrorBlock;
import net.mcreator.thebroken.block.BrokenerrorPortalBlock;
import net.mcreator.thebroken.block.BrokenblockBlock;
import net.mcreator.thebroken.block.BrokenannomBlock;
import net.mcreator.thebroken.TheBrokenMod;

public class TheBrokenModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TheBrokenMod.MODID);
	public static final RegistryObject<Block> BROKENBLOCK;
	public static final RegistryObject<Block> BROKENERROR_PORTAL;
	public static final RegistryObject<Block> BROKENANNOM;
	public static final RegistryObject<Block> ERROR;
	static {
		BROKENBLOCK = REGISTRY.register("brokenblock", BrokenblockBlock::new);
		BROKENERROR_PORTAL = REGISTRY.register("brokenerror_portal", BrokenerrorPortalBlock::new);
		BROKENANNOM = REGISTRY.register("brokenannom", BrokenannomBlock::new);
		ERROR = REGISTRY.register("error", ErrorBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}