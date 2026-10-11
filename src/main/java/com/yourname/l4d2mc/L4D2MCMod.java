package com.yourname.l4d2mc;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class L4D2MCMod implements ModInitializer {
    public static final String MOD_ID = "l4d2mc";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.register();
        WeaponRegistry.register();

        ServerLifecycleEvents.SERVER_STARTED.register(this::onServerStarted);
        ServerTickEvents.END_SERVER_TICK.register(this::onServerTick);

        LOGGER.info("L4D2 Minecraft Survivor initialized");
    }

    private void onServerStarted(MinecraftServer server) {
        LOGGER.info("Server started. Survival prototype ready");
    }

    private void onServerTick(MinecraftServer server) {
        // Hook de prototipo: oleadas, reglas de supervivencia, y combate de armas.
    }
}
