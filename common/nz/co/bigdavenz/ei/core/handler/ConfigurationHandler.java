package nz.co.bigdavenz.ei.core.handler;

import static net.minecraftforge.common.Configuration.CATEGORY_GENERAL;

import java.io.File;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;
import nz.co.bigdavenz.ei.debug.DebugMessage;
import nz.co.bigdavenz.ei.debug.DebugType;
import nz.co.bigdavenz.ei.lib.ConfigRef;
import nz.co.bigdavenz.ei.skill.EISkill;

public class ConfigurationHandler {

    public static Configuration configuration;

    public static void init(FMLPreInitializationEvent event) {

        configuration = new Configuration(event.getSuggestedConfigurationFile());

        configuration.load();
        
        for (EISkill skill : EISkill.skillList) {
            Property modifierProperty = configuration.get(ConfigRef.CATEGORY_SKILLS_MODIFIERS, skill.getSkillName() + " ", skill.getModifier());
            Property disabledProperty = configuration.get(ConfigRef.CATEGORY_SKILLS_DISABLED, skill.getSkillName() + " is enabled ", skill.getEnabled());
            skill.setModifier(modifierProperty.getDouble(skill.getModifier()));
            skill.setEnabled(disabledProperty.getBoolean(true));
        }
        configuration.addCustomCategoryComment(ConfigRef.CATEGORY_SKILLS_MODIFIERS, "Allows you to alter the rate at which Xp is gathered for a certain skill");
        configuration.addCustomCategoryComment(ConfigRef.CATEGORY_SKILLS_MODIFIERS, "Allows you disable a certain skill");
        
        configuration.save();
        EIDebugHandler.sendDebugInfoToConsole(new DebugMessage("Config's Initialized", DebugType.CONFIGURATION));
    }
}