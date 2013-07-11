package BigDaveNz.EI.skill;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.player.EntityPlayer;

import BigDaveNz.EI.lib.Skills;

/**
 * @author BigDaveNz
 * 
 */

public class EISkill {

	private String skillName;
	private int currentLevel;
	private int minLevel = 0;
	private double modifier = 1;
	private int currentXp = 0;
	private int id;
	private static int nextId = 0;
	private static Map<String, EISkill> skillsMap = new HashMap<String, EISkill>();
	private SkillTypeEnum skillType;

	public String getSkillName() {
		return skillName;
	}

	public int getCurrentLevel() {
		return currentLevel;
	}

	public int getId() {
		return id;
	}

	public int getLevel() {
		return (int) Math.pow(currentXp * modifier, 3);
	}

	public int getNextID() {
		nextId++;
		return nextId;
	}

	public SkillTypeEnum getSkillType() {
		return skillType;
	}

	private EISkill(EntityPlayer player, String skillName, double modifier,
			SkillTypeEnum skillType) {
		this.skillName = skillName;
		this.minLevel = 0;
		this.modifier = modifier;
		this.currentLevel = getLevel();
		this.currentXp = 1;
		this.id = getNextID();
		this.skillType = skillType;
	}

	private String generateLeaderboard() {
		return null;
	}

	public static EISkill createNewSkill(EntityPlayer player, String skillName,
			double modifier, SkillTypeEnum skillType) {

		EISkill newSkill = new EISkill(player, skillName, modifier, skillType);
		addskillToMap(skillName, newSkill);
		return newSkill;
	}

	private static void addskillToMap(String skillName, EISkill skill) {
		skillsMap.put(skillName, skill);
	}

	public static EISkill getSkillFromName(String name) {

		EISkill requestedSkill = EISkill.skillsMap.get(name);
		if (requestedSkill == null) {
			throw new WrongUsageException("Invalid ", new Object[0]);
		} else {
			return requestedSkill;
		}

	}
}
