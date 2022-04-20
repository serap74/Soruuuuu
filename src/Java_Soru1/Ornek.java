package Java_Soru1;

import java.util.Scanner;

public class Ornek {
    /*
     * - Main method icerisinde bir ogrenciye ait variable’lar olusturun ve bu
     * variable’lara atama yapin
     *
     * - isimDegistir adinda bir method olusturun, parametre olarak ogrenci
     * bilgilerini alsin ve methodun icinde tum bilgileri degistirip, yeni bilgileri
     * yazdirsin
     *
     * - Main method icinde isimDegistir methodunu cagirdigimiz satirin hemen
     * sonrasinda yeniden ogrenci bilgilerini yazdirin
     *
     * -Soyisimdegistir isminde bir method olusturun, bu method parametre olarak "soyisim"
     * variable'ini alsin. method'un icinde kullaniciya yeni soyisim girmesini istesin ve
     * eski soyismi degistirsin.
     *
     * Not :Instance variable'lar object'lere aittir ve diger adi object variable'dir
     */
    public static void main(String[] args) {

        String ogrenciİsmi="Serap";
        String ogrenciSoyİsmi="Diraz";
        String  ogrenciTel="543678954";

        System.out.println("Ogrenci ismi :" + ogrenciİsmi + " Soyismi : " + ogrenciSoyİsmi + " Ogrenci tel : " + ogrenciTel);

        isimDegistir(ogrenciİsmi,ogrenciSoyİsmi,ogrenciTel);

        ogrenciSoyİsmi=soyİsimDegistir(ogrenciSoyİsmi);

    }

    private static void isimDegistir(String ogrenciİsmi, String ogrenciSoyİsmi, String ogrenciTel) {
        ogrenciİsmi="İkra Nur";
        ogrenciSoyİsmi="Diiraz";
        ogrenciTel="2344566";
        System.out.println("Ogrenci ismi :" + ogrenciİsmi + " Soyismi : " + ogrenciSoyİsmi + " Ogrenci tel : " + ogrenciTel);



    }

    private static String soyİsimDegistir(String ogrenciSoyİsmi) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Yeni soyisminizi giriniz");
        String yeniSoyİsim=scan.nextLine();

        return yeniSoyİsim;

    }

}