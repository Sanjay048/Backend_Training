/*Write a Java program that takes two numbers as input from the user and divides the first number by the second.
Handle the following exceptions:
ArithmeticException: If the second number is zero, display an error message: "Division by zero is not allowed."
InputMismatchException: If the user enters non-numeric input, display an error message: "Invalid input. Please enter numeric values."
General Exception: For any other unexpected errors, display a generic error message: "An error occurred: [error message]."
*/

package Day7;
import java.util.*;
public class ExceptionProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter the Number1 : ");
            int number1 = sc.nextInt();
            System.out.print("Enter the Number2 : ");
            int number2 = sc.nextInt();

            System.out.print(number1+" / "+number2+" = "+(number1/number2));

        }catch (ArithmeticException e){
            System.out.println("Division by zero is not allowed");
        }catch (InputMismatchException e){
            System.out.println("Invalid input. Please enter numeric values");
        }catch (Exception e){
            System.out.println("An error occurred");
        }
    }
}
