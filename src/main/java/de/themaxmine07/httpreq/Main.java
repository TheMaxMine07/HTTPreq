package de.themaxmine07.httpreq;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import de.themaxmine07.httpreq.commands.print;

public final class Main extends JavaPlugin {

    private static Main plugin;

    @Override
    public void onEnable() {

        getCommand("print").setExecutor(new print());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static Plugin getPlugin() {return plugin;}
}
