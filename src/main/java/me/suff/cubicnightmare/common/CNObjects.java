package me.suff.cubicnightmare.common;

import me.suff.cubicnightmare.CubicNightmare;
import me.suff.cubicnightmare.common.entity.EntityGraboid;
import me.suff.cubicnightmare.common.entity.EntityKothoga;
import me.suff.cubicnightmare.common.entity.EntitySharktopus;
import me.suff.cubicnightmare.utils.CNSource;
import me.suff.cubicnightmare.utils.SpawnUtil;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class CNObjects {

    public static CNSource SHARK_BITE = new CNSource("shark_bite");
    
    @SubscribeEvent
    public static void addEntities(RegistryEvent.Register<EntityEntry> e) {
        IForgeRegistry<EntityEntry> reg = e.getRegistry();
        reg.registerAll(EntityEntries.SHARK, EntityEntries.KOTHOGA, EntityEntries.GRABOID);
        SpawnUtil.setUpSpawns();
    }

    @GameRegistry.ObjectHolder(CubicNightmare.MODID)
    public static class EntityEntries {
        public static final EntityEntry SHARK = EntityEntryBuilder.create().entity(EntitySharktopus.class).id(new ResourceLocation(CubicNightmare.MODID, "sharktopus"), 0).name("sharktopus").tracker(80, 3, false).build();
        public static final EntityEntry KOTHOGA = EntityEntryBuilder.create().entity(EntityKothoga.class).id(new ResourceLocation(CubicNightmare.MODID, "kothoga"), 1).name("kothaga").tracker(80, 3, false).build();
        public static final EntityEntry GRABOID = EntityEntryBuilder.create().entity(EntityGraboid.class).id(new ResourceLocation(CubicNightmare.MODID, "graboid"), 2).name("graboid").tracker(80, 3, false).build();
    }
}
