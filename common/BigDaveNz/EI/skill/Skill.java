package BigDaveNz.EI.skill;

import BigDaveNz.EI.lib.Skills;

public class Skill {
    
    private String name = "default";
    private int minLevel;
    private int maxLevel;
    private int currentLevel;
    private int currentXP;
    private float Modifier;
    
    //Skill definitions into constructor
    
    public static final Skill Unbreaking = (new SkillUnbreaking(Skills.SKILL_UNBREAKING,1));
    
    //skill constructor
    public Skill(String skillName, int SkillID, float Modifier){
        
        this.name  = skillName;
        this.minLevel = Skills.MIN_SKILL_LEVEL;
        this.maxLevel = Skills.MAX_SKILL_LEVEL;
        this.Modifier = 1f;
        this.currentLevel = (int)calculateLevel();
        this.currentXP = 0;
        
    }
    
    public double calculateLevel(){
        return Math.pow(currentXP * Modifier,3);
    }
    
    public int getCurrentLevel(){
        return currentLevel;
    }
        
    public int getCurrentXp(){
        return currentXP;
    }
        
}
