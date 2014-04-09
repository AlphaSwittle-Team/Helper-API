package org.sls.helper.common.registry.maker;

import org.sls.helper.common.entity.EntityHelper;

import net.minecraft.entity.Entity;

public class EntityMaker {

	public static void makeEntity(Class<? extends Entity> entity, String name)
	{
		entity = EntityHelper.createEntity(entity, name);
	}

	public static void makeEntity(Class<? extends Entity> entity, String name, int foreground, int background)
	{
		entity = EntityHelper.createEntity(entity, name, foreground, background);
	}
}
