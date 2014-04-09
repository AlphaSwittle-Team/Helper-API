package org.sls.helper.common.entity.mob;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityMobHelper extends EntityMob {
	protected double attack, health, speed, knockbackResistance, detectionRange;

	public EntityMobHelper(World world, double attack, double health, double speed, double knockbackResistance, double detectionRange)
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
}
