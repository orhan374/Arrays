package day012;

import java.util.Scanner;

public class ıfelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("yas gir");
        int yas = input.nextInt();

        if (yas >= 18) {
            System.out.println("reşit");

        } else {
            System.out.println("reşit değil");
        }


        int k = 20;
        int m = 25;
        if (k > m) {
            System.out.println("k büyük");
        } else if (k < m) {
            System.out.println("m büyük");

        }
    }
}