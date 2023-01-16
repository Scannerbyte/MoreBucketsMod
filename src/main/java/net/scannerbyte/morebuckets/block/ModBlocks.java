package net.scannerbyte.morebuckets.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.scannerbyte.morebuckets.MoreBuckets;
import net.scannerbyte.morebuckets.item.ModItemGroups;

public class ModBlocks {

    private static final Block BUCKET_BLOCK = registerBlock("bucket_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroups.BUCKETS);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registries.BLOCK, new Identifier(MoreBuckets.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        ItemGroupEvents.modifyEntriesEvent(tab).register(entries -> entries.add(block));
        return Registry.register(Registries.ITEM, new Identifier(MoreBuckets.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        MoreBuckets.LOGGER.debug("Registering ModBlocks for " + MoreBuckets.MOD_ID);
    }
}
