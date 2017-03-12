import java.util.*;

/**
 * Created by Lino on 10.03.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        String message = "Let me introduce myself. My name is Ann. I am twenty. I am a student. I study at the " +
                "university. I am a prospective economist. I like this profession, that's why I study with pleasure. " +
                "My parents are not economists, but they support me in my choice. We are a friendly family and try to " +
                "understand and support each other in any situation. Understanding and support is what I need in " +
                "friendship as well. Some of my friends study at the same university. After classes we usually gather " +
                "to gether, discuss our plans or problems and have some fun. We have a lot of hobbies.";
        String[] words = message.split(" ");

        Map<String, Integer> wordsMap = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                Integer count = wordsMap.get(word);
                if (count == null) {
                    count = 0;
                }
                wordsMap.put(word, ++count);
            }
        }

        for (String word : wordsMap.keySet()) {
            System.out.println(word + ": " + wordsMap.get(word));
        }
    }
}