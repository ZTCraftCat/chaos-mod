package space.chaosmc.chaos.items;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import space.chaosmc.chaos.init.OtherModStuff;
import space.chaosmc.chaos.util.IModContent;
import space.chaosmc.chaos.util.Reference;

public class CatiumIngotItem extends Item implements IModContent {
    public CatiumIngotItem() {
        super(new Settings().group(OtherModStuff.CHAOS_ITEMS).rarity(Rarity.COMMON));
    }

    @Override
    public Identifier getIdentifier() {
        return new Identifier(Reference.MODID.getValue(), "catium_ingot");
    }
}
