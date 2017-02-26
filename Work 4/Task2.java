import java.util.Scanner;

/**
 * Created by evl.a.a on 23.02.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        int last = 3999;
        String[] arab = {"I","II","III", "IV","V", "VI", "VII", "VIII" , "IX",
                "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C",
                "D", "M" };
        System.out.println("Введите римское число:");
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        boolean k = false;
        for (int i = 0; i < arab.length; i++)
            if (arab[i].equals(a))
                k = true;
        if (k)
            System.out.println("Арабское число = " + letterToNumber(a));
        else ;
    }

    public static int letterToNumber(String letter) {
        if (letter.equals("I"))
            return 1;
        else if (letter.equals("II"))
            return 2;
        else if (letter.equals("III"))
            return 3;
        else if (letter.equals("IV"))
            return 4;
        else if (letter.equals("V"))
            return 5;
        else if (letter.equals("VI"))
            return 6;
        else if (letter.equals("VII"))
            return 7;
        else if (letter.equals("VIII"))
            return 8;
        else if (letter.equals("IX"))
            return 9;
        else if (letter.equals("X"))
            return 10;
        else if (letter.equals("XX"))
            return 20;
        else if (letter.equals("XXX"))
            return 30;
        else if (letter.equals("LX"))
            return 40;
        else if (letter.equals("L"))
            return 50;
        else if (letter.equals("LX"))
            return 60;
        else if (letter.equals("LXX"))
            return 70;
        else if (letter.equals("LXXX"))
            return 80;
        else if (letter.equals("XC"))
            return 90;
        else if (letter.equals("C"))
            return 100;
        else if (letter.equals("D"))
            return 500;
        else if (letter.equals("M"))
            return 1000;
        else return -1;
    }

}