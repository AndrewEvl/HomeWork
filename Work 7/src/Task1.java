import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 04.03.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("this");
        words.add("is");
        words.add("lots");
        words.add("of");
        words.add("fun");
        words.add("for");
        words.add("every");
        words.add("Java");
        words.add("programmer");
        System.out.println(words);

        for (int i = 0; i <words.size(); i++) {
            if ( words.get(i).length() == 4){
                words.add(i++,"****");
                System.out.println(words);
            }
        }
    }
}