package me.fril.cubicnightmare.client.render;

import me.fril.cubicnightmare.client.render.models.ModelKothoga;
import me.fril.cubicnightmare.common.entity.EntityKothoga;
import me.fril.cubicnightmare.utils.CNTextures;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

/**
 * Created by Suffril
 * on 23/01/2019.
 */
public class RenderKothoga extends RenderLiving<EntityKothoga> {
	
	public RenderKothoga(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelKothoga(), 2);
	}
	
	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(EntityKothoga entity) {
		return CNTextures.KOTHOGA;
	}
}
