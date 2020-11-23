package ciklai;

public class CikloNutraukimas {
    public static void main(String[] args) {
//        mums reikia susumuoti visus masyvo elementus pradedant nuo pirmo, bet tik iki
//        elemento kurio reikšmė yra 0.
        int[] a = {15, 20, 5, 0, -5, 80};
        int suma = 0;
//        Sie abu ciklo variantai yra teisingi
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == 0) {

        for (int j : a) {
            if (j == 0) {
                break;
            }
            suma += j;
            System.out.println(suma);
        }
        int i = 1, viso = 0;
        while (i <= 100) {
//            viso += i++;
// tas pats kas:
            viso = viso + i;
            i = i + 1;
        }
        System.out.println("1 + 2 + … + 100 = " + viso);

        int[] b = {10, 50, -5, 15};
        int suma1 = 0;
        for (int elementas : b) {
            suma1 += elementas;
        }
        System.out.println("Suma = " + suma1);
    }
}
