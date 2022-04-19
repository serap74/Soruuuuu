package Java_Soru;

import java.util.Scanner;

public class Q17_StringManipulation11 {

    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir isim girin");
        String isim=scan.next();

        System.out.println("soyisminizi giriniz");
        String soyİsim=scan.next();

        if(isim.length()>soyİsim.length()){
            System.out.println("isminiz soyisminizden daha uzun");
        }else if((soyİsim.length()>isim.length())){
            System.out.println("soyisminiz isminizden daha uzun");
        } else
        System.out.println("esit sayida olmayan karakterler girin");


        }
    }

