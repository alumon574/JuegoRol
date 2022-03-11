package PJ.Job;

import PJ.Stat.Dexterity;
import PJ.Stat.Intelligence;
import PJ.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThiefTest {
    Thief thief;

    @BeforeEach
    void setUp() {
        thief = new Thief();
    }

    @Test
    void Modifier_Dexterity_ReturnsCorrectModifier() {
        assertEquals(3, thief.modifier(new Dexterity()));
    }

    @Test
    void Modifier_Strength_ReturnsCorrectModifier() {
        assertEquals(3, thief.modifier(new Strength()));
    }

    @Test
    void Modifier_Intelligence_ReturnsCorrectModifier() {
        assertEquals(-1, thief.modifier(new Intelligence()));
    }


}