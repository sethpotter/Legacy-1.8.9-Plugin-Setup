package com.example.exampleproject.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class EventListener implements Listener {

    // Event that fires whenever a player clicks a slot in any inventory.
    @EventHandler
    public void onClick(InventoryClickEvent event) {
        // Cancels the event. Meaning the player cannot click the item.
        event.setCancelled(true);
    }

    /*
     * Tutorial on viewing the event hierarchy in IntellJ
     *
     * Click on the InventoryClickEvent in "public void onClick" and press Ctrl+H on your keyboard.
     * You should see a menu popup that shows you the hierarchy of the InventoryClickEvent.
     *
     * This is good, but we want to see all available events!
     *
     * To do this simply double-click on the org.bukkit.Event in the hierarchy.
     * It will open the base Event class. You can then click on the Event in "public abstract class Event"
     * and press Ctrl+H one more time.
     *
     * You should now see a detailed list of events for spigot.
     */

}