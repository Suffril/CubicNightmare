package me.fril.cubicnightmare.client.render;

import me.fril.cubicnightmare.CubicNightmare;
import me.fril.cubicnightmare.client.render.models.ModelSharktopus;
import me.fril.cubicnightmare.common.entity.EntitySharktopus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSquid;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderModelBase extends RenderLiving<EntitySharktopus> {
	
	ResourceLocation TEX;
	
	public RenderModelBase(RenderManager rendermanagerIn, ResourceLocation texture, ModelBase modelBase) {
		super(rendermanagerIn, modelBase, 0);
		this.TEX = texture;
	}
	
	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	 *
	 * @param entity
	 */
	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(EntitySharktopus entity) {
		return TEX;
	}
}
