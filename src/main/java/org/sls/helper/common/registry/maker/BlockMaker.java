package org.sls.helper.common.registry.maker;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import org.sls.helper.common.block.BlockHelper;
import org.sls.helper.common.block.ExplosiveBlockHelper;

public class BlockMaker {
	public static void makeBlock(Block block, Material material, String name, float hardness, float resistance, CreativeTabs tab)
	{
		block = BlockHelper.createBlock(block, material, name, hardness, resistance, tab);
	}

	public static void makeExplosiveBlock(Block block, Material material, String name, float hardness, float resistance, CreativeTabs tab, int explosionRadius)
	{
		block = ExplosiveBlockHelper.createExplosiveBlock(block, material, name, hardness, resistance, tab, explosionRadius);
	}
}
