/*Write a method to sort an array of integers.
Test cases should include arrays with duplicates, already sorted arrays, and empty arrays*/

package Day13;

import java.util.Arrays;

public class ArraySorter {
    public static int[] sortArray(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Null Array");
        }
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        return sortedArray;
    }
}
