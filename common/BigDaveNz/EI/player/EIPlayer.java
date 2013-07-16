package BigDaveNz.EI.player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import net.minecraft.entity.player.EntityPlayer;
import BigDaveNz.EI.skill.EISkill;
import BigDaveNz.EI.skill.Skill;
import BigDaveNz.EI.skill.SkillTypeEnum;

public class EIPlayer {

    public static ArrayList<String> players   = new ArrayList();
    private static Map              skillsMap = new HashMap();

    public static void addEIPlayer(String playerName) {
        if (!players.contains(playerName)) {
            players.add(playerName);
        }
    }

    public static int getPlayerAmount() {
        return players.size();
    }

    private Object       username;
    private EntityPlayer player;

    public EIPlayer(EntityPlayer player) {
        this.username = player.getEntityName();
        this.player = player;
        
        
    }
//    public static Map createEIPlayer(EntityPlayer player) {
//        Map skillMapByName = EISkill.cloneSkillsMap();
//        String playerName = player.getEntityName();
//        for (String item: skillMapByName)
//        return thisSkill;
//        
//        
//        
//    }
}
