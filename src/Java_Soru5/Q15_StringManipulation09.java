package Java_Soru5;

import java.util.Scanner;

public class Q15_StringManipulation09 {

     /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/
     public static void main(String[] args) {

         Scanner scan= new Scanner(System.in);
         System.out.println("Lutfen bir kelime giriniz :");
         String kelime=scan.nextLine();
         char ortancaKarakter=kelime.charAt((kelime.length()-1)/2);

         if(kelime.length()%2==1 && kelime.length()>=3){
             System.out.println(ortancaKarakter);

         }else System.out.println("hatali giris yaaptınız" );
     }
}
