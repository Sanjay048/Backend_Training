/*Write a program to add a list of integers using a List<Integer> and demonstrate
how autoboxing allows seamless addition of primitive int.*/

package Day5;
import java.util.*;

public class IntegerAddition {
    public static int addIntegers(List<Integer> integer){
        int sum=0;
        for (int x: integer){
            sum+=x;
        }
        return sum;
    }
    public static int addIntegersVarargs(int... integer){
        int sum=0;
        for (int x: integer){
            sum+=x;
        }
        return sum;
    }
    public static void main(String[] args) {
        List<Integer> integer = new ArrayList<>();
        integer.add(1);
        integer.add(3);
        integer.add(5);
        integer.add(7);
        integer.add(9);

        System.out.println("Sum of Integer List : "+addIntegers(integer));
        System.out.println("Sum of VarArgs : "+addIntegersVarargs(2,4,6,8));

    }
}
