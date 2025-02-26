/*Instance Method Reference to Create a program where a method reference is used to compare strings
(e.g., String::compareToIgnoreCase) in a list and sort them.*/

package Day17;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InstanceMethodReference {
    public static void CheckCompareToIgnoreCase(List<String> names){
        Collections.sort(names,String::compareToIgnoreCase);
        System.out.println(names);
    }
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sanji", "Kavin", "jeeva", "yuvan", "luffy");
        CheckCompareToIgnoreCase(names);
    }
}
