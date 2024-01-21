package net.mattias.mystigrecia.block.entity;

import net.mattias.mystigrecia.Mysti;
import net.mattias.mystigrecia.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Mysti.MOD_ID);

    public static final RegistryObject<BlockEntityType<CelestialBronzeWorkBenchEntity>> CELESTIAL_BRONZE_WORK_BENCH_BLOCK =
            BLOCK_ENTITIES.register("celestial_bronze_workbench", () ->
                    BlockEntityType.Builder.of(CelestialBronzeWorkBenchEntity::new,
                            ModBlocks.CELESTIAL_BRONZE_WORKBENCH.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}