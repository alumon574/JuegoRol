package Character.Race;

import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Stat;
import Character.Stat.Strength;

public class Human extends Race {

    //Para saber que el tipo de stat puedes usar instanceof

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity)
            return +2;
        if (stat instanceof Constitution)
            return +4;
        if (stat instanceof Strength)
            return +4;
        return 0;
    }
}
