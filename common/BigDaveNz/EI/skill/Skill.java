package BigDaveNz.EI.skill;

import BigDaveNz.EI.lib.Reference;
import BigDaveNz.EI.lib.SkillModifiers;
import net.minecraft.entity.player.EntityPlayer;

public class Skill {

    public static void init() {

        EISkill toolCare = EISkill.createNewSkill("Tool Care", SkillModifiers.SKILL_TOOLCARE_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill efficiency = EISkill.createNewSkill("Efficeincy", SkillModifiers.SKILL_EFFICIENCY_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill excavation = EISkill.createNewSkill("Excavation", SkillModifiers.SKILL_EXCAVATION_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill mining = EISkill.createNewSkill("Mining", SkillModifiers.SKILL_MINING_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill luck = EISkill.createNewSkill("Luck", SkillModifiers.SKILL_LUCK_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill woodcutting = EISkill.createNewSkill("Woodcutting", SkillModifiers.SKILL_WOODCUTTING_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill horticulture = EISkill.createNewSkill("Horticulture", SkillModifiers.SKILL_HORTICULTURE_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill speed = EISkill.createNewSkill("Speed", SkillModifiers.SKILL_SPEED_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill jump = EISkill.createNewSkill("Leap", SkillModifiers.SKILL_JUMP_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill swimming = EISkill.createNewSkill("Swimming", SkillModifiers.SKILL_SWIMMING_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill bane = EISkill.createNewSkill("Bane", SkillModifiers.SKILL_BANE_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill time = EISkill.createNewSkill("Time", SkillModifiers.SKILL_TIME_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill crafting = EISkill.createNewSkill("Crafting", SkillModifiers.SKILL_CRAFTING_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill smelting = EISkill.createNewSkill("Smelting", SkillModifiers.SKILL_SMELTING_MODIFIER, SkillTypeEnum.PLAYER);

        EISkill pickaxe = EISkill.createNewSkill("Pickaxe", SkillModifiers.SKILL_PICKAXE_MODIFIER, SkillTypeEnum.TOOL);
        EISkill shovel = EISkill.createNewSkill("Shovel", SkillModifiers.SKILL_SHOVEL_MODIFIER, SkillTypeEnum.TOOL);
        EISkill axe = EISkill.createNewSkill("Axe", SkillModifiers.SKILL_AXE_MODIFIER, SkillTypeEnum.TOOL);
        EISkill hoe = EISkill.createNewSkill("Hoe", SkillModifiers.SKILL_HOE_MODIFIER, SkillTypeEnum.TOOL);
        EISkill shears = EISkill.createNewSkill("Shears", SkillModifiers.SKILL_SHEARS_MODIFIER, SkillTypeEnum.TOOL);

        EISkill sword = EISkill.createNewSkill("Swordsmanship", SkillModifiers.SKILL_SWORD_MODIFIER, SkillTypeEnum.WEAPON);
        EISkill battleaxe = EISkill.createNewSkill("Axemanship", SkillModifiers.SKILL_BATTLEAXE_MODIFIER, SkillTypeEnum.WEAPON);
        EISkill bow = EISkill.createNewSkill("Bowmanship", SkillModifiers.SKILL_BOW_MODIFIER, SkillTypeEnum.WEAPON);
        EISkill fist = EISkill.createNewSkill("Martial Arts", SkillModifiers.SKILL_FIST_MODIFIER, SkillTypeEnum.WEAPON);

        EISkill lightarmour = EISkill.createNewSkill("Light Armour", SkillModifiers.SKILL_LIGHTARMOUR_MODIFIER, SkillTypeEnum.ARMOUR);
        EISkill heavyarmour = EISkill.createNewSkill("Heavy Armour", SkillModifiers.SKILL_HEAVYARMOUR_MODIFIER, SkillTypeEnum.ARMOUR);
        EISkill unarmoured = EISkill.createNewSkill("Unarmoured", SkillModifiers.SKILL_UNARMOURED_MODIFIER, SkillTypeEnum.ARMOUR);

        EISkill skeleton = EISkill.createNewSkill("Skeleton", SkillModifiers.SKILL_SKELETON_MODIFIER, SkillTypeEnum.HOSTILE_ENTITY);
        EISkill zombie = EISkill.createNewSkill("Zombie", SkillModifiers.SKILL_ZOMBIE_MODIFIER, SkillTypeEnum.HOSTILE_ENTITY);
        EISkill slime = EISkill.createNewSkill("Slime", SkillModifiers.SKILL_SLIME_MODIFIER, SkillTypeEnum.HOSTILE_ENTITY);
        EISkill blaze = EISkill.createNewSkill("Blaze", SkillModifiers.SKILL_BLAZE_MODIFIER, SkillTypeEnum.HOSTILE_ENTITY);
        EISkill spider = EISkill.createNewSkill("Spider", SkillModifiers.SKILL_SPIDER_MODIFIER, SkillTypeEnum.HOSTILE_ENTITY);
        EISkill wither = EISkill.createNewSkill("Wither", SkillModifiers.SKILL_WITHER_MODIFIER, SkillTypeEnum.HOSTILE_ENTITY);
        EISkill bat = EISkill.createNewSkill("Bat", SkillModifiers.SKILL_BAT_MODIFIER, SkillTypeEnum.HOSTILE_ENTITY);
        EISkill enderman = EISkill.createNewSkill("Enderman", SkillModifiers.SKILL_ENDERMAN_MODIFIER, SkillTypeEnum.HOSTILE_ENTITY);
        EISkill ghast = EISkill.createNewSkill("Ghast", SkillModifiers.SKILL_GHAST_MODIFIER, SkillTypeEnum.HOSTILE_ENTITY);
        
        EISkill sheep = EISkill.createNewSkill("Sheep", SkillModifiers.SKILL_SHEEP_MODIFIER, SkillTypeEnum.FRIENDLY_ENTITY);
        EISkill pig = EISkill.createNewSkill("Pig", SkillModifiers.SKILL_PIG_MODIFIER, SkillTypeEnum.FRIENDLY_ENTITY);
        EISkill cow = EISkill.createNewSkill("Cow", SkillModifiers.SKILL_COW_MODIFIER, SkillTypeEnum.FRIENDLY_ENTITY);
        EISkill wolf = EISkill.createNewSkill("Wolf", SkillModifiers.SKILL_WOLF_MODIFIER, SkillTypeEnum.FRIENDLY_ENTITY);
        EISkill squid = EISkill.createNewSkill("Squid", SkillModifiers.SKILL_SQUID_MODIFIER, SkillTypeEnum.FRIENDLY_ENTITY);
        EISkill horse = EISkill.createNewSkill("Horse", SkillModifiers.SKILL_HORSE_MODIFIER, SkillTypeEnum.FRIENDLY_ENTITY);
        EISkill chicken = EISkill.createNewSkill("Chicken", SkillModifiers.SKILL_CHICKEN_MODIFIER, SkillTypeEnum.FRIENDLY_ENTITY);
        EISkill ocelot = EISkill.createNewSkill("Ocelot", SkillModifiers.SKILL_OCELOT_MODIFIER, SkillTypeEnum.FRIENDLY_ENTITY);
        EISkill golem = EISkill.createNewSkill("Golem", SkillModifiers.SKILL_GOLEM_MODIFIER, SkillTypeEnum.FRIENDLY_ENTITY);
        EISkill npc = EISkill.createNewSkill("NPC", SkillModifiers.SKILL_NPC_MODIFIER, SkillTypeEnum.FRIENDLY_ENTITY);

    }
}
