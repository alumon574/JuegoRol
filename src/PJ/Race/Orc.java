package PJ.Race;

import PJ.Stat.*;

public class Orc extends Race {

    //Para saber que el tipo de stat puedes usar instanceof

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Intelligence)
            return -3;
        if (stat instanceof Constitution)
            return +3;
        if (stat instanceof Strength)
            return +5;
        return 0;
    }
}
