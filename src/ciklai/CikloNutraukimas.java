package ciklai;

public class CikloNutraukimas {
    public static void main(String[] args) {
//        mums reikia susumuoti visus masyvo elementus pradedant nuo pirmo, bet tik iki
//        elemento kurio reikšmė yra 0.
        int[] a = {15, 20, 5, 0, -5, 80};
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                break;
            }
            suma += a[i];
            System.out.println(suma);
        }
    }
}
