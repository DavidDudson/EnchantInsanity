package BigDaveNz.EI.configuration;

import static net.minecraftforge.common.Configuration.CATEGORY_GENERAL;

import java.io.File;

import BigDaveNz.EI.lib.ConfigRef;

import net.minecraftforge.common.Configuration;

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