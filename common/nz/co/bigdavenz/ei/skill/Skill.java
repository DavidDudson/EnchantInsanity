package nz.co.bigdavenz.ei.skill;

import nz.co.bigdavenz.ei.core.handler.EIDebugHandler;
import nz.co.bigdavenz.ei.debug.DebugMessage;
import nz.co.bigdavenz.ei.debug.DebugType;
import nz.co.bigdavenz.ei.lib.SkillModifiers;

public class Skill {

    public static void init() {

        EISkill toolcare = EISkill.createNewSkill("ToolCare", SkillModifiers.SKILL_TOOLCARE_MODIFIER);
        EISkill efficiency = EISkill.createNewSkill("Efficiency", SkillModifiers.SKILL_EFFICIENCY_MODIFIER);
        EISkill excavation = EISkill.createNewSkill("Excavation", SkillModifiers.SKILL_EXCAVATION_MODIFIER);
        EISkill mining = EISkill.createNewSkill("Mining", SkillModifiers.SKILL_MINING_MODIFIER);
        EISkill luck = EISkill.createNewSkill("Luck", SkillModifiers.SKILL_LUCK_MODIFIER);
        EISkill woodcutting = EISkill.createNewSkill("Woodcutting", SkillModifiers.SKILL_WOODCUTTING_MODIFIER);
        EISkill horticulture = EISkill.createNewSkill("Horticulture", SkillModifiers.SKILL_HORTICULTURE_MODIFIER);
        EISkill speed = EISkill.createNewSkill("Speed", SkillModifiers.SKILL_SPEED_MODIFIER);
        EISkill jump = EISkill.createNewSkill("Leap", SkillModifiers.SKILL_JUMP_MODIFIER);
        EISkill swimming = EISkill.createNewSkill("Swimming", SkillModifiers.SKILL_SWIMMING_MODIFIER);
        EISkill bane = EISkill.createNewSkill("Bane", SkillModifiers.SKILL_BANE_MODIFIER);
        EISkill time = EISkill.createNewSkill("Time", SkillModifiers.SKILL_TIME_MODIFIER);
        EISkill crafting = EISkill.createNewSkill("Crafting", SkillModifiers.SKILL_CRAFTING_MODIFIER);
        EISkill smelting = EISkill.createNewSkill("Smelting", SkillModifiers.SKILL_SMELTING_MODIFIER);

        EISkill pickaxe = EISkill.createNewSkill("Pickaxe", SkillModifiers.SKILL_PICKAXE_MODIFIER);
        EISkill shovel = EISkill.createNewSkill("Shovel", SkillModifiers.SKILL_SHOVEL_MODIFIER);
        EISkill axe = EISkill.createNewSkill("Axe", SkillModifiers.SKILL_AXE_MODIFIER);
        EISkill hoe = EISkill.createNewSkill("Hoe", SkillModifiers.SKILL_HOE_MODIFIER);
        EISkill shears = EISkill.createNewSkill("Shears", SkillModifiers.SKILL_SHEARS_MODIFIER);

        EISkill sword = EISkill.createNewSkill("Swordsmanship", SkillModifiers.SKILL_SWORD_MODIFIER);
        EISkill battleaxe = EISkill.createNewSkill("Axemanship", SkillModifiers.SKILL_BATTLEAXE_MODIFIER);
        EISkill bow = EISkill.createNewSkill("Archery", SkillModifiers.SKILL_BOW_MODIFIER);
        EISkill fist = EISkill.createNewSkill("MartialArts", SkillModifiers.SKILL_FIST_MODIFIER);

        EISkill light = EISkill.createNewSkill("LightArmour", SkillModifiers.SKILL_LIGHTARMOUR_MODIFIER);
        EISkill heavy = EISkill.createNewSkill("HeavyArmour", SkillModifiers.SKILL_HEAVYARMOUR_MODIFIER);
        EISkill uned = EISkill.createNewSkill("Unarmoured", SkillModifiers.SKILL_UNARMOURED_MODIFIER);

        EISkill skeleton = EISkill.createNewSkill("Skeleton", SkillModifiers.SKILL_SKELETON_MODIFIER);
        EISkill zombie = EISkill.createNewSkill("Zombie", SkillModifiers.SKILL_ZOMBIE_MODIFIER);
        EISkill slime = EISkill.createNewSkill("Slime", SkillModifiers.SKILL_SLIME_MODIFIER);
        EISkill blaze = EISkill.createNewSkill("Blaze", SkillModifiers.SKILL_BLAZE_MODIFIER);
        EISkill spider = EISkill.createNewSkill("Spider", SkillModifiers.SKILL_SPIDER_MODIFIER);
        EISkill wither = EISkill.createNewSkill("Wither", SkillModifiers.SKILL_WITHER_MODIFIER);
        EISkill bat = EISkill.createNewSkill("Bat", SkillModifiers.SKILL_BAT_MODIFIER);
        EISkill enderman = EISkill.createNewSkill("Enderman", SkillModifiers.SKILL_ENDERMAN_MODIFIER);
        EISkill ghast = EISkill.createNewSkill("Ghast", SkillModifiers.SKILL_GHAST_MODIFIER);

        EISkill sheep = EISkill.createNewSkill("Sheep", SkillModifiers.SKILL_SHEEP_MODIFIER);
        EISkill pig = EISkill.createNewSkill("Pig", SkillModifiers.SKILL_PIG_MODIFIER);
        EISkill cow = EISkill.createNewSkill("Cow", SkillModifiers.SKILL_COW_MODIFIER);
        EISkill wolf = EISkill.createNewSkill("Wolf", SkillModifiers.SKILL_WOLF_MODIFIER);
        EISkill squid = EISkill.createNewSkill("Squid", SkillModifiers.SKILL_SQUID_MODIFIER);
        EISkill horse = EISkill.createNewSkill("Horse", SkillModifiers.SKILL_HORSE_MODIFIER);
        EISkill chicken = EISkill.createNewSkill("Chicken", SkillModifiers.SKILL_CHICKEN_MODIFIER);
        EISkill ocelot = EISkill.createNewSkill("Ocelot", SkillModifiers.SKILL_OCELOT_MODIFIER);
        EISkill golem = EISkill.createNewSkill("Golem", SkillModifiers.SKILL_GOLEM_MODIFIER);
        EISkill npc = EISkill.createNewSkill("NPC", SkillModifiers.SKILL_NPC_MODIFIER);

        EIDebugHandler.sendDebugInfoToConsole(new DebugMessage("Skills Initialized - " + "Disabled Count: " + EISkill.amountDisabled(), DebugType.SKILL));

    }
}
