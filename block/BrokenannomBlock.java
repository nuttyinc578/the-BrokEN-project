package net.mcreator.thebroken.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class BrokenannomBlock extends Block {
	public BrokenannomBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(1.05f, 10f).lightLevel(s -> 1).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}