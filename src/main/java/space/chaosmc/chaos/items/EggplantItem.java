package space.chaosmc.chaos.items;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import space.chaosmc.chaos.init.OtherModStuff;
import space.chaosmc.chaos.util.IModContent;
import space.chaosmc.chaos.util.Reference;

public class EggplantItem extends Item implements IModContent {
    public EggplantItem() {
        super(new Settings().group(OtherModStuff.CHAOS_ITEMS).rarity(Rarity.COMMON)
                            .food(new FoodComponent.Builder().hunger(4).saturationModifier(0.1f).build()));
    }

    @Override
    public Identifier getIdentifier() {
        return new Identifier(Reference.MODID.getValue(), "eggplant_item");
    }
}
