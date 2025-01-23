/*Practice problems:
This project is about analyzing the performance of students in different departments using Java Streams. Here's the step-by-step explanation:
Imagine we have students in three departments (like Computer Science, Mathematics, and Physics). Each student has:
A name (e.g., "John"),
Marks for 5 subjects (e.g., 85, 90, 78, etc.),
A grade (to be calculated based on their average marks).
We want to:
Find the top 3 students based on their average marks.
Assign a grade (A, B, C, D) to each student based on their average marks.
Find the average marks for each department.
Identify the top student in each department.
Count how many students failed in each department (average marks < 50).
*/

package Day18;

import Day6.Student;

import java.util.*;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentHistory {
    public static char calculateGrade(double average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else {
            return 'D';
        }
    }
    public static void main(String[] args) {
        List<StudentList> list = Arrays.asList(
                new StudentList("Sanjay","Computer Science",89,87,86,98,93),
                new StudentList("Jeeva","Computer Science",60,67,76,72,90),
                new StudentList("Kavin Kumar","Mathematics",60,77,70,78,63),
                new StudentList("Arjunan","Mathematics",20,57,30,49,49),
                new StudentList("Kishanth","Physics",93,87,90,87,58),
                new StudentList("Sakthivel","Physics",65,75,85,76,63)
                );
        List<StudentList> topThreeStudents = list.stream().sorted(Comparator.comparingDouble(StudentList::calculateAverage).reversed())
                .limit(3).collect(Collectors.toList());
        System.out.println("Top 3 Grades");
        topThreeStudents.forEach(System.out::println);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");

        //Assigning grades
        list.forEach(student -> student.setGrade(calculateGrade(student.calculateAverage())));

        //Calculate avg marks for every dept
        Map<String, Double> departmentAverages = list.stream()
                .collect(Collectors.groupingBy(StudentList::getDepartment, Collectors.averagingDouble(StudentList::calculateAverage)));
        System.out.println("Department Average");
        departmentAverages.forEach((department,average)-> System.out.println("Department : "+department+" , Average : "+average));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");

        // Find the top student in each department
        Map<String, StudentList> topStudentsInDepartments = list.stream()
                .collect(Collectors.groupingBy(StudentList::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(StudentList::calculateAverage)),
                                Optional::get
                        )));
        System.out.println("Top student in Each Department:");
        topStudentsInDepartments.forEach((department, student) -> System.out.println(department + ": " + student));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");

        // Fail in each department
        Map<String, Long> failedStudentsByDepartment = list.stream()
                .filter(student -> student.calculateAverage() < 50)
                .collect(Collectors.groupingBy(StudentList::getDepartment, Collectors.counting()));
        System.out.println("Failed Students by Department:");
        failedStudentsByDepartment.forEach((department, count) -> System.out.println(department + ": " + count));
    }
}
