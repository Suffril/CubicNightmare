package me.suff.cubicnightmare.client.render;

import me.suff.cubicnightmare.CubicNightmare;
import me.suff.cubicnightmare.client.render.models.ModelGraboid;
import net.minecraft.client.model.ModelBase;
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
		return new ResourceLocation(CubicNightmare.MODID, "textures/entity/graboid.png");
	}
}
