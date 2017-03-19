import java.io.*;
import java.util.ArrayList;

/**
 * Created by evl.a.a on 16.03.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        File directory = new File("src" + File.separator);
        File number = new File(directory, "number.txt");
        try {
            number.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int element = 50;
        ArrayList<Integer> numb = new ArrayList<>();

        for (int i = 0; i < element; i++) {
            Integer b = (int) (Math.random() * 100 + 0);
            numb.add(i, b);
        }

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(number));
            bufferedWriter.write(numb + "\n");
            bufferedWriter.flush();
            numb.sort(Integer::compareTo);
            bufferedWriter.write(numb + " ");
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


