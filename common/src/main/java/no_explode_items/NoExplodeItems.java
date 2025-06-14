package no_explode_items;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class NoExplodeItems {
    public static final String MOD_ID = "no_explode_items";
    public static final Logger LOGGER = LoggerFactory.getLogger("NoExplodeItems");

    public static void init() {
        LOGGER.info("No more exploding items!");
    }
}
