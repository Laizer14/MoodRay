package net.laizer.moodyray.Item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.laizer.moodyray.MoodyRay;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup TANZANITE = FabricItemGroup.builder(new Identifier(MoodyRay.MOD_ID))
            .displayName(Text.literal("Tanzanite"))
            .icon(() -> new ItemStack(ModItems.TANZANITE))
            .build();

};
