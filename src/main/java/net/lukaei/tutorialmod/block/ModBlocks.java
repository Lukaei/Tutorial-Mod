package net.lukaei.tutorialmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.lukaei.tutorialmod.TutorialMod;
import net.lukaei.tutorialmod.block.custom.SpeedyBlock;
import net.lukaei.tutorialmod.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block MYTHRIL_BLOCK = registerBlock("mythril_block", new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.MYTHRIL);
    public static final Block MYTHRIL_ORE = registerBlock("mythril_ore", new Block(FabricBlockSettings.of(Material.STONE).strength(5f).requiresTool()), ModItemGroup.MYTHRIL);

    public static final Block SPEEDY_BLOCK = registerBlock("speedy_block", new SpeedyBlock(FabricBlockSettings.of(Material.METAL).strength(5f).requiresTool()), ModItemGroup.MYTHRIL);


    // Register Blocks
    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }

    // Register Block Items
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(group)));
    }

    // Logger
    public static void registerModBlocks() {
        TutorialMod.LOGGER.info("Registering ModBlocks for " + TutorialMod.MOD_ID);
    }

}
