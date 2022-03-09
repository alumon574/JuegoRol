package Character.Race;

import Character.Stat.*;

public class Elf extends Race {

    //Para saber que el tipo de stat puedes usar instanceof

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Intelligence)
            return +3;
        if (stat instanceof Constitution)
            return -4;
        if (stat instanceof Dexterity)
            return +6;
        return 0;
    }
}
