package PJ.Race;

import PJ.Stat.Constitution;
import PJ.Stat.Dexterity;
import PJ.Stat.Stat;
import PJ.Stat.Strength;

public class Human extends Race {

    //Para saber que el tipo de stat puedes usar instanceof

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity)
            return +1;
        if (stat instanceof Constitution)
            return +2;
        if (stat instanceof Strength)
            return +2;
        return 0;
    }
}
