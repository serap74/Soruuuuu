package JavaSoru8;

import java.util.Scanner;

public class Q04 {

     /*
    cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Metre ve kilometreye donusturmek uzere cm veri girin");

        double santiMetre=scan.nextDouble();

        cmDonustur(santiMetre);
    }

    public static void cmDonustur(double cm) {

        double metre =cm/100;
        double kiloMetre = cm/100000;

        System.out.println("sizin girdiginiz "  + cm + " cm degeri :" +metre + " metredir, " +kiloMetre  + " kilometredir" );
    }
}
