package com.mattispower.strip;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;

public final class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {

        new CommandStrip(this);

        getServer().getConsoleSender().sendMessage("[Strip] " + ChatColor.DARK_AQUA + ChatColor.BOLD + "Strip v" + getDescription().getVersion() + " by MattisPower");
    }
    
    @Override
    public void onDisable() {}
}
