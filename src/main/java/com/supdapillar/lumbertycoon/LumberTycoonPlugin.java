package com.supdapillar.lumbertycoon;

import com.supdapillar.lumbertycoon.Helpers.ScoreboardHandler;
import com.supdapillar.lumbertycoon.Listeners.PlayerMovementListener;
import com.supdapillar.lumbertycoon.Runnables.TickRunnable;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.UUID;

public final class LumberTycoonPlugin extends JavaPlugin {

    public HashMap<UUID, Integer> playerMoney = new HashMap<UUID, Integer>();
    @Override
    public void onEnable() {
        // Plugin startup logic
        new TickRunnable().runTaskTimer(this,0,1);

        new PlayerMovementListener(this);
        ScoreboardHandler.startScoreboard();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
