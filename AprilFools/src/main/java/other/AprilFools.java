package other;

import commands.CommandBoost;
import commands.CommandGiveaway;
import commands.CommandJCharles;
import commands.CommandLag;
import events.TwentyFiveChance;
import events.Giveaway;
import events.RanChance;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class AprilFools extends JavaPlugin {
    PluginManager pm = Bukkit.getServer().getPluginManager();

    @Override
    public void onEnable() {
        // registering commands
        getCommand("jamescharles").setExecutor(new CommandJCharles(this));
        getCommand("giveaway").setExecutor(new CommandGiveaway(this));
        getCommand("lag").setExecutor(new CommandLag(this));
        getCommand("boost").setExecutor(new CommandBoost(this));



        // registering events
        pm.registerEvents(new Giveaway(this), this);
        pm.registerEvents(new RanChance(), this);
        pm.registerEvents(new TwentyFiveChance(), this);
        pm.registerEvents(new CommandBoost(this), this);




        // making config
        getConfig().options().copyDefaults();
        saveDefaultConfig();



    }
}
