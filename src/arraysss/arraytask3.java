package arraysss;

import java.util.Scanner;

public class arraytask3 {public static void main(String[] args) {

    String[] gunler = {"pzrts",
            "salı",
            "crsmb",
            "prsmb",
            "cuma",
            "cmrts",
            "pzr"};

    Scanner input = new Scanner(System.in);
    System.out.println("gun seç");
    System.out.println("Bulmak istediğiniz gün:");
    int gunNo = -1;
   String gun = input.nextLine();


    for (int i =0; i < gunler.length; i++) {
        if ( gun.equals(gunler[i])) {
            gunNo = i + 1;
            break;
        }
        System.out.println(gun+" buldunuz");
        System.out.println();
         }
    }
}

