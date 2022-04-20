package Java_Soru4;

import java.util.Scanner;

public class Q05_SwitchCase03_firstVersion {

    // Girilen uc haneli bir sayının onlar basamağının değerini yazı ile yazdırınız.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("sayi giriniz :");
        int sayi = scan.nextInt();

        int onlarBasamagi= (sayi/10) %10;

        switch(onlarBasamagi){
            case 0: System.out.println("sifir");
            case 1: System.out.println("bir");
            case 2: System.out.println("iki");
            case 3: System.out.println("uc");
            case 4: System.out.println("dort");
            case 5: System.out.println("bes");
            case 6: System.out.println("alti");
            case 7: System.out.println("yedi");
            case 8: System.out.println("sekiz");
            case 9: System.out.println("dokuz");
        }
        scan.close();
    }
}
