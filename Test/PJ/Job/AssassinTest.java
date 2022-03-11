package PJ.Job;

import PJ.Stat.Constitution;
import PJ.Stat.Dexterity;
import PJ.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AssassinTest {
    Assassin assassin;

    @BeforeEach
    void setUp() {
        assassin = new Assassin();
    }

    @Test
    void Modifier_Dexterity_ReturnsCorrectModifier() {
        assertEquals(3, assassin.modifier(new Dexterity()));
    }

    @Test
    void Modifier_Strength_ReturnsCorrectModifier() {
        assertEquals(1, assassin.modifier(new Strength()));
    }

    @Test
    void Modifier_Intelligence_ReturnsCorrectModifier() {
        assertEquals(+1, assassin.modifier(new Constitution()));
    }

}