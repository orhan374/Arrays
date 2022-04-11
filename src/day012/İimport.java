package day012;

import java.util.Scanner;

public class İimport {
    public static void main(String[] args) {
        System.out.println("beşten küçük sayı sayı gir");
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();

        if (sayi > 5 ) {

            System.out.println("hatalı");
        } else {
            System.out.println("true");
        }

    }
}