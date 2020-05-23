package io.github.haykam821.stainedbeacons;

import io.github.haykam821.stainedbeacons.block.ModBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.tag.TagRegistry;
import net.minecraft.block.Block;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class Main implements ModInitializer {
	public static final String MOD_ID = "stainedbeacons";

	public static Identifier STAINED_BEACONS_ID = new Identifier(MOD_ID, "stained_beacons");
	public static Tag<Block> STAINED_BEACONS = TagRegistry.block(STAINED_BEACONS_ID);

	@Override
	public void onInitialize() {
		ModBlocks.initialize();
	}
}