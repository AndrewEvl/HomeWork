import java.util.Arrays;

/**
 * Created by evl.a.a on 22.02.2017.
 */
public class Task4 {
    public static void main(String[] args) {
        int array[][] = {{1, 2,}, {3, 4}};
        int result[] = new int[4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++)
                result[i * array.length + j] = array[i][j];
            System.out.println(Arrays.toString(result));
        }
    }
}

