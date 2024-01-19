package net.mattias.mystigrecia.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MYSTI_GRECIA = new CreativeModeTab("mystitab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BRONZE.get());
        }
    };
}

