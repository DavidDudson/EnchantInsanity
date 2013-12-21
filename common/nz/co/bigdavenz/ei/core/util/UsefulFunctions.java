package nz.co.bigdavenz.ei.core.util;

import net.minecraft.client.Minecraft;
import nz.co.bigdavenz.ei.lib.Reference;
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

    public static float getScaledScreenWidth(){
        return (Minecraft.getMinecraft().displayWidth/1920.0f);
    }

    public static float getScaledScreenHeight(){
        return (Minecraft.getMinecraft().displayHeight/1080.0f);
    }

    public static String getSavedModVersion(){
            return "0.0.1";
        //TODO tie this into NBT
    }
}
