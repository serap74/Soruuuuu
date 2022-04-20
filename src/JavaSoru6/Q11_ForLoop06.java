package JavaSoru6;

import java.util.Scanner;

public class Q11_ForLoop06 {

   /* Kullanıcıdan satır ve sütun sayısını alın.
    Bir dikdörtgen oluşturun. satırlar = 3 ve sütun = 5 ==>*/
   public static void main(String[] args) {

       Scanner scan=new Scanner(System.in);
      System.out.print("Satir giriniz");
      int satir=scan.nextInt();

      System.out.print("Sutun giriniz");
      int sutun=scan.nextInt();

      for (int i = 1; i <=satir ; i++) {
         for (int j = 1; j <=sutun ; j++) {
            System.out.print("*");

         }
         System.out.println();
      }
   }
}


