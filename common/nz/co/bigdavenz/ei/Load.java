/**
 * 
 */
package nz.co.bigdavenz.ei;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import nz.co.bigdavenz.ei.config.ConfigurationHandler;
import nz.co.bigdavenz.ei.core.handler.EIDebugHandler;
import nz.co.bigdavenz.ei.core.handler.EIEventHandler;
import nz.co.bigdavenz.ei.core.handler.TickHandler;
import nz.co.bigdavenz.ei.core.util.EILogger;
import nz.co.bigdavenz.ei.debug.DebugMessage;
import nz.co.bigdavenz.ei.debug.DebugType;
import nz.co.bigdavenz.ei.enchant.Enchant;
import nz.co.bigdavenz.ei.gui.GUI;
import nz.co.bigdavenz.ei.item.ModItems;
import nz.co.bigdavenz.ei.keybind.KeyBind;
import nz.co.bigdavenz.ei.lib.Reference;
import nz.co.bigdavenz.ei.skill.Skill;
import nz.co.bigdavenz.ei.update.Updater;

/**
 * @author BigDaveNz
 * 
 */
public class Load {

    public static String previousVersion = "saved mod version";

    public static void loadEI(FMLPreInitializationEvent event) {
        EIDebugHandler.sendDebugInfoToConsole(new DebugMessage("EI Loading...", DebugType.SERVER));
        if (!(Reference.MOD_VERSION == previousVersion)) {
            
            EILogger.info("EI Found that an update is necissary, old save is version: " + Reference.MOD_VERSION);
            // TODO create version in data save
            switch (previousVersion) {

                case "0.0.1":
                    Updater.serverUpdate("0.0.1");
                    
                default:
                    load(event);
            }    
        }

        else {

            load(event);
        }
    }

    public static void load(FMLPreInitializationEvent event) {

        EILogger.init();
        
        TickHandler.init();
        
        ModItems.init();

        Enchant.init();

        Skill.init();
        
        ConfigurationHandler.init(event);
        
        EIEventHandler.init();

        GUI.init();
        
        KeyBind.init();
    }
}
