package me.swirtzly.cubicnightmare.utils;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ITeleporter;

import javax.annotation.Nullable;

public final class Teleporter {

    @Nullable
    public static Entity move(Entity entity, int dimension, BlockPos pos) {
        return move(entity, dimension, pos.getX() + 0.5D, pos.getY(), pos.getZ() + 0.5D);
    }

    @Nullable
    public static Entity move(Entity entity, int dimension, double x, double y, double z) {
        if (entity.world.isRemote || !entity.isNonBoss()) {
            return null;
        }

        if (entity.dimension == dimension) {
            if (entity instanceof EntityPlayerMP) {
                if (((EntityPlayerMP) entity).connection != null) {
                    ((EntityPlayerMP) entity).connection.setPlayerLocation(x, y, z, entity.rotationYaw, entity.rotationPitch);
                }
            } else {
                entity.setLocationAndAngles(x, y, z, entity.rotationYaw, entity.rotationPitch);
            }
            return entity;
        }
        return entity.changeDimension(dimension, new CNTeleport(x, y, z));
    }

    public static final class CNTeleport implements ITeleporter {
        private final double x, y, z;

        public CNTeleport(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        @Override
        public void placeEntity(World world, Entity entity, float yaw) {
            entity.setLocationAndAngles(x, y, z, yaw, entity.rotationPitch);
        }
    }


}