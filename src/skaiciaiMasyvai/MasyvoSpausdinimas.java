package skaiciaiMasyvai;

public class MasyvoSpausdinimas {

    public static void main(String[] args) {
        int[] masyvas= {5, 8, 3, 4, 7, 1, 9};
        spausdintiMasyva(masyvas);

        for (int i = 0; i < masyvas.length; i++) {

            for (int j = i + 1; j < masyvas.length; j++) {

                if (masyvas[i] > masyvas[j]) {
                    sukeistiSkaicius(masyvas, i, j);
                }
            }
        }
        spausdintiMasyva(masyvas);
    }
    static void sukeistiSkaicius (int[] p, int x, int y) {
        int s = p[x];
        p[x] = p[y];
        p[y] = s;
    }
    static void spausdintiMasyva(int [] p) {
        System.out.print("{ ");
        for(int e : p) {
            System.out.print(e + " ");
        }
        System.out.println('}');
    }
}
