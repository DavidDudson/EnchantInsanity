package BigDaveNz.EI.skill;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.command.WrongUsageException;
import net.minecraft.nbt.NBTTagCompound;

import BigDaveNz.EI.lib.Commands;
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
    private int ID;
    private int nextID;
    public static Map<String, Skill> skillsMap = new HashMap<String, Skill>();
    
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
        
        Skill Unbreaking = (new SkillUnbreaking(Skills.SKILL_UNBREAKING,Skills.SKILL_UNBREAKING_MODIFIER));
        Skill Efficiency = (new SkillEfficiency(Skills.SKILL_EFFICIENCY,Skills.SKILL_EFFICIENCY_MODIFIER));
        Skill Excavation = (new SkillExcavation(Skills.SKILL_EXCAVATION,Skills.SKILL_EXCAVATION_MODIFIER));
        Skill Mining = (new SkillMining(Skills.SKILL_MINING,Skills.SKILL_MINING_MODIFIER));
        Skill Luck = (new SkillLuck(Skills.SKILL_LUCK,Skills.SKILL_LUCK_MODIFIER));
        Skill Woodcutting = (new SkillWoodcutting(Skills.SKILL_WOODCUTTING,Skills.SKILL_WOODCUTTING_MODIFIER));
        Skill Horticulture = (new SkillHorticulture(Skills.SKILL_HORTICULTURE,Skills.SKILL_HORTICULTURE_MODIFIER));
        Skill Speed = (new SkillSpeed(Skills.SKILL_SPEED,Skills.SKILL_SPEED_MODIFIER));
        Skill Jump = (new SkillJump(Skills.SKILL_JUMP,Skills.SKILL_JUMP_MODIFIER));
        Skill Swimming = (new SkillSwimming(Skills.SKILL_SWIMMING,Skills.SKILL_SWIMMING_MODIFIER));
        Skill Bane = (new SkillBane(Skills.SKILL_BANE,Skills.SKILL_BANE_MODIFIER));
        
        Skill Pickaxe = (new SkillPickaxe(Skills.SKILL_PICKAXE,Skills.SKILL_PICKAXE_MODIFIER));
        Skill Shovel = (new SkillShovel(Skills.SKILL_SHOVEL,Skills.SKILL_SHOVEL_MODIFIER));
        Skill Axe = (new SkillAxe(Skills.SKILL_AXE,Skills.SKILL_AXE_MODIFIER));
        Skill Hoe = (new SkillHoe(Skills.SKILL_HOE,Skills.SKILL_HOE_MODIFIER));
        Skill Shears = (new SkillShears(Skills.SKILL_SHEARS,Skills.SKILL_SHEARS_MODIFIER));
        
        Skill Sword = (new SkillSword(Skills.SKILL_SWORD,Skills.SKILL_SWORD_MODIFIER));
        Skill BattleAxe = (new SkillBattleAxe(Skills.SKILL_BATTLEAXE,Skills.SKILL_BATTLEAXE_MODIFIER));
        Skill Bow = (new SkillBow(Skills.SKILL_BOW,Skills.SKILL_BOW_MODIFIER));
        Skill Fist = (new SkillFist(Skills.SKILL_FIST,Skills.SKILL_FIST_MODIFIER));
        
        Skill Unarmoured = (new SkillUnarmoured(Skills.SKILL_UNARMOURED,Skills.SKILL_UNARMOURED_MODIFIER));
        Skill LightArmour = (new SkillLightArmour(Skills.SKILL_LIGHTARMOUR,Skills.SKILL_LIGHTARMOUR_MODIFIER));
        Skill HeavyArmour = (new SkillHeavyArmour(Skills.SKILL_HEAVYARMOUR,Skills.SKILL_HEAVYARMOUR_MODIFIER));
        
        Skill BaneSkeleton = (new SkillBaneSkeleton(Skills.SKILL_BANE_SKELETON,Skills.SKILL_BANE_SKELETON_MODIFIER));
        Skill BaneZombie = (new SkillBaneZombie(Skills.SKILL_BANE_ZOMBIE,Skills.SKILL_BANE_ZOMBIE_MODIFIER));
        Skill BaneGhast = (new SkillBaneGhast(Skills.SKILL_BANE_GHAST,Skills.SKILL_BANE_GHAST_MODIFIER));
        Skill BaneSpider = (new SkillBaneSpider(Skills.SKILL_BANE_SPIDER,Skills.SKILL_BANE_SPIDER_MODIFIER));
        Skill BaneSlime = (new SkillBaneSlime(Skills.SKILL_BANE_SLIME,Skills.SKILL_BANE_SLIME_MODIFIER));
        Skill BaneBlaze = (new SkillBaneBlaze(Skills.SKILL_BANE_BLAZE,Skills.SKILL_BANE_BLAZE_MODIFIER));        
        Skill BaneBat = (new SkillBaneBat(Skills.SKILL_BANE_BAT,Skills.SKILL_BANE_BAT_MODIFIER));
        Skill BaneWither = (new SkillBaneWither(Skills.SKILL_BANE_WITHER,Skills.SKILL_BANE_WITHER_MODIFIER));
        Skill BaneEnderman = (new SkillBaneEnderman(Skills.SKILL_BANE_ENDERMAN,Skills.SKILL_BANE_ENDERMAN_MODIFIER));
        
        Skill BaneSheep = (new SkillBaneSheep(Skills.SKILL_BANE_SHEEP,Skills.SKILL_BANE_SHEEP_MODIFIER));
        Skill BanePig = (new SkillBanePig(Skills.SKILL_BANE_PIG,Skills.SKILL_BANE_PIG_MODIFIER));
        Skill BaneCow = (new SkillBaneCow(Skills.SKILL_BANE_COW,Skills.SKILL_BANE_COW_MODIFIER));
        Skill BaneOcelot = (new SkillBaneOcelot(Skills.SKILL_BANE_OCELOT,Skills.SKILL_BANE_OCELOT_MODIFIER));
        Skill BaneWolf = (new SkillBaneWolf(Skills.SKILL_BANE_WOLF,Skills.SKILL_BANE_WOLF_MODIFIER));
        Skill BaneChicken = (new SkillBaneChicken(Skills.SKILL_BANE_CHICKEN,Skills.SKILL_BANE_CHICKEN_MODIFIER));
        Skill BaneGolem = (new SkillBaneGolem(Skills.SKILL_BANE_GOLEM,Skills.SKILL_BANE_GOLEM_MODIFIER));
        Skill BaneNPC = (new SkillBaneNPC(Skills.SKILL_BANE_NPC,Skills.SKILL_BANE_NPC_MODIFIER));
        Skill BaneSquid = (new SkillBaneSquid(Skills.SKILL_BANE_SQUID,Skills.SKILL_BANE_SQUID_MODIFIER));
        
        
    }

    //skill constructor
    public Skill(String skillName, double modifier){
        this.setName(skillName);
        this.minLevel = Skills.MIN_SKILL_LEVEL;
        this.Modifier = 1f;
        this.currentLevel = (int)calculateLevel();
        this.currentXP = 1;
        this.leaderboard = getCurrentLeaderboard();
        this.ID = getNextID();
    }
    public double calculateLevel(){
        return Math.pow(currentXP * Modifier,3);
    }

    public int getCurrentXP() {
        return currentXP;
    }
    public int getCurrentLevel(){
        return currentLevel;
    }
    
    public HashMap<String, Integer> getCurrentLeaderboard()
    {
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
    
    public int getNextID(){
        nextID += 1;
        return nextID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void mapSkills() {
        skillsMap.put(Speed.getName(), Speed);
        skillsMap.put(Unbreaking.getName(), Unbreaking);
        skillsMap.put(Efficiency.getName(), Efficiency);
        skillsMap.put(Excavation.getName(), Excavation);
        skillsMap.put(Mining.getName(), Mining);
        skillsMap.put(Luck.getName(), Luck);
        //TODO add all skills
    }

    public static Skill getSkillFromName(String Name)
    {
        Skill skill = Skill.skillsMap.get(Name);
        {
            if(skill == null)
            {
                throw new WrongUsageException("Invalid ", new Object[0]);
            }
            else
            {
                return skill;
            }

        }
    }

}
