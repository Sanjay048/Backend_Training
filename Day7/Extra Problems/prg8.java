/*A Java interface can only contain method signatures and fields.
The interface can be used to achieve polymorphism. In this problem, you will practice your knowledge on interfaces.
You are given an interface AdvancedArithmetic which contains a method signature int divisor_sum(int n).
You need to write a class called MyCalculator which implements the interface.
divisorSum function just takes an integer as input and return the sum of all its divisors.
For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. The value of n will be at most 1000.
Read the partially completed code in the editor and complete it. You just need to write the MyCalculator class only.
Your class shouldn't be public.
Sample Input
6
Sample Output
12
Explanation
Divisors of 6 are 1,2,3 and 6. 1+2+3+6=12.*/

package Day7;
import java.util.*;

interface AdvancedArithmetic{
    int divisonSum(int number);
}
class MyCalculator implements AdvancedArithmetic{
    @Override
    public int divisonSum(int number){
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (number%i==0) sum+=i;
        }
        return sum;
    }
}
public class Prg8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = sc.nextInt();
        MyCalculator add = new MyCalculator();
        System.out.println("Sum of Divisor : "+add.divisonSum(number));

    }
}
