package klases;

import klases.papildomai.Naudinga;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Zmogus a = new Zmogus();
        a.vardas = "Jonas";
        a.pavarde = "Jonaitis";
        a.amzius = "25";
        System.out.println("Vardas: " + a.vardas);
        System.out.println("Pavarde: " + a.pavarde);
        System.out.println("Amzius: " + a.amzius);

        Zmogus b = new Zmogus("Petras", "Petraitis", "32");
        System.out.println("b " + Naudinga.kasYraKas(b));

        Zmogus[] zmones = {a, b, new Zmogus("Karolis", "Penkatasis")};
        System.out.println("Tai musu zmoniu masyvas:");
        for (Zmogus e : zmones) {
            Naudinga.spausdinti(e);
        }
        Mokinys m1 = new Mokinys();
        m1.vardas = "Donatas";
        m1.pavarde = "Doncikas";
        m1.klase = 7;
        System.out.println("m " + Naudinga.kasYraKas(m1));

        Mokinys m2 = new Mokinys();
        m2.vardas = "Danute";
        m2.pavarde = "Dundule";
        m2.klase = 5;

        Mokinys m3 = new Mokinys();
        m3.vardas = "Zose";
        m3.pavarde = "Kaliause";
        m3.klase = 8;

        Mokinys m4 = new Mokinys();
        m4.vardas = "Vincas";
        m4.pavarde = "Kudirka";
        m4.klase = 7;

        Mokinys m5 = new Mokinys();
        m5.vardas = "Rasa";
        m5.pavarde = "Basa";
        m5.klase = 5;

        Mokinys m6 = new Mokinys();
        m6.vardas = "Vytas";
        m6.pavarde = "Pipiras";
        m6.klase = 8;
        Naudinga.MokinioSp(m2);
//        Sudeti mokinius i masyva
        Mokinys[] mokiniai = {m1, m2, m3, m4, m5, m6};
//        atspausdinti mokiniu masyva
//        for (int i = 0; i < mokiniai.length; i++)
//        Cia tas pats, kaip ir virsuje
        for (Mokinys mokinys : mokiniai) {
            System.out.println("Mokinio vardas ir pavarde: " + mokinys.vardas + " " + mokinys.pavarde + "; mokosi - " + mokinys.klase + " klaseje");
        }
    }

    static void surusiuotiMokinius(String[] a) {
        // TODO
    }

}
