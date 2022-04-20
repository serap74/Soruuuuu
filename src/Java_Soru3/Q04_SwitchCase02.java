package Java_Soru3;

import java.util.Scanner;

public class Q04_SwitchCase02 {

     /*
		 * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
		 * ornek
		 *  Kullanici  : A , B , C harflerinden birini secsin
			 A'yi secmis ise, ==> Java is easy
			 B'yi secmis ise, ==> Java is fun
			 C'yi secmis ise, ==> I need to study :)
		 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen harflerden birini seciniz : \nA \nB \nC");
        char secenek = scanner.next().toUpperCase().charAt(0);

        switch(secenek){

            case 'A':
                System.out.println("Java kolay");
                break;

            case 'B':
                System.out.println("Java eglenceli");
                break;

            case 'C':
                System.out.println("Ders calismam lazim");
                break;

            default:
                System.out.println("Gecerli bir secim yapiniz");
        }
    }
}
