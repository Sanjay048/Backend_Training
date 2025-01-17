package Day13;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {

    @Test
    void testFactorialOfZero() {
        assertEquals(1, FactorialCalculator.factorial(0));
    }

    @Test
    void testSmallPositiveNumbers() {
        assertEquals(1, FactorialCalculator.factorial(1));
        assertEquals(2, FactorialCalculator.factorial(2));
        assertEquals(120, FactorialCalculator.factorial(5));
    }

    @Test
    void testInvalidNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            FactorialCalculator.factorial(-3);
        });
        assertEquals("Negative numbers.", exception.getMessage());
    }

    @Test
    void testLargeNumber() {
        assertEquals(3628800, FactorialCalculator.factorial(10), "Expected factorial of 10 to be 3628800");
    }
}
