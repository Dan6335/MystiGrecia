package net.mattias.mystigrecia.item;

import net.mattias.mystigrecia.Mysti;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
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
    public static final RegistryObject<Item> SILVER = ITEMS.register("silver",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA)));
    public  static final RegistryObject<Item> CELESTIAL_BRONZE = ITEMS.register("celestial_bronze",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA)));

    public static final RegistryObject<Item> BRONZE_HELMET = ITEMS.register("bronze_helmet",
            ()-> new ArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA)));
    public static final RegistryObject<Item> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate",
            ()-> new ArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA)));
    public static final RegistryObject<Item> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings",
            ()-> new ArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA)));
    public static final RegistryObject<Item> BRONZE_BOOTS = ITEMS.register("bronze_boots",
            ()-> new ArmorItem(ModArmorMaterials.BRONZE, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA)));

    public static final RegistryObject<Item> TIN_HELMET = ITEMS.register("tin_helmet",
            ()-> new ArmorItem(ModArmorMaterials.TIN, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA)));
    public static final RegistryObject<Item> TIN_CHESTPLATE = ITEMS.register("tin_chestplate",
            ()-> new ArmorItem(ModArmorMaterials.TIN, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA)));
    public static final RegistryObject<Item> TIN_LEGGINGS = ITEMS.register("tin_leggings",
            ()-> new ArmorItem(ModArmorMaterials.TIN, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA)));
    public static final RegistryObject<Item> TIN_BOOTS = ITEMS.register("tin_boots",
            ()-> new ArmorItem(ModArmorMaterials.TIN, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA)));

    public  static final RegistryObject<Item> NECTAR = ITEMS.register("nectar",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA).food(ModFoods.NECTAR)));

    public  static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword",
            ()-> new SwordItem(ModTiers.BRONZE, 6, 1.6f, new  Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA)));

    public  static final RegistryObject<Item> BRONZE_AXE = ITEMS.register("bronze_axe",
            ()-> new AxeItem(ModTiers.BRONZE, 4, 0.9f, new  Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA)));

    public  static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe",
            ()-> new PickaxeItem(ModTiers.BRONZE, 2, 5f, new  Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA)));

    public  static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel",
            ()-> new ShovelItem(ModTiers.BRONZE, 1, 1f, new  Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA)));

    public  static final RegistryObject<Item> BRONZE_HOE = ITEMS.register("bronze_hoe",
            ()-> new HoeItem(ModTiers.BRONZE, 1, 3f, new  Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA)));

    public  static final RegistryObject<Item> TIN_SWORD = ITEMS.register("tin_sword",
            ()-> new SwordItem(ModTiers.TIN, 5, 1.6f, new  Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA)));

    public  static final RegistryObject<Item> TIN_AXE = ITEMS.register("tin_axe",
            ()-> new SwordItem(ModTiers.TIN, 3, 0.8f, new  Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA)));

    public  static final RegistryObject<Item> TIN_PICKAXE = ITEMS.register("tin_pickaxe",
            ()-> new SwordItem(ModTiers.TIN, 2, 5f, new  Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA)));

    public  static final RegistryObject<Item> TIN_SHOVEL = ITEMS.register("tin_shovel",
            ()-> new SwordItem(ModTiers.TIN, 1, 1f, new  Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA)));

    public  static final RegistryObject<Item> TIN_HOE = ITEMS.register("tin_hoe",
            ()-> new SwordItem(ModTiers.TIN, 1, 3f, new  Item.Properties().tab(ModCreativeModeTab.MYSTI_GRECIA)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
