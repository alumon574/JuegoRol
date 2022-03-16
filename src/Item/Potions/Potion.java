package Item.Potions;

import Item.IConsumable;
import PJ.Player;

public abstract class Potion implements IConsumable {

    private int power;

    public Potion(int power){
        this.power=power;
    }

    @Override
    public void consumedBy(Player player) {
    player.heals(power);
    }
}
