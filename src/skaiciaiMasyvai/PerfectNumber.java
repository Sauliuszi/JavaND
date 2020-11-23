package skaiciaiMasyvai;

public class PerfectNumber {
    public static void main(String[] args) {
        for (int n = 1; n <= 1000; n++) {
            int suma = 0;
            for (int i = 1; i < n; i++) {
                int a = n % i;
                if (a == 0) {
                    suma += i;
                }
            }
            if (suma == n){
                System.out.println("Tobulas skaicius: " + suma);
            }
        }
    }
}
