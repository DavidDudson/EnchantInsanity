/**
 * 
 */
package nz.co.bigdavenz.ei;

import nz.co.bigdavenz.ei.block.EIBlock;
import nz.co.bigdavenz.ei.client.gui.GUI;
import nz.co.bigdavenz.ei.client.keybind.KeyBind;
import nz.co.bigdavenz.ei.client.render.EIFont;
import nz.co.bigdavenz.ei.config.ConfigurationHandler;
import nz.co.bigdavenz.ei.core.handler.EIDebugHandler;
import nz.co.bigdavenz.ei.core.handler.EIEventHandler;
import nz.co.bigdavenz.ei.core.handler.TickHandler;
import nz.co.bigdavenz.ei.core.registry.EIGameRegistry;
import nz.co.bigdavenz.ei.core.registry.EILanguageRegistry;
import nz.co.bigdavenz.ei.core.util.UsefulFunctions;
import nz.co.bigdavenz.ei.crafting.EIRecipeHandler;
import nz.co.bigdavenz.ei.debug.DebugMessage;
import nz.co.bigdavenz.ei.debug.DebugType;
import nz.co.bigdavenz.ei.enchant.Enchant;
import nz.co.bigdavenz.ei.item.ModItems;
import nz.co.bigdavenz.ei.lib.Reference;
import nz.co.bigdavenz.ei.logger.VanillaEILogger;
import nz.co.bigdavenz.ei.skill.Skill;
import nz.co.bigdavenz.ei.update.Updater;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * @author BigDaveNz
 * 
 */
public class Load {

    public static String previousVersion = UsefulFunctions.getSavedModVersion();

    public static void loadEI(FMLPreInitializationEvent event) {
        EIDebugHandler.sendDebugInfoToConsole(new DebugMessage("EI Loading...", DebugType.SERVER));
        if (!(Reference.MOD_VERSION.equalsIgnoreCase(previousVersion))) {

            VanillaEILogger.info("EI Found that an update is necessary, old save is version: " + Reference.MOD_VERSION);
            Updater.serverUpdate(previousVersion) ;
        }
        load(event);
    }

    public static void load(FMLPreInitializationEvent event) {

        VanillaEILogger.init();

        TickHandler.init();

        ModItems.init();

        EIBlock.init();

        EIRecipeHandler.init();

        Enchant.init();

        Skill.init();

        ConfigurationHandler.init(event);

        EIEventHandler.init();

        EIGameRegistry.init();

        EILanguageRegistry.init();

        if (!UsefulFunctions.isServer()) {

            GUI.init();

            KeyBind.init();

            EIFont.init();
        }
    }
}
