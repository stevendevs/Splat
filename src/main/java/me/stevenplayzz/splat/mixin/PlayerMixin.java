package me.stevenplayzz.splat.mixin;

import me.shedaniel.autoconfig.AutoConfig;
import me.stevenplayzz.splat.config.SplatConfig;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Player.class)
public abstract class PlayerMixin {
	@Redirect(method = "drop(Lnet/minecraft/world/item/ItemStack;ZZ)Lnet/minecraft/world/entity/item/ItemEntity;",
			at = @At(value = "INVOKE",
					target = "Lnet/minecraft/world/entity/item/ItemEntity;setDeltaMovement(DDD)V",
					ordinal = 0))
	private void adjustDropVelocity(ItemEntity itemEntity, double x, double y, double z) {
		// Grab the config values //
		SplatConfig config = AutoConfig.getConfigHolder(SplatConfig.class).getConfig();

		// Change the velocity values based on player choice //
		itemEntity.setDeltaMovement(x * config.xVelocity, y * config.yVelocity, z * config.zVelocity);
	}
}