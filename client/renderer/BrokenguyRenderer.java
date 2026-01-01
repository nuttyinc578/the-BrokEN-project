package net.mcreator.thebroken.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.CrossedArmsItemLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.WitchModel;

import net.mcreator.thebroken.entity.BrokenguyEntity;

public class BrokenguyRenderer extends MobRenderer<BrokenguyEntity, WitchModel<BrokenguyEntity>> {
	public BrokenguyRenderer(EntityRendererProvider.Context context) {
		super(context, new WitchModel<BrokenguyEntity>(context.bakeLayer(ModelLayers.WITCH)), 0.5f);
		this.addLayer(new CrossedArmsItemLayer<>(this, context.getItemInHandRenderer()));
	}

	@Override
	public ResourceLocation getTextureLocation(BrokenguyEntity entity) {
		return new ResourceLocation("the_broken:textures/entities/2025_12_22_null---23736228.png");
	}
}