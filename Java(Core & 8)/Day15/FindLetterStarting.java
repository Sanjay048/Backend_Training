//Write a method that finds all students whose names start with a specific letter.

package Day15;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FindLetterStarting {
        public static void main (String[] args){
            Students s1 = new Students("sanjay", 8.3);
            Students s2 = new Students("kavin", 7.2);
            Students s3 = new Students("jeeva", 7.8);

            List<Students> list = new ArrayList<Students>();
            list.add(s1);
            list.add(s2);
            list.add(s3);
            System.out.println("Name Starts With s...");
            Predicate<Students> predicate = (ref)-> ref.getName().startsWith("s");
           for (Students list1 : list)
           {
               if(predicate.test(list1))
               {
                   System.out.println(list1.getName());
               }
           }
        }
    }

