package PJ;

import PJ.Job.Job;
import PJ.Race.Race;
import PJ.Stat.*;


public class Player {
    private String name;
    private Race race;
    private Job job;
    private Dexterity dexterity;
    private Strength strength;
    private Constitution constitution;
    private Intelligence intelligence;

    public String getName() {
        return name;
    }

    public Job getJob() {
        return job;
    }

    public Race getRace() {
        return race;
    }

    public Player(String name, Race race, Job job,Dexterity dexterity,Strength strength,Constitution constitution, Intelligence intelligence) {
        this.name = name;
        this.race = race;
        this.job = job;
        this.dexterity=dexterity;
        this.strength=strength;
        this.constitution=constitution;
        this.intelligence=intelligence;
    }

    public double velocity() {
        return (dexterity.getValue() + race.modifier(dexterity) + job.modifier(dexterity)) * 2;
    }

    public double power() {
        return (strength.getValue() + race.modifier(strength) + job.modifier(strength)) * 2;
    }

    public double magic() {
        return (intelligence.getValue() + race.modifier(intelligence) + job.modifier(intelligence)) * 2;
    }

    public double health() {
        return (constitution.getValue() + race.modifier(constitution) + job.modifier(constitution)) * 25;
    }


    @Override
    public String toString() {
        return "Player{" +
                "My name is:'" + name + '\'' +
                ", I'm  " + race.getClass().getSimpleName() +" "+ job.getClass().getSimpleName() +
                ", My stats are : dexterity=" + (dexterity.getValue() + race.modifier(dexterity) + job.modifier(dexterity)) +
                ", strength=" + (strength.getValue() + race.modifier(strength) + job.modifier(strength)) +
                ", constitution=" + (constitution.getValue() + race.modifier(constitution) + job.modifier(constitution)) +
                ", intelligence=" + (intelligence.getValue() + race.modifier(intelligence) + job.modifier(intelligence)) +
                ", health=" + health() +
                '}';
    }
}
