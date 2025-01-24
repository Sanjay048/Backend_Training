package Day18;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;


public class StreamExample {

    public static void main(String[] args) {
        List<Student> stuList = new ArrayList<>();

        Student stu1 = new Student("Sanjay", "Physics", new int[]{90, 98, 90, 89, 88});
        Student stu2 = new Student("kishanth", "Mathematics", new int[]{70, 75, 80, 65, 60});
        Student stu3 = new Student("sakthivel", "Physics", new int[]{54, 53, 30, 39, 41});
        Student stu4 = new Student("Kavinkumar", "Computer Science", new int[]{90, 70, 98, 82, 77});
        Student stu5 = new Student("sam", "Computer Science", new int[]{85, 90, 78, 88, 92});
        Student stu6 = new Student("Arjunan", "Mathematics", new int[]{55, 60, 65, 70, 75});

        stuList.add(stu1);
        stuList.add(stu2);
        stuList.add(stu3);
        stuList.add(stu4);
        stuList.add(stu5);
        stuList.add(stu6);

        stuList.forEach(System.out::println);
        System.out.println("________________________________________________________________________");
        System.out.println("\nTop 3 Students average marks:");
        TopThree(stuList);

        System.out.println("________________________________________________________________________");
        System.out.println("average marks for each department.");
        AverageMarks(stuList);

        System.out.println("________________________________________________________________________");
        System.out.println("Top students in each department");
        TopStudents(stuList);

        System.out.println("________________________________________________________________________");
        System.out.println("Count of students failed in each department:");
        failed(stuList);
        
    }

    public static void TopThree(List<Student> students) {
        students.stream()
                .sorted((s1, s2) -> Double.compare(s2.getAverage(), s1.getAverage())) // Sort based on average marks
                .limit(3) 
                .forEach(System.out::println); 
    }
    
    public static void AverageMarks(List<Student> students) {
        students.stream()
                .collect(Collectors.groupingBy(
                        Student::getDepartment, 
                        Collectors.averagingDouble(Student::getAverage) 
                ))
                .forEach((department, averageMarks) ->System.out.println(department + " : " + averageMarks));


    }   public static void TopStudents(List<Student> students) {
        students.stream()
        .collect(Collectors.groupingBy(
                Student::getDepartment, 
                Collectors.collectingAndThen(
                        Collectors.maxBy((s1, s2) -> Double.compare(s1.getAverage(), s2.getAverage())), 
                        student -> student.orElse(null) 
                )
        ))
        .forEach((department, topStudent) -> {
            if (topStudent != null) {
                System.out.println(department + " : " + topStudent.getName() + " average marks " + topStudent.getAverage());
            }
        });
}
    public static void failed(List<Student> students) {
        students.stream()
                .collect(Collectors.groupingBy(
                        Student::getDepartment, 
                        Collectors.filtering(student -> student.getAverage() < 50, Collectors.counting()) 
                ))
                .forEach((department, count) -> System.out.println(department + " : " + count + " failed"));
    }


    }
