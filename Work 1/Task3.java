import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;

/**
 * Created by evl.a.a on 16.02.2017.
 */
public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a:");
        int a = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите b:");
        int b = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите c:");
        int c = scanner.nextInt();
        double  D,x1,x2;

        D =(b*b)-(4*a*c);
        if (D > 0){
            x1 = ((-b)+Math.sqrt(D))/2*a;
            x2 = ((-b)-Math.sqrt(D))/2*a;
            System.out.println ("x1 = "+ x1 + " x2 = "+ x2);
        }else if (D == 0){
            x1 = (-b)/2*a;
            System.out.println ("x1,x2 ="+ x1);
        }
        else{
            System.out.println ("D меньше нуля");
        }
    }
}
