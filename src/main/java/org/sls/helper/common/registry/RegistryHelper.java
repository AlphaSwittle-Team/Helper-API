package org.sls.helper.common.registry;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

import org.sls.helper.common.item.armor.EnumArmorHelper;
import org.sls.helper.common.item.tool.EnumToolHelper;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class RegistryHelper {
	private Random rand = new Random();

	public static RegistryHelper instance()
	{
		return new RegistryHelper();
	}

	public void addExplosiveBlockRecipe(ItemStack block, Block centerBlock)
	{
		GameRegistry.addRecipe(block, new Object[] { "XXX", "XYX", "XXX", Character.valueOf('X'), Blocks.tnt, Character.valueOf('Y'), centerBlock });
	}

	public void addBlockOfMaterial(ItemStack block, Item material)
	{
		GameRegistry.addRecipe(block, new Object[] { "XXX", "XXX", "XXX", Character.valueOf('X'), material });
		GameRegistry.addShapelessRecipe(new ItemStack(material, 9), new Object[] { block });
	}

	public void addToolsCrafting(ItemStack toolMaterial, EnumToolHelper toolType, ItemStack toolOutput, ItemStack toolStick)
	{
		if (toolType == EnumToolHelper.AXE)
		{
			GameRegistry.addRecipe(toolOutput, new Object[] { "XX", "XS", " S", Character.valueOf('X'), toolMaterial, Character.valueOf('S'), toolStick });
			GameRegistry.addRecipe(toolOutput, new Object[] { "XX", "SX", "S ", Character.valueOf('X'), toolMaterial, Character.valueOf('S'), toolStick });
		} else if (toolType == EnumToolHelper.PICKAXE)
		{
			GameRegistry.addRecipe(toolOutput, new Object[] { "XXX", " S ", " S ", Character.valueOf('X'), toolMaterial, Character.valueOf('S'), toolStick });
		} else if (toolType == EnumToolHelper.SPADE)
		{
			GameRegistry.addRecipe(toolOutput, new Object[] { "X", "S", "S", Character.valueOf('X'), toolMaterial, Character.valueOf('S'), toolStick });
		} else if (toolType == EnumToolHelper.HOE)
		{
			GameRegistry.addRecipe(toolOutput, new Object[] { "XX", " S", " S", Character.valueOf('X'), toolMaterial, Character.valueOf('S'), toolStick });
			GameRegistry.addRecipe(toolOutput, new Object[] { "XX", "S ", "S ", Character.valueOf('X'), toolMaterial, Character.valueOf('S'), toolStick });
		} else if (toolType == EnumToolHelper.SWORD)
		{
			GameRegistry.addRecipe(toolOutput, new Object[] { "X", "X", "S", Character.valueOf('X'), toolMaterial, Character.valueOf('S'), toolStick });
		}
	}

	public void addAllToolsCrafting(ItemStack toolMaterial, ItemStack outputAxe, ItemStack outputShovel, ItemStack outputHoe, ItemStack outputPickaxe, ItemStack outputSword, ItemStack toolStick)
	{
		GameRegistry.addRecipe(outputAxe, new Object[] { "XX", "XS", " S", Character.valueOf('X'), toolMaterial, Character.valueOf('S'), toolStick });
		GameRegistry.addRecipe(outputAxe, new Object[] { "XX", "SX", "S ", Character.valueOf('X'), toolMaterial, Character.valueOf('S'), toolStick });
		GameRegistry.addRecipe(outputShovel, new Object[] { "X", "S", "S", Character.valueOf('X'), toolMaterial, Character.valueOf('S'), toolStick });
		GameRegistry.addRecipe(outputHoe, new Object[] { "XX", " S", " S", Character.valueOf('X'), toolMaterial, Character.valueOf('S'), toolStick });
		GameRegistry.addRecipe(outputHoe, new Object[] { "XX", "S ", "S ", Character.valueOf('X'), toolMaterial, Character.valueOf('S'), toolStick });
		GameRegistry.addRecipe(outputPickaxe, new Object[] { "XXX", " S ", " S ", Character.valueOf('X'), toolMaterial, Character.valueOf('S'), toolStick });
		GameRegistry.addRecipe(outputSword, new Object[] { "X", "X", "S", Character.valueOf('X'), toolMaterial, Character.valueOf('S'), toolStick });
	}

	public void addArmorCrafting(ItemStack armorMaterial, EnumArmorHelper armorType, ItemStack output)
	{
		if (armorType == EnumArmorHelper.HELMET)
		{
			GameRegistry.addRecipe(output, new Object[] { "XXX", "X X", Character.valueOf('X'), armorMaterial });
		} else if (armorType == EnumArmorHelper.CHESTPLATE)
		{
			GameRegistry.addRecipe(output, new Object[] { "X X", "XXX", "XXX", Character.valueOf('X'), armorMaterial });
		} else if (armorType == EnumArmorHelper.LEGGINGS)
		{
			GameRegistry.addRecipe(output, new Object[] { "XXX", "X X", "X X", Character.valueOf('X'), armorMaterial });
		} else if (armorType == EnumArmorHelper.BOOTS)
		{
			GameRegistry.addRecipe(output, new Object[] { "X X", "X X", Character.valueOf('X'), armorMaterial });
		}
	}

	public void addAllArmorCrafting(ItemStack armorMaterial, ItemStack outputHelmet, ItemStack outputChestPlate, ItemStack outputLeggings, ItemStack outputBoots)
	{
		GameRegistry.addRecipe(outputHelmet, new Object[] { "XXX", "X X", Character.valueOf('X'), armorMaterial });
		GameRegistry.addRecipe(outputChestPlate, new Object[] { "X X", "XXX", "XXX", Character.valueOf('X'), armorMaterial });
		GameRegistry.addRecipe(outputLeggings, new Object[] { "XXX", "X X", "X X", Character.valueOf('X'), armorMaterial });
		GameRegistry.addRecipe(outputBoots, new Object[] { "X X", "X X", Character.valueOf('X'), armorMaterial });
	}

	public void addSmeltingRecipe(Block input, ItemStack output, float xp)
	{
		GameRegistry.addSmelting(input, output, xp);
	}

	public void addOtherEntity(Class<? extends Entity> entityClass, String entityName, int id, Object mod, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates)
	{
		EntityRegistry.registerModEntity(entityClass, entityName, id, mod, trackingRange, updateFrequency, sendsVelocityUpdates);
	}

	public void addMob(Class<? extends Entity> entityClass, String entityName, int id, Object mod, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates, int backGroundEggColour, int foreGroundEggColour, int weightedProb, int minSpawn, int maxSpawn, EnumCreatureType creatureType)
	{
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, EntityRegistry.findGlobalUniqueEntityId(), backGroundEggColour, foreGroundEggColour);
		EntityRegistry.registerModEntity(entityClass, entityName, id, mod, trackingRange, updateFrequency, sendsVelocityUpdates);
		EntityRegistry.addSpawn(entityName, weightedProb, minSpawn, maxSpawn, creatureType, new BiomeGenBase[0]);
	}

	public void addMob(Class<? extends Entity> entityClass, String entityName, int id, Object mod, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates, int backGroundEggColour, int foreGroundEggColour, int weightedProb, int minSpawn, int maxSpawn, EnumCreatureType creatureType, BiomeGenBase... biome)
	{
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, EntityRegistry.findGlobalUniqueEntityId(), backGroundEggColour, foreGroundEggColour);
		EntityRegistry.registerModEntity(entityClass, entityName, id, mod, trackingRange, updateFrequency, sendsVelocityUpdates);
		EntityRegistry.addSpawn(entityName, weightedProb, minSpawn, maxSpawn, creatureType, biome);
	}

	public void targetEntity(World world, EntityCreature entityHostAttack, Class<? extends EntityLivingBase> classToAttack)
	{
		List list = world.getEntitiesWithinAABB(classToAttack, AxisAlignedBB.getBoundingBox(entityHostAttack.posX, entityHostAttack.posY, entityHostAttack.posZ, entityHostAttack.posX + 1.0D, entityHostAttack.posY + 1.0D, entityHostAttack.posZ + 1.0D).expand(16.0D, 4.0D, 16.0D));

		Entity entityToAttack = (Entity) list.get(rand.nextInt(list.size()));
		if (!list.isEmpty())
		{
			entityHostAttack.setTarget(entityToAttack);
		}
	}

	public boolean entityOnGround(Entity entity)
	{
		return entity.onGround;
	}

	public void removeLoadedEntityList(World world, Entity entityToRemove)
	{
		List list = world.getLoadedEntityList();
		if (!list.isEmpty())
		{
			list.remove(entityToRemove);
		}
	}

	public void setInfiniteHealthToEntity(EntityLivingBase entity)
	{
		entity.setHealth(Float.MAX_VALUE);
	}
}
