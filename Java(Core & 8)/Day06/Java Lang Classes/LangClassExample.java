/*Write a program to demonstrate the use of the following java.lang classes:
Math - Perform basic mathematical operations like finding the square root, power, and maximum of two numbers.
String - Manipulate a string by finding its length, converting it to uppercase, and extracting a substring.
System - Print a message to the console and measure the execution time of a simple loop using System.currentTimeMillis().
*/

package Day6;

public class LangClassExample {
    public static void main(String[] args) {
        System.out.println("Math Problem");
        double number = 16.0;
        System.out.println("Square root of " + number + " is: " + Math.sqrt(number));
        double base = 2.0;
        double exponent = 3.0;
        System.out.println(base + " power of " + exponent + " is: " + Math.pow(base, exponent));
        int num1 = 25, num2 = 30;
        System.out.println("Maximum of " + num1 + " and " + num2 + " is: " + Math.max(num1, num2));

        System.out.println("String Problem");
        String text = "Sanjay lives in Erode";
        System.out.println("Length of the string: " + text.length());
        System.out.println("Uppercase of the string: " + text.toUpperCase());
        System.out.println("Substring : " + text.substring(7, 11));

        long start = System.currentTimeMillis();
        System.out.println("Starting Time : " + start);
        long sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("Ending Time : " + end);
        long executionTime = end - start;
        System.out.println("Execution time of the loop: " + executionTime + " milliseconds");

    }
}

