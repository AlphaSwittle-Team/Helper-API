package org.sls.helper;

import java.io.File;

import org.sls.helper.common.CommonProxyHelper;
import org.sls.helper.debug.Debugger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLConstructionEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Helper.apiID, name = Helper.apiName, version = Helper.apiVersion)
/**
 * 
 * @author SLS
 *
 */
public class Helper {
	public static final String apiID = "helperAPI";
	public static final String apiName = "Helper API";
	public static final String apiVersion = "v.01B";
	public static final String apiClientProxy = "org.sls.helper.client.ClientProxyHelper";
	public static final String apiCommonProxy = "org.sls.helper.common.CommonProxyHelper";

	@SidedProxy(clientSide = Helper.apiClientProxy, serverSide = Helper.apiCommonProxy)
	public static CommonProxyHelper proxy;

	@Instance(Helper.apiID)
	public static Helper apiInstance;

	@EventHandler
	public void modConstructing(FMLConstructionEvent event)
	{

	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.registerBlockRender();
		proxy.registerItemRender();
		proxy.registerEntityRender();
		Debugger debugger = Debugger.instance();
		debugger.debug(new File("logs/helper-api.log"));
		debugger.log("-----Initializing Helper API " + this.apiVersion + "-----");
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
}
