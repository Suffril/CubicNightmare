package me.swirtzly.cubicnightmare.common.entity.weather;

import me.swirtzly.cubicnightmare.utils.CNUtil;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class EntityUDLightning extends EntityLightningBolt {
	
	public EnumLightningColor COLOR = EnumLightningColor.BLUE;
	
	public EntityUDLightning(World worldIn, double x, double y, double z, boolean effectOnlyIn) {
		super(worldIn, x, y, z, effectOnlyIn);
		COLOR = CNUtil.randomEnum(EnumLightningColor.class);
	}
	
	/**
	 * (abstract) Protected helper method to read subclass entity data from NBT.
	 */
	@Override
	protected void readEntityFromNBT(NBTTagCompound compound) {
		super.readEntityFromNBT(compound);
		COLOR = EnumLightningColor.valueOf(compound.getString("color_lightning"));
	}
	
	/**
	 * (abstract) Protected helper method to write subclass entity data to NBT.
	 */
	@Override
	protected void writeEntityToNBT(NBTTagCompound compound) {
		compound.setString("color_lightning", COLOR.name());
		writeToNBT(compound);
	}
	
	public EnumLightningColor getColor() {
		return COLOR;
	}
	
	public void setColor(EnumLightningColor color) {
		this.COLOR = color;
	}
	
	public enum EnumLightningColor {
		RED(new Vec3d(1, 0, 0)), BLUE(new Vec3d(0, 0, 1)), WHITE(new Vec3d(0, 0, 0));
		
		private Vec3d color;
		
		EnumLightningColor(Vec3d vec3d) {
			this.color = vec3d;
		}
		
		public Vec3d getColor() {
			return color;
		}
	}
}
