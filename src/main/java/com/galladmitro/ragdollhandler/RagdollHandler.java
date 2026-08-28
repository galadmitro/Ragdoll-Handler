package com.galadmitro.ragdollhandler;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(RagdollHandler.MODID)
public class RagdollHandler {
    public static final String MODID = "ragdollhandler";
    private static final Logger LOGGER = LogManager.getLogger();

    public RagdollHandler(IEventBus modEventBus) {
        modEventBus.addListener(this::commonSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        if (ModList.get().isLoaded("sable")) {
            LOGGER.info("Successfully connected to Sable!");
        }
    }
}