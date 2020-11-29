package skaiciaiMasyvai;

public class Faktorialas {
    public static void main(String[] args) {
        int n5 = faktorialas(10);
        System.out.println(" 10 ! = " + n5);
    }

    private static int faktorialas(int n) {
        int f = 1;
        for (n = n; n >= 2; n--) {
//            Sie  du uzrasai reiskia ta pati !!!
//        f = f * n;
//        Dazniau naudojamas sis !!!
                    f *= n;
        }
        return f;
//
    }

}
