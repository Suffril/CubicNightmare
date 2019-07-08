package me.swirtzly.cubicnightmare.common;

import me.swirtzly.cubicnightmare.CubicNightmare;
import me.swirtzly.cubicnightmare.common.entity.EntityBioraptor;
import me.swirtzly.cubicnightmare.common.entity.EntityDemodog;
import me.swirtzly.cubicnightmare.common.entity.EntityDemogorgon;
import me.swirtzly.cubicnightmare.common.entity.EntityGraboid;
import me.swirtzly.cubicnightmare.common.entity.EntityKothoga;
import me.swirtzly.cubicnightmare.common.entity.EntityPortal;
import me.swirtzly.cubicnightmare.common.entity.EntityQuietMonster;
import me.swirtzly.cubicnightmare.common.entity.EntitySharktopus;
import me.swirtzly.cubicnightmare.utils.CNSource;
import me.swirtzly.cubicnightmare.utils.SpawnUtil;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber
public class CNObjects {
	
	//SOUNDS
	public static final SoundEvent USD_AMBIENCE = setUpSound("usd_ambience");
	public static final SoundEvent DEMODOG_AMBIENCE = setUpSound("demodog_ambient");
	
	
	public static List<Item> ITEMS = new ArrayList<>();
	public static final Item DEMOGORGON_FLESH = setUpItem(new Item(), "demogorgon_flesh");
	public static CNSource SHARK_BITE = new CNSource("shark_bite");
	
	@SubscribeEvent
	public static void addEntities(RegistryEvent.Register<EntityEntry> e) {
		IForgeRegistry<EntityEntry> reg = e.getRegistry();
		reg.registerAll(EntityEntries.SHARK, EntityEntries.KOTHOGA, EntityEntries.GRABOID, EntityEntries.DEMOGORGON, EntityEntries.BIORAPTOR, EntityEntries.QUIET_MONSTER, EntityEntries.DEMODOG, EntityEntries.PORTAL);
		SpawnUtil.setUpSpawns();
	}
	
	@SubscribeEvent
	public static void addSounds(RegistryEvent.Register<SoundEvent> e) {
		IForgeRegistry<SoundEvent> reg = e.getRegistry();
		reg.registerAll(USD_AMBIENCE, DEMODOG_AMBIENCE);
	}
	
	
	private static SoundEvent setUpSound(String soundName) {
		return new SoundEvent(new ResourceLocation(CubicNightmare.MODID, soundName)).setRegistryName(soundName);
	}
	
	private static Item setUpItem(Item item, String name) {
		item.setRegistryName(CubicNightmare.MODID, name);
		item.setUnlocalizedName(name);
		ITEMS.add(item);
		return item;
	}
	
	@GameRegistry.ObjectHolder(CubicNightmare.MODID)
	public static class EntityEntries {
		public static final EntityEntry SHARK = EntityEntryBuilder.create().entity(EntitySharktopus.class).id(new ResourceLocation(CubicNightmare.MODID, "sharktopus"), 0).name("sharktopus").tracker(80, 3, false).build();
		public static final EntityEntry KOTHOGA = EntityEntryBuilder.create().entity(EntityKothoga.class).id(new ResourceLocation(CubicNightmare.MODID, "kothoga"), 1).name("kothaga").tracker(80, 3, false).build();
		public static final EntityEntry GRABOID = EntityEntryBuilder.create().entity(EntityGraboid.class).id(new ResourceLocation(CubicNightmare.MODID, "graboid"), 2).name("graboid").tracker(80, 3, false).build();
		public static final EntityEntry DEMOGORGON = EntityEntryBuilder.create().entity(EntityDemogorgon.class).id(new ResourceLocation(CubicNightmare.MODID, "demogorgon"), 3).name("demogorgon").tracker(80, 3, false).build();
		public static final EntityEntry QUIET_MONSTER = EntityEntryBuilder.create().entity(EntityQuietMonster.class).id(new ResourceLocation(CubicNightmare.MODID, "quiet_monster"), 4).name("quiet_monster").tracker(80, 3, false).build();
		public static final EntityEntry BIORAPTOR = EntityEntryBuilder.create().entity(EntityBioraptor.class).id(new ResourceLocation(CubicNightmare.MODID, "bioraptor"), 5).name("bioraptor").tracker(80, 3, false).build();
		public static final EntityEntry DEMODOG = EntityEntryBuilder.create().entity(EntityDemodog.class).id(new ResourceLocation(CubicNightmare.MODID, "demodog"), 6).name("demodog").tracker(80, 3, false).build();
		public static final EntityEntry PORTAL = EntityEntryBuilder.create().entity(EntityPortal.class).id(new ResourceLocation(CubicNightmare.MODID, "portal"), 7).name("portal").tracker(80, 3, false).build();
	}
}
