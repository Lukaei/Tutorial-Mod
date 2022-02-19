package net.lukaei.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.lukaei.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // Create new ModItems
    public static final Item MYTHRIL_PEARL = registerItem("mythril_pearl", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget", new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    // Registers the ModItems
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    // Logger
    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);
    }

}
