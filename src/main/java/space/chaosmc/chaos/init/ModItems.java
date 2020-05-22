package space.chaosmc.chaos.init;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import space.chaosmc.chaos.items.*;
import space.chaosmc.chaos.materials.ModMaterials;
import space.chaosmc.chaos.util.Reference;

public final class ModItems {
    public static final CatItem CAT_ITEM;
    public static final EggplantItem EGGPLANT_ITEM;
    public static final CatiumIngotItem CATIUM_INGOT;
    public static final EggplantiumIngotItem EGGPLANTIUM_INGOT;

    // Items
    static {
        CAT_ITEM = new CatItem();
        EGGPLANT_ITEM = new EggplantItem();
        CATIUM_INGOT = new CatiumIngotItem();
        EGGPLANTIUM_INGOT = new EggplantiumIngotItem();
    }

    // Catium Armor
    static {
        CATIUM_HELMET = new ModArmorItem(ModMaterials.CATIUM,
                                         EquipmentSlot.HEAD,
                                         (new Item.Settings().group(ItemGroup.COMBAT)),
                                         new Identifier(
                                                 Reference.MODID.getValue(),
                                                 "catium_helmet"));

        CATIUM_CHESTPLATE = new ModArmorItem(ModMaterials.CATIUM,
                                             EquipmentSlot.CHEST,
                                             (new Item.Settings().group(ItemGroup.COMBAT)),
                                             new Identifier(
                                                     Reference.MODID.getValue(),
                                                     "catium_chestplate"));

        CATIUM_LEGGINGS = new ModArmorItem(ModMaterials.CATIUM,
                                           EquipmentSlot.LEGS,
                                           (new Item.Settings().group(ItemGroup.COMBAT)),
                                           new Identifier(
                                                   Reference.MODID.getValue(),
                                                   "catium_leggings"));

        CATIUM_BOOTS = new ModArmorItem(ModMaterials.CATIUM,
                                        EquipmentSlot.FEET,
                                        (new Item.Settings().group(ItemGroup.COMBAT)),
                                        new Identifier(
                                                Reference.MODID.getValue(),
                                                "catium_boots"));
    }


    // armor
    public static final ModArmorItem CATIUM_HELMET;

    public static final ModArmorItem CATIUM_CHESTPLATE;

    public static final ModArmorItem CATIUM_LEGGINGS;

    public static final ModArmorItem CATIUM_BOOTS;

    public static void registerItems() {
        Registry.register(Registry.ITEM, CAT_ITEM.getIdentifier(), CAT_ITEM);
        Registry.register(Registry.ITEM, EGGPLANT_ITEM.getIdentifier(), EGGPLANT_ITEM);
        Registry.register(Registry.ITEM, CATIUM_INGOT.getIdentifier(), CATIUM_INGOT);
        Registry.register(Registry.ITEM, EGGPLANTIUM_INGOT.getIdentifier(), EGGPLANTIUM_INGOT);


        Registry.register(Registry.ITEM, CATIUM_HELMET.getIdentifier(), CATIUM_HELMET);
        Registry.register(Registry.ITEM, CATIUM_CHESTPLATE.getIdentifier(), CATIUM_CHESTPLATE);
        Registry.register(Registry.ITEM, CATIUM_LEGGINGS.getIdentifier(), CATIUM_LEGGINGS);
        Registry.register(Registry.ITEM, CATIUM_BOOTS.getIdentifier(), CATIUM_BOOTS);
    }
}
