import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by evl.a.a on 23.03.2017.
 */
public class Factory extends Thread {

    List<Integer> numbs = new ArrayList<>(8);
    private Random random = new Random();

    public void test() {
        for (int i = 0; i < 9; i++) {
            numbs.add(i, 0);
        }
    }

    public void ran20part() {
        for (int i = 0; i < 20; i++) {
            int o = random.nextInt(9);
            numbs.set(o, numbs.get(o) + 1);
        }
    }

    public void run() {
        for (int i = 0; i < 4; i++) {
            int o = random.nextInt(9);
            numbs.set(o, numbs.get(o) + random.nextInt(2));
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public List<Integer> getNumbs(Dump dump) {
        return numbs;
    }

    public void setNumbs(List<Integer> numbs) {
        this.numbs = numbs;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }
}