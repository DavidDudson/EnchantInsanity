package BigDaveNz.EI.lib;

public class Skills {
    
    /**
    Enchant Insantiy

    Created by BigDaveNz

    Reference File for EI Skill related constants
    */
    
    //General constants
    public final static int MAX_SKILL_LEVEL = 100;
    public final static int MIN_SKILL_LEVEL = 0;
    
    //Player Skill Names
    public final static String SKILL_UNBREAKING = "Unbreaking";
    public final static String SKILL_EFFICIENCY = "Efficiency";
    public final static String SKILL_EXCAVATION = "Excavation";
    public final static String SKILL_MINING = "Mining";
    public final static String SKILL_LUCK = "Fortune";
    public final static String SKILL_WOODCUTTING = "Lumberjack";
    public final static String SKILL_HORTICULTURE = "Horticulture";
    public final static String SKILL_SPEED = "Fleet of Foot";
    public final static String SKILL_JUMP = "Leap";
    public final static String SKILL_SWIMMING = "Smimming";
    public final static String SKILL_BANE = "Bane";
    
    //Tool Skill Names
    
    public final static String SKILL_PICKAXE = "Pickaxe";
    public final static String SKILL_SHOVEL = "Shovel";
    public final static String SKILL_AXE = "Axe";
    public final static String SKILL_HOE = "Hoe";
    public final static String SKILL_SHEARS = "Shears";
    
    //Weapon Skill Names
    
    public final static String SKILL_SWORD = "Swordsmanship";
    public final static String SKILL_BATTLEAXE = "BattleAxe";
    public final static String SKILL_BOW = "Marksmanship";
    public final static String SKILL_FIST = "Fists";
    
    //Armour Skill Names
    
    public final static String SKILL_UNARMOURED = "Unarmoured";
    public final static String SKILL_LIGHTARMOUR = "Light Armour";
    public final static String SKILL_HEAVYARMOUR = "Heavy Armour";
    
    //Entity Skill Names - Hostile
    
    public final static String SKILL_BANE_SKELETON = "Bane of Skeletons";
    public final static String SKILL_BANE_ZOMBIE = "Bane of Zombies";
    public final static String SKILL_BANE_WITHER = "Bane of Wither";
    public final static String SKILL_BANE_SPIDER = "Bane of Spider";
    public final static String SKILL_BANE_SLIME = "Bane of Slime";
    public final static String SKILL_BANE_BAT = "Bane of Bat";
    public final static String SKILL_BANE_BLAZE = "Bane of Blaze";
    public final static String SKILL_BANE_ENDERMAN = "Bane of Enderman";
    
    //Entity Skill Names - Friendly
    
    public final static String SKILL_BANE_SHEEP = "Bane of Sheep";
    public final static String SKILL_BANE_PIG = "Bane of Pig";
    public final static String SKILL_BANE_COW = "Bane of Cow";
    public final static String SKILL_BANE_SQUID = "Bane of Squid";
    public final static String SKILL_BANE_CHICKEN = "Bane of Chicken";
    public final static String SKILL_BANE_WOlf = "Bane of Wolf";
    public final static String SKILL_BANE_OCELOT = "Bane of Ocelot";
    public final static String SKILL_BANE_PEOPLE = "Bane of Testificate";
    public final static String SKILL_BANE_GOLEM = "Bane of Golem";
    
    //Player Skill Modifiers
    public final static double SKILL_UNBREAKING_MODIFIER = 1;
    public final static double SKILL_EFFICIENCY_MODIFIER = 1;
    public final static double SKILL_EXCAVATION_MODIFIER = 0.5;
    public final static double SKILL_MINING_MODIFIER = 0.5;
    public final static double SKILL_LUCK_MODIFIER = 1;
    public final static double SKILL_WOODCUTTING_MODIFIER = 0.4;
    public final static double SKILL_HORTICULTURE_MODIFIER = 0.2;
    public final static double SKILL_SPEED_MODIFIER = 2;
    public final static double SKILL_JUMP_MODIFIER = 0.2;
    public final static double SKILL_SWIMMING_MODIFIER = 0.02;
    
    //Tool Skill Modifiers
    
    public final static double SKILL_PICKAXE_MODFIER = 1;
    public final static double SKILL_SHOVEL_MODFIER  = 1;
    public final static double SKILL_AXE_MODFIER  = 0.4;
    public final static double SKILL_HOE_MODFIER  = 0.02;
    public final static double SKILL_SHEARS_MODFIER  = 0.02;
    
    //Weapon Skill Modifiers
    
    public final static double SKILL_SWORD_MODFIER = 1;
    public final static double SKILL_BATTLEAXE_MODFIER = 1;
    public final static double SKILL_BOW_MODFIER = 1;
    public final static double SKILL_FIST_MODFIER = 1;
    
    //Armour Skill Modifiers
    
    //Entity Hostile Skill Modifiers
    
    //Entity Hostile Skill Modifiers
    
    //Skill Lists
    public final static String[] PLAYER_SKILL_LIST = {SKILL_BANE,SKILL_UNBREAKING,SKILL_EFFICIENCY,SKILL_EXCAVATION,SKILL_MINING,SKILL_LUCK,SKILL_WOODCUTTING,SKILL_HORTICULTURE,SKILL_SPEED,SKILL_JUMP,SKILL_SWIMMING};
    public final static String[] TOOL_SKILL_LIST = {SKILL_PICKAXE,SKILL_SHOVEL,SKILL_AXE,SKILL_HOE,SKILL_SHEARS};
    public final static String[] WEAPON_SKILL_LIST = {SKILL_SWORD,SKILL_BOW,SKILL_AXE,SKILL_FIST};
    public final static String[] ARMOUR_SKILL_LIST = {SKILL_UNARMOURED,SKILL_LIGHTARMOUR,SKILL_HEAVYARMOUR};
    public final static String[] HOSTILE_BANE_SKILL_LIST = {SKILL_BANE_BLAZE,SKILL_BANE_SKELETON,SKILL_BANE_ZOMBIE,SKILL_BANE_SPIDER,SKILL_BANE_WITHER,SKILL_BANE_SLIME,SKILL_BANE_BAT};
    public final static String[] FRIENDLY_BANE_SKILL_LIST = {};
    
    
    //Block Related XP gain
    public final static int XP_PER_COBBLE = 1;
    public final static int XP_PER_STONE = 1;
    public final static int XP_PER_DIRT = 1;
    public final static int XP_PER_SAND = 1;
    public final static int XP_PER_GRASS = 1;
    public final static int XP_PER_SANDSTONE = 2;
    public final static int XP_PER_OBSIDIAN = 8;
    public final static int XP_PER_NETHERACK = 1;
    public final static int XP_PER_SOULSAND = 2;
    public final static int XP_PER_CLAY = 4;
    
    //Ore Related XP Gain
    public final static int XP_PER_COAL_ORE = 4;
    public final static int XP_PER_IRON_ORE = 6;
    public final static int XP_PER_GOLD_ORE = 10;
    public final static int XP_PER_REDSTONE_ORE = 8;
    public final static int XP_PER_LAPIS_ORE = 15;
    public final static int XP_PER_DIAMOND_ORE = 20;
    public final static int XP_PER_EMERALD_ORE = 30;
    public final static int XP_PER_QUARTZ_ORE = 6;
    
    //Woodcutting related XP Gain
    
    public final static int XP_PER_BIRCH_LOG = 1;
    public final static int XP_PER_OAK_LOG = 1;
    public final static int XP_PER_SPRUCE_LOG = 1;
    public final static int XP_PER_JUNGLE_LOG = 1;
    
    
}

