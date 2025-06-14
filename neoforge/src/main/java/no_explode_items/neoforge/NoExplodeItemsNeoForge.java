package no_explode_items.neoforge;

import net.neoforged.fml.common.Mod;
import no_explode_items.NoExplodeItems;

@Mod(NoExplodeItems.MOD_ID)
public final class NoExplodeItemsNeoForge {
    public NoExplodeItemsNeoForge() {
        // Run our common setup.
        NoExplodeItems.init();
    }
}
