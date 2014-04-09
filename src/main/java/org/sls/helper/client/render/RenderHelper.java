package org.sls.helper.client.render;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;

import org.sls.helper.debug.Debugger;
import org.sls.helper.debug.Logger;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * 
 * @author SLS
 * 
 */
public class RenderHelper implements Logger {

	public static RenderHelper instance()
	{
		return new RenderHelper();
	}

	@SideOnly(Side.CLIENT)
	public void addEntityRender(Class<? extends Entity> entityToRender, Render render)
	{
		RenderingRegistry.registerEntityRenderingHandler(entityToRender, render);
	}

	public void log(Debugger debugger)
	{
		debugger.log("-----Initializing render helper-----");
	}
}
