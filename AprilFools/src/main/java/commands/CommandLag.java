package commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import other.AprilFools;

import java.util.concurrent.TimeUnit;

public class CommandLag implements CommandExecutor {
    private CommandJCharles t;

    private AprilFools main;

    public CommandLag(AprilFools pl) { main = pl; }
    public void delay(long t) {
        try {
            Thread.sleep(t);
        } catch (InterruptedException e) {}
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player) || !sender.hasPermission("aprilfools.lag")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', main.getConfig().getString("noperm")));

        } else {
            Player p = (Player) sender;
            if(args.length < 1) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c/lag (player)"));
            } else {
                Player target = Bukkit.getServer().getPlayer(args[0]);
                if(target != null) {
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&n" + target.getName() + "&a&n is now experiencing lag for 7 seconds&a!"));
                    target.teleport(target);
                    int tplag = 0;
                    while(tplag < 12) {
                        delay(800);
                        target.teleport(target);
                        tplag++;
                    }
                } else {
                    p.sendMessage(ChatColor.RED + "Target is not online!");
                }
            }
        }








        return true;
    }
}
