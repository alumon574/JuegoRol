package Item.Potions;

import Item.IConsumable;
import Item.IPickable;
import PJ.Player;

public abstract class Potion implements IConsumable, IPickable {

    private int power;

    public Potion(int power){
        this.power=power;
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
