package net.mattias.mystigrecia.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties NECTAR = (new FoodProperties.Builder()).nutrition(6).saturationMod(2F).effect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1), 1.0F).effect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 0), 1.0F).effect(new MobEffectInstance(MobEffects.HARM, 400, 0), 0.4F).alwaysEat().build();
}
