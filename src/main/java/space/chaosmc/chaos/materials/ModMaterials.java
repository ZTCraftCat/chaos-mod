package space.chaosmc.chaos.materials;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;
import space.chaosmc.chaos.init.ModItems;

import java.util.function.Supplier;

public enum ModMaterials implements ArmorMaterial {
    CATIUM("catium", 37, new int[]{3, 6, 8, 3}, 30, SoundEvents.BLOCK_ANVIL_PLACE, 4.0F, () -> {
        return Ingredient.ofItems(ModItems.CATIUM_INGOT);
    }),
    EGGPLANTIUM("eggplantium", 37, new int[]{3, 6, 8, 3}, 30, SoundEvents.BLOCK_ANVIL_PLACE, 4.0F, () -> {
        return Ingredient.ofItems(ModItems.EGGPLANTIUM_INGOT);
    });


    private static final int[] baseDurability = {13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] armorValues;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final Lazy<Ingredient> repairIngredient;

    ModMaterials(String name, int durabilityMultiplier, int[] armorValues, int enchantability, SoundEvent equipSound, float toughness, Supplier<Ingredient> repairIngredient) {
        this.name = name;

        this.durabilityMultiplier = durabilityMultiplier;
        this.armorValues = armorValues;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    @Override
    public int getDurability(EquipmentSlot slot) {
        return 0;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public SoundEvent getEquipSound() {
        return null;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public float getToughness() {
        return 0;
    }
}
