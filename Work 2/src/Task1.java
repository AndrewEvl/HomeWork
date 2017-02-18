import java.util.Scanner;

/**
 * Created by Lino on 18.02.2017.
 */
public class Task1 {
    public static void main(String[] args) {

        long a, c = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println( "Введите число: ");
            a = scn.nextLong();

            while (a != 0) {
                c = a % 10 + c ;
                a /= 10; }
             System.out.println("Сумма всех чисел введенного числа равна " + c);
    }
}