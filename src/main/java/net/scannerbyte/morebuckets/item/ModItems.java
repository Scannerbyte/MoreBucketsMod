package net.scannerbyte.morebuckets.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.scannerbyte.morebuckets.MoreBuckets;



public class ModItems {

    public static final Item BUCKET_OF_SLIME = registerItem("bucket_of_slime",
            new Item(new Item.Settings()), ModItemGroups.BUCKETS);
    public static final Item BUCKET_OF_HONEY = registerItem("bucket_of_honey",
            new Item(new Item.Settings()), ModItemGroups.BUCKETS);

    public static Item registerItem(String name, Item item, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(MoreBuckets.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoreBuckets.LOGGER.debug("Registering Mod Items for " + MoreBuckets.MOD_ID);
    }

}