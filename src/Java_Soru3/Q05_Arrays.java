package Java_Soru3;

import java.util.Scanner;

public class Q05_Arrays {

     /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */
     public static void main(String[] args) {

         int arr[] = new int[8];
         Scanner scan=new Scanner(System.in);

         for (int i = 0; i < arr.length; i++) {

             System.out.println(i + ". index sayiyi giriniz");
             arr[i]=scan.nextInt();


         }
         int count=0;

         for (int i = 0; i < arr.length; i++) {
             if(i%3==0){
                 count++;

             }

         }
         System.out.println("3 ile bolunebilen sayilar :" + count);
     }

}
