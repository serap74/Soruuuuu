package Java_Soru;

import java.util.Scanner;

public class Q03_MethodCreation03 {

     /*
    cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz

      */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen metre ve km yi cevirmek icin deger giriniz:");
        double santimetre = scan.nextDouble();


        donusturMetodu(santimetre);
}

    private static void donusturMetodu(double num) {
        double meter = num / 100;
        double kMeter = num / 100000;
        System.out.println("Sizin" + num + "santimetre " + "esittir " + meter + " Metre " + "ve "
                + kMeter + " kilometers");

    }

}
