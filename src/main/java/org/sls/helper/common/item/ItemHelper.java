package org.sls.helper.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import org.sls.helper.common.resource.ResourceHelper;

import cpw.mods.fml.common.registry.GameRegistry;

public abstract class ItemHelper extends Item {
	public ItemHelper(String name, CreativeTabs tab)
	{
		this.setUnlocalizedName(name);
		this.setTextureName(ResourceHelper.instance().getResourcePath() + name);
		this.setCreativeTab(tab);
	}

	public static Item createItem(Item item, String name, CreativeTabs tab)
	{
		item = new Item();
		item.setUnlocalizedName(name);
		item.setTextureName(ResourceHelper.instance().getResourcePath() + name);
		item.setCreativeTab(tab);
		GameRegistry.registerItem(item, name);
		return item;
	}
}
