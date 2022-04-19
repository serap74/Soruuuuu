package Java_Soru;

import java.util.Scanner;

public class Q08_Scanner01 {

    // kullanicidan 2 tam sayi alin
    // bu tam sayilari toplayin ve sonucu yazdirin


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("birinci sayiyi girin");
        int sayi1=scan.nextInt();

        System.out.println("ikinci sayiyi girin");
        int sayi2=scan.nextInt();

        int toplam=sayi1+sayi2;
        System.out.println("toplam = " + toplam);


    }

}
