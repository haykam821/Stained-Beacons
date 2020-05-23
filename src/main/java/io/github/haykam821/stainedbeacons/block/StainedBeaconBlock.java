package io.github.haykam821.stainedbeacons.block;

import net.minecraft.block.BeaconBlock;
import net.minecraft.util.DyeColor;

public class StainedBeaconBlock extends BeaconBlock {
	private final DyeColor color;

	public StainedBeaconBlock(DyeColor color, Settings settings) {
		super(settings);
		this.color = color;
	}

	@Override
	public DyeColor getColor() {
		return color;
	}
}