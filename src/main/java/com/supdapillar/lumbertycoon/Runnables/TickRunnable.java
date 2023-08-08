package com.supdapillar.lumbertycoon.Runnables;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.block.data.Directional;
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

                    Block block = item.getLocation().add(0,-1,0) .getBlock();
                    if(block.getType()==Material.MAGENTA_GLAZED_TERRACOTTA) {

                        if(block.getBlockData() instanceof Directional) {
                            Directional bmeta = (Directional) block.getBlockData();
                            Bukkit.broadcastMessage("PLACE:brownM "+bmeta.getFacing());
                            switch  (bmeta.getFacing()){

                                case NORTH:
                                    item.setVelocity(new Vector(0,0,0.25));
                                    break;
                                case EAST:
                                    item.setVelocity(new Vector(-0.25,0,0));
                                    break;
                                case SOUTH:
                                    item.setVelocity(new Vector(0,0,-0.25));
                                    break;
                                case WEST:
                                    item.setVelocity(new Vector(0.25,0,0));
                                    break;
                            }
                        }

                    }
            }
        }
    }
}
