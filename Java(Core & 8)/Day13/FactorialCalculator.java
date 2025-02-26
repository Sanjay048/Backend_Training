/*Create a method to calculate the factorial of a number.
Include test cases for zero, small positive numbers, and invalid inputs (e.g., negative numbers).*/

package Day13;

public class FactorialCalculator {
    public static long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative numbers.");
        }
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
