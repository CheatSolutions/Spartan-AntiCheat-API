package me.vagdedes.spartan.api;

import me.vagdedes.spartan.system.Enums;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.ArrayList;

public class ViolationResetEvent extends Event implements Cancellable {

    private boolean cancelled = false;
    private final ArrayList<Enums.HackType> ignore = new ArrayList<>(Enums.HackType.values().length);

    public ViolationResetEvent() {
    }

    public void setIgnoredChecks(ArrayList<Enums.HackType> array) {
        if (array != null) {
            for (Enums.HackType hackType : array) {
                ignoreCheck(hackType);
            }
        }
    }

    public void ignoreCheck(Enums.HackType hackType) {
        if (!ignore.contains(hackType)) {
            ignore.add(hackType);
        }
    }

    public ArrayList<Enums.HackType> getIgnoredChecks() {
        return ignore;
    }

    public int getTime() {
        return API.getViolationResetTime();
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
