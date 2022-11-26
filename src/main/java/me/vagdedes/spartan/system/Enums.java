package me.vagdedes.spartan.system;

import me.vagdedes.spartan.Register;
import me.vagdedes.spartan.objects.system.Check;

public class Enums {

    public enum HackType {
        XRay, Exploits, EntityMove, NoSwing, IrregularMovements, ImpossibleActions, ItemDrops, AutoRespawn, InventoryClicks,
        NoSlowdown, Criticals, GhostHand, BlockReach, FastBow, FastClicks, FastHeal, ImpossibleInventory, HitReach, FastBreak, Speed, FastPlace,
        MorePackets, NoFall, FastEat, Velocity, KillAura;

        private final String id;
        private Check check;

        HackType() {
            this.id = String.valueOf(this.ordinal());
            this.check = null;
        }

        public String getID() {
            return id;
        }

        public Check getCheck() {
            return check != null ? check : (check = new Check(this));
        }

        public void setCheck(Check check) {
            this.check = check;
        }
    }

    public enum Permission {
        condition, report, staff_chat, wave, reconnect, admin, reload, kick, bypass, manage, info,
        chat_protection, warn, use_bypass, ban, unban, notifications;

        private final String key;

        Permission() {
            key = Register.plugin.getName().toLowerCase() + "." + this.name().toLowerCase();
        }

        public String getKey() {
            return key;
        }
    }

    public enum ToggleAction {
        Enable, Disable
    }
}
