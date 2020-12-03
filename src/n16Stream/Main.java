package n16Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Darbuotojai jonas = new Darbuotojai("Jonas");
        Darbuotojai petras = new Darbuotojai("Petras");
        Darbuotojai birute = new Darbuotojai("Birute");
        Darbuotojai angele = new Darbuotojai("Angele");

        List<Mokejimai> mokejimai = Arrays.asList(
                new Mokejimai(jonas, 320.20),
                new Mokejimai(petras, 512.32),
                new Mokejimai(jonas, 1024.35),
                new Mokejimai(angele, 542.31),
                new Mokejimai(jonas, 251.38),
                new Mokejimai(angele, 854.50),
                new Mokejimai(birute, 654.58),
                new Mokejimai(jonas, 135.50)
        );
                    //Isrusiuoti mokejimus didejimo tvarka

        mokejimai.stream()
                .sorted((m1, m2) -> Double.compare(m1.getMokejimas(), m2.getMokejimas()))
                .forEach(m -> System.out.println(m.getDarbuotojai() + " " + m.getMokejimas()));

                //        Isrusiuoti mokejimus pagal darbuotojus

        Map<Darbuotojai, List<Mokejimai>> map = mokejimai.stream()
                .collect(Collectors.groupingBy(m -> m.getDarbuotojai()));
        System.out.println(map);

        //        Suskaiciuoti, kiek kartu buvo ismoketa kiekvienam darbuotojui

        Map<Darbuotojai, List<Mokejimai>> map1 = mokejimai.stream()
                .collect(Collectors.groupingBy(d -> d.getDarbuotojai()));
        map1.keySet().forEach(d -> {
            System.out.println("Buvo sumoketa: " + d.getVardas() + " " + map1.get(d).size() + " kartai");
        });



    }



}
