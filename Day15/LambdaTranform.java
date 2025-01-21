/*Write a method that takes a list of student names and transforms each name into uppercase letters
with a prefix like "Student: " using map.*/

package Day15;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LambdaTranform {
    public static Map<String,String> StringTransform(List<Students> names)
    {
        return names.stream().collect(Collectors.toMap(name->name.getName(),name->"Student : "+name.getName().toUpperCase()));

    }
        public static void main(String[] args){
            Students s1 = new Students("sanjay", 8.3);
            Students s2 = new Students("kavin", 7.2);
            Students s3 = new Students("jeeva", 7.8);

            List<Students> list = new ArrayList<>();
            list.add(s1);
            list.add(s2);
            list.add(s3);

            Map<String , String> trans = StringTransform(list);
            trans.forEach((original, transformed)-> System.out.println("Original : "+original+" [ Tranformed : "+transformed+" ]"));
        }
    }

