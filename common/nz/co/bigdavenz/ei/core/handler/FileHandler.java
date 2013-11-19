/**
 * 
 */
package nz.co.bigdavenz.ei.core.handler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import nz.co.bigdavenz.ei.leaderboard.GlobalLeaderboard;
import nz.co.bigdavenz.ei.logger.VanillaEILogger;

/**
 * @author BigDaveNz
 * 
 */
public class FileHandler {

    public static void saveLeaderboard() {
        try {
            FileOutputStream fileOut = new FileOutputStream("Leaderboard.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(GlobalLeaderboard.globalLeaderboard);
            out.close();
            fileOut.close();
        } catch (FileNotFoundException e) {
            VanillaEILogger.warning("EI save file not found for this world, creating new file now");
            createLeaderboardFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void createLeaderboardFile() {
        try {
            FileOutputStream fileOut = new FileOutputStream("Leaderboard.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            GlobalLeaderboard.populateLeaderboard();
            out.writeObject(GlobalLeaderboard.globalLeaderboard);
            out.close();
            fileOut.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void backupLeaderboard() {
        try {
            FileOutputStream fileOut = new FileOutputStream("LeaderboardBackup.dat");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(GlobalLeaderboard.globalLeaderboard);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadLeaderboard() {

        try {
            FileInputStream fileIn = new FileInputStream("Leaderboard.dat");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            GlobalLeaderboard.globalLeaderboard = (int[][]) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }
    }
}
