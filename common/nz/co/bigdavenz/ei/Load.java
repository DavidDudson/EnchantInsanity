/**
 * 
 */
package nz.co.bigdavenz.ei;

import nz.co.bigdavenz.ei.core.handler.EIEventHandler;
import nz.co.bigdavenz.ei.core.util.EILogger;
import nz.co.bigdavenz.ei.enchant.Enchant;
import nz.co.bigdavenz.ei.item.ModItems;
import nz.co.bigdavenz.ei.lib.Reference;
import nz.co.bigdavenz.ei.skill.Skill;
import nz.co.bigdavenz.ei.update.Updater;

/**
 * @author BigDaveNz
 * 
 */
public class Load {

    private static String previousVersion = "saved mod version";

    public static void loadEI() {
        if (!(Reference.MOD_VERSION == previousVersion )) {
            // TODO create version in data save
            switch (previousVersion) {

                case "0.0.1":
                    Updater.serverUpdate("0.0.1");

            }

        }

        else {
            ModItems.init();

            Enchant.init();

            EILogger.init();

            EIEventHandler.init();

            Skill.init();
        }
    }
}
