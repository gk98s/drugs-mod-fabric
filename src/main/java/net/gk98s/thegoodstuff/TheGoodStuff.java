package net.gk98s.thegoodstuff;

import net.fabricmc.api.ModInitializer;
import net.gk98s.thegoodstuff.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheGoodStuff implements ModInitializer {
	public static final String MOD_ID = "thegoodstuff";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
