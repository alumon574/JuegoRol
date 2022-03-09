package Character.Race;

import Character.Stat.*;

public class Samurai extends Race {

    //Para saber que el tipo de stat puedes usar instanceof

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity)
            return +5;
        if (stat instanceof Constitution)
            return +2;
        if (stat instanceof Strength)
            return +2;
        if (stat instanceof Intelligence)
            return -4;
        return 0;
    }
}
