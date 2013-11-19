package nz.co.bigdavenz.ei.skill;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.player.EntityPlayerMP;
import nz.co.bigdavenz.ei.core.handler.EIDebugHandler;
import nz.co.bigdavenz.ei.debug.DebugMessage;
import nz.co.bigdavenz.ei.debug.DebugType;
import nz.co.bigdavenz.ei.lib.Reference;
import nz.co.bigdavenz.ei.player.EIPlayerProperties;

/**
 * @author BigDaveNz
 * 
 */

public class EISkill {

    private String                      skillName  = "error";
    private final int                   currentLevel;
    private int                         minLevel   = 0;
    private double                      modifier   = 1;
    private int                         currentXp  = 0;
    private int                         id         = -1;
    private boolean                     skillEnabled;
    private static int                  nextId     = -2;
    public static ArrayList<EISkill>    skillList  = new ArrayList();
    private static Map<String, Integer> skillIDMap = new HashMap<String, Integer>();
    private static EISkill              newSkill   = new EISkill("error", 0);

    public String getSkillName() {
        return skillName;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public int getId() {
        return id;
    }

    public int getLevel() {
        return (int) Math.pow(currentXp * modifier, 3);
    }

    public int getNextID() {
        nextId++;
        return nextId;
    }

    private EISkill(String skillName, double modifier) {
        this.skillEnabled = true;
        this.skillName = skillName;
        this.minLevel = 0;
        this.modifier = modifier;
        this.currentLevel = getLevel();
        this.currentXp = 1;
        this.id = getNextID();
    }

    public static EISkill createNewSkill(String skillName, double modifier) {
        if (!skillList.contains(skillIDMap)) {
            newSkill = new EISkill(skillName, modifier);
            skillList.add(newSkill.id, newSkill);
            skillIDMap.put(newSkill.skillName, newSkill.id);
        }
        return newSkill;
    }

    public static EISkill getSkillFromMap(String name) {
        EISkill requestedSkill = skillList.get(EISkill.skillIDMap.get(name));
        if (requestedSkill == null) {
            throw new WrongUsageException("Invalid Skill requested", new Object[0]);
        } else {
            return requestedSkill;
        }
    }

    public static Map cloneSkillsMap() {
        Map map = new HashMap(skillIDMap);
        return map;
    }

    public static int amountDisabled() {
        int counter = 0;
        for (EISkill skill : skillList) {
            if (!skill.getEnabled()) {
                counter++;
            }
        }
        return counter;
    }

    public static void addXpToSkill(String skillName, EntityPlayerMP player, int xpGain) {
        EIPlayerProperties props = (EIPlayerProperties) player.getExtendedProperties(Reference.MOD_NAME);
        props.addSkillXP(skillName, xpGain);
        EIDebugHandler.sendDebugInfoToConsole(new DebugMessage("Skill XPGain - Player: " + player.getEntityName() + " Skill: " + skillName + " XP Gain: " + xpGain, DebugType.SKILL));

    }

    public static int getSkillAmount() {
        return skillList.size();
    }

    public double getModifier() {
        return modifier;
    }

    public void setModifier(double newModifier) {
        modifier = newModifier;
    }

    public boolean getEnabled() {
        return skillEnabled;
    }

    /**
     * @param boolean1
     */
    public void setEnabled(boolean newEnabled) {
        skillEnabled = newEnabled;
    }
}
