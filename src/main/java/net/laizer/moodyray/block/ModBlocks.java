package net.laizer.moodyray.block;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.laizer.moodyray.Item.ModItemGroup;
import net.laizer.moodyray.MoodyRay;
import net.laizer.moodyray.block.custom.EggplantCropBlock;
import net.laizer.moodyray.block.custom.JumpyBlock;
import net.laizer.moodyray.block.custom.TanzaniteLampBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block TANZANITE_BLOCK = registerBlock("tanzanite_block",
    new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.TANZANITE);

    public static final Block JUMPY_BLOCK = registerBlock("jumpy_block",
    new JumpyBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ModItemGroup.TANZANITE);

    public static final Block TANZANITE_LAMP = registerBlock("tanzanite_lamp",
    new TanzaniteLampBlock(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()
            .luminance(state -> state.get(TanzaniteLampBlock.LIT) ? 15 : 0)), ModItemGroup.TANZANITE);

    public static final Block EGGPLANT_CROP = registerBlockWithoutItem("eggplant_crop",
    new EggplantCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));

    public static final Block TANZANITE_ORE = registerBlock("tanzanite_ore",
    new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
            UniformIntProvider.create(3, 7)), ModItemGroup.TANZANITE);

    public static final Block DEEPSLATE_TANZANITE_ORE = registerBlock("deepslate_tanzanite_ore",
    new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
            UniformIntProvider.create(3, 7)), ModItemGroup.TANZANITE);




    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(MoodyRay.MOD_ID, name), block);
    }


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(MoodyRay.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group)  {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(block));
        return Registry.register(Registries.ITEM, new Identifier(MoodyRay.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        MoodyRay.LOGGER.debug("Registering ModBlocks for " + MoodyRay.MOD_ID);
    }
}

