package io.github.haykam821.stainedbeacons.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import io.github.haykam821.stainedbeacons.Main;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.container.BlockContext;
import net.minecraft.container.Container;
import net.minecraft.entity.player.PlayerEntity;

@Mixin(Container.class)
public class ContainerMixin {
	@Inject(method = "canUse", at = @At("HEAD"), cancellable = true)
	private static void canUse(BlockContext context, PlayerEntity player, Block target, CallbackInfoReturnable<Boolean> ci) {
		if (target == Blocks.BEACON) {
			ci.setReturnValue(context.run((world, blockPos) -> {
				Block block = world.getBlockState(blockPos).getBlock();
				if (block != target && !Main.STAINED_BEACONS.contains(block)) return false;

				return player.squaredDistanceTo(blockPos.getX() + 0.5d, blockPos.getY() + 0.5d, blockPos.getZ() + 0.5d) <= 64.0d;
			}, true));
		}
	}
}