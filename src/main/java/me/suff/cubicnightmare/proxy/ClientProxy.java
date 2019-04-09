package me.suff.cubicnightmare.proxy;

import me.suff.cubicnightmare.client.render.RenderBioraptor;
import me.suff.cubicnightmare.client.render.RenderDemogorgon;
import me.suff.cubicnightmare.client.render.RenderGraboid;
import me.suff.cubicnightmare.client.render.RenderKothoga;
import me.suff.cubicnightmare.client.render.RenderQuietMonster;
import me.suff.cubicnightmare.client.render.RenderSharktopus;
import me.suff.cubicnightmare.common.entity.EntityBioraptor;
import me.suff.cubicnightmare.common.entity.EntityDemogorgon;
import me.suff.cubicnightmare.common.entity.EntityGraboid;
import me.suff.cubicnightmare.common.entity.EntityKothoga;
import me.suff.cubicnightmare.common.entity.EntityQuietMonster;
import me.suff.cubicnightmare.common.entity.EntitySharktopus;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void pre() {
		super.pre();
		RenderingRegistry.registerEntityRenderingHandler(EntitySharktopus.class, RenderSharktopus::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityKothoga.class, RenderKothoga::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityGraboid.class, RenderGraboid::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityDemogorgon.class, RenderDemogorgon::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityBioraptor.class, RenderBioraptor::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityQuietMonster.class, RenderQuietMonster::new);
	}
}
