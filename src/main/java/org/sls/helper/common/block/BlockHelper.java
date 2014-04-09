package org.sls.helper.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import org.sls.helper.common.resource.ResourceHelper;
import org.sls.helper.debug.Debugger;
import org.sls.helper.debug.Logger;

import cpw.mods.fml.common.registry.GameRegistry;

public abstract class BlockHelper extends Block implements Logger {
	public BlockHelper(Material material, String name, float hardness, float resistance, CreativeTabs tab)
	{
		super(material);
		this.setBlockName(name);
		this.setBlockTextureName(ResourceHelper.instance().getResourcePath() + name);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setCreativeTab(tab);
	}

	public static Block createBlock(Block block, Material material, String name, float hardness, float resistance, CreativeTabs tab)
	{
		block = new BlockCustom(material, name, hardness, resistance, tab);
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
		debugger.log("-----Initializing block helper-----");
	}
}
