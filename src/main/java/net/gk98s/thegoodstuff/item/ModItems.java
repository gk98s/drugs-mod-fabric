package net.gk98s.thegoodstuff.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.gk98s.thegoodstuff.TheGoodStuff;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item WEED_SEED = registerItem("weed_seed",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TheGoodStuff.MOD_ID, name), item);
    }
    
    public static void registerModItems() {
        TheGoodStuff.LOGGER.debug("Registering Mod Items for " + TheGoodStuff.MOD_ID);
    }
}
