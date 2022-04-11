package day012;

import java.util.Scanner;

public class extraa {


        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);

            System.out.println("dört işlem");
            System.out.println("-".repeat(20));
            System.out.println("toplama");
            System.out.println("çıkar");
            System.out.println("çarpma");
            System.out.println("bölme");
            System.out.println();
            System.out.print("tercih et:");
            int secim= input.nextInt();
            switch (secim){
                case 1:

                    System.out.println("TOPLAMA");
                    System.out.print("sayı 1: ");
                    int sayı1= input.nextInt();
                    System.out.print("sayı 2: ");
                    int sayı2= input.nextInt();
                    System.out.println("toplam: "+(sayı1+sayı2));
                    break;
                case 2:             System.out.println("ÇIKARMA");

                    System.out.print("sayı 1: ");
                    sayı1= input.nextInt();
                    System.out.print("sayı 2: ");
                     sayı2= input.nextInt();
                    System.out.println("çıkan : "+(sayı1-sayı2));

                    break;
                case 3:             System.out.println("ÇARPMA");

                    System.out.print("sayı 1: ");
                     sayı1= input.nextInt();
                    System.out.print("sayı 2: ");
                     sayı2= input.nextInt();
                    System.out.println("çarpım : "+(sayı1*sayı2));

                    break;
                case 4:
                    System.out.println("BÖLME");
                    System.out.print("sayı 1: ");
                     sayı1= input.nextInt();
                    System.out.print("sayı 2: ");
                     sayı2= input.nextInt();
                    System.out.println("bölüm : "+((double)sayı1/sayı2));

                    break;
                default:   System.out.println();
                    break;

            }

        }
    }



