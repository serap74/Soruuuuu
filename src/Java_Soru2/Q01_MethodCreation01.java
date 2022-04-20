package Java_Soru2;

import java.util.Scanner;

public class Q01_MethodCreation01 {

     /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("yapacaginiz dort islemi + - * / olarak giriniz");
        char islem = scan.next().charAt(0);
        System.out.println("birinci sayiyi giriniz");
        double sayi1 = scan.nextInt();

        System.out.println("ikinci sayiyi giriniz");
        double sayi2 = scan.nextInt();

        hesapMakinesi(islem, sayi1, sayi2);


    }

    private static void hesapMakinesi(char islem, double sayi1, double sayi2) {
        if (islem == '+' || islem == '-' || islem == '*' || islem == '/') {

            switch (islem) {
                case '+':
                    System.out.println(sayi1 + "+" + sayi2 + "=" + (sayi1 + sayi2));
                    break;
                case '-':
                    System.out.println(sayi1 + "-" + sayi2 + "=" + (sayi1 - sayi2));
                    break;
                case '*':
                    System.out.println(sayi1 + "*" + sayi2 + "=" + (sayi1 * sayi2));
                    break;
                case '/':
                    System.out.println(sayi1 + "/" + sayi2 + "=" + (sayi1 / sayi2));

            }
        }else System.out.println("hatali giris yaptiniz");


    }
}