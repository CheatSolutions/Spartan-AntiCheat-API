package me.vagdedes.spartan;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Register extends JavaPlugin implements Listener {

    public static Plugin plugin;

    public void onEnable() {
        plugin = this;

        if (!getDescription().getName().equalsIgnoreCase("SpartanAPI")
                || !getDescription().getVersion().equalsIgnoreCase("Universal")
                || !getDescription().getWebsite().equalsIgnoreCase("https://www.spigotmc.org/resources/25638")
                || !getDescription().getAuthors().toString().equalsIgnoreCase("[Evangelos Dedes @Vagdedes]")) {
            Bukkit.getPluginManager().disablePlugin(plugin);
            return;
        }
        Bukkit.getPluginManager().registerEvents(this, this);
    }
}
