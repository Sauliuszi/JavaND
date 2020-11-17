package ciklai;

public class Sachmatai {
//    public static void main(String[] args) {
//        System.out.println("Sachmatai");
//
//        double grudai = 0;
//
//        // suskaiciuoti kiek grudeliu tilps lentoje
//        int lentosDydis = 4;
//        double x = 1;
//
//        for (int i = 1; i <= lentosDydis; i++) {
//            System.out.println("Langelyje " + i + " yra " + x + " grudu");
//            grudai = grudai + x;
//            System.out.println("Ant lentos is viso: " + "?" + " grudu");
//            x = x * 2;
//
//
//        }
//
//    }


    public static void main(String[] args) {
        int grudai = 0;
        int lentosKrastoDydis = 3; // 3 x 3
        int x = 1;
        //                    97                99
        for (char stulpelis = 'a'; stulpelis <= 'a' + lentosKrastoDydis - 1; stulpelis++) {
            // System.out.print(stulpelis);
            for (int eilute = 1; eilute <= lentosKrastoDydis; eilute++) {
                // System.out.print(eilute);
                System.out.println("Langelyje " + stulpelis + eilute + " yra " + x + " grudu");
                grudai = grudai + x;
                x = x * 2;
            }
            // System.out.println(); // uzbaigiame eilute
        }

        System.out.println("Viso ant lentos yra " + grudai + " grudu");
    }
}




