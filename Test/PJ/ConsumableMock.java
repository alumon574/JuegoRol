package PJ;

import Item.IConsumable;
import PJ.Player;

public class ConsumableMock implements IConsumable {
    private boolean consumedByCalled;

    public boolean isConsumedByCalled() {
        return consumedByCalled;
    }
    public void consumedBy(Player player){
        consumedByCalled=true;
    }
}
