package PJ.Race;

import PJ.Stat.Constitution;
import PJ.Stat.Dexterity;
import PJ.Stat.Intelligence;
import PJ.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrcTest {
    Orc orc;

    @BeforeEach
    void setUp() {
        orc = new Orc();
    }

    @Test
    void Modifier_Intelligence_ReturnsCorrectValue() {
        assertEquals(-3, orc.modifier(new Intelligence()));
    }

    @Test
    void Modifier_Strength_ReturnsCorrectValue() {
        assertEquals(+5, orc.modifier(new Strength()));
    }

    @Test
    void Modifier_Dexterity_CorrectValue() {
        assertEquals(0, orc.modifier(new Dexterity()));
    }

    @Test
    void Modifier_Constitution_CorrectValue() {
        assertEquals(+3, orc.modifier(new Constitution()));
    }
}