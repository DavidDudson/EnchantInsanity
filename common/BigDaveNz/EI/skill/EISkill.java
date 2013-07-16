package BigDaveNz.EI.skill;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.player.EntityPlayer;

import BigDaveNz.EI.core.handler.EIDebugHandler;
import BigDaveNz.EI.leaderboard.GlobalLeaderboard;
import BigDaveNz.EI.lib.SkillModifiers;

/**
 * @author BigDaveNz
 * 
 */

public class EISkill {

    private String                      skillName;
    private int                         currentLevel;
    private int                         minLevel  = 0;
    private double                      modifier  = 1;
    private int                         currentXp = 0;
    private int                         id;
    private static int                  nextId    = -1;
    private static ArrayList<String>    skillList = new ArrayList();
    private static Map<String, EISkill> skillsMap = new HashMap<String, EISkill>();
    private SkillTypeEnum               skillType;

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

    public SkillTypeEnum getSkillType() {
        return skillType;
    }

    private EISkill(String skillName, double modifier, SkillTypeEnum skillType) {
        this.skillName = skillName;
        this.minLevel = 0;
        this.modifier = modifier;
        this.currentLevel = getLevel();
        this.currentXp = 1;
        this.id = getNextID();
        this.skillType = skillType;
    }

    public static EISkill createNewSkill(String skillName, double modifier, SkillTypeEnum skillType) {

        EISkill newSkill = new EISkill(skillName, modifier, skillType);
        addskillToMap(skillName, newSkill);
        EIDebugHandler.sendDebugInfoToConsole("New Skill: " + skillName + " with ID: " + newSkill.getId());
        return newSkill;
    }

    private static void addskillToMap(String skillName, EISkill skill) {
        if (!skillList.contains(skillName)) {
            skillList.add(skillName);
            skillsMap.put(skillName, skill);
        }
    }

    public static EISkill getSkillFromMap(String name) {

        EISkill requestedSkill = EISkill.skillsMap.get(name);
        if (requestedSkill == null) {
            throw new WrongUsageException("Invalid Skill requested", new Object[0]);
        }
        else {
            return requestedSkill;
        }
    }

    public static Map cloneSkillsMap() {
        Map map = new HashMap(skillsMap);
        return map;
    }

    public static void addXpToSkill(String skillName, String playerName, int amount) {
        // ;
        // skill.currentXp += amount;
    }

    public static int getSkillAmount() {
        return skillList.size();
    }
}
