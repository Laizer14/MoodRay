package net.laizer.moodyray;

import net.laizer.moodyray.Item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.laizer.moodyray.Item.ModItems;
import net.laizer.moodyray.block.ModBlocks;
import net.minecraft.item.BlockItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoodyRay implements ModInitializer {
	public static final String MOD_ID = "moodyray";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
