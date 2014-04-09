package org.sls.helper.common.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import org.sls.helper.debug.Debugger;
import org.sls.helper.debug.Logger;

public class BlockCustom extends BlockHelper implements Logger {
	public BlockCustom(Material material, String name, float hardness, float resistance, CreativeTabs tab)
	{
		super(material, name, hardness, resistance, tab);
	}
	
	public void log(Debugger debugger)
	{
		debugger.log("-----Initializing block custom class-----");
	}
}
