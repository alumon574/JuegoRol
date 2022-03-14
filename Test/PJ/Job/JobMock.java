package PJ.Job;

import PJ.Stat.Stat;

public class JobMock extends Job{
    private int modifier;

    public int getModifier() {
        return modifier;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }

    public JobMock(int modifier) {
        this.modifier = modifier;
    }

    @Override
    public int modifier(Stat stat) {
        return modifier;
    }
}
