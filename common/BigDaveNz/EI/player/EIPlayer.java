package BigDaveNz.EI.player;

import java.util.ArrayList;

public class EIPlayer {

    static ArrayList<String> players = new ArrayList();
    
    public static void addPlayerToList(String playerName){
        if(!players.contains(playerName)) {
            players.add(playerName);
        }
    }
    
    public static int getPlayerAmount() {
        return players.size();
    }
}
