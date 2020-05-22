package space.chaosmc.chaos.items;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.util.Identifier;
import space.chaosmc.chaos.util.IModContent;

public final class ModArmorItem extends ArmorItem implements IModContent {
    private final Identifier identifier;

    public ModArmorItem(ArmorMaterial material, EquipmentSlot slot, Settings settings, Identifier identifier) {
        super(material, slot, settings);
        this.identifier = identifier;
    }

    @Override
    public Identifier getIdentifier() {
        return identifier;
    }
}
