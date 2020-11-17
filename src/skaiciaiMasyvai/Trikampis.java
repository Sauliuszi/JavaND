package skaiciaiMasyvai;

public class Trikampis {
    public static void main(String[] args) {
        int a = 7;
        int b = 7;
        int c = 5;
        int p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

//        Nustatome ar tai trikampis
        if (a + b >= c && a + c >= b && b + c >= a) {
            System.out.println("tai trikampis");
        } else {
            System.out.println("tai ne trikampis");
        }
//        Ar tai lygiakrastis trikampis ?
        if (a == b && b == c && c == a){
            System.out.println("tai lygiakrastis trikampis");
        }
//        Ar tai lygiasonis trikampis ?
        if (a == b && a > c && b > c && a < c && b < c || b == c && b > a && c > a && b < a && c < a || a == c && a > b && c > b && a < b && c < b) {
            System.out.println("tai lygiasonis trikampis");
        }
//        Ar tai ivairiakrastis trikampis ?
        if (a != b && b != c && c != a){
            System.out.println("tai ivairiakrastis trikampis");
        } else if (a * a + b * b == c * c || b * b + c * c == a + a || a * a + c * c == b * b) {
            System.out.println("tai statusis trikampis");
        }

        System.out.println("trikampio plotas yra: " + s);
    }
}
