package net.mcreator.thebroken.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.mcreator.thebroken.init.TheBrokenModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements TheBrokenModBiomes.TheBrokenModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> the_broken_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.the_broken_dimensionTypeReference != null) {
			retval = TheBrokenModBiomes.adaptSurfaceRule(retval, this.the_broken_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setthe_brokenDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.the_broken_dimensionTypeReference = dimensionType;
	}
}