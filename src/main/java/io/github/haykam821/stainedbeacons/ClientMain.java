package io.github.haykam821.stainedbeacons;

import io.github.haykam821.stainedbeacons.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class ClientMain implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		RenderLayer stainedBeaconLayer = RenderLayer.getTranslucent();

		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WHITE_STAINED_BEACON.block, stainedBeaconLayer);
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORANGE_STAINED_BEACON.block, stainedBeaconLayer);
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAGENTA_STAINED_BEACON.block, stainedBeaconLayer);
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_BLUE_STAINED_BEACON.block, stainedBeaconLayer);
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_STAINED_BEACON.block, stainedBeaconLayer);
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIME_STAINED_BEACON.block, stainedBeaconLayer);
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_STAINED_BEACON.block, stainedBeaconLayer);
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRAY_STAINED_BEACON.block, stainedBeaconLayer);
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_GRAY_STAINED_BEACON.block, stainedBeaconLayer);
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CYAN_STAINED_BEACON.block, stainedBeaconLayer);
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PURPLE_STAINED_BEACON.block, stainedBeaconLayer);
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_STAINED_BEACON.block, stainedBeaconLayer);
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BROWN_STAINED_BEACON.block, stainedBeaconLayer);
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GREEN_STAINED_BEACON.block, stainedBeaconLayer);
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_STAINED_BEACON.block, stainedBeaconLayer);
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACK_STAINED_BEACON.block, stainedBeaconLayer);
	}
}