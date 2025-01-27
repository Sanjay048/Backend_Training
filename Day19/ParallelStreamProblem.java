/*Exercise:
Given a list of integers, perform the following tasks using parallel streams:
Filter numbers greater than 50.
Map these numbers to their squares.
Print the first 10 squared numbers.
*/

package Day19;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamProblem {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40,50,60,70,80,90,100,110,120,130,140,150);
        list.parallelStream().filter(num -> num<50).forEach(System.out::println);
        System.out.println("--------------------");
        list.parallelStream().map(num->num*num).forEach(System.out::println);
        System.out.println("--------------------");
        list.parallelStream().limit(10).forEach(System.out::println);
        System.out.println("--------------------");
        list.parallelStream().filter(num -> num<50)
                .map(num->num*num)
                .limit(10)
                .forEach(System.out::println);
    }
}

