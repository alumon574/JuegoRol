package PJ;

import PJ.Job.Thief;
import PJ.Player;
import PJ.Race.Human;
import PJ.Stat.Constitution;
import PJ.Stat.Dexterity;
import PJ.Stat.Intelligence;
import PJ.Stat.Strength;

public class Main {
    public static void main(String[] args) {
        Human human=new Human();
        Thief thief=new Thief();
        Player player=new Player("pep", human,thief,new Dexterity(5),new Strength(5),new Constitution(5),new Intelligence(5));
        System.out.println(player);
    }


}
