package space.chaosmc.chaos.init;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import space.chaosmc.chaos.util.Reference;

public class OtherModStuff {
    public static final ItemGroup CHAOS_ITEMS = FabricItemGroupBuilder.create(new Identifier(Reference.MODID.getValue(),
                                                                                             "chaos_items"))
                                                                      .icon(() -> new ItemStack(Items.GOLD_INGOT))
                                                                      .build();
}
