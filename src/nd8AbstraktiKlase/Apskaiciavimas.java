package nd8AbstraktiKlase;

public class Apskaiciavimas {

    public static void main(String[] args) {

        Apskritimas a1 = new Apskritimas(0, 0, 0, 5  );
        Trikampis t1 = new Trikampis(0, 6, 15, 3, 4, 5);
        Kvadratas k1 = new Kvadratas(6, 6, 95, 7);

        Figura[] figuros = {a1, t1, k1};
        System.out.println(figurosPerimetras(figuros));
    }
    private static double figurosPerimetras(Figura[] figuros) {
        double perimetras = 0;
        for (Figura f: figuros) {
            perimetras = f.perimetras();
        }
        return perimetras;
    }



}
