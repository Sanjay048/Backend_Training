//Write a method that finds all students whose names start with a specific letter.

package Day15;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFind {
    public static List<Students> FindStrings(List<Students> list,char letter)
    {
        return list.stream().filter(students -> students.getName().startsWith(String.valueOf(letter))).collect(Collectors.toList());
    }
        public static void main (String[] args){
            Students s1 = new Students("sanjay", 8.3);
            Students s2 = new Students("kavin", 7.2);
            Students s3 = new Students("jeeva", 7.8);
            Students s4 = new Students("sowmiya", 8.2);

            List<Students> list = new ArrayList<>();
            list.add(s1);
            list.add(s2);
            list.add(s3);
            list.add(s4);
            char ch ='s';
            List<Students> list2 = FindStrings(list,ch);
            list2.forEach(students -> System.out.println(students.getName()));
        }
    }

