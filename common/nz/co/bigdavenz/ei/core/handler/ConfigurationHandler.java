package nz.co.bigdavenz.ei.core.handler;

import static net.minecraftforge.common.Configuration.CATEGORY_GENERAL;

import java.io.File;


import net.minecraftforge.common.Configuration;
import nz.co.bigdavenz.ei.configuration.ConfigurationSettings;
import nz.co.bigdavenz.ei.lib.ConfigRef;

public class ConfigurationHandler {

    public static Configuration configuration;

    public static void init(File configFile) {

        configuration = new Configuration(configFile);

        try {
            configuration.load();

            ConfigurationSettings.DIFFICULTY_MODIFIER = configuration.get(
                    CATEGORY_GENERAL, ConfigRef.DIFFICULTY_MODIFIER_CONFIGNAME,
                    ConfigRef.DEFAULT_DIFFICULTY_MODIFIER).getDouble(
                    ConfigRef.DEFAULT_DIFFICULTY_MODIFIER);
        } finally {
            configuration.save();
        }
    }
}