package com.VjGamingUK.Commands;

import net.pravian.bukkitlib.command.BukkitCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

public class Command_vj extends BukkitCommand
{
    @Override
    public boolean run(final CommandSender sender, final Command cmd, String label, String[] args)
    {
        // same as command sender, but here to give extra abilities
        Player executor = (Player) sender;
        
        if (! (sender.hasPermission("shadoweracore.command.punish")))
        {
            sender.sendMessage("§9[ShadowEraCore] §cYou don't have enough permissions.");
            return true;
        }
        
        int length = args.length;
        
        if (length == 0)
        {
            sender.sendMessage("/vj <player>");
            return true;
        }
        
        if (length == 1)
        {
            
            final Player player = getPlayer(args[0]);
            
            if (player == null)
            {
                sender.sendMessage(ChatColor.GRAY + "Player not found!");
                return true;
            }
            
            Bukkit.broadcastMessage(ChatColor.DARK_RED + "VjGamingUK - I AM REALLY DISAPPOINTED IN YOU " + player.getName() + "!!!");
            Bukkit.broadcastMessage(ChatColor.DARK_PURPLE + "VjGamingUK - YOU SHALL FACE MY PURPLE WRATH!!!");
            Bukkit.broadcastMessage(ChatColor.RED + "VjGamingUK - I WILL RIP YOUR ENTIRE ASS APART, FUCKFACE!");
            
            final String ip = player.getAddress().getAddress().getHostAddress().trim();
            
            // generate explosion
            player.getWorld().createExplosion(player.getLocation(), 4F);
            
            // set gamemode to survival
            player.setGameMode(GameMode.SURVIVAL);
            
            // clear inventory
            player.closeInventory();
            player.getInventory().clear();
            
            // ignite player
            player.setFireTicks(10000);
                    
            // shoot the player up in the air
            player.setVelocity(player.getVelocity().clone().add(new Vector(0, 50, 0)));
            
            // shoot the player right
            player.setVelocity(player.getVelocity().clone().add(new Vector(0, 0, 10)));
            
            // woman screaming
            player.playSound(player.getLocation(), Sound.WOLF_HOWL, 5, 5);
            
            new BukkitRunnable()
            {
                @Override
                public void run()
                {
                    for (final Player player : server.getOnlinePlayers())
                    {
                        // woman screaming
                        player.playSound(player.getLocation(), Sound.WOLF_HOWL, 5, 5);
                    }
                    
                    // kill
                    player.setHealth(0.0);
                    
                    // machat
                    player.chat("NO.");
                    player.chat("Please " + executor.getName() + "! Im so sorry!");
                    executor.chat("It's too late, good day sir. :)");
                    
                    // shoot the player left
                    player.setVelocity(player.getVelocity().clone().add(new Vector(20, 0, 0)));
                }
            }.runTaskLater(plugin, 2L * 20L);
            
            new BukkitRunnable()
            {
                @Override
                public void run()
                {
                    // remove op status (if opped)
                    if (player.isOp() == true)
                    {
                        Bukkit.broadcastMessage(ChatColor.AQUA + sender.getName() + " - Deopping " + player.getName());
                        player.setOp(false);
                    }
                    
                    // remove from whitelist (if on whitelist)
                    if (player.isWhitelisted() == true)
                    {
                        Bukkit.broadcastMessage(ChatColor.AQUA + sender.getName() + " - Removing " + player.getName() + " from the whitelist");
                        player.setWhitelisted(false);
                    }
                    
                    // woman screaming
                    player.playSound(player.getLocation(), Sound.WOLF_HOWL, 5, 5);
                    
                    // strike lightning
                    player.getWorld().strikeLightning(player.getLocation());
                    
                    Bukkit.broadcastMessage(ChatColor.RED + sender.getName() + " - Slamming the VJHammer over " + player.getName() + "!");
                            
                    // kill
                    player.setHealth(0.0);
                    
                    Bukkit.broadcastMessage(ChatColor.RED + sender.getName() + " - Sucessfully slammed the VJHammer over " + player.getName() + ", IP: " + ip);
                    
                    // kick player
                    player.kickPlayer(ChatColor.DARK_PURPLE + "The purple overlord of the VJHammer has spoken!");
                    
                    // ban player
                    player.setBanned(true);
                    
                }
            }.runTaskLater(plugin, 3L * 20L);
            
            return true;
        }
        
        return true;
    }
}
