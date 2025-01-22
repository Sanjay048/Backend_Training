package Day15;

import java.util.*;
import java.util.stream.Collectors;

public class TopScorer {
    public static void main(String[] args) {
        Students s1 = new Students("Sanjay",8.3,"CSE");
        Students s2 = new Students("Kavin",7.2,"IT");
        Students s3 = new Students("Jeeva",7.8,"IT");

        List<Students> list = new ArrayList<Students>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
     Map<String, Optional<Students>> topScorersByDept = list.stream()
                .collect(Collectors.groupingBy(Students::getDept,
                        Collectors.maxBy(Comparator.comparingDouble(Students::getCgpa))
                ));
        topScorersByDept.forEach((department, student) -> {
            student.ifPresent(s -> System.out.println(department + " - Top Scorer: " + s));
        });

    }
}


































