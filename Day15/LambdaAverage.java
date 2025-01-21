//Write a method that calculates the average GPA of a list of students using a lambda expression.

package Day15;

import java.util.ArrayList;
import java.util.List;

public class LambdaAverage {
    public static double ToCalculateAverage(List<Students> list1)
    {
        return list1.stream().mapToDouble(list-> list.getCgpa()).average().orElse(0.0);
    }
    public static void main(String[] args) {
        Students s1 = new Students("sanjay", 8.3);
        Students s2 = new Students("kavin", 7.2);
        Students s3 = new Students("jeeva", 7.8);

        List<Students> list = new ArrayList<Students>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        double avg = ToCalculateAverage(list);
        System.out.println("Average CGPA : "+avg);
    }
}
