
import java.util.Scanner;

/**
 * Created by evl.a.a on 16.02.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a");
        int a = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите b");
        int b = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите c");
        int c = scanner.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Введите d");
        int d = scanner.nextInt();

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Введите e");
        int e = scanner.nextInt();

        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Введите f");
        int f = scanner.nextInt();

        if ((b + c > e)&( a + d > f )){
            System.out.println("дома не помещаються :(");
        }else if ((a + d > e) & ( b + c > f )){
            System.out.println("дома не помещаються :(");
        }else if ((a + d > f) & ( b + c > e )){
            System.out.println("дома не помещаються :(");
        }else if ((b + c > f) & ( a + d > e )){
            System.out.println("дома не помещаються :(");}
            else {
            System.out.println("дома помещаються");}

    }
}