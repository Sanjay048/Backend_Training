/*Create a program that reads two integers and prints whether the first number is greater than the second using relational operators.
Use logical operators to combine multiple conditions.*/


package Day1;

import java.util.*;
public class logicalRelationalOperatorsProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no1= sc.nextInt();
        int no2= sc.nextInt();
        if(no1>no2) System.out.println("no1 "+no1+" Greater than no2 "+no2);
        else if(no2>no1) System.out.println("no2 "+no2+" Greater than no1 "+no1);
        else System.out.println("no1 "+no1+" equal to no2 "+no2);

        if(no1>no2 && no1>0) System.out.println("Positive number .no1 "+no1+" Greater than no2 "+no2);
        else if(no2>no1 && no2>0) System.out.println("Positive number .no2 "+no2+" Greater than no1 "+no1);
        else System.out.println("Positive number .no1 "+no1+" equal to no2 "+no2);
    }
}
