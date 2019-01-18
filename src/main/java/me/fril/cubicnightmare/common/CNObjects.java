package me.fril.cubicnightmare.common;

import me.fril.cubicnightmare.CubicNightmare;
import me.fril.cubicnightmare.common.entity.EntitySharktopus;
import me.fril.cubicnightmare.utils.SpawnUtil;
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

    @SubscribeEvent
    public static void addEntities(RegistryEvent.Register<EntityEntry> e) {
        IForgeRegistry<EntityEntry> reg = e.getRegistry();
        reg.registerAll(EntityEntries.SHARK);
        SpawnUtil.setUpSpawns();
    }

    @GameRegistry.ObjectHolder(CubicNightmare.MODID)
    public static class EntityEntries {
        public static final EntityEntry SHARK = EntityEntryBuilder.create().entity(EntitySharktopus.class).id(new ResourceLocation(CubicNightmare.MODID, "sharktopus"), 0).name("sharktopus").tracker(80, 3, false).build();
    }
}
