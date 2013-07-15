package BigDaveNz.EI.skill;

import BigDaveNz.EI.lib.Reference;
import BigDaveNz.EI.lib.Skills;
import net.minecraft.entity.player.EntityPlayer;

public class Skill {

    public static void init(EntityPlayer player) {

        EISkill toolCare = EISkill.createNewSkill(player, "Tool Care", Skills.SKILL_TOOLCARE_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill efficiency = EISkill.createNewSkill(player, "Efficeincy", Skills.SKILL_EFFICIENCY_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill excavation = EISkill.createNewSkill(player, "Excavation", Skills.SKILL_EXCAVATION_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill mining = EISkill.createNewSkill(player, "Mining", Skills.SKILL_MINING_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill luck = EISkill.createNewSkill(player, "Luck", Skills.SKILL_LUCK_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill woodcutting = EISkill.createNewSkill(player, "Woodcutting", Skills.SKILL_WOODCUTTING_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill horticulture = EISkill.createNewSkill(player, "Horticulture", Skills.SKILL_HORTICULTURE_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill speed = EISkill.createNewSkill(player, "Speed", Skills.SKILL_SPEED_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill jump = EISkill.createNewSkill(player, "Leap", Skills.SKILL_JUMP_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill swimming = EISkill.createNewSkill(player, "Swimming", Skills.SKILL_SWIMMING_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill bane = EISkill.createNewSkill(player, "Bane", Skills.SKILL_BANE_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill time = EISkill.createNewSkill(player, "Time", Skills.SKILL_TIME_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill crafting = EISkill.createNewSkill(player, "Crafting", Skills.SKILL_CRAFTING_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill smelting = EISkill.createNewSkill(player, "Smelting", Skills.SKILL_SMELTING_MODIFIER, SkillTypeEnum.PLAYER);

        EISkill pickaxe = EISkill.createNewSkill(player, "Pickaxe", Skills.SKILL_PICKAXE_MODIFIER, SkillTypeEnum.TOOL);
        EISkill shovel = EISkill.createNewSkill(player, "Shovel", Skills.SKILL_SHOVEL_MODIFIER, SkillTypeEnum.TOOL);
        EISkill axe = EISkill.createNewSkill(player, "Axe", Skills.SKILL_AXE_MODIFIER, SkillTypeEnum.TOOL);
        EISkill hoe = EISkill.createNewSkill(player, "Hoe", Skills.SKILL_HOE_MODIFIER, SkillTypeEnum.TOOL);
        EISkill shears = EISkill.createNewSkill(player, "Shears", Skills.SKILL_SHEARS_MODIFIER, SkillTypeEnum.TOOL);

        EISkill sword = EISkill.createNewSkill(player, "Swordsmanship", Skills.SKILL_SWORD_MODIFIER, SkillTypeEnum.WEAPON);
        EISkill battleaxe = EISkill.createNewSkill(player, "Axemanship", Skills.SKILL_BATTLEAXE_MODIFIER, SkillTypeEnum.WEAPON);
        EISkill bow = EISkill.createNewSkill(player, "Bowmanship", Skills.SKILL_BOW_MODIFIER, SkillTypeEnum.WEAPON);
        EISkill fist = EISkill.createNewSkill(player, "Martial Arts", Skills.SKILL_FIST_MODIFIER, SkillTypeEnum.WEAPON);

        EISkill lightarmour = EISkill.createNewSkill(player, "Light Armour", Skills.SKILL_LIGHTARMOUR_MODIFIER, SkillTypeEnum.ARMOUR);
        EISkill heavyarmour = EISkill.createNewSkill(player, "Heavy Armour", Skills.SKILL_HEAVYARMOUR_MODIFIER, SkillTypeEnum.ARMOUR);
        EISkill unarmoured = EISkill.createNewSkill(player, "Unarmoured", Skills.SKILL_UNARMOURED_MODIFIER, SkillTypeEnum.ARMOUR);

        EISkill skeleton = EISkill.createNewSkill(player, "Skeleton", Skills.SKILL_SKELETON_MODIFIER, SkillTypeEnum.HOSTILE_ENTITY);
        EISkill zombie = EISkill.createNewSkill(player, "Zombie", Skills.SKILL_ZOMBIE_MODIFIER, SkillTypeEnum.HOSTILE_ENTITY);
        EISkill slime = EISkill.createNewSkill(player, "Slime", Skills.SKILL_SLIME_MODIFIER, SkillTypeEnum.HOSTILE_ENTITY);
        EISkill blaze = EISkill.createNewSkill(player, "Blaze", Skills.SKILL_BLAZE_MODIFIER, SkillTypeEnum.HOSTILE_ENTITY);
        EISkill spider = EISkill.createNewSkill(player, "Spider", Skills.SKILL_SPIDER_MODIFIER, SkillTypeEnum.HOSTILE_ENTITY);
        EISkill wither = EISkill.createNewSkill(player, "Wither", Skills.SKILL_WITHER_MODIFIER, SkillTypeEnum.HOSTILE_ENTITY);
        EISkill bat = EISkill.createNewSkill(player, "Bat", Skills.SKILL_BAT_MODIFIER, SkillTypeEnum.HOSTILE_ENTITY);
        EISkill enderman = EISkill.createNewSkill(player, "Enderman", Skills.SKILL_ENDERMAN_MODIFIER, SkillTypeEnum.HOSTILE_ENTITY);
        EISkill ghast = EISkill.createNewSkill(player, "Ghast", Skills.SKILL_GHAST_MODIFIER, SkillTypeEnum.HOSTILE_ENTITY);
        
        EISkill sheep = EISkill.createNewSkill(player, "Sheep", Skills.SKILL_SHEEP_MODIFIER, SkillTypeEnum.FRIENDLY_ENTITY);
        EISkill pig = EISkill.createNewSkill(player, "Pig", Skills.SKILL_PIG_MODIFIER, SkillTypeEnum.FRIENDLY_ENTITY);
        EISkill cow = EISkill.createNewSkill(player, "Cow", Skills.SKILL_COW_MODIFIER, SkillTypeEnum.FRIENDLY_ENTITY);
        EISkill wolf = EISkill.createNewSkill(player, "Wolf", Skills.SKILL_WOLF_MODIFIER, SkillTypeEnum.FRIENDLY_ENTITY);
        EISkill squid = EISkill.createNewSkill(player, "Squid", Skills.SKILL_SQUID_MODIFIER, SkillTypeEnum.FRIENDLY_ENTITY);
        EISkill horse = EISkill.createNewSkill(player, "Horse", Skills.SKILL_HORSE_MODIFIER, SkillTypeEnum.FRIENDLY_ENTITY);
        EISkill chicken = EISkill.createNewSkill(player, "Chicken", Skills.SKILL_CHICKEN_MODIFIER, SkillTypeEnum.FRIENDLY_ENTITY);
        EISkill ocelot = EISkill.createNewSkill(player, "Ocelot", Skills.SKILL_OCELOT_MODIFIER, SkillTypeEnum.FRIENDLY_ENTITY);
        EISkill golem = EISkill.createNewSkill(player, "Golem", Skills.SKILL_GOLEM_MODIFIER, SkillTypeEnum.FRIENDLY_ENTITY);
        EISkill npc = EISkill.createNewSkill(player, "NPC", Skills.SKILL_NPC_MODIFIER, SkillTypeEnum.FRIENDLY_ENTITY);

    }
}
