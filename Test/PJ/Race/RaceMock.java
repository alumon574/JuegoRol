package PJ.Race;

import PJ.Stat.Stat;

public class RaceMock extends Race {
    private int modifier;

    public int getModifier() {
        return modifier;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }

    public RaceMock(int modifier) {
        this.modifier = modifier;
    }

    @Override
    public int modifier(Stat stat) {
        return modifier;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
