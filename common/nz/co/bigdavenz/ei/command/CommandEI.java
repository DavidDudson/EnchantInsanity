package nz.co.bigdavenz.ei.command;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.player.EntityPlayerMP;
import nz.co.bigdavenz.ei.core.handler.ChatMessageHandler;
import nz.co.bigdavenz.ei.core.handler.EIDebugHandler;
import nz.co.bigdavenz.ei.core.handler.FileHandler;
import nz.co.bigdavenz.ei.debug.DebugMessage;
import nz.co.bigdavenz.ei.debug.DebugType;
import nz.co.bigdavenz.ei.hud.EIHUDHandler;
import nz.co.bigdavenz.ei.lib.Commands;
import nz.co.bigdavenz.ei.lib.Reference;
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
    public void processCommand(ICommandSender commandSender, String[] args) {
        if (args.length > 0) {
            String commandName = args[0];
            System.arraycopy(args, 1, args, 0, args.length - 1);

            switch (commandName.toLowerCase()) {

                case "xp":
                    processXPCommand(commandSender, args);
                    break;

                case "level":
                    processLevelCommand(commandSender, args);
                    break;

                case "leaderboard":
                    processLeaderboardCommand(commandSender, args);
                    break;

                case "debugtoggle":
                    Reference.debugMode = !Reference.debugMode;
                    ChatMessageHandler.icommandsenderReply(commandSender, "Debug mode toggled to: " + Boolean.toString(Reference.debugMode));
                    break;

                case "debuggcheck":
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

                default:
                    throw new WrongUsageException(Commands.COMMAND_EI_USAGE, new Object[0]);
            }
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

    public void processLevelCommand(ICommandSender commandSender, String[] args) {
        if (args.length > 0) {
            String skillName = args[0];
            getIntMethodInSkill(skillName, "getLevel", commandSender);
        } else
            throw new WrongUsageException(Commands.COMMAND_LEVEL_USAGE, new Object[0]);
    }

    public void processLeaderboardCommand(ICommandSender commandSender, String[] args) {
        // TODO finish leaderboard
    }

    @Override
    public String getCommandUsage(ICommandSender icommandsender) {
        return null;
    }

    public void getIntMethodInSkill(String skillName, String methodName, ICommandSender commandSender) {
        if (skillName.length() > 0) {
            EISkill skill = EISkill.getSkillFromMap(skillName);
            Method method = null;
            try {
                method = skill.getClass().getMethod(methodName, EISkill.class);
            } catch (NoSuchMethodException | SecurityException e) {
                e.printStackTrace();
            }
            int returnedValue = -1;

            try {
                returnedValue = (int) method.invoke(skill);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                e.printStackTrace();
            }
            String message;
            if (returnedValue == -1) {
                message = "Something Went Wrong";
            } else {
                switch (methodName) {

                    case "getLevel":
                        message = "Current: " + skillName + " Level: " + returnedValue;
                    case "getXp":
                        message = "Current: " + skillName + " Xp: " + returnedValue;

                }
            }
        }
    }
}
