package me.fril.cubicnightmare.common.entity;

import me.fril.cubicnightmare.common.CNObjects;
import me.fril.cubicnightmare.common.entity.ai.MoveHelperSharktopus;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.pathfinding.Path;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathNavigateSwimmer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntitySharktopus extends EntityMob {
	
	protected EntityAIWander wander;
	
	public EntitySharktopus(World worldIn) {
		super(worldIn);
		setSize(3,1.5F);
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
	public float getBlockPathWeight(BlockPos pos) {
		return this.world.getBlockState(pos).getMaterial() == Material.WATER ? 10.0F + this.world.getLightBrightness(pos) - 0.5F : super.getBlockPathWeight(pos);
	}
	
	@Override
	public void onUpdate() {
		super.onUpdate();
		
		System.out.println(getAttackTarget());
		
		if(getAttackTarget() == null) {
			world.getEntitiesWithinAABB(EntityLivingBase.class, this.getEntityBoundingBox().expand(45, 45, 45)).forEach(entity -> {
				if (entity.isEntityAlive() && !(entity instanceof EntitySharktopus)) {
					setAttackTarget(entity);
				} else {
					setAttackTarget(null);
				}
			});
		}else {
			if (getAttackTarget().getDistance(this) < 1) {
				getAttackTarget().attackEntityFrom(CNObjects.SHARK_BITE, 4.0F);
			}
		}
		
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
		
		if(this.isInsideOfMaterial(Material.WATER)) {
			this.setNoGravity(true);
		}
		else this.setNoGravity(false);
		
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
