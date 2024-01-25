package net.mattias.mystigrecia.item;

import net.mattias.mystigrecia.Mysti;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Mysti.MOD_ID);

public static final RegistryObject<Item> BRONZE = ITEMS.register("bronze",
        ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA)));
public static final RegistryObject<Item> TIN = ITEMS.register("tin",
        ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA)));
    public  static final RegistryObject<Item> CELESTIAL_BRONZE = ITEMS.register("celestial_bronze",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA)));

    public static final RegistryObject<Item> BRONZE_HELMET = ITEMS.register("bronze_helmet",
            ()-> new ArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA)));
    public static final RegistryObject<Item> BRONZE_CHESTPLATE = ITEMS.register("bronze_chesplate",
            ()-> new ArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA)));
    public static final RegistryObject<Item> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings",
            ()-> new ArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA)));
    public static final RegistryObject<Item> BRONZE_BOOTS = ITEMS.register("bronze_boots",
            ()-> new ArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA)));

    public static final RegistryObject<Item> TIN_HELMET = ITEMS.register("tin_helmet",
            ()-> new ArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA)));
    public static final RegistryObject<Item> TIN_CHESTPLATE = ITEMS.register("tin_chesplate",
            ()-> new ArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA)));
    public static final RegistryObject<Item> TIN_LEGGINGS = ITEMS.register("tin_leggings",
            ()-> new ArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA)));
    public static final RegistryObject<Item> TIN_BOOTS = ITEMS.register("tin_boots",
            ()-> new ArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
