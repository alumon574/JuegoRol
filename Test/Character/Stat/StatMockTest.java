package Character.Stat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatMockTest {
    int initialValue;
    StatMock stat;

    @BeforeEach
    void setUp() {
        initialValue=10;
        stat = new StatMock(initialValue);
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void InitialValue_getValue_CurrentValue() {
        assertEquals(initialValue, stat.getValue());
    }

    @Test
    void InitialValue_IncreaseValue_EndValue() {
        stat.increase();
        assertEquals(initialValue+1,stat.getValue());
    }

    @Test
    void InitialValue_DecreaseValue_EndValue() {
        stat.decrease();
        assertEquals(initialValue-1,stat.getValue());
    }

}