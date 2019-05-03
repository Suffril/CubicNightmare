package me.suff.cubicnightmare.utils;

import me.suff.cubicnightmare.common.dimensions.upsidedown.USDProvider;
import net.minecraft.world.World;

public class CNUtil {
	
	public static boolean isUpsideDownDimension(World world) {
		return world.provider instanceof USDProvider;
	}
}
