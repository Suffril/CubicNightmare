package me.suff.cubicnightmare;

import me.suff.cubicnightmare.common.dimensions.CNDimensions;
import me.suff.cubicnightmare.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = CubicNightmare.MODID, name = CubicNightmare.NAME, version = CubicNightmare.VERSION)
public class CubicNightmare {
	public static final String MODID = "cubic_nightmare";
	public static final String NAME = "Cubic Nightmare";
	public static final String VERSION = "1.0";
	@SidedProxy(clientSide = "me.suff.cubicnightmare.proxy.ClientProxy", serverSide = "me.suff.cubicnightmare.proxy.CommonProxy")
	public static CommonProxy proxy;
	private static Logger LOG = LogManager.getLogger(NAME);
	
	@EventHandler
	public void pre(FMLPreInitializationEvent event) {
		proxy.pre();
		CNDimensions.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
	}
	
	@EventHandler
	public void post(FMLPostInitializationEvent event) {
		proxy.init();
	}
	
}
