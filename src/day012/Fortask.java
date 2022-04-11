package day012;

public class Fortask {
    public static void main(String[] args) {
        int sumOfOdd=0;
        int sumOfEven=0;
        for (int i = 0; i < 100; i++) {
            if (i%2==0) {
               sumOfEven+=i;
            }else {
                sumOfOdd+=i;
            }
            
        }
        System.out.println(sumOfEven);
        System.out.println(sumOfOdd);
    }
}
