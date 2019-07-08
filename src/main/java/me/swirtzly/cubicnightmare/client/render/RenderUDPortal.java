package me.swirtzly.cubicnightmare.client.render;

import me.swirtzly.cubicnightmare.CubicNightmare;
import me.swirtzly.cubicnightmare.common.entity.EntityPortal;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;

import javax.annotation.Nullable;

public class RenderUDPortal extends Render<EntityPortal> {
	
	private static final ResourceLocation TEXTURE = new ResourceLocation(CubicNightmare.MODID, "textures/entity/portal.png");
	
	public RenderUDPortal(RenderManager renderManager) {
		super(renderManager);
	}
	
	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(EntityPortal entity) {
		return null;
	}
	
	@Override
	public void doRender(EntityPortal entity, double x, double y, double z, float entityYaw, float partialTicks) {
		
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240, 240);
		
		GlStateManager.pushMatrix();
		GlStateManager.disableCull();
		GlStateManager.disableLighting();
		
		float offset = MathHelper.cos(entity.ticksExisted * 0.1F) * -0.09F;
		
		//GlStateManager.scale(offset, offset, offset);
		
		if (entity.world.rand.nextInt(5) == 1) {
			GlStateManager.translate(0, entity.world.rand.nextInt(7) / 100.0f, 0);
		}
		
		if (entity.world.rand.nextInt(5) == 1) {
			GlStateManager.translate(entity.world.rand.nextInt(7) / 100.0f, 0, 0);
		}
		
		if (entity.world.rand.nextInt(10) == 1) {
			GlStateManager.scale(1, 1 + entity.world.rand.nextInt(7) / 100.0f, 1);
		}
		
		if (entity.world.getTotalWorldTime() % 60 == 0) {
			GlStateManager.color(entity.world.rand.nextFloat(), entity.world.rand.nextFloat(), entity.world.rand.nextFloat(), 0.8F);
		} else {
			GlStateManager.color(1, 1, 1, 0.8F);
		}
		
		GlStateManager.translate(x, y + entity.height / 2.0F, z);
		GlStateManager.rotate(180.0F - entityYaw, 0.0F, 1.0F, 0.0F);
		
		this.renderTexture();
		
		GlStateManager.enableLighting();
		GlStateManager.enableCull();
		GlStateManager.popMatrix();
		
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, OpenGlHelper.lastBrightnessX, OpenGlHelper.lastBrightnessY);
	}
	
	private void renderTexture() {
		Minecraft client = Minecraft.getMinecraft();
		
		client.getTextureManager().bindTexture(TEXTURE);
		
		GlStateManager.enableAlpha();
		GlStateManager.enableBlend();
		
		GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
		
		Tessellator tessellator = Tessellator.getInstance();
		BufferBuilder builder = tessellator.getBuffer();
		
		double width = (64.0 * 0.0625) / 3.5;
		double height = (128.0 * 0.0625) / 3.5;
		
		builder.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);
		builder.pos(-width, height, 0.0).tex(0.0, 1.0).endVertex();
		builder.pos(width, height, 0.0).tex(1.0, 1.0).endVertex();
		builder.pos(width, -height, 0.0).tex(1.0, 0.0).endVertex();
		builder.pos(-width, -height, 0.0).tex(0.0, 0.0).endVertex();
		tessellator.draw();
		
		GlStateManager.disableBlend();
	}
}