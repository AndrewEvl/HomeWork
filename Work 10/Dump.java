import java.util.ArrayList;
import java.util.List;

/**
 * Created by evl.a.a on 24.03.2017.
 */
public class Dump extends Factory {
    List<Integer> dumpRoboParts = new ArrayList<>(9);

    public void test() {
        for (int i = 0; i < 9; i++) {
            dumpRoboParts.add(i, 0);
        }
    }

    public void run() {
        for (int i = 0; i < 9; i++) {
        }
    }

    public List<Integer> getDumpRoboParts() {
        return dumpRoboParts;
    }

    public void setDumpRoboParts(List<Integer> dumpRoboParts) {
        this.dumpRoboParts = dumpRoboParts;
    }
}