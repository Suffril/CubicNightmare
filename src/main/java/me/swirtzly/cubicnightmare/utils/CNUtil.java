package me.swirtzly.cubicnightmare.utils;

import me.swirtzly.cubicnightmare.common.dimensions.upsidedown.USDProvider;
import net.minecraft.world.World;

import java.util.Random;

public class CNUtil {
	
	public static Random RANDOM = new Random();
	
	public static <T extends Enum<?>> T randomEnum(Class<T> clazz) {
		int x = RANDOM.nextInt(clazz.getEnumConstants().length);
		return clazz.getEnumConstants()[x];
	}
	
	public static boolean isUpsideDownDimension(World world) {
		return world.provider instanceof USDProvider;
	}
}
