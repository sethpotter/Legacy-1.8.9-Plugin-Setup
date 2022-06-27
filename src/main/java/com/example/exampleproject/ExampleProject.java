package com.example.exampleproject;

import com.example.exampleproject.cmds.ExampleProjectCommands;
import com.example.exampleproject.listeners.EventListener;
import org.bukkit.plugin.java.JavaPlugin;

public class ExampleProject extends JavaPlugin {

    private static ExampleProject inst;

    public ExampleProject() {
        if(inst == null)
            inst = this;
    }

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EventListener(), this);
        getCommand("exampleproject").setExecutor(new ExampleProjectCommands());
    }

    @Override
    public void onDisable() {

    }

    public static ExampleProject inst() {
        return inst;
    }

}