package me.suff.cubicnightmare.common.entity;

import me.suff.cubicnightmare.common.CNObjects;
import me.suff.cubicnightmare.common.entity.ai.EntityAIWanderSwim;
import me.suff.cubicnightmare.common.entity.ai.EntityMoveHandlerWater;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathNavigateSwimmer;
import net.minecraft.world.World;

import javax.annotation.Nullable;


//Done
public class EntitySharktopus extends EntityWaterMob {
	
	public EntitySharktopus(World worldIn) {
		super(worldIn);
		setSize(2, 2F);
		this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityPlayer.class, 32F));
		this.tasks.addTask(1, new EntityAIWanderSwim(this, 0.3));
		this.stepHeight = 0.95F;
		this.moveHelper = new EntityMoveHandlerWater(this);
	}
	
	@Nullable
	@Override
	public EntityLivingBase getAttackTarget() {
		return super.getAttackTarget();
	}
	
	@Override
	public PathNavigate createNavigator(World worldIn) {
		return new PathNavigateSwimmer(this, worldIn);
	}
	
	@Override
	public void onUpdate() {
		super.onUpdate();
		
		if (world.getBlockState(getPosition().up()).getMaterial() != Material.WATER) {
			motionY = -2;
		}
		
		if (getAttackTarget() == null) {
			
			if (world.getClosestPlayerToEntity(this, 45) != null) {
				setAttackTarget(world.getClosestPlayerToEntity(this, 45));
			} else {
				world.getEntitiesWithinAABB(EntityLivingBase.class, this.getEntityBoundingBox().expand(45, 45, 45)).forEach(entity -> {
					
					if (entity.isEntityAlive() && !(entity instanceof EntitySharktopus) && entity.isInsideOfMaterial(Material.WATER)) {
						setAttackTarget(entity);
					} else {
						setAttackTarget(null);
					}
				});
			}
			
		} else {
			getNavigator().tryMoveToEntityLiving(getAttackTarget(), 1);
			if (getAttackTarget().getDistance(this) < 2) {
				getAttackTarget().attackEntityFrom(CNObjects.SHARK_BITE, 4.0F);
			}
		}
		
		
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5D);
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(40.0D);
	}
	
	
	@Override
	public boolean attackEntityAsMob(Entity entityIn) {
		return true;
	}
	
	@Override
	public boolean canBreatheUnderwater() {
		return true;
	}
	
	@Override
	public boolean getCanSpawnHere() {
		return true;
	}
	
	@Override
	public boolean isNotColliding() {
		return this.world.checkNoEntityCollision(this.getEntityBoundingBox(), this);
	}
	
	@Override
	public int getTalkInterval() {
		return 120;
	}
	
	@Override
	protected boolean canDespawn() {
		return true;
	}
	
	@Override
	protected int getExperiencePoints(EntityPlayer player) {
		return 1 + this.world.rand.nextInt(3);
	}
	
	public boolean isPushedByWater() {
		return false;
	}
	
}
