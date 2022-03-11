package PJ.Job;

import PJ.Stat.Constitution;
import PJ.Stat.Dexterity;
import PJ.Stat.Intelligence;
import PJ.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WarriorTest {
    Samurai samurai;

    @BeforeEach
    void setUp() {
        samurai = new Samurai();
    }


    @Test
    void Modifier_Strength_ReturnsCorrectModifier() {
        assertEquals(3, samurai.modifier(new Strength()));
    }

    @Test
    void Modifier_Intelligence_ReturnsCorrectModifier() {
        assertEquals(2, samurai.modifier(new Constitution()));
    }


}