package com.supdapillar.lumbertycoon.Runnables;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

public class TickRunnable extends BukkitRunnable{
    int timer = 0;
    @Override
    public void run() {

        for(Entity entity : Bukkit.getWorld("World").getEntities()){
            if (entity instanceof Item){
                Item item = (Item) entity;

                if (item.getLocation().add(0,-1,0) .getBlock().getType() == Material.MAGENTA_GLAZED_TERRACOTTA){
                    item.setVelocity(new Vector(1,0,0));
                }


            }
        }
    }
}
