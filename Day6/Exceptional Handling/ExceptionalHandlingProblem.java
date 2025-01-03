/*Accepts two integers from the user as input.
Attempts to divide the first integer by the second.
Implements exception handling to manage the following scenarios:
Division by zero: Display an error message "Error: Division by zero is not allowed.".
Invalid input: Display an error message "Error: Please enter valid integers.".
Any other exceptions: Display "An unexpected error occurred.".*/

package Day6;
import java.util.*;
public class ExceptionalHandlingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter the Number1 : ");
            int number1 = Integer.parseInt(sc.nextLine());
            System.out.print("Enter the Number2 : ");
            int number2 = Integer.parseInt(sc.nextLine());
            System.out.println(number1+" / "+number2+" = "+number1/number2);
        }catch (ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed");
        }catch (NumberFormatException e){
            System.out.println("Error: Please enter valid integers");
        }
        catch (Exception e){
            System.out.println("An unexpected error occurred");
        }
    }
}
