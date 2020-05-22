package space.chaosmc.chaos.mixin;

import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import space.chaosmc.chaos.init.ModItems;

import java.util.Map;

@Mixin(AbstractFurnaceBlockEntity.class)
public abstract class AbstractFurnaceBlockEntityMixin {

    @Shadow
    protected static void addFuel(Map<Item, Integer> fuelTimes, ItemConvertible item, int fuelTime) {
    }

    @Inject(method = "createFuelTimeMap", at = @At("RETURN"))
    private static void addModFuels(CallbackInfoReturnable<Map<Item, Integer>> cir) {
        addFuel(cir.getReturnValue(), ModItems.CAT_ITEM, 12000);
    }
}
