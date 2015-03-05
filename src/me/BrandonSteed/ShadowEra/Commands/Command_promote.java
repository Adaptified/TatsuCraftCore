package me.BrandonSteed.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.SE_Messages;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.util.PlayerUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class Command_promote extends BukkitCommand 
{
    @Override
    public boolean run(CommandSender sender, Command cmd, String commandLabel, String[] args)
    {
           OfflinePlayer player = PlayerUtils.getOfflinePlayer(args[0]);
        
        if (player == null)
        {
            sender.sendMessage(SE_Messages.NO_PLAYER);
            return true;
        }

        if (args[1].equalsIgnoreCase("developer"))
        {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "manuadd " + player.getName() + " developer");
            player.setOp(true);
            Bukkit.broadcastMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_RED + "Staff" + ChatColor.DARK_GRAY + "] " + ChatColor.DARK_RED + player.getName() + SE_Messages.PROMOTE + ChatColor.RED + " Developer! Good Coding! Congrats :D");
            return true;

        }

        else if (args[1].equalsIgnoreCase("VIP"))
        {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "manuadd " + player.getName() + " VIP");
            player.setOp(true);
            Bukkit.broadcastMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_RED + "Staff" + ChatColor.DARK_GRAY + "] " + ChatColor.DARK_RED + player.getName() + SE_Messages.PROMOTE + ChatColor.RED + " VIP, Congrats :D");
            return true;

        }
        if (args[1].equalsIgnoreCase("admin"))
        {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "manuadd " + player.getName() + " admin");  
            Bukkit.broadcastMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_RED + "Staff" + ChatColor.DARK_GRAY + "] " + ChatColor.DARK_RED + player.getName() + SE_Messages.PROMOTE + ChatColor.RED + " Administrator! Congrats :D");
            return true;

        }
        else if (args[1].equalsIgnoreCase("helper"))
        {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "manuadd " + player.getName() + " helper");
            Bukkit.broadcastMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_RED + "Staff" + ChatColor.DARK_GRAY + "] " + ChatColor.DARK_RED + player.getName() + SE_Messages.PROMOTE + ChatColor.RED + " Helper, Congrats :D");
            return true;
        }

        if (args[1].equalsIgnoreCase("owner"))
        {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "manuadd " + player.getName() + " owner");
            player.setOp(true);
            Bukkit.broadcastMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_RED + "Staff" + ChatColor.DARK_GRAY + "] " + ChatColor.DARK_RED + player.getName() + SE_Messages.PROMOTE + ChatColor.RED + " Owner, OMG, LOLOLOL, Congrats :D");
            return true;

        }
        else if (args[1].equalsIgnoreCase("headadmin"))
        {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "manuadd " + player.getName() + " headadmin");
            player.setOp(true);           
            Bukkit.broadcastMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_RED + "Staff" + ChatColor.DARK_GRAY + "] " + ChatColor.DARK_RED + player.getName() + SE_Messages.PROMOTE + ChatColor.RED + " Head Admin! Congrats :D");
            return true;

        }
        else if (args[1].equalsIgnoreCase("host"))
        {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "manuadd " + player.getName() + " host");
            player.setOp(true);           
           Bukkit.broadcastMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_RED + "Staff" + ChatColor.DARK_GRAY + "] " + ChatColor.DARK_RED + player.getName() + SE_Messages.PROMOTE + ChatColor.RED + " HOST!! Congrats :D");
            return true;
        }
        else if (args[1].equalsIgnoreCase("coowner"))
        {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "manuadd " + player.getName() + " coowner");
            player.setOp(true);
            Bukkit.broadcastMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_RED + "Staff" + ChatColor.DARK_GRAY + "] " + ChatColor.DARK_RED + player.getName() + SE_Messages.PROMOTE + ChatColor.RED + " Co Owner!! Congrats :D");
            return true;
        }
        else if (args[1].equalsIgnoreCase("moderator"))
        {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "manuadd " + player.getName() + " moderator");
            Bukkit.broadcastMessage(ChatColor.DARK_GRAY + "[" + ChatColor.DARK_RED + "Staff" + ChatColor.DARK_GRAY + "] " + ChatColor.DARK_RED + player.getName() + SE_Messages.PROMOTE + ChatColor.RED + " Moderator! Congrats :D");
            return true;
        }
    
return true;
}
}
