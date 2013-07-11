package BigDaveNz.EI.leaderboard;

import BigDaveNz.EI.skill.EISkill;
import net.minecraft.entity.player.EntityPlayer;

public class playerLeaderboard {
	
	int totalSkills = GlobalLeaderboard.getSkillCount();
	private static EISkill[] skillList;
	
	public void addSkillToList(EntityPlayer player, EISkill skill){
		
		int id = skill.getId();
		skillList[id] = skill;
		
	}
	
	
}
