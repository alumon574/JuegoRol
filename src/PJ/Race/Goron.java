package PJ.Race;

import PJ.Stat.*;

public class Goron extends Race {

    //Para saber que el tipo de stat puedes usar instanceof

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity)
            return +2;
        if (stat instanceof Constitution)
            return +2;
        if (stat instanceof Strength)
            return +2;
        if (stat instanceof Intelligence)
            return -1;
        return 0;
    }
}
