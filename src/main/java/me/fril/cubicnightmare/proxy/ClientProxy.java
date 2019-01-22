package me.fril.cubicnightmare.proxy;

import me.fril.cubicnightmare.client.render.RenderModelBase;
import me.fril.cubicnightmare.client.render.models.ModelSharktopus;
import me.fril.cubicnightmare.common.entity.EntitySharktopus;
import me.fril.cubicnightmare.utils.CNTextures;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import static net.minecraft.client.Minecraft.*;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void pre() {
		super.pre();
		RenderingRegistry.registerEntityRenderingHandler(EntitySharktopus.class, new RenderModelBase(getMinecraft().getRenderManager(), CNTextures.SHARK, new ModelSharktopus()));
	}
}
