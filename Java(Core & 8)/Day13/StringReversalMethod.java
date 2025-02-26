/*Write a method to reverse a string.
Test edge cases like an empty string, a single character, and a string with special characters.*/

package Day13;

public class StringReversalMethod {
    public static String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        return new StringBuilder(input).reverse().toString();
    }
}
