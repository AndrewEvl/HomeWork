import java.util.Scanner;

/**
 * Created by Lino on 19.02.2017.
 */
public class test1 {
        public static int fib(int index){
            if (index<=0){
                return 0;
            } else if(index==1){
                return 1;
            } else if(index==2){
                return 1;
            } else{
                return fib(index - 1)+fib(index - 2);
            }
        }
        public static void main(String[] args){
            Scanner scn = new Scanner(System.in);
            System.out.println("Введите число Фибоначчи: ");
            int n = scn.nextInt();
            int fibo1=1;
            int fibo2=0;
            int fibonachi;
                for (int i=0;fibo2<n;i++){
                    fibonachi = fibo1 + fibo2;
                    fibo1 = fibo2;
                    fibo2 = fibonachi;
                System.out.print(fib(i) + fibo2 + ", ");
            }
        }
    }