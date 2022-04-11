package arraysss;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner imput=new Scanner(System.in);
        System.out.println("bir sayı girin");
                int sayi= imput.nextInt();
                int num=sayi;

              sayi=sayi>0?sayi:-sayi;
              int count=0;
                do {
                    count++;
                }while ((sayi/=10)>0);
        System.out.printf("%d sayisi %d basamaklıdır");
    }
}
