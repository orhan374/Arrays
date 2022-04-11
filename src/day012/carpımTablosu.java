package day012;

import java.util.Scanner;

public class carpımTablosu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("carpım tablosu\nbir sayı giriniz");
        int sayi= input.nextInt();
        for (int i = 1; i<=10; i++) {
            System.out.println(sayi+"x"+i+"="+i*sayi);

        }
    }

}