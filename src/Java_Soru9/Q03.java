package Java_Soru9;

import java.util.Scanner;

public class Q03 {

    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String pin = "Serap.1989";
        int girisHakki = 3;
        System.out.println("*********HOSGELDİNİZ**********");

        while (true) {
            System.out.println("Pin kodu giriniz");
            String girilenPin = scan.nextLine();

            if (pin.equals(girilenPin)) {
                System.out.println("Giris basarili");
                break;

            } else {
                System.out.println("Yanlis giris yaptiniz...");
                girisHakki--;
                System.out.println("Giris hakkiniz : " + girisHakki);
            }
            if (girisHakki == 0) {
                System.out.println("Giris hakkiniz kalmadi .... pin bloke oldu");
                break;
            }
        }

    }}
