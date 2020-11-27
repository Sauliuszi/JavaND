package skaiciaiMasyvai;

public class Trikampis {
    public static void main(String[] args) {
        int a = 10;
        int b = 6;
        int c = 9;
        int p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

//        Nustatome ar tai trikampis
        if (a + b <= c && a + c <= b && b + c <= a) {
            System.out.println("tai ne trikampis");
        } else {
            System.out.println("tai yra trikampis");
        }
//        Ar tai lygiakrastis trikampis ?
        if (a == b && b == c && c == a){
            System.out.println("ir tai lygiakrastis trikampis");
        }
//        Ar tai lygiasonis trikampis ?
        if (a == b && a != c && b != c ||a == c && a != b && c != b || c == b && c != a && b != a) {
            System.out.println("ir tai lygiasonis trikampis");
        }
//        Ar tai ivairiakrastis trikampis ?
        if (a != b && b != c && c != a){
            System.out.println("ir tai ivairiakrastis trikampis");
        }
        if (a * a + b * b == c * c || b * b + c * c == a + a || a * a + c * c == b * b) {
            System.out.println("taip pat sis trikampis yra statusis");
        }

        System.out.println("trikampio plotas yra: " + s);
    }
}
