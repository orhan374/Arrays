package arraysss;

import java.util.Scanner;

public class task6 {
    static public void binaryDonustur(int sayi){
        int binary[] = new int[120];
        int index = 0;
        while(sayi > 0){
            binary[index++] = sayi%2;
            sayi = sayi/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }

    public static void main(String[] args) {




        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz: ");
        int sayi = input.nextInt();

        System.out.print("sayi: ");
        binaryDonustur(sayi);





    }
}
