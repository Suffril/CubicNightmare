package me.swirtzly.cubicnightmare.client.render.sky.weather;

import me.swirtzly.cubicnightmare.common.entity.weather.EntityUDLightning;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;

import javax.annotation.Nullable;

public class RenderUDLightning extends Render<EntityUDLightning> {
	public RenderUDLightning(RenderManager renderManagerIn) {
		super(renderManagerIn);
	}
	
	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(EntityUDLightning entity) {
		return null;
	}
	
	@Override
	public void doRender(EntityUDLightning entity, double x, double y, double z, float entityYaw, float partialTicks) {
		GlStateManager.pushMatrix();
		System.out.println(entity.getColor().getColor());
		Vec3d color = entity.getColor().getColor();
		GlStateManager.color((float) color.x, (float) color.y, (float) color.z, 0);
		super.doRender(entity, x, y, z, entityYaw, partialTicks);
		GlStateManager.popMatrix();
	}
}
