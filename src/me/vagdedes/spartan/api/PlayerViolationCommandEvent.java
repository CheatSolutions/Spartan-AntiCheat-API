package me.vagdedes.spartan.api;

import me.vagdedes.spartan.system.Enums;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerViolationCommandEvent extends Event implements Cancellable {

    private Player p;
    private Enums.HackType h;
    private String c;
    private boolean cancelled = false;

    public PlayerViolationCommandEvent(Player player, Enums.HackType HackType, String command) {
        p = player;
        h = HackType;
        c = command;
    }

    public Player getPlayer() {
        return p;
    }

    public Enums.HackType getHackType() {
        return h;
    }

    public String getCommand() {
        return c;
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
