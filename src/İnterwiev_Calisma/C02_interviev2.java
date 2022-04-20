package İnterwiev_Calisma;

import java.util.Scanner;

public class C02_interviev2 {
    public static void main(String[] args) {

        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
        scanner                     sout        substring
        
        
         * return eden metod yaziniz
         *
         * ornek:  input            output          method(str,     sayi
         *         elma  2           eaea                   String   int
         *         army  3           ayayay

         */


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen string giriniz");
        String str = scan.nextLine();

        System.out.println("bir sayi giriniz" );
        int sayi=scan.nextInt();
        ilkSonharf(str , sayi);

        System.out.println("girlen stringin ilk ve son harfinin istene sayi kadar birlesik hali :"+ilkSonharf(str,sayi));
        
        //main sonu
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    private static String ilkSonharf(String str, int sayi) {

        String s =str.substring(0,1) + str.substring(str.length() - 1);

        String b ="";
        for (int i = 0; i < sayi; i++) {//ilk ve son karakteri yan yana kac kez yazacak
            b+=s;
        }
        return b;
    }
}
