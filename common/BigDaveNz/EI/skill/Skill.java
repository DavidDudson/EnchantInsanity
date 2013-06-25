package BigDaveNz.EI.skill;

import java.util.HashMap;

import net.minecraft.nbt.NBTTagCompound;

import BigDaveNz.EI.lib.Skills;

public class Skill {
    
    private int currentLevel;
    private int currentXP;
    private float Modifier;
    private HashMap<String, Integer> leaderboard = new HashMap<String, Integer>();
    private int minLevel;
    private int maxLevel;
    private String name;
    
    //Skill definitions into constructor
    
    public static final Skill Unbreaking = (new SkillUnbreaking(Skills.SKILL_UNBREAKING,1,1.00));
    public static final Skill Excavation = (new SkillExcavation(Skills.SKILL_EXCAVATION,1,0.50));
    public static final Skill Mining = (new SkillMining(Skills.SKILL_MINING,1,0.50));
    public static final Skill Luck = (new SkillExcavation(Skills.SKILL_LUCK,1,1));
    
    
    //skill constructor
    public Skill(String skillName, int SkillID, double modifier){
        this.name  = skillName;
        this.minLevel = Skills.MIN_SKILL_LEVEL;
        this.maxLevel = Skills.MAX_SKILL_LEVEL;
        this.Modifier = 1f;
        this.currentLevel = (int)calculateLevel();
        this.currentXP = 0;
        this.leaderboard = getCurrentLeaderboard();
        
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
    
    public HashMap<String, Integer> getCurrentLeaderboard(){
        leaderboard.put("BigDaveNz", getCurrentLevel());
        return leaderboard;
    }
    
    public void writeSkillsToNBT(NBTTagCompound par1NBTTagCompound)
    {
        NBTTagCompound nbttagcompound1 = new NBTTagCompound();
        nbttagcompound1.setInteger("Unbreaking_XP", Unbreaking.currentXP);
        par1NBTTagCompound.setTag("skills", nbttagcompound1);
    }
    
    public void readSkillsFromNBT(NBTTagCompound par1NBTTagCompound){
        
    if (par1NBTTagCompound.hasKey("skills"))
    {
        NBTTagCompound nbttagcompound1 = par1NBTTagCompound.getCompoundTag("skills");
        Unbreaking.currentXP = nbttagcompound1.getInteger("Unbreaking_XP");
        }
    }
}
