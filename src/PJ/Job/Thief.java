package PJ.Job;

import PJ.Stat.*;

public class Thief extends Job{
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Strength)
            return -2;
        if (stat instanceof Dexterity)
            return +4;
        if (stat instanceof Intelligence)
            return +3;
        return 0;
    }
}
