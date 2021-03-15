package me.thewhalezaza.jombungee;

import net.md_5.bungee.api.plugin.Plugin;

public class Main extends Plugin {
	@SuppressWarnings("deprecation")
	@Override
	public void onEnable() {
		getProxy().getConsole().sendMessage("§e[*] Plugin Enabled!");
		getProxy().getPluginManager().registerListener(this, new Events());
	}
	
}
