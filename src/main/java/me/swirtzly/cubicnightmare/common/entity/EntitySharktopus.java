package me.swirtzly.cubicnightmare.common.entity;

import me.swirtzly.cubicnightmare.common.CNObjects;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class EntitySharktopus extends EntityWaterMob {
	protected double swimTargetX;
	
	protected double swimTargetY;
	
	protected double swimTargetZ;
	
	private Entity targetEntity;
	
	private boolean isAttacking;
	
	private float swimRadius = 4.0F;
	
	private float swimRadiusHeight = 4.0F;
	
	private boolean isAgressive = false;
	
	private int attackInterval = 50;
	
	private float attackSpeed = 1.2F;
	
	private float swimSpeed = 0.5F;
	
	
	public EntitySharktopus(World world) {
		super(world);
	}
	
	@Override
	protected boolean canDespawn() {
		return false;
	}
	
	@Override
	protected boolean canTriggerWalking() {
		return false;
	}
	
	@Override
	public void onUpdate() {
		super.onUpdate();
		if (isInWater())
			this.motionY *= 0.1D;
	}
	
	@Override
	protected void updateAITasks() {
		super.updateAITasks();
		if (isInWater()) {
			double dx = this.swimTargetX - this.posX;
			double dy = this.swimTargetY - this.posY;
			double dz = this.swimTargetZ - this.posZ;
			double dist = MathHelper.sqrt(dx * dx + dy * dy + dz * dz);
			if (dist < 1.0D || dist > 1000.0D) {
				this.swimTargetX = this.posX + ((this.rand.nextFloat() * 2.0F - 1.0F) * this.swimRadius);
				this.swimTargetY = this.posY + ((this.rand.nextFloat() * 2.0F - 1.0F) * this.swimRadiusHeight);
				this.swimTargetZ = this.posZ + ((this.rand.nextFloat() * 2.0F - 1.0F) * this.swimRadius);
				this.isAttacking = false;
			}
			IBlockState blockState = this.world.getBlockState(new BlockPos(MathHelper.floor(this.swimTargetX), MathHelper.floor(this.swimTargetY + this.height), MathHelper.floor(this.swimTargetZ)));
			if (blockState.getBlock() == Blocks.WATER) {
				this.motionX += dx / dist * 0.05D * this.swimSpeed;
				this.motionY += dy / dist * 0.1D * this.swimSpeed;
				this.motionZ += dz / dist * 0.05D * this.swimSpeed;
			} else {
				this.swimTargetX = this.posX;
				this.swimTargetY = this.posY + 0.1D;
				this.swimTargetZ = this.posZ;
			}
			if (this.isAttacking) {
				this.motionX *= this.attackSpeed;
				this.motionY *= this.attackSpeed;
				this.motionZ *= this.attackSpeed;
			}
			if (this.isAgressive && this.rand.nextInt(this.attackInterval) == 0) {
				this.targetEntity = findEntityToAttack();
				if (this.targetEntity != null && this.targetEntity.isInWater()) {
					this.swimTargetX = this.targetEntity.posX;
					this.swimTargetY = this.targetEntity.posY;
					this.swimTargetZ = this.targetEntity.posZ;
					this.isAttacking = true;
				}
			}
			this.renderYawOffset += (-((float) Math.atan2(this.motionX, this.motionZ)) * 180.0F / 3.1415927F - this.renderYawOffset) * 0.5F;
			this.rotationYaw = this.renderYawOffset;
			float f = MathHelper.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
			this.rotationPitch += ((float) Math.atan2(this.motionY, f) * 180.0F / 3.1415927F - this.rotationPitch) * 0.5F;
		}
	}
	
	protected Entity findEntityToAttack() {
		EntityPlayer player = this.world.getClosestPlayerToEntity(this, 16.0D);
		return (player != null && canEntityBeSeen(player)) ? player : null;
	}
	
	@Override
	public void applyEntityCollision(Entity entity) {
		super.applyEntityCollision(entity);
		if (this.isAgressive && this.targetEntity == entity)
			attackEntityAsMob(entity);
	}
	
	@Override
	public boolean attackEntityAsMob(Entity entity) {
		float damage = (float) getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue();
		return entity.attackEntityFrom(CNObjects.SHARK_BITE, damage);
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
	}
	
	public boolean getCanSpawnHere() {
		return (this.posY > 45.0D && this.posY < 63.0D && super.getCanSpawnHere());
	}
}
