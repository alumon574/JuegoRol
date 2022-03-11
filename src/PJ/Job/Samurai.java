package PJ.Job;

import PJ.Stat.Dexterity;
import PJ.Stat.Intelligence;
import PJ.Stat.Stat;
import PJ.Stat.Strength;

public class Samurai extends Job{
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Strength)
            return +3;
        if (stat instanceof Dexterity)
            return +3;
        if (stat instanceof Intelligence)
            return -1;
        return 0;
    }
}
