import java.util.Scanner;

/**
 * Created by Lino on 18.02.2017.
 */
public class fibtest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число Фибоначчи: ");
        int n = scn.nextInt();
        int fibo1 = 1;
        int fibo2 = 0;
        int fibonachi;
        for (int i = 0; fibo2 < n; i++) {
            fibonachi = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonachi;
            System.out.print(fibonachi + ", ");
        }
    }

}
