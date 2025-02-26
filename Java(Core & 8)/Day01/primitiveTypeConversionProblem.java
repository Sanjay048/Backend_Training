
//Write a program that takes a float as input, converts it to int, and displays both values.Try a case where narrowing conversion loses precision (e.g., casting 123.456 to int).

package Day1;

public class primitiveTypeConversionProblem {
    public static void main(String[] args) {
        float one = 123.456f;
        int two = (int)one;
        System.out.println("Float : "+one+"\nInt : "+two);
    }
}
