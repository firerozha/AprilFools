package commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import other.AprilFools;

import java.awt.*;

public class CommandGiveaway implements CommandExecutor {

    private AprilFools plugin;

    public CommandGiveaway(AprilFools pl) { plugin = pl; }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!sender.hasPermission("aprilfools.giveaway") && !(sender instanceof Player)) {
            sender.sendMessage(plugin.getConfig().getString("noperm"));
        } else {
            Player p = (Player) sender;
            p.sendMessage(ChatColor.translateAlternateColorCodes('&',  plugin.getConfig().getString("servername") + " &8» &7We are giving away our top rank (" + plugin.getConfig().getString("toprank") + "&7)! Comment your in game name on this video to enter! &b&nhttps://www.youtube.com/watch?v=dQw4w9WgXcQdFsGjD"));
        }








        return true;
    }
}
