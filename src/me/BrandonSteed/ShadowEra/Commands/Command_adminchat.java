/*
package me.BrandonSteed.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.Modules.AdminChat;
import me.BrandonSteed.ShadowEra.SE_Messages;
import me.BrandonSteed.ShadowEra.SE_Utils;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.apache.commons.lang.StringUtils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

@CommandPermissions(source = SourceType.PLAYER, permission = "")
public class Command_adminchat extends BukkitCommand 
{
    @Override
    public boolean run(CommandSender sender, Command cmd, String commandLabel, String[] args)
    {
        if (!SE_Utils.ADMINS.contains(sender.getName()))
        {
            sender.sendMessage(SE_Messages.NO_PREMS);
            return true;
        }
        
        if (args.length <1)
        {
            sender.sendMessage(ChatColor.RED + "Usage: /<command> <message>");
            return true;
        }
        AdminChat.chat(sender, StringUtils.join(args, " "));
        return true;        
    }    
}
*/
