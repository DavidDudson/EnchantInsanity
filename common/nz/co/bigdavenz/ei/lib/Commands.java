package nz.co.bigdavenz.ei.lib;

/**
 * Enchant Insantiy
 * 
 * Created by BigDaveNz
 * 
 * Reference File for EI Commands
 */

public class Commands {

    // Command First Paramater
    public final static String COMMAND_PAR1_EI = "ei";

    // Possible Second Parameters
    public final static String COMMAND_PAR2_XP = "xp";
    public final static String COMMAND_PAR2_LEVEL = "level";
    public final static String COMMAND_PAR2_LEADERBOARD = "leaderboard";

    // Possible Third Parameters - Currently Any skill name

    // Command Usage Statements
    public static final String COMMAND_EI_USAGE = "ei [ xp | level | leaderboard ]";
    public static final String COMMAND_XP_USAGE = "ei xp [ any skill ]";
    public static final String COMMAND_LEADERBOARD_USAGE = "ei leaderboard [ any skill ]";
    public static final String COMMAND_LEVEL_USAGE = "ei level [ any skill ]";

}
