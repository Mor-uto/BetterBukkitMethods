package me.pluginname.pluginname;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class pluginname extends JavaPlugin {

    public String ColorTranslate(String text) {
        text = ChatColor.translateAlternateColorCodes('&', text);
        return text;
    }
}
