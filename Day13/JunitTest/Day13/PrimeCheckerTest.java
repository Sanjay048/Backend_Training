package Day13;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeCheckerTest {

    @Test
    void testSmallPrimes() {
        assertTrue(PrimeChecker.isPrime(2));
        assertTrue(PrimeChecker.isPrime(3));
    }

    @Test
    void testNonPrimes() {
        assertFalse(PrimeChecker.isPrime(0));
        assertFalse(PrimeChecker.isPrime(1));
    }

    @Test
    void testNegativeNumbers() {
        assertFalse(PrimeChecker.isPrime(-1));
        assertFalse(PrimeChecker.isPrime(-10));
    }

    @Test
    void testLargePrime() {
        assertTrue(PrimeChecker.isPrime(7919), "Expected 7919 to be a prime number");
    }

    @Test
    void testLargeNonPrime() {
        assertFalse(PrimeChecker.isPrime(8000), "Expected 8000 to not be a prime number");
    }
}
