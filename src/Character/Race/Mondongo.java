package Character.Race;

import Character.Stat.*;

public class Mondongo extends Race {

    //Para saber que el tipo de stat puedes usar instanceof

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Intelligence)
            return -7;
        if (stat instanceof Constitution)
            return +5;
        if (stat instanceof Strength)
            return +8;
        return 0;
    }
}
