package Java_Soru5;

import java.util.Scanner;

public class Q13_WhileLoop01 {
    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi=scan.nextInt();

        System.out.println(basamakTopla(sayi));
        basamakToplaDoWhile(sayi);


    }

    private static void basamakToplaDoWhile(int sayi) {

        //do while ile
        int toplam=0;
        do {
            toplam+=sayi%10;
            sayi/=10;
            System.out.println("Basamaklarin Toplami = " + toplam + " \nkalan sayi " + sayi);
        }while(sayi > 0);
        System.out.println("Do while ile Toplam = " + toplam);

    }

    //while ile
    private static int basamakTopla(int sayi) {
        int toplam=0;
        while (sayi!=0){
            toplam+=sayi%10;
                    sayi/=10;
        }
        return sayi;


    }


}
