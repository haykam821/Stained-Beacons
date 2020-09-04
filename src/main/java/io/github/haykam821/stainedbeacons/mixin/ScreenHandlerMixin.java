package io.github.haykam821.stainedbeacons.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import io.github.haykam821.stainedbeacons.Main;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;

@Mixin(ScreenHandler.class)
public class ScreenHandlerMixin {
	@Inject(method = "canUse", at = @At("HEAD"), cancellable = true)
	private static void canUse(ScreenHandlerContext context, PlayerEntity player, Block target, CallbackInfoReturnable<Boolean> ci) {
		if (target == Blocks.BEACON) {
			ci.setReturnValue(context.run((world, blockPos) -> {
				Block block = world.getBlockState(blockPos).getBlock();
				if (block != target && !Main.STAINED_BEACONS.contains(block)) return false;

				return player.squaredDistanceTo(blockPos.getX() + 0.5d, blockPos.getY() + 0.5d, blockPos.getZ() + 0.5d) <= 64.0d;
			}, true));
		}
	}
}