package com.khazoda.rosegoldtier;

import net.fabricmc.api.ModInitializer;

public class RoseGoldTierFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        RoseGoldTierCommon.init();
        RoseGoldTierCommon.postInit();
        RoseGoldTierCommon.REGISTRARS.registerAll();
    }
}
