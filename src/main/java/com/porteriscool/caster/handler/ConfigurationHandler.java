package com.porteriscool.caster.handler;

import com.porteriscool.caster.reference.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class ConfigurationHandler
    {
        public static Configuration configuration;

        public static boolean testValue = false;
        public static boolean enableaGeneration;

        public static String generation = "Generation";

        public static void init(File configFile)
        {
            if (configuration == null)
            {
                configuration = new Configuration(configFile);
                loadConfiguration();
            }
        }

        @SubscribeEvent
        public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
        {
            if (event.getModID().equalsIgnoreCase(Reference.MOD_ID))
            {
                loadConfiguration();
            }
        }

        private static void loadConfiguration()
        {
            testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example configuration value.");

            configuration.addCustomCategoryComment(generation, "This section adds and contains settings to ore generation.");

            enableaGeneration = configuration.get(generation, "enableGeneration", true, "Enable Ore Generation").getBoolean(enableaGeneration);

            if (configuration.hasChanged())
            {
                configuration.save();
            }
        }
    }
