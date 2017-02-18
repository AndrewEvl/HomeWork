
import java.util.Scanner;

/**
 * Created by evl.a.a on 16.02.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Введите день");
        int day = scanner.nextInt();
        day++;

        Scanner scanner1 = new Scanner (System.in);
        System.out.println ("Введите месяц");
        int month = scanner.nextInt();

        Scanner scanner2 = new Scanner (System.in);
        System.out.println ("Введите год");
        int year = scanner.nextInt();


        if ((day > 31)&(month == 1)||(month==3)||(month==5)||(month==7)||(month==8 )||(month ==10)||(month == 12)) {
            month++;
            day = 1;
        }else if((day > 30)&(month==4)||(month==6)||(month==9 )||(month ==11)) {
            month++;
            day = 1;
        }else if ((day>28)&(month ==2)){
            month++;
            day = 1;}
        if (month > 12){
            year++;
            month =1;}
        System.out.println(day + "." + month + "." + year);
    }
}


