package net.mcreator.thebroken.block;

import net.minecraftforge.common.ToolActions;
import net.minecraftforge.common.ToolAction;

import net.minecraft.world.phys.HitResult;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.thebroken.init.TheBrokenModItems;
import net.mcreator.thebroken.init.TheBrokenModBlocks;

public class BrokenblockBlock extends Block {
	public BrokenblockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(1f, 10f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).replaceable().ignitedByLava());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 1;
	}

	@Override
	public BlockState getToolModifiedState(BlockState blockstate, UseOnContext context, ToolAction itemAbility, boolean simulate) {
		if (ToolActions.AXE_STRIP == itemAbility && context.getItemInHand().canPerformAction(itemAbility)) {
			return TheBrokenModBlocks.BROKENERROR_PORTAL.get().withPropertiesOf(blockstate);
		}
		return super.getToolModifiedState(blockstate, context, itemAbility, simulate);
	}

	@Override
	public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter world, BlockPos pos, Player player) {
		return new ItemStack(TheBrokenModItems.BROKENERROR.get());
	}
}