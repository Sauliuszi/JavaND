package nd9Interface;

public class Pavedimai {

    public static void main(String[] args) {

        Darbuotojas d1 = new Darbuotojas();
        d1.setVardas("Antanas");
        d1.setPavarde("Antanaitis");
        d1.setBankoSaskaita("LT123654789");
        d1.setSuma(1200);

        Darbuotojas d2 = new Darbuotojas();
        d2.setVardas("Petras");
        d2.setPavarde("Petraitis");
        d2.setBankoSaskaita("IE369852147");
        d2.setSuma(4100);

        Darbuotojas d3 = new Darbuotojas();
        d3.setVardas("Maryte");
        d3.setPavarde("Melnykaite");
        d3.setBankoSaskaita("GB987463321");
        d3.setSuma(1980);

        Klientas k1 = new Klientas();
        k1.setPavadinimas("Tuscia vieta");
        k1.setImonesKodas("22226666");
        k1.setBankoSaskaitosNr("LT456456456");
        k1.setSuma(15000);

        Klientas k2 = new Klientas();
        k2.setPavadinimas("Full house");
        k2.setImonesKodas("77777555");
        k2.setBankoSaskaitosNr("LT321321321");
        k2.setSuma(2500);

        Klientas k3 = new Klientas();
        k3.setPavadinimas("Mano imone");
        k3.setImonesKodas("85298755");
        k3.setBankoSaskaitosNr("LT987987987");
        k3.setSuma(-1700);

        IMokejimas[] mokejimai = {d1, d3, k2, k3, d2, k1};

        Mokejimai.printMokejimuInfo (mokejimai);

    }
}
