package me.vagdedes.spartan.system;

public class Enums {

    public enum HackType {
        Exploits, EntityMove, NoSwing, IrregularMovements, ImpossibleActions, ItemDrops, AutoRespawn, InventoryClicks, Sprint, Jesus, NoSlowdown,
        Criticals, GhostHand, BlockReach, FastBow, FastClicks, FastHeal, ImpossibleInventory, HitReach, FastBreak, Speed, FastPlace,
        MorePackets, NoFall, FastEat, Velocity, KillAura
    }

    public enum Permission {
        condition, use_report, report, staff_chat, wave, reconnect, admin, reload, kick, verbose, bypass, manage, info, kick_message, ping, chat_protection, toggle, warn,
        use_bypass, ban, unban, ban_info, ban_message, mining, notifications, punishment, spectate
    }

    public enum ToggleAction {
        Enable, Disable
    }
}
