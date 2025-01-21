/*Write a method that groups students by department and finds the top scorer in each department using Collectors.
groupingBy and maxBy.*/

package Day15;
import java.util.*;
import java.util.stream.Collectors;

public class StudentGrouping {
    public static Map<String, Optional<Students>> getTopScorersByDepartment(List<Students> students) {
        return students.stream()
                .collect(Collectors.groupingBy(
                        Students::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Students::getCgpa))
                ));
    }

    public static void main(String[] args) {
        List<Students> students = Arrays.asList(
                new Students("Sanjay", 8.3, "Information Technology"),
                new Students("Kavin", 7.6, "Cyber Security"),
                new Students("Jeeva", 8.9, "Computer Science"),
                new Students("sanji", 9.2, "Computer Science")
        );
        Map<String, Optional<Students>> topScorers = getTopScorersByDepartment(students);

        System.out.println("Top Scorer in Each Department:");
        topScorers.forEach((department, student) ->
                System.out.println(department + ": " + student.orElse(null))
        );
    }
}