package space.chaosmc.chaos.init;

import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import space.chaosmc.chaos.items.CatItem;
import space.chaosmc.chaos.items.EggplantItem;
import space.chaosmc.chaos.util.IModContent;

import java.util.ArrayList;

public final class ModItems {
    public static final CatItem CAT_ITEM = new CatItem();
    public static final EggplantItem EGGPLANT_ITEM = new EggplantItem();
    public static ArrayList<Item> ITEMS = new ArrayList<>();

    public static void registerItems() {
        for (Item item : ITEMS) {
            if (item instanceof IModContent) {
                Registry.register(Registry.ITEM, ((IModContent) item).getIdentifier(), item);
            }
        }
    }
}
