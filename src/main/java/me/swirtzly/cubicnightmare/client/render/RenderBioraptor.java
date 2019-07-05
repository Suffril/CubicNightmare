package me.swirtzly.cubicnightmare.client.render;

import me.swirtzly.cubicnightmare.client.render.models.ModelBioraptor;
import me.swirtzly.cubicnightmare.common.entity.EntityBioraptor;
import me.swirtzly.cubicnightmare.utils.CNTextures;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderBioraptor extends RenderLiving {
	
	
	public RenderBioraptor(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelBioraptor(), 1);
	}
	
	@Override
	protected void renderModel(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) {
		if (entitylivingbaseIn instanceof EntityBioraptor) {
			EntityBioraptor bioraptor = (EntityBioraptor) entitylivingbaseIn;
			if (bioraptor.isBaby()) {
				GlStateManager.scale(1, 1, 1);
			}
			super.renderModel(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
		} else {
			super.renderModel(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
		}
	}
	
	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return CNTextures.BIO_RAPTOR;
	}
}
