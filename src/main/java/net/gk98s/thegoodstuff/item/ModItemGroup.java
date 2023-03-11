package net.gk98s.thegoodstuff.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.gk98s.thegoodstuff.TheGoodStuff;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup DRUGS = FabricItemGroupBuilder.build(
            new Identifier(TheGoodStuff.MOD_ID, "drugs"), () -> new ItemStack(ModItems.WEED));
}
