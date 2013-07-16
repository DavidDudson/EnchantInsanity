package BigDaveNz.EI.skill;

import BigDaveNz.EI.lib.Reference;
import BigDaveNz.EI.lib.SkillModifiers;
import net.minecraft.entity.player.EntityPlayer;

public class Skill {

    public static void init(EntityPlayer player) {

        EISkill toolCare = EISkill.createNewSkill(player, "Tool Care", SkillModifiers.SKILL_TOOLCARE_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill efficiency = EISkill.createNewSkill(player, "Efficeincy", SkillModifiers.SKILL_EFFICIENCY_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill excavation = EISkill.createNewSkill(player, "Excavation", SkillModifiers.SKILL_EXCAVATION_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill mining = EISkill.createNewSkill(player, "Mining", SkillModifiers.SKILL_MINING_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill luck = EISkill.createNewSkill(player, "Luck", SkillModifiers.SKILL_LUCK_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill woodcutting = EISkill.createNewSkill(player, "Woodcutting", SkillModifiers.SKILL_WOODCUTTING_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill horticulture = EISkill.createNewSkill(player, "Horticulture", SkillModifiers.SKILL_HORTICULTURE_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill speed = EISkill.createNewSkill(player, "Speed", SkillModifiers.SKILL_SPEED_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill jump = EISkill.createNewSkill(player, "Leap", SkillModifiers.SKILL_JUMP_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill swimming = EISkill.createNewSkill(player, "Swimming", SkillModifiers.SKILL_SWIMMING_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill bane = EISkill.createNewSkill(player, "Bane", SkillModifiers.SKILL_BANE_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill time = EISkill.createNewSkill(player, "Time", SkillModifiers.SKILL_TIME_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill crafting = EISkill.createNewSkill(player, "Crafting", SkillModifiers.SKILL_CRAFTING_MODIFIER, SkillTypeEnum.PLAYER);
        EISkill smelting = EISkill.createNewSkill(player, "Smelting", SkillModifiers.SKILL_SMELTING_MODIFIER, SkillTypeEnum.PLAYER);

        EISkill pickaxe = EISkill.createNewSkill(player, "Pickaxe", SkillModifiers.SKILL_PICKAXE_MODIFIER, SkillTypeEnum.TOOL);
        EISkill shovel = EISkill.createNewSkill(player, "Shovel", SkillModifiers.SKILL_SHOVEL_MODIFIER, SkillTypeEnum.TOOL);
        EISkill axe = EISkill.createNewSkill(player, "Axe", SkillModifiers.SKILL_AXE_MODIFIER, SkillTypeEnum.TOOL);
        EISkill hoe = EISkill.createNewSkill(player, "Hoe", SkillModifiers.SKILL_HOE_MODIFIER, SkillTypeEnum.TOOL);
        EISkill shears = EISkill.createNewSkill(player, "Shears", SkillModifiers.SKILL_SHEARS_MODIFIER, SkillTypeEnum.TOOL);

        EISkill sword = EISkill.createNewSkill(player, "Swordsmanship", SkillModifiers.SKILL_SWORD_MODIFIER, SkillTypeEnum.WEAPON);
        EISkill battleaxe = EISkill.createNewSkill(player, "Axemanship", SkillModifiers.SKILL_BATTLEAXE_MODIFIER, SkillTypeEnum.WEAPON);
        EISkill bow = EISkill.createNewSkill(player, "Bowmanship", SkillModifiers.SKILL_BOW_MODIFIER, SkillTypeEnum.WEAPON);
        EISkill fist = EISkill.createNewSkill(player, "Martial Arts", SkillModifiers.SKILL_FIST_MODIFIER, SkillTypeEnum.WEAPON);

        EISkill lightarmour = EISkill.createNewSkill(player, "Light Armour", SkillModifiers.SKILL_LIGHTARMOUR_MODIFIER, SkillTypeEnum.ARMOUR);
        EISkill heavyarmour = EISkill.createNewSkill(player, "Heavy Armour", SkillModifiers.SKILL_HEAVYARMOUR_MODIFIER, SkillTypeEnum.ARMOUR);
        EISkill unarmoured = EISkill.createNewSkill(player, "Unarmoured", SkillModifiers.SKILL_UNARMOURED_MODIFIER, SkillTypeEnum.ARMOUR);

        EISkill skeleton = EISkill.createNewSkill(player, "Skeleton", SkillModifiers.SKILL_SKELETON_MODIFIER, SkillTypeEnum.HOSTILE_ENTITY);
        EISkill zombie = EISkill.createNewSkill(player, "Zombie", SkillModifiers.SKILL_ZOMBIE_MODIFIER, SkillTypeEnum.HOSTILE_ENTITY);
        EISkill slime = EISkill.createNewSkill(player, "Slime", SkillModifiers.SKILL_SLIME_MODIFIER, SkillTypeEnum.HOSTILE_ENTITY);
        EISkill blaze = EISkill.createNewSkill(player, "Blaze", SkillModifiers.SKILL_BLAZE_MODIFIER, SkillTypeEnum.HOSTILE_ENTITY);
        EISkill spider = EISkill.createNewSkill(player, "Spider", SkillModifiers.SKILL_SPIDER_MODIFIER, SkillTypeEnum.HOSTILE_ENTITY);
        EISkill wither = EISkill.createNewSkill(player, "Wither", SkillModifiers.SKILL_WITHER_MODIFIER, SkillTypeEnum.HOSTILE_ENTITY);
        EISkill bat = EISkill.createNewSkill(player, "Bat", SkillModifiers.SKILL_BAT_MODIFIER, SkillTypeEnum.HOSTILE_ENTITY);
        EISkill enderman = EISkill.createNewSkill(player, "Enderman", SkillModifiers.SKILL_ENDERMAN_MODIFIER, SkillTypeEnum.HOSTILE_ENTITY);
        EISkill ghast = EISkill.createNewSkill(player, "Ghast", SkillModifiers.SKILL_GHAST_MODIFIER, SkillTypeEnum.HOSTILE_ENTITY);
        
        EISkill sheep = EISkill.createNewSkill(player, "Sheep", SkillModifiers.SKILL_SHEEP_MODIFIER, SkillTypeEnum.FRIENDLY_ENTITY);
        EISkill pig = EISkill.createNewSkill(player, "Pig", SkillModifiers.SKILL_PIG_MODIFIER, SkillTypeEnum.FRIENDLY_ENTITY);
        EISkill cow = EISkill.createNewSkill(player, "Cow", SkillModifiers.SKILL_COW_MODIFIER, SkillTypeEnum.FRIENDLY_ENTITY);
        EISkill wolf = EISkill.createNewSkill(player, "Wolf", SkillModifiers.SKILL_WOLF_MODIFIER, SkillTypeEnum.FRIENDLY_ENTITY);
        EISkill squid = EISkill.createNewSkill(player, "Squid", SkillModifiers.SKILL_SQUID_MODIFIER, SkillTypeEnum.FRIENDLY_ENTITY);
        EISkill horse = EISkill.createNewSkill(player, "Horse", SkillModifiers.SKILL_HORSE_MODIFIER, SkillTypeEnum.FRIENDLY_ENTITY);
        EISkill chicken = EISkill.createNewSkill(player, "Chicken", SkillModifiers.SKILL_CHICKEN_MODIFIER, SkillTypeEnum.FRIENDLY_ENTITY);
        EISkill ocelot = EISkill.createNewSkill(player, "Ocelot", SkillModifiers.SKILL_OCELOT_MODIFIER, SkillTypeEnum.FRIENDLY_ENTITY);
        EISkill golem = EISkill.createNewSkill(player, "Golem", SkillModifiers.SKILL_GOLEM_MODIFIER, SkillTypeEnum.FRIENDLY_ENTITY);
        EISkill npc = EISkill.createNewSkill(player, "NPC", SkillModifiers.SKILL_NPC_MODIFIER, SkillTypeEnum.FRIENDLY_ENTITY);

    }
}
