//Create a program to check if a number is prime using logical operators.

package Day2;
import  java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(), temp = 0;
        if (number == 0 || number == 1) {
            System.out.println(number + " it is neither Prime nor Composite");
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    temp++;
                    break;
                }
            }
            if (temp == 0) System.out.println(number + " is a Prime Number");
            else System.out.println(number + " it is not a Prime Number");
        }
    }
}
