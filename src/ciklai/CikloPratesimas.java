package ciklai;

public class CikloPratesimas {
    public static void main(String[] args) {
//        Kartais reikia cikle nevykdyti likusių ciklo sakinių ir grįžti į ciklo pradžią.
//        Tarkime mums reikia sudauginti visus masyvo elementus, išskyrus tuos kurių reikšmė yra 0
        int[] a = {2, 0, 3, 0, -5, 0};
        int sandauga = 1;
        for (int b: a) {
            if (b == 0) {
                continue;
            }
            sandauga *= b;
            System.out.println(sandauga);
        }

    }
}
