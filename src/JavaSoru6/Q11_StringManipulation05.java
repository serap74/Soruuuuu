package JavaSoru6;

import java.util.Scanner;

public class Q11_StringManipulation05 {

    /*
     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("1. kelimeyi girin");
        String kelime1=scan.next().toUpperCase();

        System.out.println("2. kelimeyi girin");
        String kelime2=scan.next().toUpperCase();

        System.out.println("3. kelimeyi girin");
        String kelime3=scan.next().toUpperCase();

        System.out.println("4. kelimeyi girin");
        String kelime4=scan.next().toUpperCase();

        System.out.println(kelime1 +" " + kelime2 +" " + kelime3 + " " + kelime4 +".");

    }



}
