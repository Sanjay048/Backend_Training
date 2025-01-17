/*Write a method to check if a number is prime.
Test cases should cover boundary values like 0, 1, negative numbers, and large primes.*/

package Day13;

public class PrimeChecker {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
