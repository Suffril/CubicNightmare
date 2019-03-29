package me.suff.cubicnightmare.client.render;

import me.suff.cubicnightmare.CubicNightmare;
import me.suff.cubicnightmare.client.render.models.ModelGraboid;
import me.suff.cubicnightmare.client.render.models.ModelQuietMonster;
import me.suff.cubicnightmare.utils.CNTextures;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderQuietMonster extends RenderLiving {
	
	
	public RenderQuietMonster(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelQuietMonster(), 1);
	}
	
	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return CNTextures.QUIET_MONSTER;
	}
}
