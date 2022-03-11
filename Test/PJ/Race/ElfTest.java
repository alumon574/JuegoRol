package PJ.Race;

import PJ.Stat.Constitution;
import PJ.Stat.Dexterity;
import PJ.Stat.Intelligence;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElfTest {
    Elf elfo;

    @BeforeEach
    void setUp() {
        elfo = new Elf();
    }

    @Test
    void Modifier_Intelligence_ReturnsCorrectValue() {
        assertEquals(3, elfo.modifier(new Intelligence()));
    }

    @Test
    void Modifier_Dexterity_CorrectValue() {
        assertEquals(+3, elfo.modifier(new Dexterity()));
    }

    @Test
    void Modifier_Constitution_CorrectValue() {
        assertEquals(-1, elfo.modifier(new Constitution()));
    }
}