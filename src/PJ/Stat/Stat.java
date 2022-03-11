package PJ.Stat;

public abstract class Stat {
    public int value;

    public Stat(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void increase() {
        value++;
    }

    public void decrease() {
        value--;
    }

    @Override
    public String toString() {
        return "Value" + value;
    }
}
