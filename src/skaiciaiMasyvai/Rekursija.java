package skaiciaiMasyvai;

public class Rekursija {
    public static void main(String[] args) {
        int n5 = faktorialas(10);
        System.out.println(" 10 ! = " + n5);
        System.out.println(" 7 ! = " + faktorialas(7));
        System.out.println(" 3 ! = " + faktorialas(3));


    }

    private static int faktorialas(int n) {
       if (n == 2) return 2;
       return n * faktorialas(n - 1);
    }
}
