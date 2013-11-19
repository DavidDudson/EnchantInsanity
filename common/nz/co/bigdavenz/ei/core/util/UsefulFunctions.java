package nz.co.bigdavenz.ei.core.util;

import nz.co.bigdavenz.ei.logger.VanillaEILogger;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;

public class UsefulFunctions {

    public static Boolean isServer() {
        Side side = FMLCommonHandler.instance().getEffectiveSide();
        if (side == Side.SERVER) {
            return true;
        } else if (side == Side.CLIENT) {
            return false;
        } else {
            VanillaEILogger.warning("Server returned no side!");
        }
        return null;

    }

}
