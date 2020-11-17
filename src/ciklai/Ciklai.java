package ciklai;

public class Ciklai {
//    sumos skaiciavimas per cikla
//    public static void main(String[] args) {
//        System.out.println("Ciklai");
////        int suma = 0;
////        for (int i = 1; i<=5; i++) {
////            suma += i;
////            System.out.println("viso suma: " + suma);

//    sumos skaiciavims
//
//            int[] a = {10, 50 , -5, 15};
//            int suma1 = 0;
//            for (int j = 0; j < a.length; j++) {
//                suma1 += a[j];
//                System.out.println("suma = " + suma1);
//
//            }
//        }
//    }
//    sumos skaiciavimas kitas budas
        public static void main(String[] args) {
            int[] a = {10, 50 , -5, 15};
            int suma = 0;
            for (int elem : a) {
                suma += elem;
                System.out.println("suma = " + suma);
            }

    }
}

