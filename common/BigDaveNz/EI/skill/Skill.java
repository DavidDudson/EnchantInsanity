package BigDaveNz.EI.skill;

import java.util.HashMap;

import net.minecraft.nbt.NBTTagCompound;

import BigDaveNz.EI.lib.Skills;
import BigDaveNz.EI.skill.player.SkillEfficiency;
import BigDaveNz.EI.skill.player.SkillExcavation;
import BigDaveNz.EI.skill.player.SkillHorticulture;
import BigDaveNz.EI.skill.player.SkillJump;
import BigDaveNz.EI.skill.player.SkillLuck;
import BigDaveNz.EI.skill.player.SkillMining;
import BigDaveNz.EI.skill.player.SkillSpeed;
import BigDaveNz.EI.skill.player.SkillSwimming;
import BigDaveNz.EI.skill.player.SkillUnbreaking;
import BigDaveNz.EI.skill.player.SkillWoodcutting;

public class Skill {
    
    private int currentLevel;
    private int currentXP;
    private float Modifier;
    private HashMap<String, Integer> leaderboard = new HashMap<String, Integer>();
    private int minLevel;
    private int maxLevel;
    private String name;
    
    //Skill definitions into constructor
    
    public static Skill Unbreaking;
    public static Skill Efficiency;
    public static Skill Excavation;
    public static Skill Mining;
    public static Skill Luck;
    public static Skill Woodcutting;
    public static Skill Horticulture;
    public static Skill Jump;
    public static Skill Speed;
    public static Skill Swimming;

    public static void init() {
        
        Skill Unbreaking = (new SkillUnbreaking(Skills.SKILL_UNBREAKING,1,Skills.SKILL_UNBREAKING_MODIFIER));
        Skill Efficiency = (new SkillEfficiency(Skills.SKILL_EFFICIENCY,2,Skills.SKILL_EFFICIENCY_MODIFIER));
        Skill Excavation = (new SkillExcavation(Skills.SKILL_EXCAVATION,3,Skills.SKILL_EXCAVATION_MODIFIER));
        Skill Mining = (new SkillMining(Skills.SKILL_MINING,4,Skills.SKILL_MINING_MODIFIER));
        Skill Luck = (new SkillLuck(Skills.SKILL_LUCK,5,Skills.SKILL_LUCK_MODIFIER));
        Skill Woodcutting = (new SkillWoodcutting(Skills.SKILL_WOODCUTTING,6,Skills.SKILL_WOODCUTTING_MODIFIER));
        Skill Horticulture = (new SkillHorticulture(Skills.SKILL_HORTICULTURE,7,Skills.SKILL_HORTICULTURE_MODIFIER));
        Skill Speed = (new SkillSpeed(Skills.SKILL_SPEED,8,Skills.SKILL_SPEED_MODIFIER));
        Skill Jump = (new SkillJump(Skills.SKILL_JUMP,9,Skills.SKILL_JUMP_MODIFIER));
        Skill Swimming = (new SkillSwimming(Skills.SKILL_SWIMMING,10,Skills.SKILL_SWIMMING_MODIFIER));
    }
    

    
    
    
    
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
