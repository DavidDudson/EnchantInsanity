package BigDaveNz.EI.skill;

import java.util.HashMap;
import java.util.Map;

import BigDaveNz.EI.lib.Skills;

/**
 * @author BigDaveNz
 * 
 */

public class SkillFactory {

    private String skillName;
    private String leaderboard;
    private int currentLevel;
    private int minLevel = 0;
    private double modifier = 1;
    private int currentXp = 0;
    private int id;
    private static int nextId = 0;
    private static Map<String, Skill> skillsMap = new HashMap<String, Skill>();
    private SkillTypeEnum skillType;

    public String getSkillName() {
        return skillName;
    }

    public String getLeaderboard() {
        return leaderboard;
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

    private SkillFactory(String skillName, double modifier,
            SkillTypeEnum skillType) {
        this.skillName = skillName;
        this.minLevel = 0;
        this.modifier = modifier;
        this.currentLevel = getLevel();
        this.currentXp = 1;
        this.leaderboard = generateLeaderboard();
        this.id = getNextID();
        this.skillType = skillType;
    }

    private String generateLeaderboard() {
        return null;
    }

    
     public void createNewSkill(String skillName, double
     modifier,SkillTypeEnum skillType){
     
     //newSkill = this.instance(); return null;
     
     //TODO create function
     }
}
