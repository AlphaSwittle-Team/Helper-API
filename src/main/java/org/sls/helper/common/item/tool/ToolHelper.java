package org.sls.helper.common.item.tool;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;

import org.sls.helper.common.item.ItemHelper;
import org.sls.helper.common.resource.ResourceHelper;

public abstract class ToolHelper extends ItemHelper {
	public ToolHelper(String name, CreativeTabs tab)
	{
		super(name, tab);
	}

	public static class AxeHelper extends ItemAxe {
		public AxeHelper(ToolMaterial material, String name, CreativeTabs tab)
		{
			super(material);
			this.setUnlocalizedName(name);
			this.setTextureName(ResourceHelper.instance().getResourcePath() + name);
			this.setCreativeTab(tab);
		}
	}

	public static class PickaxeHelper extends ItemPickaxe {
		public PickaxeHelper(ToolMaterial material, String name, CreativeTabs tab)
		{
			super(material);
			this.setUnlocalizedName(name);
			this.setTextureName(ResourceHelper.instance().getResourcePath() + name);
			this.setCreativeTab(tab);
		}
	}

	public static class SpadeHelper extends ItemSpade {
		public SpadeHelper(ToolMaterial material, String name, CreativeTabs tab)
		{
			super(material);
			this.setUnlocalizedName(name);
			this.setTextureName(ResourceHelper.instance().getResourcePath() + name);
			this.setCreativeTab(tab);
		}
	}

	public static class HoeHelper extends ItemHoe {
		public HoeHelper(ToolMaterial material, String name, CreativeTabs tab)
		{
			super(material);
			this.setUnlocalizedName(name);
			this.setTextureName(ResourceHelper.instance().getResourcePath() + name);
			this.setCreativeTab(tab);
		}
	}

	public static class SwordHelper extends ItemSword {
		public SwordHelper(ToolMaterial material, String name, CreativeTabs tab)
		{
			super(material);
			this.setUnlocalizedName(name);
			this.setTextureName(ResourceHelper.instance().getResourcePath() + name);
			this.setCreativeTab(tab);
		}
	}
}
