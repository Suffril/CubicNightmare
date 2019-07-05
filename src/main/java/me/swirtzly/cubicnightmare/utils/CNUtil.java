package me.swirtzly.cubicnightmare.utils;

import me.swirtzly.cubicnightmare.common.dimensions.upsidedown.USDProvider;
import net.minecraft.world.World;

public class CNUtil {
	
	public static boolean isUpsideDownDimension(World world) {
		return world.provider instanceof USDProvider;
	}
}
