/*Static Method Reference to write a Java program that uses a method reference
to a static method Math::sqrt to calculate the square root of a list of numbers.*/

package Day17;

import java.util.function.DoubleFunction;

public class StaticMethodReference {
    StaticMethodReference(){
        DoubleFunction<Double> doubleFunction = Math::sqrt;
        double[] no = {10,23,43,45,26};
        for (double x : no){
            System.out.println(doubleFunction.apply(x));
        }
    }
    public static void main(String[] args) {
        StaticMethodReference staticMethodReference = new StaticMethodReference();
    }
}
