package Java8Interview_questions;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student("A", "Math", 90),
            new Student("B", "Math", 95),
            new Student("C", "Math", 95),
            new Student("D", "Math", 80),
            new Student("E", "Science", 85),
            new Student("F", "Science", 92),
            new Student("G", "Science", 88)
        );

        Map<String, Optional<Integer>> result =
            students.stream()
                .collect(Collectors.groupingBy(
                    Student::getSubject,
                    Collectors.mapping(
                        Student::getMarks,
                        Collectors.collectingAndThen(
                            Collectors.toList(),
                            list -> list.stream()
                                    .distinct()
                                    .sorted(Comparator.reverseOrder())
                                    .skip(1)
                                    .findFirst()
                        )
                    )
                ));

        result.forEach((subject, mark) ->
            System.out.println(subject + " -> " + mark.orElse(null))
        );
    }

}

class Student {
    private String name;
    private String subject;
    private int marks;

    // constructor, getters
    public Student(String name, String subject, int marks) {
        this.name = name;
        this.subject = subject;
        this.marks = marks;
    }

    public String getSubject() { return subject; }
    public int getMarks() { return marks; }
}