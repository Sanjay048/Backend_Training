package Day13;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    @Test
    void testValidPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("madam"));
        assertTrue(PalindromeChecker.isPalindrome("RaceCar"));
    }

    @Test
    void testNonPalindrome() {
        assertFalse(PalindromeChecker.isPalindrome("hello"));
        assertFalse(PalindromeChecker.isPalindrome("Sanji"));
    }

    @Test
    void testEmptyString() {
        assertTrue(PalindromeChecker.isPalindrome(""));
    }

    @Test
    void testSingleCharacter() {
        assertTrue(PalindromeChecker.isPalindrome("s"));
    }

    @Test
    void testNullInput() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> PalindromeChecker.isPalindrome(null));
        assertEquals("Input cannot be null", exception.getMessage());
    }
}
