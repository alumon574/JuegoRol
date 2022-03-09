package Character.Race;

import Character.Stat.*;

public class Orc extends Race {

    //Para saber que el tipo de stat puedes usar instanceof

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Intelligence)
            return -6;
        if (stat instanceof Constitution)
            return +6;
        if (stat instanceof Strength)
            return +10;
        return 0;
    }
}
