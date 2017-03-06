import java.util.Comparator;

/**
 * Created by User on 04.03.2017.
 */
public class ByAgeCorporato implements Comparator <Student> {
    @Override
    public int compare(Student oneStudent, Student twoStudent) {
        return new Integer (oneStudent.getAge()).compareTo(twoStudent.getAge());
    }
}
