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
        getLogger().info("BetterBedTime Plugin version 1.3 has been Enabled");
        getServer().getPluginManager().registerEvents(this, this);
        getConfig().options().copyDefaults();
        saveDefaultConfig();

    }

    public void onDisable() {

        getLogger().info("BetterBedTime Plugin version 1.3 has been Disabled");

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

            if (player.hasPermission("betterbedtime.effectbadomen")) {

                int badomendelay = getConfig().getInt("badomentime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.BAD_OMEN, badomendelay, 2));

            }

        }

        if (Objects.equals(getConfig().getString("blindness"), "true")) {

            if (player.hasPermission("betterbedtime.effectblindness")) {

                int blindnessdelay = getConfig().getInt("blindnesstime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, blindnessdelay, 2));

            }

        }

        if (Objects.equals(getConfig().getString("conduitpower"), "true")) {

            if (player.hasPermission("betterbedtime.effectconduitpower")) {

                int conduitpowerdelay = getConfig().getInt("conduitpowertime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.CONDUIT_POWER, conduitpowerdelay, 2));

            }

        }

        if (Objects.equals(getConfig().getString("dolphinsgrace"), "true")) {

            if (player.hasPermission("betterbedtime.effectdolphinsgrace")) {

                int dolphinsgracedelay = getConfig().getInt("dolphinsgracetime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, dolphinsgracedelay, 2));

            }

        }

        if (Objects.equals(getConfig().getString("fireresistance"), "true")) {

            if (player.hasPermission("betterbedtime.effectfireresistance")) {

                int fireresistancedelay = getConfig().getInt("fireresistancetime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, fireresistancedelay, 2));

            }

        }

        if (Objects.equals(getConfig().getString("glowing"), "true")) {

            if (player.hasPermission("betterbedtime.effectglowing")) {

                int glowingdelay = getConfig().getInt("glowingtime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, glowingdelay, 2));

            }

        }

        if (Objects.equals(getConfig().getString("haste"), "true")) {

            if (player.hasPermission("betterbedtime.effecthaste")) {

                int hastedelay = getConfig().getInt("hastetime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, hastedelay, 2));

            }

        }

        if (Objects.equals(getConfig().getString("healthboost"), "true")) {

            if (player.hasPermission("betterbedtime.effecthealthboost")) {

                int healthboostdelay = getConfig().getInt("healthboosttime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, healthboostdelay, 2));

            }

        }

        if (Objects.equals(getConfig().getString("heroofthevillage"), "true")) {

            if (player.hasPermission("betterbedtime.effectvillagehero")) {

                int villageherodelay = getConfig().getInt("heroofthevillagetime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, villageherodelay, 2));


            }

        }

        if (Objects.equals(getConfig().getString("hunger"), "true")) {

            if (player.hasPermission("betterbedtime.effecthunger")) {

                int hungerdelay = getConfig().getInt("hungertime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, hungerdelay, 2));

            }

        }

        if (Objects.equals(getConfig().getString("instantdamage"), "true")) {

            if (player.hasPermission("betterbedtime.effectinstantdamage")) {

                int instantdamagedelay = getConfig().getInt("instantdamagetime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, instantdamagedelay,2));

            }

        }

        if (Objects.equals(getConfig().getString("instanthealth"), "true")) {

            if (player.hasPermission("betterbedtime.effectinstanthealth")) {

                int instanthealthdelay = getConfig().getInt("instanthealthtime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, instanthealthdelay, 2));

            }

        }

        if (Objects.equals(getConfig().getString("invisibility"), "true")) {

            if (player.hasPermission("betterbedtime.effectinvisibility")) {

                int invisibilitydelay = getConfig().getInt("invisibilitytime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, invisibilitydelay, 2));

            }

        }

        if (Objects.equals(getConfig().getString("jumpboost"), "true")) {

            if (player.hasPermission("betterbedtime.effectjumpboost")) {

                int jumpboostdelay = getConfig().getInt("jumpboosttime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, jumpboostdelay, 2));

            }

        }

        if (Objects.equals(getConfig().getString("levitation"), "true")) {

            if (player.hasPermission("betterbedtime.effectlevitation")) {

                int levitationdelay = getConfig().getInt("levitationtime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, levitationdelay, 2));

            }

        }

        if (Objects.equals(getConfig().getString("luck"), "true")) {

            if (player.hasPermission("betterbedtime.effectluck")) {

                int luckdelay = getConfig().getInt("lucktime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.LUCK, luckdelay, 2));

            }

        }

        if (Objects.equals(getConfig().getString("miningfatigue"), "true")) {

            if (player.hasPermission("betterbedtime.effectminingfatigue")) {

                int miningfatiguedelay = getConfig().getInt("miningfatiguetime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, miningfatiguedelay, 2));

            }

        }

        if (Objects.equals(getConfig().getString("nausea"), "true")) {

            if (player.hasPermission("betterbedtime.effectnausea")) {

                int nauseadelay = getConfig().getInt("nauseatime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, nauseadelay, 2));

            }

        }

        if (Objects.equals(getConfig().getString("nightvision"), "true")) {

            if (player.hasPermission("betterbedtime.effectnightvision")) {

                int nightvisiondelay = getConfig().getInt("nightvisiontime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, nightvisiondelay, 2));

            }

        }

        if (Objects.equals(getConfig().getString("poison"), "true")) {

            if (player.hasPermission("betterbedtime.effectpoison")) {

                int poisondelay = getConfig().getInt("poisontime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, poisondelay, 2));

            }

        }

        if (Objects.equals(getConfig().getString("regeneration"), "true")) {

            if (player.hasPermission("betterbedtime.effectregeneration")) {

                int regenerationdelay = getConfig().getInt("regenerationtime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, regenerationdelay, 2));

            }

        }

        if (Objects.equals(getConfig().getString("resistance"), "true")) {

            if (player.hasPermission("betterbedtime.effectresistance")) {

                int resistancedelay = getConfig().getInt("resistancetime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, resistancedelay, 2));

            }

        }

        if (Objects.equals(getConfig().getString("saturation"), "true")) {

            if (player.hasPermission("betterbedtime.effectsaturation")) {

                int saturationdelay = getConfig().getInt("saturationtime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, saturationdelay, 2));

            }

        }

        if (Objects.equals(getConfig().getString("slowfalling"), "true")) {

            if (player.hasPermission("betterbedtime.eventslowfalling")) {

                int slowfallingdelay = getConfig().getInt("slowfallingtime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, slowfallingdelay, 2));

            }

        }

        if (Objects.equals(getConfig().getString("slowness"), "true")) {

            if (player.hasPermission("betterbedtime.effectslowness")) {

                int slownessdelay = getConfig().getInt("slownesstime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, slownessdelay, 2));

            }

        }

        if (Objects.equals(getConfig().getString("speed"), "true")) {

            if (player.hasPermission("betterbedtime.effectspeed")) {

                int speeddelay = getConfig().getInt("speedtime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, speeddelay, 2));

            }

        }

        if (Objects.equals(getConfig().getString("waterbreathing"), "true")) {

            if (player.hasPermission("betterbedtime.effectwaterbreathing")) {

                int waterbreathingdelay = getConfig().getInt("waterbreathingtime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, waterbreathingdelay,2));

            }

        }

        if (Objects.equals(getConfig().getString("weakness"), "true")) {

            if (player.hasPermission("betterbedtime.effectweakness")) {

                int weaknessdelay = getConfig().getInt("weakness");
                player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, weaknessdelay,2));

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
