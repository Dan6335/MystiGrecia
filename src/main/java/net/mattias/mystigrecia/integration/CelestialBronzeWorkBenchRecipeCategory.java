package net.mattias.mystigrecia.integration;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.mattias.mystigrecia.Mysti;
import net.mattias.mystigrecia.block.ModBlocks;
import net.mattias.mystigrecia.recipe.CelestialBronzeWorkBenchRecipe;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.List;

public class CelestialBronzeWorkBenchRecipeCategory implements IRecipeCategory<CelestialBronzeWorkBenchRecipe> {
    public final static ResourceLocation UID = new ResourceLocation(Mysti.MOD_ID, "celestial_infusing");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(Mysti.MOD_ID, "textures/gui/celestial_bronze_workbench_gui.png");

    private final IDrawable background;
    private final IDrawable icon;

    public CelestialBronzeWorkBenchRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.CELESTIAL_BRONZE_WORKBENCH.get()));
    }

    @Override
    public RecipeType<CelestialBronzeWorkBenchRecipe> getRecipeType() {
        return JEIMystiPlugin.INFUSION_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.literal("Celestial Infusing Workbench");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, CelestialBronzeWorkBenchRecipe recipe, IFocusGroup focuses) {
        /*builder.addSlot(RecipeIngredientRole.INPUT, 12, 15).addIngredients(recipe.getIngredients().get(1));
        builder.addSlot(RecipeIngredientRole.INPUT, 86, 15).addIngredients(recipe.getIngredients().get(0));*/
        List<Ingredient> ingredients = recipe.getIngredients();
        if (ingredients.size() > 1) {
            builder.addSlot(RecipeIngredientRole.INPUT, 12, 15).addIngredients(ingredients.get(1));
        }
        if (!ingredients.isEmpty()) {
            builder.addSlot(RecipeIngredientRole.INPUT, 86, 15).addIngredients(ingredients.get(0));
        }

        builder.addSlot(RecipeIngredientRole.OUTPUT, 86, 60).addItemStack(recipe.getResultItem());
    }
}