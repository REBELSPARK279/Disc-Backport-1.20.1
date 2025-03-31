package net.rebelspark.disc_backport_rebelspark.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.rebelspark.disc_backport_rebelspark.Disc_Backport_Rebelspark;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Disc_Backport_Rebelspark.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MOD_DISCS_TAB = CREATIVE_MODE_TABS.register("mod_discs_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CREATOR_MUSIC_DISC.get()))
                    .title(Component.translatable("creativetab.disc_backport_rebelspark.mod_discs"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.CREATOR_MUSIC_DISC.get());
                        pOutput.accept(ModItems.CREATOR_MUSIC_BOX_MUSIC_DISC.get());
                        pOutput.accept(ModItems.PRECIPICE_MUSIC_DISC.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
