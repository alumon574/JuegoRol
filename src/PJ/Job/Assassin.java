package PJ.Job;

import PJ.Stat.Constitution;
import PJ.Stat.Dexterity;
import PJ.Stat.Stat;
import PJ.Stat.Strength;

public class Assassin extends Job{
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Strength)
            return +1;
        if (stat instanceof Constitution)
            return +1;
        if (stat instanceof Dexterity)
            return +3;
        return 0;
    }
}
