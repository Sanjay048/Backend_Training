package Day13;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringReversalMethodTest {

    @Test
    void testReverseNormalString() {
        assertEquals("cba", StringReversalMethod.reverse("abc"));
    }

    @Test
    void testReverseEmptyString() {
        assertEquals("", StringReversalMethod.reverse(""));
    }

    @Test
    void testReverseSingleCharacter() {
        assertEquals("a", StringReversalMethod.reverse("a"));
    }

    @Test
    void testReverseSpecialCharacters() {
        assertEquals("!@#", StringReversalMethod.reverse("#@!"));
    }

    @Test
    void testReverseNullInput() {
        assertThrows(IllegalArgumentException.class, () -> StringReversalMethod.reverse(null));
    }
}
