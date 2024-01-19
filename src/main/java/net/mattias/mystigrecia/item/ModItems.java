package net.mattias.mystigrecia.item;

import net.mattias.mystigrecia.Mysti;
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


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
