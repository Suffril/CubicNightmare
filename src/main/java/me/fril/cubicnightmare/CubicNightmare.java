package me.fril.cubicnightmare;

import me.fril.cubicnightmare.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = CubicNightmare.MODID, name = CubicNightmare.NAME, version = CubicNightmare.VERSION)
public class CubicNightmare
{
    public static final String MODID = "cubicnightmare";
    public static final String NAME = "Cubic Nightmare";
    public static final String VERSION = "1.0";

    private static Logger LOG = LogManager.getLogger(NAME);

    @SidedProxy(clientSide = "me.fril.cubicnightmare.proxy.ClientProxy", serverSide = "me.fril.cubicnightmare.proxy.CommonProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void pre(FMLPreInitializationEvent event) {
        proxy.pre();
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
