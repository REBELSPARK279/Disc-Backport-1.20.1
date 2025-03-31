package net.rebelspark.disc_backport_rebelspark.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.rebelspark.disc_backport_rebelspark.Disc_Backport_Rebelspark;
import net.rebelspark.disc_backport_rebelspark.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Disc_Backport_Rebelspark.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.CREATOR_MUSIC_DISC);
        simpleItem(ModItems.CREATOR_MUSIC_BOX_MUSIC_DISC);
        simpleItem(ModItems.PRECIPICE_MUSIC_DISC);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Disc_Backport_Rebelspark.MOD_ID, "item/" + item.getId().getPath()));
    }
}
