package PJ.Job;

import PJ.Stat.Constitution;
import PJ.Stat.Stat;
import PJ.Stat.Strength;

public class Warrior extends Job{
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Strength)
            return +3;
        if (stat instanceof Constitution)
            return +2;
        return 0;
    }
}
