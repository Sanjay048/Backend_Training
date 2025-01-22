//Write a method that takes a list of Student objects and sorts them by their GPA in descending order using a lambda expression

package Day15;
import java.util.*;
import java.util.Collections;

public class Sorting {

    public static void main(String[] args) {
        Students s1 = new Students("Kavin",7.5);
        Students s2 = new Students("Manoj",7.2);
        Students s3 = new Students("Poovarasan",7.8);
        Students s4 = new Students("Teddy",8.5);
        Students s5 = new Students("Rocky",6.5);

        List<Students> list = new ArrayList<Students>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        System.out.println(list);
        Collections.sort(list,(std1,std2) -> Double.compare(std2.getCgpa(),std1.getCgpa()));
        System.out.println(list);
    }



}
