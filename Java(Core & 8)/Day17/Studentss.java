/*Create a Student class with fields name and marks.
Write an instance method displayStudentDetails in the Student class to print the student's details.
Use a method reference to call this method for each student in a list.*/

package Day17;

import java.util.Arrays;
import java.util.List;

class Students {
    String name;
    int mark;

    Students(String name, int mark){
        this.mark=mark;
        this.name=name;
    }

    public void displayStudentDetails() {
        System.out.println("Student[" + " Name = " + name + ", Mark = " + mark + "]");
    }
}
public class Studentss{
    public static void main(String[] args) {
        List<Students> list = Arrays.asList(new Students("sanji",90),
                new Students("kavin",80),
                new Students("jeeva",70)
                );
        list.forEach(Students::displayStudentDetails);
    }
}
