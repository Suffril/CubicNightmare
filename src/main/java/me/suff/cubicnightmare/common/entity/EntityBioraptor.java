package me.suff.cubicnightmare.common.entity;

import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;

public class EntityBioraptor extends EntityCreature {
	
	private static final DataParameter<Boolean> IS_BABY = EntityDataManager.<Boolean>createKey(EntityBioraptor.class, DataSerializers.BOOLEAN);
	/**
	 * Random offset used in floating behaviour
	 */
	private float heightOffset = 0.5F;
	/**
	 * ticks until heightOffset is randomized
	 */
	private int heightOffsetUpdateTime;
	
	public EntityBioraptor(World worldIn) {
		super(worldIn);
	}
	
	@Override
	protected void entityInit() {
		super.entityInit();
		getDataManager().register(IS_BABY, rand.nextBoolean());
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(21D);
	}
	
	@Override
	protected void updateAITasks() {
		--this.heightOffsetUpdateTime;
		
		if (this.heightOffsetUpdateTime <= 0) {
			this.heightOffsetUpdateTime = 1200;
			this.heightOffset = 0.5F + (float) this.rand.nextGaussian() * 3.0F;
		}
		
		EntityLivingBase entitylivingbase = this.getAttackTarget();
		
		if (this.isInWater() || world.getBlockState(getPosition().down()).getMaterial() == Material.WATER || entitylivingbase != null && entitylivingbase.posY + (double) entitylivingbase.getEyeHeight() > this.posY + (double) this.getEyeHeight() + (double) this.heightOffset) {
			this.motionY += (0.30000001192092896D - this.motionY) * 0.30000001192092896D;
			this.isAirBorne = true;
		}
		
		super.updateAITasks();
	}
	
	@Override
	public void onUpdate() {
		super.onUpdate();
		
		if (isBaby() && getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).getBaseValue() > 7) {
			this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(7D);
		} else {
			this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(21D);
		}
		
		if (ticksExisted >= 216000 && !isBaby()) {
			setBaby(true);
		}
	}
	
	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		if (!this.onGround && this.motionY < 0.0D) {
			this.motionY *= 0.6D;
		}
	}
	
	public boolean isBaby() {
		return getDataManager().get(IS_BABY);
	}
	
	public void setBaby(boolean isBaby) {
		getDataManager().set(IS_BABY, isBaby);
	}
	
	
}
