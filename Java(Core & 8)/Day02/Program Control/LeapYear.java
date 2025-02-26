//Write a program to determine if a given year is a leap year.


package Day2;
import  java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%400 == 0 && year%100 == 0) System.out.print(year+" is Leap Year");
        else if (year%4 == 0 && year%100 != 0) System.out.print(year+" is Leap Year");
        else System.out.print(year+" it is not a Leap Year");
    }
}
