package net.mcreator.thebroken.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.thebroken.init.TheBrokenModItems;
import net.mcreator.thebroken.init.TheBrokenModFluids;
import net.mcreator.thebroken.init.TheBrokenModFluidTypes;
import net.mcreator.thebroken.init.TheBrokenModBlocks;

public abstract class ErrorFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> TheBrokenModFluidTypes.ERROR_TYPE.get(), () -> TheBrokenModFluids.ERROR.get(), () -> TheBrokenModFluids.FLOWING_ERROR.get())
			.explosionResistance(100f).bucket(() -> TheBrokenModItems.ERROR_BUCKET.get()).block(() -> (LiquidBlock) TheBrokenModBlocks.ERROR.get());

	private ErrorFluid() {
		super(PROPERTIES);
	}

	public static class Source extends ErrorFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends ErrorFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}