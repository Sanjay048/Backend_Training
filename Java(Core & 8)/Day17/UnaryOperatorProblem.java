//UnaryOperator Write a Java program to use a UnaryOperator that converts a given string to uppercase.

package Day17;

import java.util.function.UnaryOperator;

public class UnaryOperatorProblem {
    public static void main(String[] args) {
        String str = "sanji";
        UnaryOperator<String> unaryOperator = (name)-> name.toUpperCase();
        System.out.println(unaryOperator.apply(str));
    }
}
