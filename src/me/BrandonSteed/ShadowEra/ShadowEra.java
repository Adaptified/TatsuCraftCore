package me.BrandonSteed.ShadowEra;

import me.BrandonSteed.ShadowEra.Commands.Command_shadoweracore;
import me.BrandonSteed.ShadowEra.Listeners.JoinEvents;
import me.BrandonSteed.ShadowEra.Listeners.PlayerListener;
import me.BrandonSteed.ShadowEra.Listeners.ThorListener;
import net.pravian.bukkitlib.BukkitLib;
import net.pravian.bukkitlib.command.BukkitCommandHandler;
import net.pravian.bukkitlib.config.YamlConfig;
import net.pravian.bukkitlib.implementation.BukkitPlugin;
import net.pravian.bukkitlib.util.LoggerUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginManager;

public class ShadowEra extends BukkitPlugin
{

    public static ShadowEra plugin;
    public BukkitCommandHandler handler;
    public PlayerListener playerListener;
    public ThorListener thorHammer;
    public JoinEvents joinEvents;


    // YAML File Information
    public static YamlConfig config;


    @Override
    public void onLoad()
    {
     this.plugin = this;
     this.handler = new BukkitCommandHandler(plugin); // Initialize the command handler
     playerListener = new PlayerListener(plugin); // PlayerListener thingy
     thorHammer = new ThorListener(plugin);
     joinEvents = new JoinEvents(plugin);
    }

    @Override
    public void onEnable()
    {
        // Listener Crap
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(plugin.playerListener, plugin);
        pm.registerEvents(plugin.thorHammer, plugin);
        pm.registerEvents(plugin.joinEvents, plugin);

        // Bukkit Lib Important Stuff
        BukkitLib.init(plugin);
        handler.setCommandLocation(Command_shadoweracore.class.getPackage());

        // More YAML Setting Up and information.
        this.config = new YamlConfig(plugin, "config.yml");

        // The Actual Loading of the configuration File
        config.load();

        // The All Clear
        LoggerUtils.info(plugin, "has been enabled with no problems.");

    }

    @Override
    public void onDisable()
    {
        // Save the config.
        config.save();

    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
    {
        // BukkitLib Magic here, making commands work!
        return handler.handleCommand(sender, cmd, commandLabel, args);
    }
}
