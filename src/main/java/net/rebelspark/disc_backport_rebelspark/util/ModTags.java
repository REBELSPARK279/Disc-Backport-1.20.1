package net.rebelspark.disc_backport_rebelspark.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.rebelspark.disc_backport_rebelspark.Disc_Backport_Rebelspark;

public class ModTags {
    public static class Blocks {


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Disc_Backport_Rebelspark.MOD_ID, name));
        }
    }

    public static class Items {



        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Disc_Backport_Rebelspark.MOD_ID, name));
        }
    }
}
