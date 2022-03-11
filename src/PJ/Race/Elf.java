package PJ.Race;

import PJ.Stat.*;

public class Elf extends Race {

    //Para saber que el tipo de stat puedes usar instanceof

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Intelligence)
            return +3;
        if (stat instanceof Constitution)
            return -1;
        if (stat instanceof Dexterity)
            return +3;
        return 0;
    }
}
