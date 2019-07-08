package me.swirtzly.cubicnightmare.proxy;

import me.swirtzly.cubicnightmare.client.render.RenderBioraptor;
import me.swirtzly.cubicnightmare.client.render.RenderDemodog;
import me.swirtzly.cubicnightmare.client.render.RenderDemogorgon;
import me.swirtzly.cubicnightmare.client.render.RenderGraboid;
import me.swirtzly.cubicnightmare.client.render.RenderKothoga;
import me.swirtzly.cubicnightmare.client.render.RenderQuietMonster;
import me.swirtzly.cubicnightmare.client.render.RenderSharktopus;
import me.swirtzly.cubicnightmare.client.render.RenderUDPortal;
import me.swirtzly.cubicnightmare.client.render.sky.weather.RenderUDLightning;
import me.swirtzly.cubicnightmare.common.CNObjects;
import me.swirtzly.cubicnightmare.common.entity.EntityBioraptor;
import me.swirtzly.cubicnightmare.common.entity.EntityDemodog;
import me.swirtzly.cubicnightmare.common.entity.EntityDemogorgon;
import me.swirtzly.cubicnightmare.common.entity.EntityGraboid;
import me.swirtzly.cubicnightmare.common.entity.EntityKothoga;
import me.swirtzly.cubicnightmare.common.entity.EntityPortal;
import me.swirtzly.cubicnightmare.common.entity.EntityQuietMonster;
import me.swirtzly.cubicnightmare.common.entity.EntitySharktopus;
import me.swirtzly.cubicnightmare.common.entity.weather.EntityUDLightning;
import net.minecraft.client.audio.MusicTicker;
import net.minecraftforge.client.EnumHelperClient;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
	
	public static MusicTicker.MusicType USD_MUSIC = EnumHelperClient.addMusicType("USD_AMBIENT", CNObjects.USD_AMBIENCE, 0, 800);
	
	@Override
	public void pre() {
		super.pre();
		RenderingRegistry.registerEntityRenderingHandler(EntitySharktopus.class, RenderSharktopus::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityKothoga.class, RenderKothoga::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityGraboid.class, RenderGraboid::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityDemogorgon.class, RenderDemogorgon::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityBioraptor.class, RenderBioraptor::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityQuietMonster.class, RenderQuietMonster::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityDemodog.class, RenderDemodog::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityUDLightning.class, RenderUDLightning::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityPortal.class, RenderUDPortal::new);
	}
}
