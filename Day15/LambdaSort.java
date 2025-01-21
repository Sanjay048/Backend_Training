//Write a method that takes a list of Student objects and sorts them by their GPA in descending order using a lambda expression.

package Day15;
import java.util.*;
import java.util.Collections;

public class LambdaSort {

    public static void main(String[] args) {
        Students s1 = new Students("sanjay", 8.3);
        Students s2 = new Students("kavin", 7.2);
        Students s3 = new Students("jeeva", 7.8);

        List<Students> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println("Before Sorting");
        System.out.println(list);
        System.out.println("After Sorting");
        Collections.sort(list,(st1,st2)-> Double.compare(st2.getCgpa() , st1.getCgpa()));
        //Collections.sort(list,Comparator.comparing(Students::getCgpa));
        System.out.print(list);
    }
}
