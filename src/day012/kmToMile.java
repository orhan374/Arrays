package day012;

public class kmToMile {
    public static void main(String[] args) {
        System.out.println("mile\tkm");
        System.out.println("-".repeat(10));
        for (int i = 60; i<=130 ; i+=10) {
        double mile=i*0.6214;
            System.out.printf("%d\t\t%4.1f\n",i,mile);

        }
        System.out.println();
    }
}
