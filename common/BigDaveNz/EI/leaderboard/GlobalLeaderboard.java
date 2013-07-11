package BigDaveNz.EI.leaderboard;

import java.util.ArrayList;
import java.util.Map;

import BigDaveNz.EI.skill.EISkill;

import net.minecraft.entity.player.EntityPlayer;

/**
 * @author BigDaveNz
 * 
 */
public class GlobalLeaderboard {

    private static int playerCount;
    private static int skillCount;
    private static String globalLeaderboard[][] = new String [playerCount][getSkillCount()];
    private static String skillList[];
    //private String stringSkillXp = Integer.toString(skillXp); 
    
    public static void addPlayerToLeaderboard(EntityPlayer player){
    	String playerName = player.getEntityName();
    	playerCount++;
    }
    
    public static void addSkill(EntityPlayer player, EISkill skill){
    	skillCount++;
    }

	public static int getSkillCount() {
		return skillCount;
	}
}