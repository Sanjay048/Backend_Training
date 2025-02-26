/*Create a program that uses a Map to store and manage student names and their corresponding grades. Implement the following features:
Add a student's name and grade to the map.
Update a student's grade if the student already exists in the map.
Retrieve a student's grade by their name.
Display all students and their grades.
Input Example:
Add: {"Alice": 85, "Bob": 90, "Charlie": 88}
Update: {"Bob": 92}
Retrieve: "Alice"*/

package Day10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String ,Integer> map = new HashMap<>();
        map.put("Alice", 85);
        map.put("Bob", 90);
        map.put("Charlie", 88);
        System.out.println("Map : "+map);
        map.put("Bob", 92);
        System.out.println("Updated value in Map : "+map);
        System.out.print("Enter the name to find the grades : ");
        String nameRetrieve = sc.nextLine();
        if (map.containsKey(nameRetrieve)) {
            System.out.println("Grade for " + nameRetrieve + ": " + map.get(nameRetrieve));
        } else {
            System.out.println("Student not found.");
        }
    }
}
