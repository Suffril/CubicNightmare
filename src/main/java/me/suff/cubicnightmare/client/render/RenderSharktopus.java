package me.suff.cubicnightmare.client.render;

import me.suff.cubicnightmare.client.render.models.ModelSharktopus;
import me.suff.cubicnightmare.common.entity.EntitySharktopus;
import me.suff.cubicnightmare.utils.CNTextures;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSquid;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderSharktopus extends RenderLiving<EntitySharktopus> {
	
	public RenderSharktopus(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelSharktopus(), 0);
	}
	
	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	 *
	 * @param entity
	 */
	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(EntitySharktopus entity) {
		return CNTextures.SHARK;
	}
}