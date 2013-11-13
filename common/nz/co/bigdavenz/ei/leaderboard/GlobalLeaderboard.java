package nz.co.bigdavenz.ei.leaderboard;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Map;

import net.minecraft.entity.player.EntityPlayer;
import nz.co.bigdavenz.ei.core.handler.EIDebugHandler;
import nz.co.bigdavenz.ei.core.handler.FileHandler;
import nz.co.bigdavenz.ei.debug.DebugMessage;
import nz.co.bigdavenz.ei.debug.DebugType;
import nz.co.bigdavenz.ei.player.EIPlayer;
import nz.co.bigdavenz.ei.skill.EISkill;

/**
 * @author BigDaveNz
 * 
 */
public class GlobalLeaderboard {

	public static int globalLeaderboard[][] = new int[EIPlayer
			.getPlayerAmount()][EISkill.getSkillAmount()];

	public static void loadLeaderboard() {
		FileHandler.loadLeaderboard();
		EIDebugHandler.sendDebugInfoToConsole(new DebugMessage(
				"leaderboard succesfully loaded", DebugType.LEADERBOARD));
	}

	public static void saveLeaderboard() {
        FileHandler.saveLeaderboard();
        EIDebugHandler.sendDebugInfoToConsole(new DebugMessage("leaderboard saved", DebugType.LEADERBOARD));
    }

	public static void populateLeaderboard() {
		for (int i = 0; i < EIPlayer.getPlayerAmount(); i++) {
			for (int j = 0; i < EISkill.getSkillAmount(); j++) {

				globalLeaderboard[i][j] = -1;

			}
		}
	}
}
