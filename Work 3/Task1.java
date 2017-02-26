import java.util.Arrays;

/**
 * Created by evl.a.a on 21.02.2017.
 */
public class Task1 {

    public static void main(String... args) {

        int array[] = new int[]{1, 2, 3, 4, 5};
        System.out.println("Изначальный массив: " + Arrays.toString(array) + "\nГотовый вариант : ");
        new Task1().array1(array, 1);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public int[] array1(int[] ent, int shift) {

        int[] ex = new int[ent.length];
        int j = 0;
        for (int i : ent) {
            ex[j++] = i;
        }

        int a = shift;
        for (int i = 0; i < ex.length; i++) {
            if (shift > 0) {
                ent[i] = ex[ex.length - shift];
                shift--;
            } else {
                ent[i] = ex[i - a];
            }
        }
        return ent;
    }
}
