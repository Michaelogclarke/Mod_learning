package net.michaelog.mogsmod.item;

import net.michaelog.mogsmod.block.ModBlocks;
import net.michaelog.mogsmod.mogsmod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreatveModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, mogsmod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MOGS_TAB = CREATIVE_MODE_TABS.register("mogs_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.mogs_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //Items
                        output.accept(Moditems.SAPPHIRE.get());
                        output.accept(Moditems.RAW_SAPPHIRE.get());

                        //Blocks
                        output.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        output.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());

                        //Spawn eggs
                        output.accept(Moditems.RHINO_SPAWN_EGG.get());


                    })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
