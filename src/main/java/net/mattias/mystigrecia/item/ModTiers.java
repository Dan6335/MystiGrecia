package net.mattias.mystigrecia.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier BRONZE = new ForgeTier(3, 500, 6.7f,
            2f, 16, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.BRONZE.get()));

    public static final ForgeTier TIN = new ForgeTier(3, 350, 6.4f,
            1f, 14, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.TIN.get()));

}
