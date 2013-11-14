package nz.co.bigdavenz.ei.config;

import static net.minecraftforge.common.Configuration.CATEGORY_GENERAL;

import java.io.File;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;
import nz.co.bigdavenz.ei.core.handler.EIDebugHandler;
import nz.co.bigdavenz.ei.debug.DebugMessage;
import nz.co.bigdavenz.ei.debug.DebugType;
import nz.co.bigdavenz.ei.lib.ConfigRef;
import nz.co.bigdavenz.ei.skill.EISkill;

public class ConfigurationHandler {

    public static void init(FMLPreInitializationEvent event) {

        Configuration config = new Configuration(event.getSuggestedConfigurationFile());

        config.load();
        
        EIDebugHandler.sendDebugInfoToConsole(new DebugMessage("Configuration loaded", DebugType.CONFIGURATION));
        
        config.addCustomCategoryComment(ConfigRef.CATEGORY_SKILLS_DISABLED, "Allows you disable a certain skill");
        config.addCustomCategoryComment(ConfigRef.CATEGORY_SKILLS_MODIFIERS, "Allows you alter the amount of XP required for each skill");
        
        for (EISkill skill : EISkill.skillList) {
            
        	Property skillEnabled = config.get(ConfigRef.CATEGORY_SKILLS_DISABLED, skill.getSkillName(), true);
            skill.setEnabled(skillEnabled.getBoolean(true));
            
            Property skillModifier = config.get(ConfigRef.CATEGORY_SKILLS_MODIFIERS, skill.getSkillName(), ConfigRef.DEFAULT_DIFFICULTY_MODIFIER);
            skill.setModifier(skillModifier.getDouble(1.0));
            EIDebugHandler.sendDebugInfoToConsole(new DebugMessage (skill.getSkillName() + ": Config Loaded", DebugType.SKILL));
        }
        
        config.save();
        EIDebugHandler.sendDebugInfoToConsole(new DebugMessage("Configuration Saved", DebugType.CONFIGURATION));
    }
}