package me.BrandonSteed.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.SE_Messages;
import me.BrandonSteed.ShadowEra.ShadowEra;
import org.apache.commons.lang3.StringUtils;
import net.pravian.bukkitlib.command.BukkitCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_consolesay extends BukkitCommand {

    @Override
    public boolean run(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if (! (player.hasPermission("shadoweracore.command.consolesay"))) {
          sender.sendMessage(SE_Messages.NO_PREMS);
          return true;
          }
          String message = StringUtils.join(args, " ");
          Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + "[Server] " + message);
          player.sendMessage(SE_Messages.TAG_MOD + ChatColor.GOLD + "You have successfully said " + message + " as console!");
        return false;
    }
}
