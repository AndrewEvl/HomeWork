import java.util.Arrays;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by evl.a.a on 23.03.2017.
 */
public class demo {
    public static void main(String[] args) throws InterruptedException {
        final CyclicBarrier cyclicBarrier = new CyclicBarrier(4);
        Factory factory = new Factory();
        Professor farnsworth = new Professor();
        Professor vernstrum = new Professor();
        Dump dump = new Dump();
        factory.test();
        farnsworth.test();
        vernstrum.test();
        dump.test();
        factory.ran20part();
        dump.setDumpRoboParts(farnsworth.getProfessorPartOfBender());
        dump.setDumpRoboParts(vernstrum.getProfessorPartOfFlekso());
        factory.setNumbs(dump.getDumpRoboParts());
        for (int i = 0; i < 100; i++) {
            dump.run();
            factory.run();
        }
        farnsworth.bendersSet();
        vernstrum.bendersSet();
        farnsworth.start();
        vernstrum.start();
        factory.start();
        dump.start();
        System.out.println(Arrays.toString(Parts.values()));
        System.out.println(factory.numbs.toString());
        System.out.println(dump.dumpRoboParts.toString());
        System.out.println(farnsworth.bendres.toString());
        System.out.println(vernstrum.bendres.toString());
        System.out.println(farnsworth.professorPartOfBender.toString());
        System.out.println(vernstrum.professorPartOfBender.toString());
        farnsworth.join();
        vernstrum.join();
        factory.join();
        dump.join();
    }
}
