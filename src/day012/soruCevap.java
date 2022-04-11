package day012;



import java.util.Scanner;

public class soruCevap {
    public static void main(String[] args) {
        String carName=("volvo");

        System.out.println(carName);




       // int y=5;
        //   int x=7;
        //   int z=x+y;
        //  System.out.println(z);


        //  int kK=5;
        //   int uK=7;
        //   int cvr=(kK*2)+(uK*2);

       // System.out.println(cvr);
        {

            int a = 8;
            int b = 3;
            int c = (a + b) * (a - b);
            System.out.println(c);

        }
        int x=10,y=15;
int as=x+y;


        Scanner scan=new Scanner(System.in);
        System.out.println("yas:"+as);


        System.out.println("giriş yap:  ");

int sonuc=scan.nextInt();
if (sonuc>20){
    System.out.println("dogru");
}else if (sonuc<20)
    System.out.println("hatalı");



    }



}
