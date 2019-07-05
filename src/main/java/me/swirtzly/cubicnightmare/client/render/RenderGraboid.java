package me.swirtzly.cubicnightmare.client.render;

import me.swirtzly.cubicnightmare.client.render.models.ModelGraboid;
import me.swirtzly.cubicnightmare.utils.CNTextures;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderGraboid extends RenderLiving {
	
	
	public RenderGraboid(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelGraboid(), 1);
	}
	
	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return CNTextures.GRABOID;
	}
}
