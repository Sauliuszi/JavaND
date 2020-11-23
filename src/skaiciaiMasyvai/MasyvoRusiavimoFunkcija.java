package skaiciaiMasyvai;
//Masyvo rusiavimo automatine funkcija!
//butina parasyti sita import!!!
import java.util.Arrays;
public class MasyvoRusiavimoFunkcija {
    public static void main(String[] args) {
        String[] m = {"bulka", "duona", "pienas", "suris", "kiausiniai", "bananai"};
//        rusiuoja
        Arrays.sort(m);
//        spausdina
        System.out.printf("Modified arr[] : %s",
                Arrays.toString(m));
//        perkelia i kita eilute
        System.out.println();


        int[] a = {1, 10, 100};
        int[] b = a;
        a[0] = 2;
        System.out.println(b[0]);

    }
}
