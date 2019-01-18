package me.fril.cubicnightmare.utils;

import me.fril.cubicnightmare.common.entity.EntitySharktopus;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EnumCreatureType;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SpawnUtil {
	
	
	public static void setUpSpawns() {
		EntitySpawnPlacementRegistry.setPlacementType(EntitySharktopus.class, EntityLiving.SpawnPlacementType.IN_WATER);
		
		ForgeRegistries.BIOMES.getValuesCollection().forEach(biome -> {
			if(biome.getRegistryName().toString().toLowerCase().contains("ocean")){
				EntityRegistry.addSpawn(EntitySharktopus.class, 10, 4, 4, EnumCreatureType.WATER_CREATURE, biome);
			}
		});
		
	}
}
