package Item.Food;

import Item.IConsumable;
import Item.IPickable;
import PJ.Player;

public abstract class Food implements IConsumable, IPickable {
    private int power;

    public Food(int power){
        this.power = power;
    }

    @Override
    public void consumedBy(Player player) {
        player.heals(power);
    }

    @Override
    public double Weight() {
        return 0;
    }
}
