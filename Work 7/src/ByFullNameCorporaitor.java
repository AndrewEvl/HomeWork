import java.util.Comparator;

/**
 * Created by User on 04.03.2017.
 */
public class ByFullNameCorporaitor implements Comparator <Student> {
    @Override
    public int compare(Student oneStudent, Student twoStudent) {
        return oneStudent.getFullName().compareTo(twoStudent.getFullName());
    }
}
