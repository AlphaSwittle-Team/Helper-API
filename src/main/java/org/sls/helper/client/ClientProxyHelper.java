package org.sls.helper.client;

import org.sls.helper.common.CommonProxyHelper;
import org.sls.helper.debug.Debugger;
import org.sls.helper.debug.Logger;

/**
 * 
 * @author SLS
 * 
 */
public class ClientProxyHelper extends CommonProxyHelper implements Logger {

	public void registerEntityRender()
	{
		super.registerEntityRender();
	}

	public void registerItemRender()
	{
		super.registerItemRender();
	}

	public void registerBlockRender()
	{
		super.registerBlockRender();
	}

	public void log(Debugger debugger)
	{
		debugger.log("-----Initializing client proxy-----");
	}
}
