package nd9Interface;

public class Mokejimai {
    public static void printMokejimuInfo (IMokejimas[] pavedimai) {
        for (IMokejimas mokejimas: pavedimai) {
            System.out.println(mokejimas.getSaskaitosSavininkas() + " " + mokejimas.getBankoSakaitosNr() +
                    " " + mokejimas.getSuma());

        }
    }
}
