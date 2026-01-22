package com.khazoda.rosegoldtier;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.registries.RegisterEvent;

@Mod(Constants.MOD_ID)
public class RoseGoldTierNeoForge {

    public RoseGoldTierNeoForge(IEventBus eventBus) {
        RoseGoldTierCommon.init();
        eventBus.addListener(this::onInit);
        eventBus.addListener(this::onRegister);
    }

    private void onInit(FMLCommonSetupEvent event) {
        event.enqueueWork(RoseGoldTierCommon::postInit);
    }

    private void onRegister(RegisterEvent event) {
        RoseGoldTierCommon.REGISTRARS.register(event.getRegistry());
    }
}