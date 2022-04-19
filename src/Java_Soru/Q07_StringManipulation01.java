package Java_Soru;

import java.util.Scanner;

public class Q07_StringManipulation01 {
    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda
    // konsola tam ismini buyuk harfler ile yazdirin

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi girin");
        String isim=scan.nextLine();
        System.out.println("soyisminizi giriniz");
        String soyİsim=scan.nextLine();

        System.out.print(isim.toUpperCase()+ " ");
        System.out.print(soyİsim.toUpperCase());




    }
}
