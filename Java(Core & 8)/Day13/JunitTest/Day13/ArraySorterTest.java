package Day13;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArraySorterTest {
    @Test
    void testEmptyArray() {
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, ArraySorter.sortArray(input));
    }

    @Test
    void testAlreadySortedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, ArraySorter.sortArray(input));
    }

    @Test
    void testArrayWithDuplicates() {
        int[] input = {4, 2, 7, 4, 3, 2};
        int[] expected = {2, 2, 3, 4, 4, 7};
        assertArrayEquals(expected, ArraySorter.sortArray(input));
    }

    @Test
    void testUnsortedArray() {
        int[] input = {5, 3, 8, 1, 9};
        int[] expected = {1, 3, 5, 8, 9};
        assertArrayEquals(expected, ArraySorter.sortArray(input));
    }

    @Test
    void testNullArray() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ArraySorter.sortArray(null);
        });
        assertEquals("Null Array", exception.getMessage());
    }
}
