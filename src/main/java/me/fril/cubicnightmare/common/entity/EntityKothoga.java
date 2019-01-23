package me.fril.cubicnightmare.common.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * Created by Suffril
 * on 22/01/2019.
 */
public class EntityKothoga extends EntityMob {
	
	public EntityKothoga(World worldIn) {
		super(worldIn);
		this.setSize(1.3F, 1.4F);
		this.tasks.addTask(4, new EntityAILeapAtTarget(this, 0.4F));
		this.tasks.addTask(5, new EntityAIAttackMelee(this, 1.0D, true));
		this.tasks.addTask(10, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(10, new EntityAILookIdle(this));
		this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true, new Class[0]));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget<>(this, EntityPlayer.class, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget<>(this, EntityVillager.class, false));
		this.targetTasks.addTask(3, new EntityAINearestAttackableTarget<>(this, EntityZombie.class, false));
		this.targetTasks.addTask(4, new EntityAINearestAttackableTarget<>(this, EntitySkeleton.class, false));
	}
	
	@Override
	public void onKillEntity(EntityLivingBase entityLivingIn) {
		super.onKillEntity(entityLivingIn);
		
		if(entityLivingIn instanceof EntityZombie || entityLivingIn instanceof EntityPlayer || entityLivingIn instanceof EntitySkeleton || entityLivingIn instanceof EntityVillager){
			if(!world.isRemote){
				EntityKothoga kothoga = new EntityKothoga(world);
				kothoga.setLocationAndAngles(entityLivingIn.posX, entityLivingIn.posY, entityLivingIn.posZ, 0, 0);
				world.spawnEntity(kothoga);
			}
		}
	
	}
	
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30000001192092896D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(48D);
	}
}
