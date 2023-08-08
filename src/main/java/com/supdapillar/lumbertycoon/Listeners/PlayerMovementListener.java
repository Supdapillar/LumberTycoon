package com.supdapillar.lumbertycoon.Listeners;

import com.supdapillar.lumbertycoon.LumberTycoonPlugin;
import org.bukkit.Bukkit;
import org.bukkit.entity.Vehicle;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

public class PlayerMovementListener implements Listener {
    public PlayerMovementListener(LumberTycoonPlugin plugin){
        Bukkit.getServer().getPluginManager().registerEvents(this,plugin);
    }

    @EventHandler
    public void OnPlayerMove(PlayerMoveEvent event){
        if(event.getPlayer().isInsideVehicle()){
            Vehicle vehicle = (Vehicle) event.getPlayer().getVehicle();
            vehicle.setVelocity(new Vector(0,1,0));
        }
    }
}