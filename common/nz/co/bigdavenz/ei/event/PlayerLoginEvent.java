package nz.co.bigdavenz.ei.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import nz.co.bigdavenz.ei.core.handler.ChatMessageHandler;

/**
 * Created by David J. Dudson on 17/12/13.
 */
public class PlayerLoginEvent {

    public static void playerLogin(EntityPlayer player) {
        String message = getMessage(player.getDisplayName());
        if (message != null) {
            ChatMessageHandler.broadcastEIMessageToPlayers("All hail " + player.getDisplayName()+ ".\n" + player.getDisplayName() + " " + message);
        }

    }

    public static String getMessage(String playerName) {

        switch (playerName.toLowerCase()) {

            case "bigdavenz":
                return "is the creator of Enchant Insanity. Be awed with his presence on this server #OverrideAdminPermissions";
            case "direwolf20":
                return "is the awe inspiring youtuber, famous for the 9x9 and incredible builds";
            case "slowpoke101":
                return "is the King of modpacks, FTB founder and maintainer";
            case "eloraam":
                return "is the creator of Redpower, and co-founder of Minecraft Forge";
            case "cpw":
                return "is the creator of FML/Iron Chests and alot more";
            case "lexmanos":
                return "is the co-founder/maintainer of Minecraft Forge. He is a true legend.";
            case "dabomb0187":
                return "is a friend of the EI Developer. Be nice";
            case "comxx":
                return "is a friend of the EI Developer and Purplepanda0x's husband. You have been warned";
            case "bigboy93jc":
                return "is a friend of the EI Developer. And a huge troll. Kick him if you want";
            case "purplepanda0x":
                return "is a friend of the EI Developer and comxx's wife. You have been warned";

            default:
                return null;
        }
    }
}
