/*Use Math class methods like sqrt() and pow() in a program
to calculate the hypotenuse of a right-angled triangle using static imports.*/

package Day5;
import static java.lang.Math.*;
import java.util.*;
public class hypotenuse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side1 : ");
        double side1= sc.nextDouble();
        System.out.print("Enter the side2 : ");
        double side2= sc.nextDouble();

        double result = sqrt(pow(side1,2)+pow(side2,2));
        System.out.println("Third side of right-angled triangle : "+result);
    }
}
