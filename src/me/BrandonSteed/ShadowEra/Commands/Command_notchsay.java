package me.BrandonSteed.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.SE_Messages;
import net.minecraft.util.org.apache.commons.lang3.StringUtils;
import net.pravian.bukkitlib.command.BukkitCommand;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_notchsay extends BukkitCommand {


    @Override
    public boolean run(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;    
        if (! (player.hasPermission("shadoweracore.command.notchsay"))) {
          sender.sendMessage(SE_Messages.NO_PREMS);
          return true;
       }
        String message = StringUtils.join(args, " ");
        
        Bukkit.broadcastMessage(SE_Messages.NOTCH + message);
        return true;

    }
}
//Written by @zD12 then adapted | https://github.com/zD12
