import java.util.Scanner;

/**
 * Created by Lino on 18.02.2017.
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите количество осадков за 6 дней");
        Scanner sc = new Scanner(System.in);

        int rain1, rain2, rain3 ,rain4, rain5, rain6;
        rain1 = sc.nextInt();
        rain2 = sc.nextInt();
        rain3 = sc.nextInt();
        rain4 = sc.nextInt();
        rain5 = sc.nextInt();
        rain6 = sc.nextInt();

        int sum = rain1 + rain2 + rain3 + rain4 + rain5 + rain6;
        int mid = (rain1 + rain2 + rain3 + rain4 + rain5 + rain6)/6;
        int max1 = Math.max (rain1,rain2);
        int max2 = Math.max (rain3,rain4);
        int max3 = Math.max (rain5,rain6);
        int max4 = Math.max (max1, max2);
        int max5 = Math.max (max4, max3);
        int max6 = Math.max (max5, max4);

        System.out.println("Измерения за 6 дней" );
        System.out.println ("Количестко осадков на 6 дней : "+sum);
        System.out.println ("Среднее количество осадков за 6 дней : "+mid);
        System.out.println ("Максимальное количество осадклв за 6 дней : "+max6);
    }
}
