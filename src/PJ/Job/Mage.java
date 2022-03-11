package PJ.Job;

import PJ.Stat.*;

public class Mage extends Job{
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Intelligence)
            return +4;
        if (stat instanceof Dexterity)
            return +1;
        return 0;
    }
}
