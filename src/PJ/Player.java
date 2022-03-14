package PJ;

import PJ.Job.Job;
import PJ.Race.Race;
import PJ.Stat.Stat;


public class Player {
    private String name;
    private Race race;
    private Job job;
    private Stat baseStat;

    public String getName() {
        return name;
    }

    public Job getJob() {
        return job;
    }

    public Race getRace() {
        return race;
    }

    public Player(String name, Race race, Job job){
        this.name=name;
        this.race=race;
        this.job=job;
    }



    public double Velocity(){

    }
}
