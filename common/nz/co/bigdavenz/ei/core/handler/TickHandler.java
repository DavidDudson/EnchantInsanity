package nz.co.bigdavenz.ei.core.handler;

import java.util.EnumSet;

import nz.co.bigdavenz.ei.tick.PlayerTickHandler;

import cpw.mods.fml.common.TickType;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class TickHandler {

	public static void init() {
		TickRegistry.registerTickHandler(new PlayerTickHandler(EnumSet.of(TickType.PLAYER)),Side.SERVER);
	}
}
