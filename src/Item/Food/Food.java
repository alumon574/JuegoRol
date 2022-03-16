package Item.Food;

import Item.IConsumable;
import PJ.Player;

public abstract class Food implements IConsumable {
    private int power;

    public Food(int power){
        this.power = power;
    }

    @Override
    public void consumedBy(Player player) {
        player.heals(power);
    }
}
