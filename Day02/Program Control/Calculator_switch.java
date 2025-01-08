//Create a program to simulate a simple calculator using switch-case.


package Day2;
import  java.util.*;
public class Calculator_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt(), number2 = sc.nextInt();
        System.out.print("Enter the Operator : ");
        char operator = sc.next().charAt(0);
        switch (operator){
            case '+':
                System.out.print(number1+" + "+number2+" = "+(number1+number2));
                break;
            case '-':
                System.out.print(number1+" - "+number2+" = "+(number1-number2));
                break;
            case '*':
                System.out.print(number1+" * "+number2+" = "+(number1*number2));
                break;
            case '/':
                System.out.print(number1+" / "+number2+" = "+(number1/number2));
                break;
            case '%':
                System.out.print(number1+" % "+number2+" = "+(number1%number2));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
