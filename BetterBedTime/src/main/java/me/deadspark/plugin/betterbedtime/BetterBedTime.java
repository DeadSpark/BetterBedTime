package me.deadspark.plugin.betterbedtime;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Objects;

public final class BetterBedTime extends JavaPlugin implements Listener {

    public void onEnable() {

        getLogger().info("BetterBedTime Plugin By DeadSpark");
        getLogger().info("BetterBedTime Plugin version SNAPSHOT-1.0 has been Enabled");
        getServer().getPluginManager().registerEvents(this, this);
        getConfig().options().copyDefaults();
        saveDefaultConfig();

    }

    public void onDisable() {

        getLogger().info("BetterBedTime Plugin version SNAPSHOT-1.0 has been Disabled");

    }

    @EventHandler
    public void OnBedEnter(PlayerBedEnterEvent event) {

        Player player = event.getPlayer();
        if (player.hasPermission("betterbedtime.enterbedmsg")) {

            String bedentermsg = getConfig().getString("bedentermessage");
            assert bedentermsg != null;
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', bedentermsg));

        }

    }

    @EventHandler
    public void OnBedExit(PlayerBedLeaveEvent event) {

        Player player = event.getPlayer();
        if (player.hasPermission("betterbedtime.bedleavemsg")) {

            String bedleavemsg = getConfig().getString("bedleavemessage");
            assert bedleavemsg != null;
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', bedleavemsg));

        }

        if (player.hasPermission("betterbedtime.heal")) {

            player.setHealth(20.00);

        }

        if (player.hasPermission("betterbedtime.feed")) {

            player.setFoodLevel(20);

        }

        if (Objects.equals(getConfig().getString("absorption"), "true")) {

            if (player.hasPermission("betterbedtime.effectabsorption")) {

                int absorptiondelay = getConfig().getInt("absorptiontime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, absorptiondelay, 3));

            }

        }

        if (Objects.equals(getConfig().getString("badluck"), "true")) {

            if (player.hasPermission("betterbedtime.effectbadluck")) {

                int badluckdelay = getConfig().getInt("badlucktime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.UNLUCK, badluckdelay, 2));

            }

        }

        if (Objects.equals(getConfig().getString("badomen"), "true")) {

            if (player.hasPermission("betterbedtime.effectbadome")) {

                int badomendelay = getConfig().getInt("badomentime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.BAD_OMEN, badomendelay, 2));

            }

        }

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equals("bbt")) {

            Player player = (Player) sender;
            player.sendMessage(ChatColor.BLACK + "--------------------------------------------------");
            player.sendMessage(ChatColor.GREEN + "BetterBedTime Plugin By DeadSpark");
            player.sendMessage(ChatColor.GREEN + "Check out our GitHub Page");
            player.sendMessage(ChatColor.GREEN + "https://deadspark.github.io/MysticalCrafts");
            player.sendMessage(ChatColor.BLACK + "--------------------------------------------------");

        }return false;

    }

}
