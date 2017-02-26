import java.util.Scanner;

/**
 * Created by evl.a.a on 23.02.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите фразу или слово и узнайте являеться ли оно палиндромом :");
        Scanner scan = new Scanner(System.in);
        String palindrom = scan.nextLine();
        palindrom = palindrom.replace(" ", "");
        StringBuilder strBuilder = new StringBuilder(palindrom);
        strBuilder.reverse();
        String palindromeReverse = strBuilder.toString();
        System.out.println(palindrom.equals(palindromeReverse));

    }
}