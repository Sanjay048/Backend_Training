package Day2;
import  java.util.*;
public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt(), number2 = sc.nextInt(), number3 = sc.nextInt();
        System.out.println((number1 > number2 && number1 > number3)?number1+" is greatest":(number2 > number1 && number2 > number3)?number2+" is greatest":number3+" is greatest");
    }
}
