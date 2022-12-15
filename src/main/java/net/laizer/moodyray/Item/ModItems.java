package net.laizer.moodyray.Item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.laizer.moodyray.Item.custom.EightBallItem;
import net.laizer.moodyray.MoodyRay;
import net.laizer.moodyray.block.ModBlocks;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RAW_TANZANITE = registerItem(
            "raw_tanzanite",
            new Item(new Item.Settings()),
            ModItemGroup.TANZANITE
    );
    public static final Item TANZANITE = registerItem(
            "tanzanite",
            new Item(new Item.Settings()),
            ModItemGroup.TANZANITE
    );

    public static final Item EIGHT_BALL = registerItem(
            "eight_ball",
            new EightBallItem(new Item.Settings().maxCount(1)),
            ModItemGroup.TANZANITE
    );

    public static final Item EGGPLANT = registerItem(
            "eggplant",
            new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(4f).build())),
            ModItemGroup.TANZANITE
    );

    public static final Item COOKED_EGGPLANT = registerItem(
            "cooked_eggplant",
            new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(4).saturationModifier(4f).build())),
            ModItemGroup.TANZANITE
    );

    public static final Item POOP = registerItem(
            "poop",
            new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(1).saturationModifier(1f).build())),
            ModItemGroup.TANZANITE
    );

    public static final Item EGGPLANT_SEEDS = registerItem(
            "eggplant_seeds",
            new AliasedBlockItem(ModBlocks.EGGPLANT_CROP, new Item.Settings()),
            ModItemGroup.TANZANITE
    );



    private static Item registerItem(String name, Item item, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(MoodyRay.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoodyRay.LOGGER.debug("Registering Mod Items for" + MoodyRay.MOD_ID);
    }
}

