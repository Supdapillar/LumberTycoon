package com.supdapillar.lumbertycoon;

import com.supdapillar.lumbertycoon.Listeners.PlayerMovementListener;
import com.supdapillar.lumbertycoon.Runnables.TickRunnable;
import org.bukkit.plugin.java.JavaPlugin;

public final class LumberTycoonPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        new TickRunnable().runTaskTimer(this,0,1);

        new PlayerMovementListener(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
