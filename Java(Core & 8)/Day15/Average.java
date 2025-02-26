/*Write a method that calculates the average GPA of a list of students using a lambda expression.*/

package Day15;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Average {
    public static void ToCalculateAverage(List<Students> list1, Consumer<Double> consumer  )
    {
        double sum=0;
       for(Students list : list1)
       {
           sum = sum + list.getCgpa();
       }
       consumer.accept(sum);
    }
    public static void main(String[] args) {
        Students s1 = new Students("sanjay", 8.3);
        Students s2 = new Students("kavin", 7.2);
        Students s3 = new Students("jeeva", 7.8);

        List<Students> list = new ArrayList<Students>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

       ToCalculateAverage(list,(total)-> System.out.println("Average CGPA : "+(total/list.size())));

    }
}
