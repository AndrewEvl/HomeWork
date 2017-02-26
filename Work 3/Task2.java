import java.util.Arrays;

/**
 * Created by evl.a.a on 21.02.2017.
 */
public class Task2 {
    public static void main(String[] args) {

        int array[] = {1, 2, 3, 2, 4, 1, 5, 2, 6, 5, 7, 7, 8, 1, 9};
        System.out.print("Изначальный массив: " + Arrays.toString(array) + "\n");
        int n = array.length;
        for (int i = 0, a = 0; i != n; i++, n = a) {
            for (int k = a = i + 1; k != n; k++) {
                if (array[k] != array[i]) {
                    if (a != k) array[a] = array[k];
                    a++;
                }
            }
        }
        if (n != array.length) {
            int array1[] = new int[n];
            for (int i = 0; i < n; i++)
                array1[i] = array[i];
            array = array1;
        }
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}
