package net.laizer.moodyray.Item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class EightBallItem extends Item {
    public EightBallItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient() && hand == Hand.MAIN_HAND) {
            outputRandomNumber(user);
            user.getItemCooldownManager().set(this, 20); //this would be a 1 second cooldown as we are using ticks and every 20 ticks = 1 second.
        }

        return super.use(world, user, hand);
    }

       private void outputRandomNumber(PlayerEntity player) {
            player.sendMessage(Text.literal("Your Number is " + getRandomNumber())); //use the getRandomNumber function display the number that the player got.
       }


    private int getRandomNumber() {
        return Random.createLocal().nextInt(10); //creates a function to give us a random number between 0-10.
    }
}
