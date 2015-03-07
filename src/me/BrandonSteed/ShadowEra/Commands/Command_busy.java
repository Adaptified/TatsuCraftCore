package me.BrandonSteed.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.Modules.BusyModule;
import me.BrandonSteed.ShadowEra.SE_Messages;
import net.pravian.bukkitlib.command.BukkitCommand;
import net.pravian.bukkitlib.command.CommandPermissions;
import net.pravian.bukkitlib.command.SourceType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(source = SourceType.PLAYER, permission = "")
public class Command_busy extends BukkitCommand
{

    @Override
    public boolean run(CommandSender sender, Command cmnd, String string, String[] args)
    {
        Player player = (Player) sender;
        if (! (player.hasPermission("shadoweracore.command.busy"))) {
          sender.sendMessage(SE_Messages.NO_PREMS);
          return true;
       }
        BusyModule.toggleBusyPlayer(player);
        return true;
    }

}
