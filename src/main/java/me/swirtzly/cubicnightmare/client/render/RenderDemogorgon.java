package me.swirtzly.cubicnightmare.client.render;

import me.swirtzly.cubicnightmare.client.render.models.ModelDemogorgon;
import me.swirtzly.cubicnightmare.common.entity.EntityDemogorgon;
import me.swirtzly.cubicnightmare.utils.CNTextures;
import net.minecraft.client.renderer.entity.RenderLiving;
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
