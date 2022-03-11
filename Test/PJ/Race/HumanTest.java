package PJ.Race;

import PJ.Stat.Constitution;
import PJ.Stat.Dexterity;
import PJ.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {
    Human humano;

    @BeforeEach
    void setUp() {
        humano=new Human();
    }

    @Test
    void Modifier_Strength_ReturnsCorrectValue(){
        assertEquals(+2, humano.modifier(new Strength()));
    }

    @Test
    void Modifier_Dexterity_CorrectValue(){
        assertEquals(+1, humano.modifier(new Dexterity()));
    }

    @Test
    void Modifier_Constitution_CorrectValue(){
        assertEquals(+2, humano.modifier(new Constitution()));
    }
}