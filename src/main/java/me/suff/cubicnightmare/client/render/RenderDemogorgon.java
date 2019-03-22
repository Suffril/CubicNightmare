package me.suff.cubicnightmare.client.render;

import me.suff.cubicnightmare.client.render.models.ModelDemogorgon;
import me.suff.cubicnightmare.common.entity.EntityDemogorgon;
import me.suff.cubicnightmare.utils.CNTextures;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderDemogorgon extends RenderLiving<EntityDemogorgon> {
	
	public RenderDemogorgon(RenderManager render) {
		super(render, new ModelDemogorgon(), 0.5F);
	}
	
	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(EntityDemogorgon entity) {
		return CNTextures.DEMOGORGON;
	}
}
