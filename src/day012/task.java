package day012;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("yas gir:");
        int yas = input.nextInt();

        if (yas < 13) {
            System.out.println("çocuktur");

        } else if (yas < 18) {
            System.out.println("ergendir");
        } else {
            System.out.println("yetişkindir");

        }
    }
}

