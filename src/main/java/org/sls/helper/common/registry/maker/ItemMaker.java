package org.sls.helper.common.registry.maker;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import org.sls.helper.common.block.BlockHelper;
import org.sls.helper.common.item.ItemHelper;

public class ItemMaker {
	public static void makeItem(Item item, String name, CreativeTabs tab)
	{
		item = ItemHelper.createItem(item, name, tab);
	}
}
