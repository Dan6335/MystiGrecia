package net.mattias.mystigrecia;

import com.mojang.logging.LogUtils;
import net.mattias.mystigrecia.block.ModBlocks;
import net.mattias.mystigrecia.block.entity.ModBlockEntities;
import net.mattias.mystigrecia.item.ModItems;
import net.mattias.mystigrecia.recipe.ModRecipes;
import net.mattias.mystigrecia.screen.CelestialBronzeWorkBenchScreen;
import net.mattias.mystigrecia.screen.ModMenuTypes;
import net.mattias.mystigrecia.world.feature.ModConfiguredFeatures;
import net.mattias.mystigrecia.world.feature.ModPlacedFeatures;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Mysti.MOD_ID)
public class Mysti {
    public static final String MOD_ID = "mysti";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Mysti()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModConfiguredFeatures.register(modEventBus);
        ModPlacedFeatures.register(modEventBus);

        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);

        ModRecipes.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }
    private void commonSetup(final FMLCommonSetupEvent event) {
    }
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            event.enqueueWork(() ->{


                MenuScreens.register(ModMenuTypes.CELESTIAL_BRONZE_WORKBENCH_MENU.get(), CelestialBronzeWorkBenchScreen::new);
            });
       }

    }
}
