package day012;

import java.util.Scanner;

public class kopyalar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen yasınızı giriniz :");
        int yas=input.nextInt();
        if (yas<13){
            System.out.println("Çocuk Yaştasınız.");
        }

        //tek & çalıştırıyor
        else if(13<=yas && yas<17){
            System.out.println("Siz ergensiniz.");
        }
        else{
            System.out.println("Yetişkinsiniz.");
        }
    }
}
