package org.sls.helper.common.entity;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public abstract class EntityHelper extends EntityLivingBase {
	protected double attack, health, speed, knockbackResistance, detectionRange;

	public EntityHelper(World world, double attack, double health, double speed, double knockbackResistance, double detectionRange)
	{
		super(world);
		this.attack = attack;
		this.health = health;
		this.speed = speed;
		this.knockbackResistance = knockbackResistance;
		this.detectionRange = detectionRange;
	}

	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(attack);
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(health);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(speed);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(detectionRange);
		this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(knockbackResistance);
	}

	public static Class<? extends Entity> createEntity(Class<? extends Entity> entity, String name)
	{
		EntityRegistry.registerGlobalEntityID(entity, name, EntityRegistry.findGlobalUniqueEntityId());
		return entity;
	}

	public static Class<? extends Entity> createEntity(Class<? extends Entity> entity, String name, int foreground, int background)
	{
		EntityRegistry.registerGlobalEntityID(entity, name, EntityRegistry.findGlobalUniqueEntityId(), foreground, background);
		return entity;
	}
}
