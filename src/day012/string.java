package day012;

import java.util.Locale;

public class string {
    public static void main(String[] args) {
        String girişAçıklama="UYARI! Selamlar Bu Sitede 5 Dakikadan Fazla Kalmaya Devam Etmek İstiyorsanız Lütfen Üye Olunuz.";
        String birinciMetin="merhaba Recep Dayı  ";
        String ikinciMetin="nasılsın";


        System.out.println(girişAçıklama);
        System.out.println("yazinın uzunluğu: "+girişAçıklama.length());
        System.out.println("büyük: "+girişAçıklama.toUpperCase());
        System.out.println("KÜÇÜK: "+girişAçıklama.toLowerCase());
        System.out.println("Dakikadan kelimesinin başladığı yer "+girişAçıklama.indexOf("Dakikadan"));
        System.out.println(birinciMetin+" "+ikinciMetin);
        System.out.println(birinciMetin.concat(ikinciMetin));
        System.out.println("büyük: "+birinciMetin.toUpperCase());
        System.out.println("büyük: "+ikinciMetin.toUpperCase());
        System.out.println(birinciMetin.concat(ikinciMetin).toLowerCase(Locale.ROOT));

    }

}
