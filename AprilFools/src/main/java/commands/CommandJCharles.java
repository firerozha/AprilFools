package commands;

import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import other.AprilFools;

import java.util.concurrent.TimeUnit;

public class CommandJCharles implements CommandExecutor {
    private AprilFools plugin;

    public CommandJCharles(AprilFools pl) { plugin = pl; }

    public void delayOfJcharlesLMAO(long t) {
        try {
            Thread.sleep(t);
        } catch (InterruptedException e) {}
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender.hasPermission("aprilfools.jcharles") && sender instanceof Player) {
            Player p = (Player) sender;
            int jcharles = 0;

            while(jcharles < 51) {
                delayOfJcharlesLMAO(40);
                sender.sendMessage(ChatColor.LIGHT_PURPLE + "HI SISTEERRRR!!!?!!?!11111///???!??!/");
                delayOfJcharlesLMAO(80);
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&d&k&lHI SISTEERRRR!!!?!!?!11111///???!??!/"));
                jcharles++;
            }
            delayOfJcharlesLMAO(60);
            Bukkit.getBanList(BanList.Type.NAME).addBan(p.getName(), ChatColor.LIGHT_PURPLE + "BYE SIISTERRR??1!!11111/1///??//1/1!!!", null, null);
            p.kickPlayer(ChatColor.LIGHT_PURPLE + "BYE SIISTERRR??1!!11111/1///??//1/1!!!");


        } else {
            sender.sendMessage(plugin.getConfig().getString("noperm"));
        }











        return true;
    }
}
