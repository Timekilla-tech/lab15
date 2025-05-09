package labxx.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class LongDivTest {
    @Test
    void testDivide() {
        LongDiv longDiv = new LongDiv();
        long result = longDiv.divide(10L, 2L);
        assertEquals(5L, result);
    }
    @Test
    void testDivideNegative() {
        LongDiv longDiv = new LongDiv();
        long result = longDiv.divide(-10L, -2L);
        assertEquals(5L, result);
    }
    @Test
    void testDivideNegativeResult() {
        LongDiv longDiv = new LongDiv();
        long result = longDiv.divide(10L, -2L);
        assertEquals(-5L, result);
    }
    @Test
    void testDivideZero() {
        LongDiv longDiv = new LongDiv();
        long result = longDiv.divide(0L, 2L);
        assertEquals(0L, result);
    }
    @Test
    void testDivideByZero() {
        LongDiv longDiv = new LongDiv();
        try {
            longDiv.divide(10L, 0L);
        } catch (IllegalArgumentException e) {
            assertEquals("0-д хувааж болохгүй.", e.getMessage());
        }
    }
}
