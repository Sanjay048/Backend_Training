//Write a program to find the factorial of a number using loops and arithmetic operators.


package Day2;
import  java.util.*;
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(), temp=1;
        for (int i = number; i >= 1 ; i--) {
            temp*=i;
        }
        System.out.println("Factorial of "+number+" is : "+temp);
    }
}
