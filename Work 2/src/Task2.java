import java.util.Scanner;

/**
 * Created by Lino on 18.02.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число Фибоначчи: ");
        int n = scn.nextInt();
        int a = 1;
        int b = 1;
        int fib = 2;
        int i = 2;
        System.out.print(a + " " + b);
        fib = 0;
        if (fib < n) {
            while (fib < n) {
                fib = a + b;
                a = b;
                b = fib;
                i++;
                System.out.print(" " + fib);
            }
        }
    }
}