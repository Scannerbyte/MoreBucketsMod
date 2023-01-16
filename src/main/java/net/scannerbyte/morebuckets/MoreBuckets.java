package net.scannerbyte.morebuckets;

import net.fabricmc.api.ModInitializer;
import net.scannerbyte.morebuckets.block.ModBlocks;
import net.scannerbyte.morebuckets.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreBuckets implements ModInitializer {

	public static final String MOD_ID = "morebuckets";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
