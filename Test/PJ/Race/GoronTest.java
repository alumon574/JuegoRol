package PJ.Race;

import PJ.Stat.Constitution;
import PJ.Stat.Dexterity;
import PJ.Stat.Intelligence;
import PJ.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoronTest {
    Goron goron;


    @BeforeEach
    void setUp() {
        goron = new Goron();
    }

        @Test
        void Modifier_Intelligence_ReturnsCorrectValu(){
            assertEquals(-1, goron.modifier(new Intelligence()));
        }

        @Test
        void Modifier_Strength_ReturnsCorrectValue(){
            assertEquals(+2, goron.modifier(new Strength()));
        }

        @Test
        void Modifier_Dexterity_CorrectValue(){
            assertEquals(+2, goron.modifier(new Dexterity()));
        }

        @Test
        void Modifier_Constitution_CorrectValue(){
            assertEquals(+2, goron.modifier(new Constitution()));
        }
    }
