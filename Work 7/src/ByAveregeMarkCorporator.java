import java.util.Comparator;

/**
 * Created by User on 04.03.2017.
 */
public class ByAveregeMarkCorporator implements Comparator <Student> {
    @Override
    public int compare(Student oneStudent, Student twoStudent) {
        return new Double(oneStudent.getAverageMark()).compareTo(twoStudent.getAverageMark());
    }
}
