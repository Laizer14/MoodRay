package net.laizer.moodyray.painting;

import net.laizer.moodyray.MoodyRay;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPaintings {
    public static final PaintingVariant SUNSET = registerPainting("sunset", new PaintingVariant(32, 16));
    public static final PaintingVariant PLANT = registerPainting("plant", new PaintingVariant(16, 16));
    public static final PaintingVariant WANDERER = registerPainting("wanderer", new PaintingVariant(16, 32));


    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant){
        return Registry.register(Registries.PAINTING_VARIANT, new Identifier(MoodyRay.MOD_ID, name), paintingVariant);
    }

    public static void registerPaintings() {
        MoodyRay.LOGGER.debug("Registering Paintings for " + MoodyRay.MOD_ID);
    }
}
