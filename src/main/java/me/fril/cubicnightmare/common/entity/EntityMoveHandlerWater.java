package me.fril.cubicnightmare.common.entity;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityMoveHelper;

public class EntityMoveHandlerWater extends EntityMoveHelper{
	
	public EntityMoveHandlerWater(EntityLiving entitylivingIn) {
		super(entitylivingIn);
	}
	
	@Override
	public void onUpdateMoveHelper() {
		if(this.action == Action.MOVE_TO && this.entity.isInsideOfMaterial(Material.WATER)) {
			
			if(this.entity.getAttackTarget() != null){
				Entity target = entity.getAttackTarget();
				this.entity.getLookHelper().setLookPosition(target.posX, target.posY, target.posZ, 5, 5);
				this.entity.rotationYaw = this.entity.rotationYawHead;
				this.entity.setMoveForward(1F);
				this.entity.motionY = posY > this.entity.posY + 1 ? 0.05 : (posY < this.entity.posY - 1) ? -0.05 : 0;
			} else
			
			if(this.entity.getPosition().getDistance((int)this.posX, (int)this.posY, (int)this.posZ) > 1) {
				this.entity.getLookHelper().setLookPosition(this.posX, this.posY, this.posZ, 5, 5);
				this.entity.rotationYaw = this.entity.rotationYawHead;
				this.entity.setMoveForward(1F);
				this.entity.motionY = posY > this.entity.posY + 1 ? 0.05 : (posY < this.entity.posY - 1) ? -0.05 : 0;
			}
			else this.action = Action.WAIT;
		}
	}
	
}