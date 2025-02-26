//Write a method that takes a list of student names and transforms each name into uppercase letters with a prefix like "Student: " using map.

package Day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Tranform {
    public static void ConvertToUpperCase(List<Students> list, Function<Students,String> function)
    {
        Map<String,String> map = new HashMap<>();
        for(Students list1 : list)
            map.put(list1.getName(),"Student : "+function.apply(list1));
        for (Map.Entry<String,String> entry : map.entrySet())
            System.out.println("Name : "+entry.getKey()+" && "+entry.getValue());
    }
        public static void main(String[] args){
            Students s1 = new Students("sanjay", 8.3);
            Students s2 = new Students("kavin", 7.2);
            Students s3 = new Students("jeeva", 7.8);

            List<Students> list = new ArrayList<Students>();
            list.add(s1);
            list.add(s2);
            list.add(s3);
            ConvertToUpperCase(list,(str)-> str.getName().toUpperCase());
        }
    }

