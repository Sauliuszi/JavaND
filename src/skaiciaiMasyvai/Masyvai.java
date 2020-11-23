package skaiciaiMasyvai;

public class Masyvai {
    public static void main(String[] args) {
        String[] auto = {"Volvo", "Audi", "Nissan"};
        System.out.println(auto[0]);

        String[] automobiliai;
        int autoKiekis = 5;
        automobiliai = new String[autoKiekis];
        System.out.println(automobiliai[2]);
//        automobiliai[0] = "Citroen";
        automobiliai[1] = "Audi";
        automobiliai[2] = "Volvo";
        automobiliai[3] = "Mercedes";
        automobiliai[4] = "Toyota";
//        automobiliai[5] = "Nissan";
        System.out.println( automobiliai[4]);
        if (automobiliai[0] == null) {
            System.out.println("Nera tokio automobilio");
        } else {
            System.out.println(automobiliai[0]);
        }
    }
}
