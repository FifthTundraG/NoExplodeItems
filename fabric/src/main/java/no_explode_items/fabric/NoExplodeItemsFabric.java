package no_explode_items.fabric;

import net.fabricmc.api.ModInitializer;
import no_explode_items.NoExplodeItems;

public final class NoExplodeItemsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        NoExplodeItems.init();
    }
}
