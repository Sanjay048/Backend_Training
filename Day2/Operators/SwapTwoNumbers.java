package Day2;
import  java.util.*;
public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt(), number2 = sc.nextInt();
        number1=number1^number2;
        number2=number1^number2;
        number1=number1^number2;
        System.out.println("After swap the numbers :"+number1+" and "+number2);
    }
}
