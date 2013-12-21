package nz.co.bigdavenz.ei.command;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.player.EntityPlayerMP;
import nz.co.bigdavenz.ei.client.hud.EIHUDHandler;
import nz.co.bigdavenz.ei.core.handler.ChatMessageHandler;
import nz.co.bigdavenz.ei.core.handler.EIDebugHandler;
import nz.co.bigdavenz.ei.core.handler.FileHandler;
import nz.co.bigdavenz.ei.core.util.UsefulFunctions;
import nz.co.bigdavenz.ei.debug.DebugMessage;
import nz.co.bigdavenz.ei.debug.DebugType;
import nz.co.bigdavenz.ei.lib.Commands;
import nz.co.bigdavenz.ei.lib.Reference;
import nz.co.bigdavenz.ei.lib.ResourcePaths;
import nz.co.bigdavenz.ei.player.EIPlayerProperties;
import nz.co.bigdavenz.ei.skill.EISkill;

public class CommandEI extends CommandBase {

    @Override
    public String getCommandName() {

        return Commands.COMMAND_PAR1_EI;
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender commandSender) {

        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void processCommand(ICommandSender commandSender, String[] args) {
        if (args.length > 0) {
            String commandName = args[0];
            System.arraycopy(args, 1, args, 0, args.length - 1);

            switch (commandName.toLowerCase()) {

                case "xp":
                    processXPCommand(commandSender, args);
                    break;


                case "leaderboard":
                    processLeaderboardCommand(commandSender, args);
                    break;

                case "debugtoggle":
                    Reference.debugMode = !Reference.debugMode;
                    ChatMessageHandler.icommandsenderReply(commandSender, "Debug mode toggled to: " + Boolean.toString(Reference.debugMode));
                    break;

                case "debugcheck":
                    ChatMessageHandler.icommandsenderReply(commandSender, "Debug mode is: " + Boolean.toString(Reference.debugMode));
                    break;

                case "version":
                    ChatMessageHandler.icommandsenderReply(commandSender, "Version: " + Reference.MOD_VERSION);
                    break;

                case "backupModFiles":
                    FileHandler.backupLeaderboard();
                    break;

                case "eihud":
                    EIDebugHandler.sendDebugInfoToConsole(new DebugMessage("EIHUD Command registered", DebugType.HUD));
                    EIHUDHandler.overrideVanillaHUD = !EIHUDHandler.overrideVanillaHUD;
                    break;

                case "scale":
                    EIDebugHandler.tempDebugToConsole("Width Scale: " + UsefulFunctions.getScaledScreenWidth());
                    EIDebugHandler.tempDebugToConsole("Height Scale: " + UsefulFunctions.getScaledScreenHeight());
                    break;

                case "crosshairs":
                    processCrosshairCommand(args);
                    break;

                case "path":
                    EIDebugHandler.tempDebugToConsole(ResourcePaths.PATH_FONT.getResourcePath());
                    break;

                default:
                    throw new WrongUsageException(Commands.COMMAND_EI_USAGE, new Object[0]);
            }
        }
    }

    private void processCrosshairCommand(String args[]) {
        if (args.length > 0) {
            try{
            EIHUDHandler.crosshairType = Integer.parseInt(args[0]);
            } catch(Exception e){
                throw new WrongUsageException(Commands.COMMAND_CROSSHAIR_USAGE, new Object[0]);
            }
        } else{
            throw new WrongUsageException(Commands.COMMAND_CROSSHAIR_USAGE, new Object[0]);
        }
    }

    public void processXPCommand(ICommandSender commandSender, String[] args) {
        if (args.length > 0) {
            String skillName = args[0];
            EntityPlayerMP player = (EntityPlayerMP) commandSender;
            EIPlayerProperties props = (EIPlayerProperties) player.getExtendedProperties(Reference.MOD_NAME);
            int xp = props.getSkillXP(skillName);
            ChatMessageHandler.icommandsenderReply(commandSender, "Skill: " + skillName + " Xp:" + xp);
        } else
            throw new WrongUsageException(Commands.COMMAND_XP_USAGE, new Object[0]);
    }

    public void processLeaderboardCommand(ICommandSender commandSender, String[] args) {
        // TODO finish leaderboard
        String message = "Leaderboard Incomplete";
        ChatMessageHandler.sendEIChatToPlayer(getCommandSenderAsPlayer(commandSender), message);
    }

    @Override
    public String getCommandUsage(ICommandSender icommandsender) {
        return null;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
