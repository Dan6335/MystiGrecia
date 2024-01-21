package net.mattias.mystigrecia.integration;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.mattias.mystigrecia.Mysti;
import net.mattias.mystigrecia.recipe.CelestialBronzeWorkBenchRecipe;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;
import java.util.Objects;

@JeiPlugin
public class JEIMystiPlugin implements IModPlugin {
    public static RecipeType<CelestialBronzeWorkBenchRecipe> INFUSION_TYPE =
            new RecipeType<>(CelestialBronzeWorkBenchRecipeCategory.UID, CelestialBronzeWorkBenchRecipe.class);

    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(Mysti.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new
                CelestialBronzeWorkBenchRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();

        List<CelestialBronzeWorkBenchRecipe> recipesInfusing = rm.getAllRecipesFor(CelestialBronzeWorkBenchRecipe.Type.INSTANCE);
        registration.addRecipes(INFUSION_TYPE, recipesInfusing);
    }
}