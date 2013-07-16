package BigDaveNz.EI.leaderboard;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Map;

import BigDaveNz.EI.core.handler.EIDebugHandler;
import BigDaveNz.EI.core.handler.FileHandler;
import BigDaveNz.EI.player.EIPlayer;
import BigDaveNz.EI.skill.EISkill;

import net.minecraft.entity.player.EntityPlayer;

/**
 * @author BigDaveNz
 * 
 */
public class GlobalLeaderboard {

    public static int globalLeaderboard[][] = new int[EIPlayer.getPlayerAmount()][EISkill.getSkillAmount()];

    public static boolean loadLeaderboard() {
        FileHandler.loadLeaderboard();
        EIDebugHandler.sendDebugInfoToConsole("leaderboard succesfully loaded");
        if (!(GlobalLeaderboard.globalLeaderboard[1][2] == -1)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void saveLeaderboard() {
        FileHandler.saveLeaderboard();
        EIDebugHandler.sendDebugInfoToConsole("leaderboard saved");
    }

    public static void populateLeaderboard() {
        for (int i = 0; i < EIPlayer.getPlayerAmount(); i++) {
            for (int j = 0; i < EISkill.getSkillAmount(); j++) {

                globalLeaderboard[i][j] = -1;
                
            }
        }
    }
}
