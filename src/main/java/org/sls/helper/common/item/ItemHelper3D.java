package org.sls.helper.common.item;

import net.minecraft.creativetab.CreativeTabs;

public abstract class ItemHelper3D extends ItemHelper {
	public ItemHelper3D(String name, CreativeTabs tab, boolean is3D)
	{
		super(name, tab);
		this.bFull3D = is3D;
	}
}