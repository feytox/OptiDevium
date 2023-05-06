package ru.feytox.optidevium;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OptiDevium implements ClientModInitializer {
    public static final String MOD_ID = "devoptimized";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.warn("If you see this message outside of the IDE, you must uninstall DevOptimized and install all the mods included in it yourself.");
    }
}
