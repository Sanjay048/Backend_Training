/*Problem Statement 3: Find the Maximum Element in an ArrayList
Create a program to find the maximum element in an ArrayList of integers.
Input Example:
Input list: [15, 22, 8, 42, 17]
Output Example:
Maximum Element: 42*/

package Day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProblemStatement3 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of Integers : ");
        int length = sc.nextInt();
        System.out.print("Enter the "+length+" nos :");
        for (int i = 0; i < length; i++) {
            integers.add(sc.nextInt());
        }
        System.out.println("Max no in the ArrrayList : "+Collections.max(integers));
    }
}
