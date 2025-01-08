/*Create a method sum(int... numbers) that takes a variable
number of integers as input and returns their sum. Test it with different numbers of arguments.*/
package Day5;

public class Varargs_Example {
    public static int sum(int... numbers){
        int sum = 0;
        for(int x : numbers){
            sum+=x;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Various Arguments");
        System.out.println("Sum of 2 Args : "+sum(2,3));
        System.out.println("Sum of 4 Args : "+sum(2,3,4,5));
        System.out.println("Sum of 6 Args : "+sum(2,3,4,5,6,7));
    }
}
