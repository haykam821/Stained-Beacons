package io.github.haykam821.stainedbeacons.block;

import io.github.haykam821.stainedbeacons.Main;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public enum ModBlocks {
	WHITE_STAINED_BEACON("white_stained_beacon", DyeColor.WHITE),
	ORANGE_STAINED_BEACON("orange_stained_beacon", DyeColor.ORANGE),
	MAGENTA_STAINED_BEACON("magenta_stained_beacon", DyeColor.MAGENTA),
	LIGHT_BLUE_STAINED_BEACON("light_blue_stained_beacon", DyeColor.LIGHT_BLUE),
	YELLOW_STAINED_BEACON("yellow_stained_beacon", DyeColor.YELLOW),
	LIME_STAINED_BEACON("lime_stained_beacon", DyeColor.LIME),
	PINK_STAINED_BEACON("pink_stained_beacon", DyeColor.PINK),
	GRAY_STAINED_BEACON("gray_stained_beacon", DyeColor.GRAY),
	LIGHT_GRAY_STAINED_BEACON("light_gray_stained_beacon", DyeColor.LIGHT_GRAY),
	CYAN_STAINED_BEACON("cyan_stained_beacon", DyeColor.CYAN),
	PURPLE_STAINED_BEACON("purple_stained_beacon", DyeColor.PURPLE),
	BLUE_STAINED_BEACON("blue_stained_beacon", DyeColor.BLUE),
	BROWN_STAINED_BEACON("brown_stained_beacon", DyeColor.BROWN),
	GREEN_STAINED_BEACON("green_stained_beacon", DyeColor.GREEN),
	RED_STAINED_BEACON("red_stained_beacon", DyeColor.RED),
	BLACK_STAINED_BEACON("black_stained_beacon", DyeColor.BLACK);

	public final StainedBeaconBlock block;
	public final BlockItem item;

	private ModBlocks(String path, DyeColor color) {
		Identifier id = new Identifier(Main.MOD_ID, path);

		Block.Settings blockSettings = FabricBlockSettings.of(Material.GLASS, color).strength(3.0f).lightLevel(15).nonOpaque();
		this.block = new StainedBeaconBlock(color, blockSettings);

		Item.Settings itemSettings = new Item.Settings().rarity(Rarity.RARE).group(ItemGroup.MISC);
		this.item = new BlockItem(this.block, itemSettings);

		Registry.register(Registry.BLOCK, id, this.block);
		Registry.register(Registry.ITEM, id, this.item);
	}

	public static ModBlocks initialize() {
		return null;
	}
}