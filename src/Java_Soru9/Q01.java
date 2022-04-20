package Java_Soru9;

import java.util.Scanner;

public class Q01 {

    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("String bir ifade girin");
        String str=scan.nextLine();

        System.out.println("Bir sayi giriniz ");
        int sayi=scan.nextInt();

        ilkVeSonHarfBirlestir(str,sayi);
        System.out.println(ilkVeSonHarfBirlestir(str,sayi));



    }

    private static String ilkVeSonHarfBirlestir(String str, int sayi) {

        String s=str.substring(0,1) + str.substring(str.length() - 1);

        String output = "";

        for (int i = 1; i <=sayi ; i++) {
            output+=s;
        }
        return output;
    }

}


