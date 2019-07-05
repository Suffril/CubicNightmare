package me.swirtzly.cubicnightmare.client.render;

import me.swirtzly.cubicnightmare.client.render.models.ModelDemoDog;
import me.swirtzly.cubicnightmare.common.entity.EntityDemodog;
import me.swirtzly.cubicnightmare.utils.CNTextures;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderDemodog extends RenderLiving<EntityDemodog> {
	
	public RenderDemodog(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelDemoDog(), 1);
	}
	
	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(EntityDemodog entity) {
		return CNTextures.DEMODOG;
	}
}
