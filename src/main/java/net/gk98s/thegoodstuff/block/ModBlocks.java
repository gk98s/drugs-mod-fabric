package net.gk98s.thegoodstuff.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.gk98s.thegoodstuff.TheGoodStuff;
import net.gk98s.thegoodstuff.block.custom.GasStove;
import net.gk98s.thegoodstuff.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block GAS_STOVE = registerBlock("gas_stove",
            new GasStove(FabricBlockSettings
                    .of(Material.METAL)
                    .strength(5.0f, 6.0f)
                    .requiresTool()), ModItemGroup.DRUGS);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(TheGoodStuff.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(TheGoodStuff.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        TheGoodStuff.LOGGER.debug("Registering blocks for " + TheGoodStuff.MOD_ID);
    }
}
