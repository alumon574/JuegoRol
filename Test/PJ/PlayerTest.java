package PJ;

import Food.FoodMock;
import PJ.Job.Job;
import PJ.Job.JobMock;
import PJ.Race.Race;
import PJ.Race.RaceMock;
import PJ.Stat.*;
import Potion.PotionMock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    Player personaje;
    Race raceMock;
    Job jobMock;

    String nombre = "pep guardiola";
    int raceModifier = 5;
    int jobModifer = 5;
    int dexterityBase = 5;
    int strengthBase = 5;
    int constitutionBase = 5;
    int intelligenceBase = 5;
    int damage;
    FoodMock foodMock;
    PotionMock potionMock;

    @BeforeEach
    void setUp() {
        damage=25;
        raceMock = new RaceMock(raceModifier);
        jobMock = new JobMock(jobModifer);
        foodMock=new FoodMock(5);
        potionMock=new PotionMock(15);
        personaje = new Player(nombre, raceMock, jobMock, new Dexterity(dexterityBase), new Strength(strengthBase), new Constitution(constitutionBase), new Intelligence(intelligenceBase));
    }

    @Test
    void getName() {
        assertEquals(nombre, personaje.getName());
    }

    @Test
    void getJob() {
        assertEquals(jobMock, personaje.getJob());
    }

    @Test
    void getRace() {
        assertEquals(raceMock, personaje.getRace());
    }

    @Test
    void velocity() {
        int velocity = (dexterityBase + raceModifier + jobModifer) * 2;
        assertEquals(velocity, personaje.velocity());
    }

    @Test
    void power() {
        int power = (strengthBase + raceModifier + jobModifer) * 2;
        assertEquals(power, personaje.power());
    }

    @Test
    void magic() {
        int magic = (intelligenceBase + raceModifier + jobModifer) * 2;
        assertEquals(magic, personaje.magic());
    }

    @Test
    void maxHealth() {
        int health = (constitutionBase + raceModifier + jobModifer) * 25;
        System.out.println(health);
        assertEquals(health,personaje.maxHealth());
    }

    @Test
    void currentHealth() {
        personaje.receivesDamage(damage);
      double dmgExpected= personaje.maxHealth()-damage;
        assertEquals(dmgExpected,personaje.currentHealth());
    }

    @Test
    void isDead() {
        boolean isDead;
        isDead=personaje.currentHealth()<=0;
        assertEquals(isDead,personaje.isDead());
    }

    @Test
    void receivesDamage() {
        personaje.receivesDamage(damage);
        assertEquals(350,personaje.currentHealth());
    }

    @Test
    void heals() {
        personaje.receivesDamage(damage);
        personaje.heals(damage);
        assertEquals(personaje.currentHealth(),personaje.maxHealth());
    }

    @Test
    void consumesFood() {
        personaje.receivesDamage(damage);
        personaje.consumes(foodMock);
        assertEquals(355,personaje.currentHealth());
    }

    @Test
    void consumesPotion() {
        personaje.receivesDamage(damage);
        personaje.consumes(potionMock);
        assertEquals(365,personaje.currentHealth());
    }
}