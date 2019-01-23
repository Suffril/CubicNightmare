package me.fril.cubicnightmare.proxy;

import me.fril.cubicnightmare.client.render.RenderSharktopus;
import me.fril.cubicnightmare.client.render.RenderKothoga;
import me.fril.cubicnightmare.common.entity.EntityKothoga;
import me.fril.cubicnightmare.common.entity.EntitySharktopus;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void pre() {
		super.pre();
		RenderingRegistry.registerEntityRenderingHandler(EntitySharktopus.class, RenderSharktopus::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityKothoga.class, RenderKothoga::new);
	}
}
