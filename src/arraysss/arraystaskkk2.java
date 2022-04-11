package arraysss;

import java.util.Scanner;

public class arraystaskkk2 {
    public static void main(String[] args) {

        int [] notlar =new int[5];
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen öğrencilerin notlarını giriniz:");
        for (int i = 0; i < notlar.length ; i++) {
            System.out.print((i+1)+".Öğrenci :");
            notlar[i]= scan.nextInt();

        }
        System.out.print("Öğrencilerin notları :");
        for (int not:notlar) {
            System.out.print(not+",");
        }
    }
}
