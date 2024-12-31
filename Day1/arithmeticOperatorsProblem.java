//Write a program that takes two integers from the user and performs all arithmetic operations, printing each result.


package Day1;

import java.util.*;
public class arithmeticOperatorsProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no1=sc.nextInt();
        int no2= sc.nextInt();
        System.out.println("Addition : "+(no1+no2)+"\nSubtraction : "+(no1-no2)+"\nMultiplication : "+(no1*no2)+"\nDivision : "+(no1/no2)+"\nModulo : "+(no1%no2));
    }
}
