package me.suff.cubicnightmare.client.render.sky;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraftforge.client.IRenderHandler;

public class RenderUpsideDownSky extends IRenderHandler {
	private static RenderUpsideDownSky INSTANCE = new RenderUpsideDownSky();
	
	public static RenderUpsideDownSky getInstance() {
		return INSTANCE;
	}
	
	@Override
	public void render(float partialTicks, WorldClient world, Minecraft mc) {
	
	}
}
