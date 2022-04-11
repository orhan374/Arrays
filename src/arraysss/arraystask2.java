package arraysss;

import java.util.Scanner;

public class arraystask2 {
    public static void main(String[] args) {
        String[] gunler=new String[7];
        gunler[0]="pzrts";
        gunler[1]="salı";
        gunler[2]="crsmb";
        gunler[3]="prsmb";
        gunler[4]="cuma";
        gunler[5]="cmrts";
        gunler[6]="pzr";
        Scanner input= new Scanner(System.in);
        System.out.println("gun seç");
        int secim= input.nextInt();
        System.out.println("secim:"+gunler[secim-1]);
        System.out.println();
    }
}
