package me.swirtzly.cubicnightmare.common;

import me.swirtzly.cubicnightmare.common.dimensions.CNDimensions;
import net.minecraft.world.WorldProviderSurface;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.ExplosionEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonHandler {
	
	@SubscribeEvent
	public static void onBlock(BlockEvent.PlaceEvent event) {
		if (event.getPlayer().world.provider instanceof WorldProviderSurface) {
			DimensionManager.getWorld(CNDimensions.USD_ID).setBlockState(event.getPos(), event.getState());
		}
	}
	
	@SubscribeEvent
	public static void onBreak(BlockEvent.BreakEvent event) {
		if (event.getPlayer().world.provider instanceof WorldProviderSurface) {
			DimensionManager.getWorld(CNDimensions.USD_ID).setBlockToAir(event.getPos());
		}
	}
	
	@SubscribeEvent
	public static void onExplode(ExplosionEvent event) {
		//	Explosion explosion = event.getExplosion();
//		Vec3d pos = explosion.getPosition();
//		if(event.getWorld().provider instanceof WorldProviderSurface){
//			DimensionManager.getWorld(CNDimensions.USD_ID).createExplosion(explosion.getExplosivePlacedBy(), pos.x, pos.y, pos.z, 1, true);
//		}
	}
}
