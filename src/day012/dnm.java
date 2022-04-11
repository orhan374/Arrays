

package day012;
import java.util.Scanner;
public class dnm {






    public static void fakto(){
        Scanner scan=new Scanner(System.in);

           System.out.println("sayı:" );

           long sayi= scan.nextLong();

           long fakto=1;
           while (sayi>0){
               fakto *=sayi;
               sayi--;
           }

        System.out.println("faktoriyel : "+fakto);


    }

    public static void main(String[] args) {
        fakto();
    }


}
