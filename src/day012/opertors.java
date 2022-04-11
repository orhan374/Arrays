package day012;

public class opertors {
    public static void main(String[] args) {
       int x=2;
        int y=++x;
        System.out.println(y);


        int a=50;
         a=--a + a++ + a-- + a++;
        System.out.println(a);


        int t=1;
        t=-t-- + t++ / -t-- * --t;
        System.out.println(t);



        int j=10;
        j+=3;
        System.out.println(j);


    }
}
