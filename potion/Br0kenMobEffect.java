package net.mcreator.thebroken.potion;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;

import java.util.List;
import java.util.ArrayList;

public class Br0kenMobEffect extends MobEffect {
	public Br0kenMobEffect() {
		super(MobEffectCategory.HARMFUL, -16777216);
		this.addAttributeModifier(ForgeMod.ENTITY_GRAVITY.get(), "2a8ed5c4-6d5b-3186-9fd5-78ccde6df59e", 1.26, AttributeModifier.Operation.ADDITION);
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, "fda713e1-b495-317e-a225-830f4e043dbe", 0, AttributeModifier.Operation.ADDITION);
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		cures.add(new ItemStack(Items.MILK_BUCKET));
		cures.add(new ItemStack(Items.TOTEM_OF_UNDYING));
		cures.add(new ItemStack(Items.HONEY_BOTTLE));
		return cures;
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.addAttributeModifiers(entity, attributeMap, amplifier);
		entity.level().playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_broken:creepy3")), entity.getSoundSource(), 1.0F, 1.0F);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}