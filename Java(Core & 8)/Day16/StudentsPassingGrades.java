/*Write a function that accepts a Predicate<Student> to filter students with grades above 60. Define a Student class with fields like name and grade.
Input:
John: 75
Alice: 55
Mark: 88
Output: John, Mark
*/

package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Student{
    String name;
    int mark;

    Student(String name, int mark){
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Student[" + " Name = " + name + ", Mark = " + mark + "]";
    }

}
public class StudentsPassingGrades {
    StudentsPassingGrades() {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student("sanji", 90);
        Student s2 = new Student("kavin", 80);
        Student s3 = new Student("jeeva", 60);
        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println(list);
        passGrade(list,(value)-> value.getMark() > 60);
    }

    public void passGrade(List<Student> list, Predicate<Student> predicate){
        for (Student student : list){
            if (predicate.test(student)){
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        StudentsPassingGrades studentsPassingGrades = new StudentsPassingGrades();
    }
}
