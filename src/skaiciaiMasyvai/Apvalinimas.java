package skaiciaiMasyvai;

import java.util.PrimitiveIterator;

public class Apvalinimas {
    public static void main(String[] args) {
        double a = Math.PI;
        System.out.println(a);
//        Pritaikome floor metoda, noredami pasirinkt siuo atveju 3 skaicius po kablelio
        System.out.println(Math.floor((a + 0.0005) * 1000) / 1000);
//        Suapvalinimas be kableliu
        System.out.println(Math.round(a));
        double b = 25.6587146;

//        NESIGAUNA< KAIP PVZ !!!!!! pvz, rodo, kad atsoausdina, tiek po kablelio, kiek yta nuliu
        System.out.println(Math.round(b * 100) / 100);

        double f = 123.13698;
        double roundOff = Math.round(f * 100)/100;
//        Sis ciklas kelia laipsniu
        System.out.println(roundOff);
        double c = 1;
        for (int i = 0; i < 4; i++) {
            c = c * 10;
            System.out.println(c);
        }
//        POW metodas kelia laipsniu
        double g = Math.pow(10, 4);
        System.out.println(g);


    }

}
