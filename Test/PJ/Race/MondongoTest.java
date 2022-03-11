package PJ.Race;

import PJ.Stat.Constitution;
import PJ.Stat.Intelligence;
import PJ.Stat.Strength;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MondongoTest {
Mondongo mondongo;
    @BeforeEach
    void setUp() {
        mondongo=new Mondongo();
    }
    @Test
    void Modifier_Intelligence_ReturnsCorrectValu(){
        assertEquals(-4, mondongo.modifier(new Intelligence()));
    }

    @Test
    void Modifier_Strength_ReturnsCorrectValue(){
        assertEquals(+4, mondongo.modifier(new Strength()));
    }

    @Test
    void Modifier_Constitution_CorrectValue(){
        assertEquals(+5, mondongo.modifier(new Constitution()));
    }
}