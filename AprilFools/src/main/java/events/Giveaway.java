package events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import other.AprilFools;

public class Giveaway implements Listener {
    private AprilFools plugin;

    public Giveaway(AprilFools pl) { plugin = pl; }

    @EventHandler
    public void GiveAwayJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        if(p.hasPermission("aprilfools.giveaway")) {
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7&m-----------------------------------"));
            p.sendMessage(ChatColor.translateAlternateColorCodes('&',  plugin.getConfig().getString("servername") + " &8» &7We are giving away our top rank (" + plugin.getConfig().getString("toprank") + "&7)! Comment your in game name on this video to enter! &b&nhttps://www.youtube.com/watch?v=dQw4w9WgXcQdFsGjD"));
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&7&m-----------------------------------"));
        }
    }
}
