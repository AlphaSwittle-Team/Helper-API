package org.sls.helper.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.world.World;

import org.sls.helper.common.resource.ResourceHelper;
import org.sls.helper.debug.Debugger;
import org.sls.helper.debug.Logger;

import cpw.mods.fml.common.registry.GameRegistry;

public class ExplosiveBlockHelper extends BlockHelper implements Logger {
	protected int explosionRadius = 0;

	public ExplosiveBlockHelper(Material material, String name, float hardness, float resistance, CreativeTabs tab, int explosionRadius)
	{
		super(material, name, hardness, resistance, tab);
		this.explosionRadius = explosionRadius;
	}

	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int radius)
	{
		super.onBlockDestroyedByPlayer(world, x, y, z, radius);
		if (!world.isRemote)
		{
			world.createExplosion(new EntityTNTPrimed(world), x, y, z, explosionRadius, true);
		}
	}

	public int getExplosionRadius()
	{
		return explosionRadius;
	}

	public void setExplosionRadius(int explosionRadius)
	{
		this.explosionRadius = explosionRadius;
	}

	public static Block createExplosiveBlock(Block block, Material material, String name, float hardness, float resistance, CreativeTabs tab, int explosionRadius)
	{
		block = new ExplosiveBlockHelper(material, name, hardness, resistance, tab, explosionRadius);
		block.setBlockName(name);
		block.setBlockTextureName(ResourceHelper.instance().getResourcePath() + name);
		block.setHardness(hardness);
		block.setResistance(resistance);
		block.setCreativeTab(tab);
		GameRegistry.registerBlock(block, name);
		return block;
	}
	
	public void log(Debugger debugger)
	{
		debugger.log("-----Initializing explosive block helper-----");
	}
}
