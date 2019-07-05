package me.swirtzly.cubicnightmare.common.entity;

import com.google.common.base.Predicate;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityLookHelper;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathNavigateSwimmer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class EntitySharktopus extends EntityMob {
	private static final DataParameter<Boolean> MOVING = EntityDataManager.createKey(EntitySharktopus.class, DataSerializers.BOOLEAN);
	private static final DataParameter<Integer> TARGET_ENTITY = EntityDataManager.createKey(EntitySharktopus.class, DataSerializers.VARINT);
	private EntityLivingBase targetedEntity;
	private EntityAIWander wander;
	
	public EntitySharktopus(World worldIn) {
		super(worldIn);
		this.experienceValue = 10;
		this.setSize(0.85F, 0.85F);
		this.moveHelper = new EntitySharktopus.sharkMoveHelper(this);
	}
	
	protected void initEntityAI() {
		EntityAIMoveTowardsRestriction entityaimovetowardsrestriction = new EntityAIMoveTowardsRestriction(this, 1.0D);
		this.wander = new EntityAIWander(this, 1.0D, 80);
		this.tasks.addTask(4, new EntitySharktopus.AIsharkAttack(this));
		this.tasks.addTask(5, entityaimovetowardsrestriction);
		this.tasks.addTask(7, this.wander);
		this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(9, new EntityAILookIdle(this));
		this.wander.setMutexBits(3);
		entityaimovetowardsrestriction.setMutexBits(3);
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityLivingBase.class, 10, true, false, new EntitySharktopus.sharkTargetSelector(this)));
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(6.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5D);
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(30.0D);
	}
	
	
	/**
	 * Returns new PathNavigateGround instance
	 */
	protected PathNavigate createNavigator(World worldIn) {
		return new PathNavigateSwimmer(this, worldIn);
	}
	
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(MOVING, Boolean.FALSE);
		this.dataManager.register(TARGET_ENTITY, 0);
	}
	
	public boolean isMoving() {
		return this.dataManager.get(MOVING);
	}
	
	private void setMoving(boolean moving) {
		this.dataManager.set(MOVING, moving);
	}
	
	public int getAttackDuration() {
		return 80;
	}
	
	public boolean hasTargetedEntity() {
		return this.dataManager.get(TARGET_ENTITY) != 0;
	}
	
	@Nullable
	public EntityLivingBase getTargetedEntity() {
		if (!this.hasTargetedEntity()) {
			return null;
		} else if (this.world.isRemote) {
			if (this.targetedEntity != null) {
				return this.targetedEntity;
			} else {
				Entity entity = this.world.getEntityByID(this.dataManager.get(TARGET_ENTITY));
				
				if (entity instanceof EntityLivingBase) {
					this.targetedEntity = (EntityLivingBase) entity;
					return this.targetedEntity;
				} else {
					return null;
				}
			}
		} else {
			return this.getAttackTarget();
		}
	}
	
	private void setTargetedEntity(int entityId) {
		this.dataManager.set(TARGET_ENTITY, entityId);
	}
	
	public void notifyDataManagerChange(DataParameter<?> key) {
		super.notifyDataManagerChange(key);
		
		if (TARGET_ENTITY.equals(key)) {
			this.targetedEntity = null;
		}
	}
	
	/**
	 * Get number of ticks, at least during which the living entity will be silent.
	 */
	public int getTalkInterval() {
		return 160;
	}
	
	
	/**
	 * returns if this entity triggers Block.onEntityWalking on the blocks they walk on. used for spiders and wolves to
	 * prevent them from trampling crops
	 */
	protected boolean canTriggerWalking() {
		return false;
	}
	
	public float getEyeHeight() {
		return this.height * 0.5F;
	}
	
	public float getBlockPathWeight(BlockPos pos) {
		return this.world.getBlockState(pos).getMaterial() == Material.WATER ? 10.0F + this.world.getLightBrightness(pos) - 0.5F : super.getBlockPathWeight(pos);
	}
	
	/**
	 * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
	 * use this to react to sunlight and start to burn.
	 */
	public void onLivingUpdate() {
		if (this.world.isRemote) {
			
			if (this.isMoving() && this.isInWater()) {
				Vec3d vec3d = this.getLook(0.0F);
				
				for (int i = 0; i < 2; ++i) {
					this.world.spawnParticle(EnumParticleTypes.WATER_BUBBLE, this.posX + (this.rand.nextDouble() - 0.5D) * (double) this.width - vec3d.x * 1.5D, this.posY + this.rand.nextDouble() * (double) this.height - vec3d.y * 1.5D, this.posZ + (this.rand.nextDouble() - 0.5D) * (double) this.width - vec3d.z * 1.5D, 0.0D, 0.0D, 0.0D);
				}
			}
			
			if (this.hasTargetedEntity()) {
				EntityLivingBase entitylivingbase = this.getTargetedEntity();
				
				if (entitylivingbase != null) {
					this.getLookHelper().setLookPositionWithEntity(entitylivingbase, 90.0F, 90.0F);
					this.getLookHelper().onUpdateLook();
					double d0 = entitylivingbase.posX - this.posX;
					double d1 = entitylivingbase.posY + (double) (entitylivingbase.height * 0.5F) - (this.posY + (double) this.getEyeHeight());
					double d2 = entitylivingbase.posZ - this.posZ;
					double d3 = Math.sqrt(d0 * d0 + d1 * d1 + d2 * d2);
					d0 = d0 / d3;
					d1 = d1 / d3;
					d2 = d2 / d3;
					double d4 = this.rand.nextDouble();
					
					while (d4 < d3) {
						d4 += 1.8D - 1 + this.rand.nextDouble() * (1.7D - 1);
						this.world.spawnParticle(EnumParticleTypes.WATER_BUBBLE, this.posX + d0 * d4, this.posY + d1 * d4 + (double) this.getEyeHeight(), this.posZ + d2 * d4, 0.0D, 0.0D, 0.0D);
					}
				}
			}
		}
		
		if (this.inWater) {
			this.setAir(300);
		} else if (this.onGround) {
			this.motionY += 0.5D;
			this.motionX += (double) ((this.rand.nextFloat() * 2.0F - 1.0F) * 0.4F);
			this.motionZ += (double) ((this.rand.nextFloat() * 2.0F - 1.0F) * 0.4F);
			this.rotationYaw = this.rand.nextFloat() * 360.0F;
			this.onGround = false;
			this.isAirBorne = true;
		}
		
		if (this.hasTargetedEntity()) {
			this.rotationYaw = this.rotationYawHead;
		}
		
		super.onLivingUpdate();
	}
	
	/**
	 * Checks to make sure the light is not too bright where the mob is spawning
	 */
	protected boolean isValidLightLevel() {
		return true;
	}
	
	/**
	 * Checks that the entity is not colliding with any blocks / liquids
	 */
	public boolean isNotColliding() {
		return this.world.checkNoEntityCollision(this.getEntityBoundingBox(), this) && this.world.getCollisionBoxes(this, this.getEntityBoundingBox()).isEmpty();
	}
	
	/**
	 * Checks if the entity's current position is a valid location to spawn this entity.
	 */
	public boolean getCanSpawnHere() {
		return (this.rand.nextInt(20) == 0 || !this.world.canBlockSeeSky(new BlockPos(this))) && super.getCanSpawnHere();
	}
	
	/**
	 * Called when the entity is attacked.
	 */
	public boolean attackEntityFrom(DamageSource source, float amount) {
		if (!this.isMoving() && !source.isMagicDamage() && source.getImmediateSource() instanceof EntityLivingBase) {
			EntityLivingBase entitylivingbase = (EntityLivingBase) source.getImmediateSource();
			
			if (!source.isExplosion()) {
				entitylivingbase.attackEntityFrom(DamageSource.causeThornsDamage(this), 2.0F);
			}
		}
		
		if (this.wander != null) {
			this.wander.makeUpdate();
		}
		
		return super.attackEntityFrom(source, amount);
	}
	
	/**
	 * The speed it takes to move the entityliving's rotationPitch through the faceEntity method. This is only currently
	 * use in wolves.
	 */
	public int getVerticalFaceSpeed() {
		return 180;
	}
	
	public void travel(float strafe, float vertical, float forward) {
		if (this.isServerWorld() && this.isInWater()) {
			this.moveRelative(strafe, vertical, forward, 0.1F);
			this.move(MoverType.SELF, this.motionX, this.motionY, this.motionZ);
			this.motionX *= 0.8999999761581421D;
			this.motionY *= 0.8999999761581421D;
			this.motionZ *= 0.8999999761581421D;
			
			if (!this.isMoving() && this.getAttackTarget() == null) {
				this.motionY -= 0.005D;
			}
		} else {
			super.travel(strafe, vertical, forward);
		}
	}
	
	static class AIsharkAttack extends EntityAIBase {
		private final EntitySharktopus shark;
		private int tickCounter;
		
		public AIsharkAttack(EntitySharktopus shark) {
			this.shark = shark;
			this.setMutexBits(3);
		}
		
		/**
		 * Returns whether the EntityAIBase should begin execution.
		 */
		public boolean shouldExecute() {
			EntityLivingBase entitylivingbase = this.shark.getAttackTarget();
			return entitylivingbase != null && entitylivingbase.isEntityAlive();
		}
		
		/**
		 * Returns whether an in-progress EntityAIBase should continue executing
		 */
		public boolean shouldContinueExecuting() {
			return super.shouldContinueExecuting() && this.shark.getDistanceSq(this.shark.getAttackTarget()) > 9.0D;
		}
		
		/**
		 * Execute a one shot task or start executing a continuous task
		 */
		public void startExecuting() {
			this.tickCounter = -10;
			this.shark.getNavigator().clearPath();
			this.shark.getLookHelper().setLookPositionWithEntity(this.shark.getAttackTarget(), 90.0F, 90.0F);
			this.shark.isAirBorne = true;
		}
		
		/**
		 * Reset the task's internal state. Called when this task is interrupted by another one
		 */
		public void resetTask() {
			this.shark.setTargetedEntity(0);
			this.shark.setAttackTarget(null);
			this.shark.wander.makeUpdate();
		}
		
		/**
		 * Keep ticking a continuous task that has already been started
		 */
		public void updateTask() {
			EntityLivingBase entitylivingbase = this.shark.getAttackTarget();
			this.shark.getNavigator().clearPath();
			this.shark.getLookHelper().setLookPositionWithEntity(entitylivingbase, 90.0F, 90.0F);
			
			if (!this.shark.canEntityBeSeen(entitylivingbase)) {
				this.shark.setAttackTarget(null);
			} else {
				++this.tickCounter;
				
				if (this.tickCounter == 0) {
					this.shark.setTargetedEntity(this.shark.getAttackTarget().getEntityId());
					this.shark.world.setEntityState(this.shark, (byte) 21);
				} else if (this.tickCounter >= this.shark.getAttackDuration()) {
					float f = 1.0F;
					
					f += 2.0F;
					
					
					entitylivingbase.attackEntityFrom(DamageSource.causeIndirectMagicDamage(this.shark, this.shark), f);
					entitylivingbase.attackEntityFrom(DamageSource.causeMobDamage(this.shark), (float) this.shark.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue());
					this.shark.setAttackTarget(null);
				}
				
				super.updateTask();
			}
		}
	}
	
	public static class sharkMoveHelper extends EntityMoveHelper {
		private final EntitySharktopus shark;
		
		public sharkMoveHelper(EntitySharktopus shark) {
			super(shark);
			this.shark = shark;
		}
		
		public void onUpdateMoveHelper() {
			if (this.action == EntityMoveHelper.Action.MOVE_TO && !this.shark.getNavigator().noPath()) {
				double d0 = this.posX - this.shark.posX;
				double d1 = this.posY - this.shark.posY;
				double d2 = this.posZ - this.shark.posZ;
				double d3 = (double) MathHelper.sqrt(d0 * d0 + d1 * d1 + d2 * d2);
				d1 = d1 / d3;
				float f = (float) (MathHelper.atan2(d2, d0) * (180D / Math.PI)) - 90.0F;
				this.shark.rotationYaw = this.limitAngle(this.shark.rotationYaw, f, 90.0F);
				this.shark.renderYawOffset = this.shark.rotationYaw;
				float f1 = (float) (this.speed * this.shark.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue());
				this.shark.setAIMoveSpeed(this.shark.getAIMoveSpeed() + (f1 - this.shark.getAIMoveSpeed()) * 0.125F);
				double d4 = Math.sin((double) (this.shark.ticksExisted + this.shark.getEntityId()) * 0.5D) * 0.05D;
				double d5 = Math.cos((double) (this.shark.rotationYaw * 0.017453292F));
				double d6 = Math.sin((double) (this.shark.rotationYaw * 0.017453292F));
				this.shark.motionX += d4 * d5;
				this.shark.motionZ += d4 * d6;
				d4 = Math.sin((double) (this.shark.ticksExisted + this.shark.getEntityId()) * 0.75D) * 0.05D;
				this.shark.motionY += d4 * (d6 + d5) * 0.25D;
				this.shark.motionY += (double) this.shark.getAIMoveSpeed() * d1 * 0.1D;
				EntityLookHelper entitylookhelper = this.shark.getLookHelper();
				double d7 = this.shark.posX + d0 / d3 * 2.0D;
				double d8 = (double) this.shark.getEyeHeight() + this.shark.posY + d1 / d3;
				double d9 = this.shark.posZ + d2 / d3 * 2.0D;
				double d10 = entitylookhelper.getLookPosX();
				double d11 = entitylookhelper.getLookPosY();
				double d12 = entitylookhelper.getLookPosZ();
				
				if (!entitylookhelper.getIsLooking()) {
					d10 = d7;
					d11 = d8;
					d12 = d9;
				}
				
				this.shark.getLookHelper().setLookPosition(d10 + (d7 - d10) * 0.125D, d11 + (d8 - d11) * 0.125D, d12 + (d9 - d12) * 0.125D, 10.0F, 40.0F);
				this.shark.setMoving(true);
			} else {
				this.shark.setAIMoveSpeed(0.0F);
				this.shark.setMoving(false);
			}
		}
	}
	
	static class sharkTargetSelector implements Predicate<EntityLivingBase> {
		private final EntitySharktopus parentEntity;
		
		public sharkTargetSelector(EntitySharktopus shark) {
			this.parentEntity = shark;
		}
		
		public boolean apply(@Nullable EntityLivingBase p_apply_1_) {
			return (p_apply_1_ instanceof EntityPlayer || p_apply_1_ instanceof EntitySquid) && p_apply_1_.getDistanceSq(this.parentEntity) > 9.0D;
		}
	}
}