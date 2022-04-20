package Java_Soru;

import java.util.Scanner;

public class Q09_Scanner02 {

    // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
    // ve yasadiklari yeri seviyorlarsa
    // bu bilgiyi yazdirin

    // next() only can read the first word
    // nextLine() can read the whole line

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("isminiz : ");
        String isim=scan.nextLine();

        System.out.println("memleketiniz : ");
        String memleket=scan.nextLine();

        System.out.println("konumunuz : ");
        String konum=scan.nextLine();

        System.out.println("yasiniz : ");
        byte yas=scan.nextByte();

        System.out.println("boyunuz : ");
        short boy=scan.nextShort();

        System.out.println("yasadiginiz" + konum + " u seviyor musunuz? true/false");
        boolean seviyorMu=scan.hasNextBoolean();

        System.out.println("*****************************");
        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("konum = " + konum);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("yasadiginiz yeri seviyor musunuz = " + seviyorMu);

    }
}
