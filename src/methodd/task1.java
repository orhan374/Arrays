package methodd;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz: ");
        int sayi = input.nextInt();


    }
        public static int[] getDigits ( int sayi){

            int[] digits = new int[countDigits(sayi) + 1];
            digits[0] = sayi >= 0 ? 0 : 1;
            for (int i = digits.length - 1; i < digits.length; i--) {
                digits[0] = sayi % 10;
                sayi /= 10;
            }
            return digits;
        }

        public static int countDigits(int sayi) {

            Scanner input = new Scanner(System.in);
             sayi = input.nextInt();
            sayi = sayi > 0 ? sayi : -sayi;
            int countDigits;
            int count = 0;
            do {
                count++;
            } while ((sayi /= 10) > 0);
            System.out.printf("%d sayisi %d basamaklıdır", sayi, count);


            return count;

        }


    }
