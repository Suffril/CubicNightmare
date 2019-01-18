package me.fril.cubicnightmare.common.entity;

import me.fril.cubicnightmare.common.entity.ai.MoveHelperSharktopus;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntitySharktopus extends EntityMob {
	
	protected EntityAIWander wander;
	
	public EntitySharktopus(World worldIn) {
		super(worldIn);
		EntityAIMoveTowardsRestriction entityaimovetowardsrestriction = new EntityAIMoveTowardsRestriction(this, 1.0D);
		this.wander = new EntityAIWander(this, 1.0D, 80);
		this.tasks.addTask(5, entityaimovetowardsrestriction);
		this.tasks.addTask(7, this.wander);
		this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.wander.setMutexBits(3);
		entityaimovetowardsrestriction.setMutexBits(3);
		this.moveHelper = new MoveHelperSharktopus(this);
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(6.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5D);
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(40.0D);
	}
	
	
	@Override
	public boolean attackEntityAsMob(Entity entityIn) {
		return super.attackEntityAsMob(entityIn);
	}
	
	@Override
	public boolean canBreatheUnderwater()
	{
		return true;
	}
	
	@Override
	public boolean getCanSpawnHere()
	{
		return true;
	}
	
	@Override
	public boolean isNotColliding()
	{
		return this.world.checkNoEntityCollision(this.getEntityBoundingBox(), this);
	}
	
	@Override
	public int getTalkInterval()
	{
		return 120;
	}
	
	@Override
	protected boolean canDespawn()
	{
		return true;
	}
	
	@Override
	protected int getExperiencePoints(EntityPlayer player)
	{
		return 1 + this.world.rand.nextInt(3);
	}
	
	@Override
	public void onEntityUpdate()
	{
		int i = this.getAir();
		super.onEntityUpdate();
		
		if (this.isEntityAlive() && !this.isInWater())
		{
			--i;
			this.setAir(i);
			
			if (this.getAir() == -20)
			{
				this.setAir(0);
				this.attackEntityFrom(DamageSource.DROWN, 2.0F);
			}
		}
		else
		{
			this.setAir(300);
		}
	}
	
	public boolean isPushedByWater()
	{
		return false;
	}
	
	
}
