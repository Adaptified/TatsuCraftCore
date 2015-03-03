package me.BrandonSteed.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.SE_Messages;
import me.BrandonSteed.ShadowEra.ShadowEra;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class Command_associated extends BukkitCommand<ShadowEra>
{

    @Override
    public boolean run(CommandSender sender, Command command, String commandLabel, String[] args)
    {      
        sender.sendMessage(ChatColor.AQUA + "Associated servers: ");
        sender.sendMessage(ChatColor.DARK_PURPLE + "Total" + ChatColor.YELLOW + "Freedom" + ChatColor.RESET + ": play.totalfreedom.me");
        sender.sendMessage(ChatColor.DARK_BLUE + "Freedom" + ChatColor.DARK_GREEN + "OP" + ChatColor.RESET + ": fop.us.to");
        sender.sendMessage(ChatColor.GRAY + "You may apply for an associated placement at " + SE_Messages.FORUMS_URL);
       return true;
    }

}

//Written by zD12 then transferred to BukkitLib by Got_No_Friends | https://github.com/zD12 | https://github.com/got_no_friends
