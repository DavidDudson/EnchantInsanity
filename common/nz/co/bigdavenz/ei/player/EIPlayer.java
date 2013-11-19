package nz.co.bigdavenz.ei.player;

import java.util.ArrayList;

public class EIPlayer {
    public static ArrayList<String> players = new ArrayList();

    public static int getPlayerAmount() {
        return players.size();
    }
}
