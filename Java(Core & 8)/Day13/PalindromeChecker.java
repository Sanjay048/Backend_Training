/*Implement a method to check if a string is a palindrome.
Write test cases for valid palindromes, non-palindromes, and case sensitivity.*/

package Day13;

public class PalindromeChecker {
        public static boolean isPalindrome(String input) {
            if (input == null) {
                throw new IllegalArgumentException("Input cannot be null");
            }
            String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            return normalized.equals(new StringBuilder(normalized).reverse().toString());
        }
}
