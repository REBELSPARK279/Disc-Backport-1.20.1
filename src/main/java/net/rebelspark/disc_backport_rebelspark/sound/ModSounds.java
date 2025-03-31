package net.rebelspark.disc_backport_rebelspark.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rebelspark.disc_backport_rebelspark.Disc_Backport_Rebelspark;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Disc_Backport_Rebelspark.MOD_ID);


    public static final RegistryObject<SoundEvent> CREATOR = registerSoundEvents("creator");
    public static final RegistryObject<SoundEvent> CREATOR_MUSIC_BOX = registerSoundEvents("creator_music_box");
    public static final RegistryObject<SoundEvent> PRECIPICE = registerSoundEvents("precipice");



    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(Disc_Backport_Rebelspark.MOD_ID, name)));
    }
    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);

    }
}
