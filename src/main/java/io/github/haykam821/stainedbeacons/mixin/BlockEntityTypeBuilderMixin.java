package io.github.haykam821.stainedbeacons.mixin;

import java.util.function.Supplier;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import io.github.haykam821.stainedbeacons.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;

@Mixin(BlockEntityType.Builder.class)
public class BlockEntityTypeBuilderMixin {
	@Inject(method = "create", at = @At("HEAD"), cancellable = true)
	private static <T extends BlockEntity> void addStainedBeacons(Supplier<T> supplier, Block[] blocks, CallbackInfoReturnable<BlockEntityType.Builder<T>> ci) {

		if (blocks[0] == Blocks.BEACON && blocks.length == 1) {
			ci.setReturnValue(BlockEntityType.Builder.create(supplier, Blocks.BEACON, ModBlocks.WHITE_STAINED_BEACON.block, ModBlocks.ORANGE_STAINED_BEACON.block, ModBlocks.MAGENTA_STAINED_BEACON.block, ModBlocks.LIGHT_BLUE_STAINED_BEACON.block, ModBlocks.YELLOW_STAINED_BEACON.block, ModBlocks.LIME_STAINED_BEACON.block, ModBlocks.PINK_STAINED_BEACON.block, ModBlocks.GRAY_STAINED_BEACON.block, ModBlocks.LIGHT_GRAY_STAINED_BEACON.block, ModBlocks.CYAN_STAINED_BEACON.block, ModBlocks.PURPLE_STAINED_BEACON.block, ModBlocks.BLUE_STAINED_BEACON.block, ModBlocks.BROWN_STAINED_BEACON.block, ModBlocks.GREEN_STAINED_BEACON.block, ModBlocks.RED_STAINED_BEACON.block, ModBlocks.BLACK_STAINED_BEACON.block));
		}
	}
}