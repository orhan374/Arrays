package arraysss;

import java.util.Scanner;

public class arraystask {
    public static void main(String[] args) {
        String[] aylar=new String[12];
        aylar[0]="ocak";
        aylar[1]="subat";
        aylar[2]="mart";
        aylar[3]="nisan";
        aylar[4]="mayis";
        aylar[5]="hazrn";
        aylar[6]="tmmz";
        aylar[7]="agusts";
        aylar[8]="eyyll";
        aylar[9]="ekmm";
        aylar[10]="ksim";
        aylar[11]="aralik";

        Scanner input= new Scanner(System.in);
        System.out.println("ay seç");
        int secim;
        do {
            secim  = input.nextInt();
        }
             while (secim<1|secim>12);



        System.out.println("sectiğiniz ay\n"+aylar[secim-1]);
    }
}
