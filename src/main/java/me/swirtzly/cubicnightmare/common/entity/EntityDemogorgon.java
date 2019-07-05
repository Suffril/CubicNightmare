package me.swirtzly.cubicnightmare.common.entity;

import me.swirtzly.cubicnightmare.common.CNObjects;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityDemogorgon extends EntityCreature {
	
	private static final DataParameter<Boolean> OPEN_MOUTH = EntityDataManager.createKey(EntityDemogorgon.class, DataSerializers.BOOLEAN);
	
	public EntityDemogorgon(World worldIn) {
		super(worldIn);
		this.setSize(0.6F, 2.7F);
		
		this.tasks.addTask(4, new EntityAILeapAtTarget(this, 0.4F));
		this.tasks.addTask(5, new EntityAIAttackMelee(this, 1.0D, true));
		this.tasks.addTask(10, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(10, new EntityAILookIdle(this));
		this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget<>(this, EntityPlayer.class, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget<>(this, EntityVillager.class, false));
		this.targetTasks.addTask(3, new EntityAINearestAttackableTarget<>(this, EntityZombie.class, false));
		this.targetTasks.addTask(4, new EntityAINearestAttackableTarget<>(this, EntitySkeleton.class, false));
	}
	
	@Override
	protected void entityInit() {
		super.entityInit();
		getDataManager().register(OPEN_MOUTH, false);
	}
	
	public boolean isMouthOpen() {
		return getDataManager().get(OPEN_MOUTH);
	}
	
	public void setOpenMouth(boolean open) {
		getDataManager().set(OPEN_MOUTH, open);
	}
	
	@Override
	public void onUpdate() {
		super.onUpdate();
		
		setOpenMouth(getAttackingEntity() != null);
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(35.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.23000000417232513D);
		this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(2.0D);
	}
	
	@Override
	public void onDeath(DamageSource cause) {
		super.onDeath(cause);
		if (!world.isRemote) {
			InventoryHelper.spawnItemStack(world, posX, posY, posZ, new ItemStack(CNObjects.DEMOGORGON_FLESH));
		}
	}
}
