/*Write a program to filter all even numbers from a list of integers using a Predicate.
Use a higher-order function to perform the filtering.
Input: [12, 45, 22, 35, 60]
Output: [12, 22, 60]*/

package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Number{
    int number;
    Number(int number){
        this.number=number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Number = " + number +" ";
    }
}
public class FilterEvenNumbers {

    FilterEvenNumbers(){
        List<Number> list = new ArrayList<>();
        Number n1 = new Number(1);
        Number n2 = new Number(2);
        Number n3 = new Number(3);
        Number n4 = new Number(4);
        Number n5 = new Number(5);
        Number n6 = new Number(6);
        list.add(n1);
        list.add(n2);
        list.add(n3);
        list.add(n4);
        list.add(n5);
        list.add(n6);

        System.out.println(list);
        printNumber(list,(value)-> value.getNumber() % 2 == 0);
    }

    public void printNumber(List<Number> list, Predicate<Number> predicate){
        for (Number number : list){
            if (predicate.test(number)){
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
        FilterEvenNumbers filterEvenNumbers = new FilterEvenNumbers();
    }
}
