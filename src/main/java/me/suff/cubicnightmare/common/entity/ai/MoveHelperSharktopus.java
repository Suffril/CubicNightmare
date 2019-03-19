package me.suff.cubicnightmare.common.entity.ai;

import me.suff.cubicnightmare.common.entity.EntitySharktopus;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityLookHelper;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.util.math.MathHelper;

public class MoveHelperSharktopus extends EntityMoveHelper {
	private final EntitySharktopus entitySharktopus;
	
	public MoveHelperSharktopus(EntitySharktopus entitySharktopus) {
		super(entitySharktopus);
		this.entitySharktopus = entitySharktopus;
	}
	
	public void onUpdateMoveHelper() {
		if (this.action == EntityMoveHelper.Action.MOVE_TO && !this.entitySharktopus.getNavigator().noPath()) {
			double d0 = this.posX - this.entitySharktopus.posX;
			double d1 = this.posY - this.entitySharktopus.posY;
			double d2 = this.posZ - this.entitySharktopus.posZ;
			double d3 = (double) MathHelper.sqrt(d0 * d0 + d1 * d1 + d2 * d2);
			d1 = d1 / d3;
			float f = (float) (MathHelper.atan2(d2, d0) * (180D / Math.PI)) - 90.0F;
			this.entitySharktopus.rotationYaw = this.limitAngle(this.entitySharktopus.rotationYaw, f, 90.0F);
			this.entitySharktopus.renderYawOffset = this.entitySharktopus.rotationYaw;
			float f1 = (float) (this.speed * this.entitySharktopus.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getAttributeValue());
			this.entitySharktopus.setAIMoveSpeed(this.entitySharktopus.getAIMoveSpeed() + (f1 - this.entitySharktopus.getAIMoveSpeed()) * 0.125F);
			double d4 = Math.sin((double) (this.entitySharktopus.ticksExisted + this.entitySharktopus.getEntityId()) * 0.5D) * 0.05D;
			double d5 = Math.cos((double) (this.entitySharktopus.rotationYaw * 0.017453292F));
			double d6 = Math.sin((double) (this.entitySharktopus.rotationYaw * 0.017453292F));
			this.entitySharktopus.motionX += d4 * d5;
			this.entitySharktopus.motionZ += d4 * d6;
			d4 = Math.sin((double) (this.entitySharktopus.ticksExisted + this.entitySharktopus.getEntityId()) * 0.75D) * 0.05D;
			this.entitySharktopus.motionY += d4 * (d6 + d5) * 0.25D;
			this.entitySharktopus.motionY += (double) this.entitySharktopus.getAIMoveSpeed() * d1 * 0.1D;
			EntityLookHelper entitylookhelper = this.entitySharktopus.getLookHelper();
			double d7 = this.entitySharktopus.posX + d0 / d3 * 2.0D;
			double d8 = (double) this.entitySharktopus.getEyeHeight() + this.entitySharktopus.posY + d1 / d3;
			double d9 = this.entitySharktopus.posZ + d2 / d3 * 2.0D;
			double d10 = entitylookhelper.getLookPosX();
			double d11 = entitylookhelper.getLookPosY();
			double d12 = entitylookhelper.getLookPosZ();
			
			if (!entitylookhelper.getIsLooking()) {
				d10 = d7;
				d11 = d8;
				d12 = d9;
			}
			this.entitySharktopus.getLookHelper().setLookPosition(d10 + (d7 - d10) * 0.125D, d11 + (d8 - d11) * 0.125D, d12 + (d9 - d12) * 0.125D, 10.0F, 40.0F);
		} else {
			this.entitySharktopus.setAIMoveSpeed(0.0F);
		}
	}
}
