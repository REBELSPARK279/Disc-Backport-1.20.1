package net.rebelspark.disc_backport_rebelspark.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rebelspark.disc_backport_rebelspark.Disc_Backport_Rebelspark;
import net.rebelspark.disc_backport_rebelspark.sound.ModSounds;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Disc_Backport_Rebelspark.MOD_ID);


    //DISCS

    /*
    Comparator values
    Creator - 12
    Creator Music Box - 11
    Precipice - 13
    */


    public static final RegistryObject<Item> CREATOR_MUSIC_DISC = ITEMS.register("creator_music_disc",
            () -> new RecordItem(12, ModSounds.CREATOR, new Item.Properties().stacksTo(1), 3580));

    public static final RegistryObject<Item> CREATOR_MUSIC_BOX_MUSIC_DISC = ITEMS.register("creator_music_box_music_disc",
            () -> new RecordItem(11, ModSounds.CREATOR_MUSIC_BOX, new Item.Properties().stacksTo(1), 1520));

    public static final RegistryObject<Item> PRECIPICE_MUSIC_DISC = ITEMS.register("precipice_music_disc",
            () -> new RecordItem(13, ModSounds.PRECIPICE, new Item.Properties().stacksTo(1), 6000));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
