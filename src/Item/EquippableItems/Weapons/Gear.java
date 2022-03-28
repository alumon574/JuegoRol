package Item.EquippableItems.Weapons;

import Item.IEquippable;
import Item.IPickable;

public abstract class Gear implements IEquippable, IPickable {

    private double AttackPower;
    private double DefensivePower;
    private double SlotsOccupied;
    private double Weight;


    @Override
    public double AttackPower() {
        return AttackPower;
    }

    @Override
    public double DefensivePower() {
        return DefensivePower;
    }

    @Override
    public double SlotsOccupied() {
        return SlotsOccupied;
    }

    @Override
    public double Weight() {
        return Weight;
    }
    public Gear(double attackPower,double defensivePower, double slotsOccupied, double weight){
        this.AttackPower=attackPower;
        this.DefensivePower=defensivePower;
        this.SlotsOccupied=slotsOccupied;
        this.Weight=weight;
    }
}
