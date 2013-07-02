package BigDaveNz.EI.lib;

public class Skills {
    
    /**
    Enchant Insantiy

    Created by BigDaveNz

    Reference File for EI Skill related constants
    */
    
    //General constants
    
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
    public final static String SKILL_TIME = "Time";   
    public final static String SKILL_CRAFTING = "Crafting";  
    public final static String SKILL_SMELTING = "Smelting";  
    
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
    public final static String SKILL_BANE_GHAST = "Bane of Ghasts";
    
    //Entity Skill Names - Friendly
    
    public final static String SKILL_BANE_SHEEP = "Bane of Sheep";
    public final static String SKILL_BANE_PIG = "Bane of Pig";
    public final static String SKILL_BANE_COW = "Bane of Cow";
    public final static String SKILL_BANE_SQUID = "Bane of Squid";
    public final static String SKILL_BANE_CHICKEN = "Bane of Chicken";
    public final static String SKILL_BANE_WOLF = "Bane of Wolf";
    public final static String SKILL_BANE_OCELOT = "Bane of Ocelot";
    public final static String SKILL_BANE_NPC = "Bane of Testificate";
    public final static String SKILL_BANE_GOLEM = "Bane of Golem";
    public final static String SKILL_BANE_HORSE = "Bane of Horse";
    
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
    public final static double SKILL_BANE_MODIFIER = 0.1;
    public final static double SKILL_TIME_MODIFIER = 0.6;   
    public final static double SKILL_CRAFTING_MODIFIER = .1;  
    public final static double SKILL_SMELTING_MODIFIER = .1;  
    
    //Tool Skill Modifiers
    
    public final static double SKILL_PICKAXE_MODIFIER = 1;
    public final static double SKILL_SHOVEL_MODIFIER  = 1;
    public final static double SKILL_AXE_MODIFIER  = 0.4;
    public final static double SKILL_HOE_MODIFIER  = 0.02;
    public final static double SKILL_SHEARS_MODIFIER  = 0.02;
    
    //Weapon Skill Modifiers
    
    public final static double SKILL_SWORD_MODIFIER = 1;
    public final static double SKILL_BATTLEAXE_MODIFIER = 1;
    public final static double SKILL_BOW_MODIFIER = 1;
    public final static double SKILL_FIST_MODIFIER = 1;
    
    //Armour Skill Modifiers
    
    public final static double SKILL_UNARMOURED_MODIFIER = 1;
    public final static double SKILL_LIGHTARMOUR_MODIFIER = 1;
    public final static double SKILL_HEAVYARMOUR_MODIFIER = 1;
    
    //Entity Hostile Skill Modifiers
    
    public final static double SKILL_BANE_SKELETON_MODIFIER = 1;
    public final static double SKILL_BANE_ZOMBIE_MODIFIER = 1;
    public final static double SKILL_BANE_SLIME_MODIFIER = 1;
    public final static double SKILL_BANE_BLAZE_MODIFIER = 1;
    public final static double SKILL_BANE_SPIDER_MODIFIER = 1;
    public final static double SKILL_BANE_WITHER_MODIFIER = 1;
    public final static double SKILL_BANE_BAT_MODIFIER = 1;
    public final static double SKILL_BANE_ENDERMAN_MODIFIER = 1;
    public final static double SKILL_BANE_GHAST_MODIFIER = 1;
    
    
    //Entity Hostile Skill Modifiers
    
    public final static double SKILL_BANE_SHEEP_MODIFIER = 1;
    public final static double SKILL_BANE_PIG_MODIFIER = 1;
    public final static double SKILL_BANE_COW_MODIFIER = 1;
    public final static double SKILL_BANE_WOLF_MODIFIER = 1;
    public final static double SKILL_BANE_SQUID_MODIFIER = 1;
    public final static double SKILL_BANE_HORSE_MODIFIER = 1;
    public final static double SKILL_BANE_CHICKEN_MODIFIER = 1;
    public final static double SKILL_BANE_OCELOT_MODIFIER = 1;
    public final static double SKILL_BANE_GOLEM_MODIFIER = 1;
    public final static double SKILL_BANE_NPC_MODIFIER = 1;
    
    //Skill Lists
    public final static String[] PLAYER_SKILL_LIST = {SKILL_TIME,SKILL_CRAFTING,SKILL_SMELTING,SKILL_BANE,SKILL_UNBREAKING,SKILL_EFFICIENCY,SKILL_EXCAVATION,SKILL_MINING,SKILL_LUCK,SKILL_WOODCUTTING,SKILL_HORTICULTURE,SKILL_SPEED,SKILL_JUMP,SKILL_SWIMMING};
    public final static String[] TOOL_SKILL_LIST = {SKILL_PICKAXE,SKILL_SHOVEL,SKILL_AXE,SKILL_HOE,SKILL_SHEARS};
    public final static String[] WEAPON_SKILL_LIST = {SKILL_SWORD,SKILL_BOW,SKILL_AXE,SKILL_FIST};
    public final static String[] ARMOUR_SKILL_LIST = {SKILL_UNARMOURED,SKILL_LIGHTARMOUR,SKILL_HEAVYARMOUR};
    public final static String[] HOSTILE_BANE_SKILL_LIST = {SKILL_BANE_GHAST,SKILL_BANE_BLAZE,SKILL_BANE_SKELETON,SKILL_BANE_ZOMBIE,SKILL_BANE_SPIDER,SKILL_BANE_WITHER,SKILL_BANE_SLIME,SKILL_BANE_BAT};
    public final static String[] FRIENDLY_BANE_SKILL_LIST = {SKILL_BANE_CHICKEN,SKILL_BANE_SHEEP,SKILL_BANE_PIG,SKILL_BANE_COW,SKILL_BANE_WOLF,SKILL_BANE_SQUID,SKILL_BANE_OCELOT,SKILL_BANE_NPC,SKILL_BANE_GOLEM, SKILL_BANE_HORSE};
    
    
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

