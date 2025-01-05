/*Write the following code in your editor below:

A class named Arithmetic with a method named add that takes  integers as parameters and returns an integer denoting their sum.
A class named Adder that inherits from a superclass named Arithmetic.
Your classes should not be public .

Input Format
You are not responsible for reading any input from stdin;
a locked code stub will test your submission by calling the add method on an Adder object and passing it 2 integer parameters.
 */

package Day7;

class Arithmetic{
    int add(int number1, int number2){
        return number1+number2;
    }
}
class Adder extends Arithmetic{}

public class prg7 {
    public static void main(String[] args) {
        Adder no = new Adder();
        System.out.println("My superclass is: " + no.getClass().getSuperclass().getName());
        System.out.println(no.add(10,10)+" "+ no.add(20,20)+" "+ no.add(30,30));
    }
}
