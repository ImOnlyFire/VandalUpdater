/*
 * MIT License
 *
 * Copyright (c) 2021 ImOnlyFire
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 */

package me.onlyfire.example;

import me.onlyfire.vandalupdater.UpdateType;
import me.onlyfire.vandalupdater.VandalUpdater;
import org.bukkit.plugin.java.JavaPlugin;

public class ExamplePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();

        // Using FireFreeze as a test for our updater
        // https://www.spigotmc.org/resources/77105/
        String resourceId = "77105";

        // Getting the update type from config
        UpdateType updateType = UpdateType.valueOf(getConfig().getString("update-type"));

        VandalUpdater vandalUpdater = new VandalUpdater(this, resourceId, updateType);

        // If you don't set an update message, VandalUpdater will use a fallback one
        vandalUpdater.setUpdateMessage("Update found! %new% > %old%");

        // Checking for updates every 30 minutes
        vandalUpdater.runTaskTimerAsynchronously(this, 20L, 30 * 60 * 20L);

        getLogger().info("Yup, that's it");
    }

}
