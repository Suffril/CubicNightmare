package me.swirtzly.cubicnightmare.common.entity.ai;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityLookHelper;

public class CNLookHelper extends EntityLookHelper {
	public CNLookHelper(EntityLiving entitylivingIn) {
		super(entitylivingIn);
	}
	
	@Override
	public void setLookPositionWithEntity(Entity entityIn, float deltaYaw, float deltaPitch) {
		if (entityIn != null) {
			super.setLookPositionWithEntity(entityIn, deltaYaw, deltaPitch);
		}
	}
}
