package me.vagdedes.spartan.api;

import me.vagdedes.spartan.system.Enums;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class CheckCancelEvent extends Event implements Cancellable {

    private final Player p;
    private final Enums.HackType h;
    private boolean cancelled = false;

    public CheckCancelEvent(Player player, Enums.HackType HackType) {
        p = player;
        h = HackType;
    }

    public Player getPlayer() {
        return p;
    }

    public Enums.HackType getHackType() {
        return h;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean b) {
        this.cancelled = b;
    }

    private static final HandlerList handlers = new HandlerList();

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
