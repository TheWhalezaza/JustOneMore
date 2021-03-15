package me.thewhalezaza.jombungee;

import net.md_5.bungee.api.ServerPing;
import net.md_5.bungee.api.ServerPing.Players;
import net.md_5.bungee.api.event.ProxyPingEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class Events implements Listener {
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onPing(ProxyPingEvent event) {
		ServerPing ping = event.getResponse();
		Players player = ping.getPlayers();
		player = new Players(player.getOnline() + 1, player.getOnline(), player.getSample());
		ServerPing p = new ServerPing(ping.getVersion(), player, ping.getDescription(), ping.getFaviconObject());
		event.setResponse(p);
	}
}
