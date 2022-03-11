package PJ.Job;

import PJ.Stat.Dexterity;
import PJ.Stat.Intelligence;
import PJ.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MageTest {
    Samurai samurai;

    @BeforeEach
    void setUp() {
        samurai = new Samurai();
    }

    @Test
    void Modifier_Dexterity_ReturnsCorrectModifier() {
        assertEquals(1, samurai.modifier(new Dexterity()));
    }

    @Test
    void Modifier_Intelligence_ReturnsCorrectModifier() {
        assertEquals(+4, samurai.modifier(new Intelligence()));
    }


}