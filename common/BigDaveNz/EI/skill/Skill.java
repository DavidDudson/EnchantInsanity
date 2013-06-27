package BigDaveNz.EI.skill;

import java.util.HashMap;

import net.minecraft.nbt.NBTTagCompound;

import BigDaveNz.EI.lib.Skills;
import BigDaveNz.EI.skill.armour.SkillHeavyArmour;
import BigDaveNz.EI.skill.armour.SkillLightArmour;
import BigDaveNz.EI.skill.armour.SkillUnarmoured;
import BigDaveNz.EI.skill.bane.friendly.SkillBaneChicken;
import BigDaveNz.EI.skill.bane.friendly.SkillBaneCow;
import BigDaveNz.EI.skill.bane.friendly.SkillBaneGolem;
import BigDaveNz.EI.skill.bane.friendly.SkillBaneNPC;
import BigDaveNz.EI.skill.bane.friendly.SkillBaneOcelot;
import BigDaveNz.EI.skill.bane.friendly.SkillBanePig;
import BigDaveNz.EI.skill.bane.friendly.SkillBaneSheep;
import BigDaveNz.EI.skill.bane.friendly.SkillBaneSquid;
import BigDaveNz.EI.skill.bane.friendly.SkillBaneWolf;
import BigDaveNz.EI.skill.bane.hostile.SkillBaneBat;
import BigDaveNz.EI.skill.bane.hostile.SkillBaneBlaze;
import BigDaveNz.EI.skill.bane.hostile.SkillBaneEnderman;
import BigDaveNz.EI.skill.bane.hostile.SkillBaneGhast;
import BigDaveNz.EI.skill.bane.hostile.SkillBaneSkeleton;
import BigDaveNz.EI.skill.bane.hostile.SkillBaneSlime;
import BigDaveNz.EI.skill.bane.hostile.SkillBaneSpider;
import BigDaveNz.EI.skill.bane.hostile.SkillBaneWither;
import BigDaveNz.EI.skill.bane.hostile.SkillBaneZombie;
import BigDaveNz.EI.skill.player.SkillBane;
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
import BigDaveNz.EI.skill.tool.SkillAxe;
import BigDaveNz.EI.skill.tool.SkillHoe;
import BigDaveNz.EI.skill.tool.SkillPickaxe;
import BigDaveNz.EI.skill.tool.SkillShears;
import BigDaveNz.EI.skill.tool.SkillShovel;
import BigDaveNz.EI.skill.weapon.SkillBattleAxe;
import BigDaveNz.EI.skill.weapon.SkillBow;
import BigDaveNz.EI.skill.weapon.SkillFist;
import BigDaveNz.EI.skill.weapon.SkillSword;

public class Skill {
    
    private int currentLevel;
    private int currentXP;
    private float Modifier;
    private HashMap<String, Integer> leaderboard = new HashMap<String, Integer>();
    private int minLevel;
    private int maxLevel;
    private String name;
    

    
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

    //Skill load method
    @SuppressWarnings("unused")
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
        Skill Bane = (new SkillBane(Skills.SKILL_BANE,10,Skills.SKILL_BANE_MODIFIER));
        
        Skill Pickaxe = (new SkillPickaxe(Skills.SKILL_PICKAXE,11,Skills.SKILL_PICKAXE_MODIFIER));
        Skill Shovel = (new SkillShovel(Skills.SKILL_SHOVEL,12,Skills.SKILL_SHOVEL_MODIFIER));
        Skill Axe = (new SkillAxe(Skills.SKILL_AXE,13,Skills.SKILL_AXE_MODIFIER));
        Skill Hoe = (new SkillHoe(Skills.SKILL_HOE,14,Skills.SKILL_HOE_MODIFIER));
        Skill Shears = (new SkillShears(Skills.SKILL_SHEARS,15,Skills.SKILL_SHEARS_MODIFIER));
        
        Skill Sword = (new SkillSword(Skills.SKILL_SWORD,16,Skills.SKILL_SWORD_MODIFIER));
        Skill BattleAxe = (new SkillBattleAxe(Skills.SKILL_BATTLEAXE,17,Skills.SKILL_BATTLEAXE_MODIFIER));
        Skill Bow = (new SkillBow(Skills.SKILL_BOW,18,Skills.SKILL_BOW_MODIFIER));
        Skill Fist = (new SkillFist(Skills.SKILL_FIST,19,Skills.SKILL_FIST_MODIFIER));
        
        Skill Unarmoured = (new SkillUnarmoured(Skills.SKILL_UNARMOURED,20,Skills.SKILL_UNARMOURED_MODIFIER));
        Skill LightArmour = (new SkillLightArmour(Skills.SKILL_LIGHTARMOUR,21,Skills.SKILL_LIGHTARMOUR_MODIFIER));
        Skill HeavyArmour = (new SkillHeavyArmour(Skills.SKILL_HEAVYARMOUR,22,Skills.SKILL_HEAVYARMOUR_MODIFIER));
        
        Skill BaneSkeleton = (new SkillBaneSkeleton(Skills.SKILL_BANE_SKELETON,23,Skills.SKILL_BANE_SKELETON_MODIFIER));
        Skill BaneZombie = (new SkillBaneZombie(Skills.SKILL_BANE_ZOMBIE,24,Skills.SKILL_BANE_ZOMBIE_MODIFIER));
        Skill BaneGhast = (new SkillBaneGhast(Skills.SKILL_BANE_GHAST,25,Skills.SKILL_BANE_GHAST_MODIFIER));
        Skill BaneSpider = (new SkillBaneSpider(Skills.SKILL_BANE_SPIDER,26,Skills.SKILL_BANE_SPIDER_MODIFIER));
        Skill BaneSlime = (new SkillBaneSlime(Skills.SKILL_BANE_SLIME,27,Skills.SKILL_BANE_SLIME_MODIFIER));
        Skill BaneBlaze = (new SkillBaneBlaze(Skills.SKILL_BANE_BLAZE,28,Skills.SKILL_BANE_BLAZE_MODIFIER));        
        Skill BaneBat = (new SkillBaneBat(Skills.SKILL_BANE_BAT,29,Skills.SKILL_BANE_BAT_MODIFIER));
        Skill BaneWither = (new SkillBaneWither(Skills.SKILL_BANE_WITHER,30,Skills.SKILL_BANE_WITHER_MODIFIER));
        Skill BaneEnderman = (new SkillBaneEnderman(Skills.SKILL_BANE_ENDERMAN,31,Skills.SKILL_BANE_ENDERMAN_MODIFIER));
        
        Skill BaneSheep = (new SkillBaneSheep(Skills.SKILL_BANE_SHEEP,32,Skills.SKILL_BANE_SHEEP_MODIFIER));
        Skill BanePig = (new SkillBanePig(Skills.SKILL_BANE_PIG,33,Skills.SKILL_BANE_PIG_MODIFIER));
        Skill BaneCow = (new SkillBaneCow(Skills.SKILL_BANE_COW,34,Skills.SKILL_BANE_COW_MODIFIER));
        Skill BaneOcelot = (new SkillBaneOcelot(Skills.SKILL_BANE_OCELOT,35,Skills.SKILL_BANE_OCELOT_MODIFIER));
        Skill BaneWolf = (new SkillBaneWolf(Skills.SKILL_BANE_WOLF,36,Skills.SKILL_BANE_WOLF_MODIFIER));
        Skill BaneChicken = (new SkillBaneChicken(Skills.SKILL_BANE_CHICKEN,37,Skills.SKILL_BANE_CHICKEN_MODIFIER));
        Skill BaneGolem = (new SkillBaneGolem(Skills.SKILL_BANE_GOLEM,38,Skills.SKILL_BANE_GOLEM_MODIFIER));
        Skill BaneNPC = (new SkillBaneNPC(Skills.SKILL_BANE_NPC,39,Skills.SKILL_BANE_NPC_MODIFIER));
        Skill BaneSquid = (new SkillBaneSquid(Skills.SKILL_BANE_SQUID,40,Skills.SKILL_BANE_SQUID_MODIFIER));
        
        
    }

    //skill constructor
    public Skill(String skillName, int SkillID, double modifier){
        this.name  = skillName;
        this.minLevel = Skills.MIN_SKILL_LEVEL;
        this.Modifier = 1f;
        this.currentLevel = (int)calculateLevel();
        this.currentXP = 1;
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
