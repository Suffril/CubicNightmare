package me.suff.cubicnightmare.common.dimensions;

import me.suff.cubicnightmare.common.dimensions.upsidedown.USDProvider;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class CNDimensions {
	
	public static int USD_ID = DimensionManager.getNextFreeDimId();
	public static DimensionType usdType;
	
	public static void register() {
		usdType = DimensionType.register("upside_down", "upside_down", USD_ID, USDProvider.class, false);
		DimensionManager.registerDimension(USD_ID, usdType);
	}
	
}
