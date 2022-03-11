package PJ.Race;

import PJ.Stat.*;

public class Mondongo extends Race {

    //Para saber que el tipo de stat puedes usar instanceof

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Intelligence)
            return -4;
        if (stat instanceof Constitution)
            return +5;
        if (stat instanceof Strength)
            return +4;
        return 0;
    }
}
