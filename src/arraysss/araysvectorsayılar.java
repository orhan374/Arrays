package arraysss;

public class araysvectorsayılar {
    public static void main(String[] args) {
        int[] sayilar={7,24,45,3,56};
        int enkucuk=sayilar[0];
        for (int i = 0; i < sayilar.length; i++){
            if (sayilar[i]< enkucuk) {
                enkucuk=sayilar[i]  ;
            }
        }

        System.out.println(" en küçük : " + enkucuk);
    }

    }

