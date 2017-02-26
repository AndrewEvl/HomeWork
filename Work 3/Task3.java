/**
 * Created by evl.a.a on 21.02.2017.
 */
public class Task3 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        int array1[] = {5, 6, 7};
        int result[] = new int[array.length + array1.length];

        int j = 0;
        int k = 0;

        while (j + k < result.length) {
            if (k == array1.length || j != array.length && array[j] < array1[k]) {
                result[j + k] = array[j++];
            } else {
                result[j + k] = array1[k++];
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + "  ");
        }
    }
}

