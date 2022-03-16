package Item;

import PJ.Player;

public interface IConsumable {
    //Pasamos el personaje para poder actuar sobre él
    void consumedBy(Player player);

}
