package me.swirtzly.cubicnightmare.common.entity;

import me.swirtzly.cubicnightmare.client.particles.ParticleUpsideDown;
import me.swirtzly.cubicnightmare.common.dimensions.CNDimensions;
import me.swirtzly.cubicnightmare.utils.Teleporter;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityPortal extends Entity {
	public EntityPortal(World worldIn) {
		super(worldIn);
		setSize(3, 2);
	}
	
	@Override
	protected void entityInit() {
	
	}
	
	@Override
	protected void readEntityFromNBT(NBTTagCompound compound) {
	
	}
	
	@Override
	protected void writeEntityToNBT(NBTTagCompound compound) {
	
	}

	@Override
	public void applyEntityCollision(Entity entityIn) {
		if(!(entityIn instanceof EntityPortal)){
			Teleporter.move(entityIn, CNDimensions.USD_ID, getPosition());
		}
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		
		if (world.isRemote) {
			spawnParticles();
		}
		
	}
	
	@SideOnly(Side.CLIENT)
	private void spawnParticles() {
		for (int i = 0; i < 2; ++i) {
			Minecraft.getMinecraft().effectRenderer.addEffect(new ParticleUpsideDown(world, this.posX + (this.rand.nextDouble() - 0.5D) * (double) this.width, this.posY + this.rand.nextDouble() * (double) this.height, this.posZ + (this.rand.nextDouble() - 0.5D) * (double) this.width, 0.0D, 0.0D, 0.0D));
		}
	}
}
