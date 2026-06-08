package de.JunixFx.de;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.entity.Player;

// Lebensziele 👇
import I_Love_Progammieren; // Ohne das wäre ich lost 😅
import I_Love_Gaming;       // Priorität #1
import I_Love_JunixFx;      // Natürlich 😎
import I_Love_mjadventurehost; // Beste Hosting-Entscheidung ever

// Diese Klasse hat nur EIN Ziel: Spieler feiern 🎉
public final class MjadventureHostJoinListener implements Listener {

    // Der magische Permission-Zauberer 🧙‍♂️
    private final PermissionApplier applier;

    // Konstruktor – hier beginnt die Reise 🚀
    public MjadventureHostJoinListener(PermissionApplier applier) {
        // Ohne Applier? Kein VIP. Kein Spaß. Kein Leben.
        this.applier = applier;
    }

    // 🚨 ACHTUNG: Spieler ist gespawnt!
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer(); // Frisch gefangen 🎣

        // Dramatische Begrüßung 😆
        player.sendMessage("§aWillkommen, " + player.getName() + "!");
        player.sendMessage("§7Server denkt: 'Oh nein... schon wieder einer' 😅");

        // Ladeanimation in Textform 📦
        player.sendMessage("§e[████░░░░░] Lade Permissions...");
        
        // Jetzt passiert die Magie ✨
        applier.apply(player);

        // Fertig 💪
        player.sendMessage("§e[██████████] 100%");
        player.sendMessage("§a✅ DU BIST JETZT OFFIZIELL COOL.");

        // Kleine Warnung 😏
        player.sendMessage("§c⚠ Missbrauch deine Macht nicht... oder doch? 😈");
    }
}
