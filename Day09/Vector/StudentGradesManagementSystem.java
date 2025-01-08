/*You are tasked with creating a program to manage student grades using a Vector in Java. Implement the following functionalities:
Add grades (as integers) to a vector dynamically.
Print all grades in the vector.
Calculate and display:
The highest grade.
The lowest grade.
The average grade.
Allow the user to remove a specific grade by its index.
*/

package Day9;

import java.util.Scanner;
import java.util.Vector;

public class StudentGradesManagementSystem {
    public static void main(String[] args) {
        Vector<Integer> grades = new Vector<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Add grades\n2.Print all grades\n3.Calculate and display\n4.Remove a specific grade by its index\n5.Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter the Grade value : ");
                    int grade = sc.nextInt();
                    grades.add(grade);
                    break;
                case 2:
                    System.out.println("All Grades : "+grades);
                    break;
                case 3:
                    int  highestGrade = Integer.MIN_VALUE, lowestGrade = Integer.MAX_VALUE, averageGrade=0;
                    for(int x:grades){
                        if(x>highestGrade) highestGrade = x;
                        if(x<lowestGrade) lowestGrade = x;
                        averageGrade+=x;
                    }
                    System.out.println("The Highest Grade : "+highestGrade);
                    System.out.println("The Lowest Grade : "+lowestGrade);
                    System.out.println("The Average Grade : "+averageGrade/grades.size());
                    break;
                case 4:
                    System.out.print("Enter the index to remove grades : ");
                    int idx = sc.nextInt();
                    if(idx >= 0 && idx < grades.size()) grades.remove(idx);
                    else System.out.println("Invalid Index");
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }while (choice!=5);
    }
}
