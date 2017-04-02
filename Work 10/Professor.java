import java.util.*;

/**
 * Created by evl.a.a on 23.03.2017.
 */
public class Professor extends Thread {

    Map<Parts, Integer> bendres = new HashMap<>();
    Map<Parts, Integer> flekso = new HashMap<>();
    List<Integer> professorPartOfBender = new ArrayList<>();
    List<Integer> professorPartOfFlekso = new ArrayList<>();

    public void test() {
        for (int i = 0; i < 9; i++) {
            professorPartOfBender.add(i, 0);
        }
        for (int i = 0; i < 9; i++) {
            professorPartOfFlekso.add(i, 0);
        }
    }

    public void bendersSet() {
        bendres.put(Parts.HEAD, professorPartOfBender.get(0));
        bendres.put(Parts.BODY, professorPartOfBender.get(1));
        bendres.put(Parts.LEFTHAND, professorPartOfBender.get(2));
        bendres.put(Parts.RIGHTHAND, professorPartOfBender.get(3));
        bendres.put(Parts.LEFTLEG, professorPartOfBender.get(4));
        bendres.put(Parts.RIGHTLEG, professorPartOfBender.get(5));
        bendres.put(Parts.CPU, professorPartOfBender.get(6));
        bendres.put(Parts.RAM, professorPartOfBender.get(7));
        bendres.put(Parts.HDD, professorPartOfBender.get(8));
    }

    public static void creature(List professorPartOfRobots, Map robots) {
        robots.entrySet();
        Collection min = robots.values();
    }

    public List<Integer> getProfessorPartOfFlekso() {
        return professorPartOfFlekso;
    }

    public Map<Parts, Integer> getFlekso() {
        return flekso;
    }

    public Map<Parts, Integer> getBendres() {
        return bendres;
    }

    public void setBendres(Map<Parts, Integer> bendres) {
        this.bendres = bendres;
    }

    public List<Integer> getProfessorPartOfBender() {
        return professorPartOfBender;
    }

    public void setProfessorPartOfBender(List<Integer> professorPartOfBender) {
        this.professorPartOfBender = professorPartOfBender;
    }
}

