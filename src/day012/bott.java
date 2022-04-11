package day012;

public class bott{

    public int intMax(int a, int b, int c) {
    int max;
    intMax(5,6,8);

    // First check between a and b
    if (a > b) {
        max = a;  System.out.println(max);
    } else {
        max = b;  System.out.println(max);
    }

    // Now check between max and c
    if (c > max) {
        max = c;  System.out.println(max);
    }

    return max;

    // Could use the builtin Math.max(x, y) function which selects the larger
    // of two values.

  }

        public static void main(String[] args) {


        }

}
