package org.sls.helper.common.item.armor;

import org.sls.helper.common.resource.ResourceHelper;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;

public abstract class ArmorHelper extends ItemArmor {
	public ArmorHelper(ArmorMaterial material, int slot, int type, String name, CreativeTabs tab)
	{
		super(material, slot, type);
		this.setUnlocalizedName(name);
		this.setTextureName(ResourceHelper.instance().getResourcePath() + name);
		this.setCreativeTab(tab);
	}
}
