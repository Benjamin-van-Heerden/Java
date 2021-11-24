import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ComparabilityDemo {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>(4);
        studentList.add(new Student(2, "John", "S"));
        studentList.add(new Student(1, "Sally", "W"));
        studentList.add(new Student(3, "Sally2", "W"));
        studentList.add(new Student(-1, "AnotherPerson", "R"));

//         // this is how to sort a list as a new variable
//         List<Student> sortedStudents = studentList.stream().sorted().collect(Collectors.toList());


        System.out.println("Unsorted:");
        for (Student s : studentList) {
            System.out.println(s);
        }

        // this sorts in place
        Collections.sort(studentList);
        System.out.println("\nNow Sorted:");
        for (Student s : studentList) {
            System.out.println(s);
        }

    }
}
