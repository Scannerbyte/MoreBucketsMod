package net.scannerbyte.morebuckets.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.scannerbyte.morebuckets.MoreBuckets;

public class ModItemGroups {
    public static final ItemGroup BUCKETS = FabricItemGroup.builder(new Identifier(MoreBuckets.MOD_ID))
            .displayName(Text.literal("Buckets")).icon(() -> new ItemStack(ModItems.BUCKET_OF_SLIME)).build();
}
