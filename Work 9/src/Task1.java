import sun.invoke.empty.Empty;

import java.io.*;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by evl.a.a on 16.03.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        File directory = new File("src" + File.separator);
        File poem = new File(directory, "poem.txt");
        Scanner scanner = null;

        try {
            scanner = new Scanner(new BufferedReader(new FileReader(poem)));
            Map <Character, Integer> latters = new HashMap <>();
            Map <String, Integer> words = new HashMap<>();

            while (scanner.hasNextLine()) {
                String stringOfLetters = scanner.next();
                stringOfLetters = stringOfLetters.toLowerCase();
                    int valueWords = words.get(stringOfLetters) !=null ? words.get(stringOfLetters) :0;
                    valueWords++;
                    words.put(stringOfLetters, valueWords);

                for (int i = 0; i < stringOfLetters.length(); i++) {
                    char keyLetters = stringOfLetters.charAt(i);
                    int valueLetters = latters.get(keyLetters) != null ? latters.get(keyLetters) : 0;
                    valueLetters++;
                    latters.put(keyLetters, valueLetters);
                }
            }
            System.out.println(" ");
            System.out.println("Колличество букв в стихотворении : " + latters + "\n");
            System.out.println("Колличество слов в стихотворении : " + words);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}