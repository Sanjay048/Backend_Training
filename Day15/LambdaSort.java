//Write a method that takes a list of Student objects and sorts them by their GPA in descending order using a lambda expression.

package Day15;
import java.util.*;
import java.util.Collections;

public class LambdaSort {

    public static void main(String[] args) {
        Students s1 = new Students("sanjay", 8.3);
        Students s2 = new Students("kavin", 7.2);
        Students s3 = new Students("jeeva", 7.8);

        List<Students> list = new ArrayList<Students>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println("Before Sort");
        System.out.println(list.toString());
        System.out.println("After Sort");
        Collections.sort(list,(std1,std2) -> Double.compare(std1.getCgpa() , std2.getCgpa()));
        System.out.println(list.toString());
        Collections.sort(list,(std1,std2) -> Double.compare(std2.getCgpa(),std1.getCgpa()));
        System.out.println("Decanding order");
        System.out.println(list.toString());
    }



}
