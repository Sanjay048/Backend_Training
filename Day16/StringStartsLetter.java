/*Create a method that takes a Predicate<String> and a list of strings and filters out all strings that start with a particular letter (e.g., 'A').
Input: ["Apple", "Banana", "Avocado", "Cherry"]
Letter: 'A'
Output: ["Apple", "Avocado"]*/

package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Name{
    String name;
    Name(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name = " + name + " ";
    }
}
public class StringStartsLetter {
    StringStartsLetter(){
        List<Name> list = new ArrayList<>();
        Name n1 = new Name("sanji");
        Name n2 = new Name("kavin");
        Name n3 = new Name("jeeva");
        Name n4 = new Name("sam");
        list.add(n1);
        list.add(n2);
        list.add(n3);
        list.add(n4);

        System.out.println(list);
        findNumber(list,(value) -> value.getName().startsWith("s"));
    }

    public void findNumber(List<Name> list, Predicate<Name> predicate){
        for (Name name : list){
            if (predicate.test(name)){
                System.out.println(name);
            }
        }
    }

    public static void main(String[] args) {
        StringStartsLetter stringStartsLetter = new StringStartsLetter();
    }
}
