import java.util.Scanner;

/**
 * Created by Lino on 18.02.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число Фибоначчи: ");
        int n = scn.nextInt();
        int fibo1 = 1;
        int fibo2 = 1;
        int fibo = 2;
        int i = 2;
        System.out.print(fibo1 + " " + fibo2);
        fibo = 0;
            while (fibo < n) {
                fibo = fibo1 + fibo2;
                fibo1 = fibo2;
                fibo2 = fibo;
                i++;
                System.out.print(fibo + ", ");}
    }
}