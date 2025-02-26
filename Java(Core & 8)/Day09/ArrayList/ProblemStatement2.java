/*Problem Statement 2: Reverse the ArrayList
Create a program that reverses the order of elements in an ArrayList.
Input Example:
Input list: [1, 2, 3, 4, 5]
Output Example:
Reversed List: [5, 4, 3, 2, 1]*/

package Day9;

import java.util.ArrayList;
import java.util.*;

public class ProblemStatement2 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of Integers : ");
        int length = sc.nextInt();
        System.out.print("Enter the "+length+" nos :");
        for (int i = 0; i < length; i++) {
            integers.add(sc.nextInt());
        }
        Collections.reverse(integers);
        System.out.println("Reverse ArrayList : "+integers);
    }
}
