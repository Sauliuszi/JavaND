package klases.papildomai;

import klases.Mokinys;
import klases.Zmogus;

public class Naudinga {
    public static void spausdinti (Zmogus z) {
        System.out.print(z.vardas + "  " + z.pavarde + "  " +
                (z.amzius == null ? " -amzius nezinomas- " : (z.amzius + ";  ")));
        System.out.println();
    }
    public static String kasYraKas (Object x) {
        String kas = "" ;
        if (x instanceof Zmogus) {
            kas = "yra zmogus";
        } else {
            kas = "nera zmogus";
        }
        if (x instanceof Mokinys) {
            kas = kas + " ir yra mokinys";
        } else {
            kas = kas + " ir nera mokinys";
        }
        return kas;
    }
    public static void MokinioSp (Mokinys h) {
        System.out.print(h.vardas + "  " + h.pavarde + " mokosi: " + h.klase + " klaseje" );
        System.out.println();
    }

    public static void MokinioSp() {
    }

}

