package org.sls.helper.common.resource;

public class ResourceHelper {
	private String resourcePath;

	public static ResourceHelper instance()
	{
		return new ResourceHelper();
	}

	public String getResourcePath()
	{
		return resourcePath;
	}

	public void setResourcePath(String resourcePath)
	{
		this.resourcePath = resourcePath;
	}
}