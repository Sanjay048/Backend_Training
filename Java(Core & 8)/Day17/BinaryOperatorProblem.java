//BinaryOperator Create a program using a BinaryOperator to find the maximum of two integers.

package Day17;

import java.util.function.BinaryOperator;

public class BinaryOperatorProblem {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (no1,no2)-> Math.max(no1,no2);
        System.out.println(binaryOperator.apply(10,20));
    }
}
