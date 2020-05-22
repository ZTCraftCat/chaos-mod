package space.chaosmc.chaos.items;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import space.chaosmc.chaos.init.ModItems;
import space.chaosmc.chaos.init.OtherModStuff;
import space.chaosmc.chaos.util.IModContent;
import space.chaosmc.chaos.util.Reference;

public class CatItem extends Item implements IModContent {
    public CatItem() {
        super(new Settings().group(OtherModStuff.CHAOS_ITEMS));
        ModItems.ITEMS.add(this);
    }

    @Override
    public Identifier getIdentifier() {
        return new Identifier(Reference.MODID.getValue(), "cat_item");
    }
}
