package Java_Soru7;

import java.util.Scanner;

public class Q10_Varargs01 {

    // istedigimiz kadar sayi girdigimizde
    // toplamlari bize veren bir method yazalim...
static int toplam;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int sayi=1;
        while (sayi>0){
            System.out.println("İstediginiz kadar sayi giriniz"+ "\nSayilarin toplami icin 0 a basiniz");
            sayi=scan.nextInt();
            sayiToplama(sayi);
        }


    }

  public static void sayiToplama(int ...sayi) {

        for (int each:sayi

             ) {
            toplam+=each;
        }
        System.out.println(toplam);
    }


}
