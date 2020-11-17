package skaiciaiMasyvai;

public class Masyvai2Ciklas {

    public static void main(String[] args) {
        int[] a = {5, 6, 10, 15, 8, 4};
        int[] b = {8, 5, 3};
        double asuma = 0;
        double bsuma = 0;
        double avidurkis = 0;
        double bvidurkis = 0;
        for (int i = 0; i < a.length; i++) {
            asuma += a[i];
//            System.out.println("A masyvo skaiciu suma: " + asuma);
            avidurkis = asuma / a.length;
//            System.out.println("A masyvo skaiciu vidurkis: " + avidurkis);
        }
        for (int j = 0; j < b.length; j++) {
            bsuma += b[j];
//            System.out.println("B masyvo skaiciu suma: " + bsuma);
            bvidurkis = bsuma / b.length;
//            System.out.println("B masyvo skaiciu vidurkis: " + bvidurkis);
        }
        double skirtumas = avidurkis - bvidurkis;
        System.out.println("Masyvu \"a\" ir \"b\" skaiciu skirtumas yra: " +  skirtumas);

    }
}
