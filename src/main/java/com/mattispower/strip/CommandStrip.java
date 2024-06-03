package com.mattispower.strip;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.*;
import org.bukkit.plugin.Plugin;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class CommandStrip implements CommandExecutor {
    Plugin plugin;
    
    public CommandStrip(Plugin plugin) {
        this.plugin = plugin;
        
        Bukkit.getPluginCommand("strip").setExecutor(this);
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        HashMap<Material, Material> woods = new HashMap<Material, Material>();
        woods.put(Material.OAK_LOG, Material.STRIPPED_OAK_LOG);
        woods.put(Material.OAK_WOOD, Material.STRIPPED_OAK_WOOD);
        woods.put(Material.SPRUCE_LOG, Material.STRIPPED_SPRUCE_LOG);
        woods.put(Material.SPRUCE_WOOD, Material.STRIPPED_SPRUCE_WOOD);
        woods.put(Material.BIRCH_LOG, Material.STRIPPED_BIRCH_LOG);
        woods.put(Material.BIRCH_WOOD, Material.STRIPPED_BIRCH_WOOD);
        woods.put(Material.JUNGLE_LOG, Material.STRIPPED_JUNGLE_LOG);
        woods.put(Material.JUNGLE_WOOD, Material.STRIPPED_JUNGLE_WOOD);
        woods.put(Material.ACACIA_LOG, Material.STRIPPED_ACACIA_LOG);
        woods.put(Material.ACACIA_WOOD, Material.STRIPPED_ACACIA_WOOD);
        woods.put(Material.DARK_OAK_LOG, Material.STRIPPED_DARK_OAK_LOG);
        woods.put(Material.DARK_OAK_WOOD, Material.STRIPPED_DARK_OAK_WOOD);
        woods.put(Material.MANGROVE_LOG, Material.STRIPPED_MANGROVE_LOG);
        woods.put(Material.MANGROVE_WOOD, Material.STRIPPED_MANGROVE_WOOD);
        woods.put(Material.CHERRY_LOG, Material.STRIPPED_CHERRY_LOG);
        woods.put(Material.CHERRY_WOOD, Material.STRIPPED_CHERRY_WOOD);
        woods.put(Material.CRIMSON_STEM, Material.STRIPPED_CRIMSON_STEM);
        woods.put(Material.CRIMSON_HYPHAE, Material.STRIPPED_CRIMSON_HYPHAE);
        woods.put(Material.WARPED_STEM, Material.STRIPPED_WARPED_STEM);
        woods.put(Material.WARPED_HYPHAE, Material.STRIPPED_WARPED_HYPHAE);
        woods.put(Material.BAMBOO_BLOCK, Material.STRIPPED_BAMBOO_BLOCK);


        if (!(sender instanceof Player)) {
            sender.sendMessage("A player needs to perform this command");
            return true;
        }

        Player p = (Player) sender;

        ItemStack s = p.getInventory().getItemInMainHand();
        
        if (woods.containsKey(s.getType())) {
            s.setType(woods.get(s.getType()));
            return true;
        }

        sender.sendMessage("You dont have any strippable items in your hand.");
        return true;
    }
}