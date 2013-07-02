package BigDaveNz.EI.command;

import java.awt.List;
import java.util.Arrays;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import BigDaveNz.EI.lib.Commands;
import BigDaveNz.EI.lib.Skills;
import BigDaveNz.EI.skill.Skill;
import BigDaveNz.EI.core.util.EILogger;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;

public class CommandEI extends CommandBase{
    
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

            if (commandName.equalsIgnoreCase(Commands.COMMAND_PAR2_XP)) {
                try {
                    processXPCommand(commandSender,args);
                } catch (NoSuchMethodException | SecurityException
                        | IllegalAccessException | IllegalArgumentException
                        | InvocationTargetException e) {
                    EILogger.severe("Command Failed");
                }
            }
            else if (commandName.equalsIgnoreCase(Commands.COMMAND_PAR2_LEVEL)) {
                processLevelCommand(commandSender,args);
            }
            else if (commandName.equalsIgnoreCase(Commands.COMMAND_PAR2_LEADERBOARD)) {
                processLeaderboardCommand(commandSender,args);
            }
            else
                throw new WrongUsageException(Commands.COMMAND_EI_USAGE, new Object[0]);
        }
        else
            throw new WrongUsageException(Commands.COMMAND_EI_USAGE, new Object[0]);
        
    }
    
    public void processXPCommand(ICommandSender commandSender, String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{

          if (args.length > 0){
              Skill skill = Skill.getSkillFromName(args[0]);
              Method method = skill.getClass().getMethod("getCurrentXP", Skill.class);
              int xp = (int) method.invoke(skill);
              String message  = "Current: " + args[0] + " Level: " + xp;
              commandSender.sendChatToPlayer(message); 
              }
    }
                       
    public void processLevelCommand(ICommandSender commandSender, String[] args){
        if (args.length > 0){
            String subCommand = args[0];
            
            if (subCommand.equalsIgnoreCase(Skills.SKILL_UNBREAKING)){
                String message  = "Current: " + Skills.SKILL_UNBREAKING + " Level: " + Skill.Unbreaking.getCurrentLevel();
                commandSender.sendChatToPlayer(message);
            }    
            else
                throw new WrongUsageException(Commands.COMMAND_XP_USAGE, new Object[0]);
        }
        else
            throw new WrongUsageException(Commands.COMMAND_LEVEL_USAGE, new Object[0]);                    
        }  
    
    public void processLeaderboardCommand(ICommandSender commandSender, String[] args){
        if (args.length > 0){
            String subCommand = args[0];
            
        if (subCommand.equalsIgnoreCase(Skills.SKILL_UNBREAKING)){
            String message  = "Current: " + Skills.SKILL_UNBREAKING + " Level: " + Skill.Unbreaking.getCurrentLeaderboard();
            commandSender.sendChatToPlayer(message);
        }    
        else
            throw new WrongUsageException(Commands.COMMAND_XP_USAGE, new Object[0]);
    }
    else
        throw new WrongUsageException(Commands.COMMAND_XP_USAGE, new Object[0]);
    }
    

}
