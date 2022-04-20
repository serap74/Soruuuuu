package JavaSoru6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q11_ArraysList {

    /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
     *  1. Kullanicidan ismini isteyelim
     *  2. Kullanici adindaki bosluklari silelim.
     *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
     *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
     *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

     */

    public static void main(String[] args) {

        List<String> veriTabanindakiKullanicilar = new ArrayList<>();
        veriTabanindakiKullanicilar.add("Ayse");
        veriTabanindakiKullanicilar.add("Ahmet");
        veriTabanindakiKullanicilar.add("Hasan");
        veriTabanindakiKullanicilar.add("Ali");
        veriTabanindakiKullanicilar.add("Mehmet");
        veriTabanindakiKullanicilar.add("Derya");


        System.out.println("veri tabanindaki kullanicilar :" + veriTabanindakiKullanicilar);


        Scanner scan = new Scanner(System.in);
        System.out.println("kullanmak istediginiz user name giriniz");
        String userName=scan.nextLine().trim();

        boolean kullaniciİsmiVarMi=veriTabanindakiKullanicilar.contains(userName);

        if(kullaniciİsmiVarMi){
             System.out.println("Bu kullanici ismi zaten alinmis");

         }else {
             System.out.println("Bu kullanici adini kullanabilirsiniz");


    }
    if(kullaniciİsmiVarMi){
        int rastgeleSayi = new Random().nextInt(100);
        userName=userName+ "" + rastgeleSayi;
        System.out.println("Yeni kullanici adi olarak bunu kullanabilirsiniz :" + userName);


    }else {
        System.out.println("Yeni kullanici adi: " + userName);
    }
scan.close();

    }
}
