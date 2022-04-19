package Java_Soru;

import java.util.Scanner;

public class Q08_StringManipulation02 {

    //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

    //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Bir string giriniz");
        String str1=scan.next();

        System.out.println("İkinci bir String giriniz");
        String str2=scan.next();

        str1=str1.substring(1);
        str2=str2.substring(1);

        System.out.println("method 1 : " +str1.concat(str2));

        System.out.println("method 2 : " + str1 + str2);





    }













}
