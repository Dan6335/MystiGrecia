package net.mattias.mystigrecia.recipe;

import net.mattias.mystigrecia.Mysti;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Mysti.MOD_ID);

    public static final RegistryObject<RecipeSerializer<CelestialBronzeWorkBenchRecipe>> CELESTIAL_INFUSING_SERIALIZER =
            SERIALIZERS.register("celestial_infusing", () -> CelestialBronzeWorkBenchRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}