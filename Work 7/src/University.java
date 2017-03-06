import java.util.*;
import java.util.List;

/**
 * Created by User on 04.03.2017.
 */
public class University {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Sam", "Serius", 21, 5.6));
        students.add(new Student("Max", "Mad", 23, 7.2));
        students.add(new Student("Gordon", "Friman", 26, 9.8));
        students.add(new Student("Max", "Payn", 29, 8.3));

        Collections.sort(students, new ByFullNameCorporaitor());
        for (Student student : students) {
            System.out.println(student.getFullName());
        }

        Collections.sort(students, new ByAveregeMarkCorporator());
        for (Student student : students) {
            System.out.println(student.getAverageMark());
        }
        Collections.sort(students, new ByAgeCorporato());
        for (Student student : students) {
            System.out.println(student.getAge());
        }
    }

    public static void maxAveregeMark(List<Student> students) {
        Student studentMaxMark = students.get(0);
        for (Student student : students) {
            if (student.getAverageMark() > studentMaxMark.getAverageMark()) {
            }
        }
        System.out.println(studentMaxMark);
    }
}
